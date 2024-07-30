package com.gildedtros;

import com.gildedtros.qualitymanagers.ItemQualityManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemQualityManagerTest {
    @Test
    void testItemQualityManager() {
        Item item = new Item("Just a normal item", 30, 10);
        ItemQualityManager manager = new ItemQualityManager();
        manager.updateSellIn(item);
        manager.updateQuality(item);

        assertEquals(item.quality, 9);
        assertEquals(item.sellIn, 29);

        for (int i = 0; i < 50; i++) {
            manager.updateSellIn(item);
            manager.updateQuality(item);
        }

        assertEquals(item.quality, 0);
        assertEquals(item.sellIn, -21);
    }

    @Test
    void testItemQualityManagerDegrading() {
        Item item = new Item("Just a normal item", 10, 50);
        ItemQualityManager manager = new ItemQualityManager();

        for (int i = 0; i < 15; i++) {
            manager.updateSellIn(item);
            manager.updateQuality(item);
        }

        assertEquals(item.quality, 30);
        assertEquals(item.sellIn, -5);
    }
}
