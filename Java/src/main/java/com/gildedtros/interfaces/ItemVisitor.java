package com.gildedtros.interfaces;

import com.gildedtros.Item;
import com.gildedtros.specialitems.BackstagePasses;
import com.gildedtros.specialitems.FineAgedItem;
import com.gildedtros.specialitems.LegendaryItem;
import com.gildedtros.specialitems.SmellyItem;

public interface ItemVisitor {
    void visit(Item anItem);
    void visit(FineAgedItem anItem);
    void visit(LegendaryItem anItem);
    void visit(BackstagePasses anItem);
    void visit(SmellyItem anItem);
}
