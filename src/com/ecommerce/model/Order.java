package com.ecommerce.model;


public class Order {
    private int orderId;
    private int customerId;
    private int productId;
    private int quantity;
    private String status;


    public Order() {}

    public Order(int customerId, int productId, int quantity, String status) {
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
    }

    public int getOrderId() { 
    	return orderId; 
    	}
    public void setOrderId(int orderId) { 
    	this.orderId = orderId; 
    	}
    public int getCustomerId() { 
    	return customerId;
    	}
    public void setCustomerId(int customerId) { 
    	this.customerId = customerId;
    	}
    public int getProductId() { 
    	return productId;
    	}
    public void setProductId(int productId) { 
    	this.productId = productId; 
    	}
    public int getQuantity() { 
    	return quantity; 
    	}
    public void setQuantity(int quantity) { 
    	this.quantity = quantity; 
    	}
    public String getStatus() { 
    	return status; 
    	}
    public void setStatus(String status) {
    	this.status = status;
    }

	public String getUserId() {
		// TODO Auto-generated method stub
		return null;
	}
}
