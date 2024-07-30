package com.gildedtros.qualitymanagers;

import com.gildedtros.Item;

public class BackstagePassQualityManager extends QualityManager {
    private int determineBackstagePassQualityDelta(Item anItem) {
        int qualityDelta = 1;

        if (anItem.sellIn < 0) {
            qualityDelta = 0;
        } else if (anItem.sellIn < 5) {
            qualityDelta = 3;
        } else if (anItem.sellIn < 10) {
            qualityDelta = 2;
        }

        return qualityDelta;
    }

    @Override
    protected int calculateDecay(Item anItem, int qualityDelta) {
        int decay = 0;
        if (anItem.sellIn < 0) {
            decay = anItem.quality * -1;
        }

        return decay;
    }

    @Override
    public void updateQuality(Item anItem) {
        final int qualityDelta = determineBackstagePassQualityDelta(anItem);
        processItemQuality(anItem, qualityDelta);
    }
}
