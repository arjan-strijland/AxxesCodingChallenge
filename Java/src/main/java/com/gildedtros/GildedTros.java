package com.gildedtros;

import com.gildedtros.adapters.ItemAdapter;
import com.gildedtros.qualitymanagers.*;

class GildedTros {
    Item[] items;
    private final QualityManager[] qualityManagers = new QualityManager[] {
            new ItemQualityManager(),
            new FineAgedItemQualityManager(),
            new SmellyItemQualityManager(),
            new BackstagePassesQualityManager()
    };

    public GildedTros(Item[] items) {
        this.items = items;
    }

    private void processItem(Item anItem) {
        for (QualityManager manager : qualityManagers) {
            ItemAdapter adapter = new ItemAdapter(anItem);
            adapter.accept(manager);
        }
    }

    public void updateQuality() {
        for (Item item : items) {
            processItem(item);
        }
    }
}