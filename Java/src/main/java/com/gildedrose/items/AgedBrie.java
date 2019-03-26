package com.gildedrose.items;

public class AgedBrie extends StandardItem {
	

	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		this.setDeltaQ(1);
	}
	
	public void updateQuality() {
		super.updateQuality();
	}

}
