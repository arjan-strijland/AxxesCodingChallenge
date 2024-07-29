package com.gildedtros.interfaces;

import com.gildedtros.Item;

public interface ItemVisitor {
    void visit(Item anItem);
}
