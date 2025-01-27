package entities;

import java.util.Date;

public class ContratoHr {
	private Date data;
	private Double vrHr;
	private Integer hr;
	
	public ContratoHr() {
		
	}

	public ContratoHr(Date data, Double vrHr, Integer hr) {
		this.data = data;
		this.vrHr = vrHr;
		this.hr = hr;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getVrHr() {
		return vrHr;
	}

	public void setVrHr(Double vrHr) {
		this.vrHr = vrHr;
	}

	public Integer getHr() {
		return hr;
	}

	public void setHr(Integer hr) {
		this.hr = hr;
	}
	
	public double valorTotal() {
		return vrHr * hr;
	}
	
	
	
	
}
