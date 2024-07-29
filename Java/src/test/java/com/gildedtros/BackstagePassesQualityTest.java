package com.gildedtros;

import com.gildedtros.qualitymanagers.BackstagePassesQualityManager;
import com.gildedtros.qualitymanagers.FineAgedItemQualityManager;
import com.gildedtros.specialitems.BackstagePasses;
import com.gildedtros.specialitems.FineAgedItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassesQualityTest {
    @Test
    void testItemQualityManager() {
        BackstagePasses item = new BackstagePasses("Some Fine Wine", 11, 10);
        BackstagePassesQualityManager manager = new BackstagePassesQualityManager();
        manager.visit(item);

        assertEquals(item.quality, 11);
        assertEquals(item.sellIn, 10);

        for (int i = 0; i < 5; i++) {
            manager.visit(item);
        }

        assertEquals(item.quality, 21);
        assertEquals(item.sellIn, 5);

        for (int i = 0; i < 5; i++) {
            manager.visit(item);
        }

        assertEquals(item.quality, 36);
        assertEquals(item.sellIn, 0);

        manager.visit(item);
        assertEquals(item.quality, 0);
        assertEquals(item.sellIn, -1);
    }
}
