package com.gildedtros.qualitymanagers;

import com.gildedtros.Item;

public class ItemQualityManager extends QualityManager {
    @Override
    public void updateQuality(Item anItem) {
        processItemQuality(anItem, -1);
    }
}
