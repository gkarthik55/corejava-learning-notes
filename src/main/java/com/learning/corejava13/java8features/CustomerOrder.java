package com.learning.corejava13.java8features;

class CustomerOrder
{
	private String customerName;
	private String product;
	private int quantity;
	private double totalPrice;

	public CustomerOrder(String customerName, String product, int quantity, double totalPrice) {
		this.customerName = customerName;
		this.product = product;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	@Override
	public String toString() {
		return customerName + " | " + product + " | Qty: " + quantity + " | ₹" + totalPrice;
	}
}