package com.gildedtros.factories;

import com.gildedtros.Item;
import com.gildedtros.specialitems.BackstagePassItem;
import com.gildedtros.specialitems.FineAgedItem;
import com.gildedtros.specialitems.LegendaryItem;
import com.gildedtros.specialitems.SmellyItem;

import java.util.Arrays;

public class ItemFactory {
    static final String[] SMELLY_ITEM_NAMES = {"Duplicate Code", "Long Methods", "Ugly Variable Names"};

    public static Item createItem(String aName, int aSellIn, int aQuality) {
        Item result;
        if (aName.equals("Good Wine")) {
            result = new FineAgedItem(aName, aSellIn, aQuality);
        } else if (aName.equals("B-DAWG Keychain")) {
            result = new LegendaryItem(aName);
        }
        else if (aName.contains("Backstage passes")) {
            result = new BackstagePassItem(aName, aSellIn, aQuality);
        } else if (Arrays.asList(SMELLY_ITEM_NAMES).contains(aName)) {
            result = new SmellyItem(aName, aSellIn, aQuality);
        }
        else {
            result = new Item(aName, aSellIn, aQuality);
        }

        return result;
    }
}