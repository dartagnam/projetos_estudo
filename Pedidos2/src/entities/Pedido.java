package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	
	private Date moment;
	private StatusPedido status;
	
	private Cliente cliente;
	private List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido() {
		
	}

	public Pedido(Date moment, StatusPedido status, Cliente cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItem(ItemPedido item) {
		itens.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for (ItemPedido item : itens) {
			soma += item.subTotal();
		}
		
		return soma;
	}

	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pedido realizado em ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido: ");
		for (ItemPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço Total: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	


}
