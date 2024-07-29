package com.gildedtros.qualitymanagers;

import com.gildedtros.specialitems.FineAgedItem;

public class FineAgedItemQualityManager extends QualityManager {
    @Override
    public void visit(FineAgedItem anItem) {
        processItem(anItem, -1, 1);
    }
}
