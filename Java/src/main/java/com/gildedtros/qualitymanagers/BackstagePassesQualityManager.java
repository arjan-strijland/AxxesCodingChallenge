package com.gildedtros.qualitymanagers;

import com.gildedtros.specialitems.BackstagePasses;

public class BackstagePassesQualityManager extends QualityManager {
    private int determineBackstagePassQuality(BackstagePasses anItem) {
        int qualityDelta = 1;

        if (anItem.sellIn <= 0) {
            qualityDelta = 0;
        } else if (anItem.sellIn <= 5) {
            qualityDelta = 3;
        } else if (anItem.sellIn <= 10) {
            qualityDelta = 2;
        }

        return qualityDelta;
    }

    @Override
    public void visit(BackstagePasses anItem) {
        final int qualityDelta = determineBackstagePassQuality(anItem);
        processItem(anItem, -1, qualityDelta);
    }
}
