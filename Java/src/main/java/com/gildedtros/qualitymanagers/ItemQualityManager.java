package com.gildedtros.qualitymanagers;

import com.gildedtros.Item;
import com.gildedtros.interfaces.ItemVisitor;
import com.gildedtros.specialitems.BackstagePasses;
import com.gildedtros.specialitems.FineAgedItem;
import com.gildedtros.specialitems.LegendaryItem;
import com.gildedtros.specialitems.SmellyItem;

public class ItemQualityManager extends QualityManager {
    @Override
    public void visit(Item anItem) {
        processItem(anItem, -1, -1);
    }
}
