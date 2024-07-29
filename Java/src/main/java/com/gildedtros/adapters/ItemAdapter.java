package com.gildedtros.adapters;

import com.gildedtros.Item;
import com.gildedtros.interfaces.ItemVisitor;
import com.gildedtros.interfaces.ItemVisitable;

public class ItemAdapter implements ItemVisitable {
    private Item item;

    public ItemAdapter(Item anItem) {
        this.item = anItem;
    }

    @Override
    public void accept(ItemVisitor aVisitor) {
        aVisitor.visit(this.item);
    }
}
