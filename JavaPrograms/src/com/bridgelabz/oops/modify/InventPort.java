package com.bridgelabz.oops.modify;

import java.util.List;



public class InventPort {
	private List<Inventory> stocks;

	public double getTotalStocks() {
		long totalStocks = 0;
		for (int i = 0; i < stocks.size(); i++) {
			totalStocks += stocks.get(i).getWeight();
		}
		return totalStocks;
	}

	public double getTotalStockValue() {
		long totalStockValue = 0;
		for (int i = 0; i < stocks.size(); i++) {
			totalStockValue += stocks.get(i).getPrice() * stocks.get(i).getWeight();
		}
		return totalStockValue;
	}

	public  List<Inventory> getStocks() {
		return stocks;
	}

	public void setStocks(List<Inventory> stocks) {
		this.stocks = stocks;
	}

}
