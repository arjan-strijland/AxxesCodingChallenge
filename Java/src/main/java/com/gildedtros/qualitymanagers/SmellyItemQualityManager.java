package com.gildedtros.qualitymanagers;

import com.gildedtros.specialitems.SmellyItem;

public class SmellyItemQualityManager extends QualityManager {
    @Override
    public void visit(SmellyItem anItem) {
        processItem(anItem, -1, -2);
    }
}
