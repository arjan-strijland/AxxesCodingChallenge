package com.gildedtros.qualitymanagers;

import com.gildedtros.Item;
import com.gildedtros.interfaces.IQualityManager;

public abstract class QualityManager implements IQualityManager {
    protected void updateQualityWithConstraint(Item anItem, int newQuality) {
        final int MAX_QUALITY = 50;
        final int MIN_QUALITY = 0;
        if (newQuality <= MIN_QUALITY) {
            anItem.quality = MIN_QUALITY;
        }
        else {
            anItem.quality = Math.min(newQuality, MAX_QUALITY);
        }
    }

    protected int calculateDecay(Item anItem, int qualityDelta) {
        int decay = 0;
        if (anItem.sellIn < 0) {
            decay = qualityDelta;
        }

        return decay;
    }

    protected void processItemQuality(Item anItem, int qualityDelta) {
        final int calculatedQualityDelta = qualityDelta + calculateDecay(anItem, qualityDelta);
        final int newQuality = anItem.quality + calculatedQualityDelta;
        updateQualityWithConstraint(anItem, newQuality);
    }

    @Override
    public void updateSellIn(Item anItem) {
        anItem.sellIn -= 1;
    }
}
