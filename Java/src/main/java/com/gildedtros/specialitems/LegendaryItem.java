package com.gildedtros.specialitems;

import com.gildedtros.Item;

public class LegendaryItem extends Item {
    static final int LEGENDARY_QUALITY = 80;
    static final int LEGENDARY_SELL_IN = -1;

    public LegendaryItem(String name) {
        super(name, LEGENDARY_SELL_IN, LEGENDARY_QUALITY);
    }
}
