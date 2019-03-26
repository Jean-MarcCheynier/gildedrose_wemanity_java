package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackstagePass;
import com.gildedrose.items.LegendaryItem;
import com.gildedrose.items.StandardItem;
import com.gildedrose.items.Sulfuras;
import com.gildedrose.items.interfaces.UpdatableItem;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        UpdatableItem[] items = new UpdatableItem[] {
                new StandardItem("+5 Dexterity Vest", 10, 20), //
                new AgedBrie("Aged Brie", 2, 0), //
                new StandardItem("Elixir of the Mongoose", 5, 7), //
                new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 20),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 9, 20),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 40),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 4, 40),
                new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 4, 49),
                // this conjured item does not work properly yet
                new StandardItem("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (UpdatableItem item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }
}
