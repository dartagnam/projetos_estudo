package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	private List<OrderStatus> itens = new ArrayList<>();

	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, List<OrderStatus> itens) {
		this.moment = moment;
		this.status = status;
		this.itens = itens;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderStatus> getItem() {
		return itens;
	}

	public void additem(OrderStatus item) {
		itens.add(item);
	}
	
	public void removeitem(OrderStatus item) {
		itens.remove(item);
	}
	
	
	
}
