package com.gildedtros;

import com.gildedtros.qualitymanagers.FineAgedItemQualityManager;
import com.gildedtros.qualitymanagers.SmellyItemQualityManager;
import com.gildedtros.specialitems.FineAgedItem;
import com.gildedtros.specialitems.SmellyItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FineAgedItemQualityTest {
    @Test
    void testItemQualityManager() {
        FineAgedItem item = new FineAgedItem("Some Fine Wine", 30, 10);
        FineAgedItemQualityManager manager = new FineAgedItemQualityManager();
        manager.visit(item);

        assertEquals(item.quality, 11);
        assertEquals(item.sellIn, 29);

        for (int i = 0; i < 50; i++) {
            manager.visit(item);
        }

        assertEquals(item.quality, 50);
        assertEquals(item.sellIn, -21);
    }
}
