package com.gildedtros;

import com.gildedtros.qualitymanagers.ItemQualityManager;
import com.gildedtros.qualitymanagers.SmellyItemQualityManager;
import com.gildedtros.specialitems.SmellyItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmellyItemQualityTest {
    @Test
    void testItemQualityManager() {
        SmellyItem item = new SmellyItem("A very smelly item", 30, 10);
        SmellyItemQualityManager manager = new SmellyItemQualityManager();
        manager.updateSellIn(item);
        manager.updateQuality(item);

        assertEquals(item.quality, 8);
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
        SmellyItem item = new SmellyItem("A very smelly item", 10, 50);
        SmellyItemQualityManager manager = new SmellyItemQualityManager();

        for (int i = 0; i < 15; i++) {
            manager.updateSellIn(item);
            manager.updateQuality(item);
        }

        assertEquals(item.quality, 12);
        assertEquals(item.sellIn, -5);
    }
}
