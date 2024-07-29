package com.gildedtros;

import com.gildedtros.factories.ItemFactory;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("AXXES CODE KATA - GILDED TROS");

        Item[] items = new Item[] {
                ItemFactory.createItem("Ring of Cleansening Code", 10, 20),
                ItemFactory.createItem("Good Wine", 2, 0),
                ItemFactory.createItem("Elixir of the SOLID", 5, 7),
                ItemFactory.createItem("B-DAWG Keychain", 0, 80),
                ItemFactory.createItem("B-DAWG Keychain", -1, 80),
                ItemFactory.createItem("Backstage passes for Re:Factor", 15, 20),
                ItemFactory.createItem("Backstage passes for Re:Factor", 10, 49),
                ItemFactory.createItem("Backstage passes for HAXX", 5, 49),
                // these smelly items do not work properly yet
                ItemFactory.createItem("Duplicate Code", 3, 6),
                ItemFactory.createItem("Long Methods", 3, 6),
                ItemFactory.createItem("Ugly Variable Names", 3, 6) };

        GildedTros app = new GildedTros(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
