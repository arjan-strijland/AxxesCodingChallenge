package com.gildedtros;

import com.gildedtros.factories.QualityManagerFactory;
import com.gildedtros.interfaces.IQualityManager;

class GildedTros {
    Item[] items;

    public GildedTros(Item[] items) {
        this.items = items;
    }

    private void updateItem(Item anItem) {
        IQualityManager manager = QualityManagerFactory.createQualityManager(anItem);
        manager.updateSellIn(anItem);
        manager.updateQuality(anItem);
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }
}