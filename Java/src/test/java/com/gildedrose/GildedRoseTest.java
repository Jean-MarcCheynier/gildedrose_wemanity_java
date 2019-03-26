package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackstagePass;
import com.gildedrose.items.Conjured;
import com.gildedrose.items.LegendaryItem;
import com.gildedrose.items.StandardItem;
import com.gildedrose.items.interfaces.UpdatableItem;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQualityV0();
        assertEquals("foo", app.items[0].name);
    }
    
    @Test
    public void stadardUpdate() {
        UpdatableItem[] items = new UpdatableItem[] { new  StandardItem("Standard", 1, 30) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(29, app.updatableItems[0].getQuality());
        app.updateQuality();
        assertEquals(27, app.updatableItems[0].getQuality());
    }
    
    @Test
    public void agedBrie() {
        UpdatableItem[] items = new UpdatableItem[] { new  AgedBrie("Aged Brie", 1, 45) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(46, app.updatableItems[0].getQuality());
        app.updateQuality();
        assertEquals(48, app.updatableItems[0].getQuality());
    }
    
    @Test
    public void backstagePass() {
        UpdatableItem[] items = new UpdatableItem[] { new  BackstagePass("Backstage passes to a TAFKAL80ETC concert", 2, 45) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(48, app.updatableItems[0].getQuality());
        app.updateQuality();
        assertEquals(50, app.updatableItems[0].getQuality());
        app.updateQuality();
        assertEquals(0, app.updatableItems[0].getQuality());
    }
    
    @SuppressWarnings("deprecation")
	@Test
    public void oldVSNew() {
        UpdatableItem[] items = new UpdatableItem[] { new  BackstagePass("Backstage passes to a TAFKAL80ETC concert", 2, 45),  new  AgedBrie("Aged Brie", 1, 45) };
        Item[] oldItems = new Item[] { new  Item("Backstage passes to a TAFKAL80ETC concert", 2, 45),  new  Item("Aged Brie", 1, 45) };
        GildedRose app = new GildedRose(items);
        GildedRose oldApp = new GildedRose(oldItems);
        app.updateQuality();
        oldApp.updateQualityV0();
        assertEquals(oldApp.items[0].quality, app.updatableItems[0].getQuality());
        assertEquals(oldApp.items[1].quality, app.updatableItems[1].getQuality());
        app.updateQuality();
        oldApp.updateQualityV0();
        assertEquals(oldApp.items[0].quality, app.updatableItems[0].getQuality());
        assertEquals(oldApp.items[1].quality, app.updatableItems[1].getQuality());        
        app.updateQuality();
        oldApp.updateQualityV0();
        assertEquals(oldApp.items[0].quality, app.updatableItems[0].getQuality());
        assertEquals(oldApp.items[1].quality, app.updatableItems[1].getQuality());
    }
    
    @Test
    public void legendaryItem() {
        UpdatableItem[] items = new UpdatableItem[] { new  LegendaryItem("Legendary", 2, 45) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(45, app.updatableItems[0].getQuality());
        assertEquals(2, app.updatableItems[0].getSellIn());
    }
    
    @Test
    public void conjuredItem() {
        UpdatableItem[] items = new UpdatableItem[] { new  Conjured("Conjured", 2, 45) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(43, app.updatableItems[0].getQuality());
        app.updateQuality();
        assertEquals(41, app.updatableItems[0].getQuality());
        app.updateQuality();
        assertEquals(37, app.updatableItems[0].getQuality());
    }
    
    
    

}
