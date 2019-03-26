package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.items.interfaces.UpdatableItem;

public class StandardItem extends Item implements UpdatableItem {
	
	private int deltaQ = -1;
	private static int MAXQUAL = 50;
	private static int MINQUAL = 0;
	
	public StandardItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getSellIn() {
		return this.sellIn;
	}

	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	@Override
	public int getQuality() {
		return this.quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getDeltaQ() {
		return deltaQ;
	}

	public void setDeltaQ(int deltaQ) {
		this.deltaQ = deltaQ;
	}

	public void updateQuality() {
		/* At the end of each day our system lowers both values for every item */
		this.sellIn--;	
		
		/* Once the sell by date has passed, Quality degrades twice as fast */
		if(this.sellIn<0) {
			this.quality+=2*deltaQ;
		}else {
			this.quality+=deltaQ;
		}
		/* The Quality of an item is never negative */
		this.quality = (quality<=MINQUAL)?MINQUAL:quality;
		/*The Quality of an item is never more than 50*/
		this.quality = (quality>=MAXQUAL)?MAXQUAL:quality;

	}

}
