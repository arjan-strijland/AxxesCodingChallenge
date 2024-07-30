package com.gildedtros.factories;

import com.gildedtros.Item;
import com.gildedtros.interfaces.IQualityManager;
import com.gildedtros.qualitymanagers.*;
import com.gildedtros.specialitems.BackstagePassItem;
import com.gildedtros.specialitems.FineAgedItem;
import com.gildedtros.specialitems.LegendaryItem;
import com.gildedtros.specialitems.SmellyItem;

public class QualityManagerFactory {
    public static IQualityManager createQualityManager(Item anItem) {
        IQualityManager result;

        if (anItem instanceof FineAgedItem) {
            result =  new FineAgedItemQualityManager();
        }
        else if (anItem instanceof SmellyItem) {
            result = new SmellyItemQualityManager();
        }
        else if (anItem instanceof BackstagePassItem) {
            result = new BackstagePassQualityManager();
        }
        else if (anItem instanceof LegendaryItem) {
            result = new NoneQualityManager();
        }
        else {
            result = new ItemQualityManager();
        }

        return result;
    }
}
