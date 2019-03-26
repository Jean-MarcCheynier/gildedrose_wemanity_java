package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.items.interfaces.UpdatableItem;

public class LegendaryItem extends Item implements UpdatableItem  {

	
	public LegendaryItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);

	}

	/** Sulfuras", being a legendary item, 
	 * never has to be sold or decreases in Quality
	 **/
	@Override
	public void updateQuality() {
		//Nothing happens
	}

	@Override
	public int getQuality() {
		return this.quality;
	}

	@Override
	public int getSellIn() {

		return this.sellIn;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
