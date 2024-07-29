package com.gildedtros.qualitymanagers;

import com.gildedtros.Item;
import com.gildedtros.interfaces.ItemVisitor;
import com.gildedtros.specialitems.BackstagePasses;
import com.gildedtros.specialitems.FineAgedItem;
import com.gildedtros.specialitems.LegendaryItem;
import com.gildedtros.specialitems.SmellyItem;

public class QualityManager implements ItemVisitor {
    protected boolean withinQualityConstraints(int newQuality) {
        return newQuality >= 0 && newQuality <= 50;
    }

    protected void processItem(Item anItem, int sellInDelta, int qualityDelta) {
        int calculatedQualityDelta = qualityDelta;
        if (anItem.sellIn < 0 && calculatedQualityDelta < 0) {
            calculatedQualityDelta *= 2;
        }

        final int newQuality = anItem.quality + calculatedQualityDelta;
        if (withinQualityConstraints(newQuality)) {
            anItem.quality = newQuality;
        }

        anItem.sellIn += sellInDelta;
    }

    @Override
    public void visit(Item anItem) {

    }

    @Override
    public void visit(FineAgedItem anItem) {

    }

    @Override
    public void visit(LegendaryItem anItem) {

    }

    @Override
    public void visit(BackstagePasses anItem) {

    }

    @Override
    public void visit(SmellyItem anItem) {

    }
}
