package com.gildedtros.qualitymanagers;

import com.gildedtros.Item;

public class FineAgedItemQualityManager extends QualityManager {

    @Override
    public void updateQuality(Item anItem) {
        processItemQuality(anItem, 1);
    }
}
