package com.gildedtros.qualitymanagers;

import com.gildedtros.specialitems.FineAgedItem;

public class FineAgedItemQualityManager extends QualityManager {
    @Override
    public void visit(FineAgedItem anItem) {
        throw new NullPointerException("Bla");
//        processItem(anItem, -1, 1);
    }
}
