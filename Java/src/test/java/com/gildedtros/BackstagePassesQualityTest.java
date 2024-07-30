package com.gildedtros;

import com.gildedtros.qualitymanagers.BackstagePassQualityManager;
import com.gildedtros.specialitems.BackstagePassItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassesQualityTest {
    @Test
    void testItemQualityManager() {
        BackstagePassItem item = new BackstagePassItem("Some Fine Wine", 11, 10);
        BackstagePassQualityManager manager = new BackstagePassQualityManager();
        manager.updateSellIn(item);
        manager.updateQuality(item);

        assertEquals(item.quality, 11);
        assertEquals(item.sellIn, 10);

        for (int i = 0; i < 5; i++) {
            manager.updateSellIn(item);
            manager.updateQuality(item);
        }

        assertEquals(item.quality, 21);
        assertEquals(item.sellIn, 5);

        for (int i = 0; i < 5; i++) {
            manager.updateSellIn(item);
            manager.updateQuality(item);
        }

        assertEquals(item.quality, 36);
        assertEquals(item.sellIn, 0);

        item.sellIn = -1;
        manager.updateSellIn(item);
        manager.updateQuality(item);
        assertEquals(item.quality, 0);
        assertEquals(item.sellIn, -2);
    }
}
