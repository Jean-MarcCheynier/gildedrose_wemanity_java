package com.gildedrose.items.interfaces;

public interface UpdatableItem {
	    
    
    /**
     * Update the quality of the Item
     */
    public void updateQuality();
    
    /**
     * 
     * @return the quality of the item
     */
    public int getQuality();
    /**
     * 
     * @return the number of day the item has to be sold
     */
    public int getSellIn();
    /**
     * 
     * @return the name of the item
     */
    public String getName();

}
