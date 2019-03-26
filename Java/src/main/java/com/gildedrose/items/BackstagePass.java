package com.gildedrose.items;

public class BackstagePass extends StandardItem {

	public BackstagePass(String name, int sellIn, int quality) {
		super(name, sellIn, quality);	
	}
	
	@Override
	public void updateQuality() {
		if(this.getSellIn()<=10) {
			this.setDeltaQ(2);
		}
		if(this.getSellIn()<=5) {
			this.setDeltaQ(3);
		}
		super.updateQuality();
		if(this.getSellIn()<0) {
			this.setQuality(0);
		}
	}
	
	

}
