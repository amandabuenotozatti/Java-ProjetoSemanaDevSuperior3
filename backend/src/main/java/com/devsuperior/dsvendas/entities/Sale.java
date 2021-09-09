package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
	
	public Sale() {		
	}

	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

	Long getId() {
		return id;
	}

	void setId(Long id) {
		this.id = id;
	}

	Integer getVisited() {
		return visited;
	}

	void setVisited(Integer visited) {
		this.visited = visited;
	}

	Integer getDeals() {
		return deals;
	}

	void setDeals(Integer deals) {
		this.deals = deals;
	}

	Double getAmount() {
		return amount;
	}

	void setAmount(Double amount) {
		this.amount = amount;
	}

	LocalDate getDate() {
		return date;
	}

	void setDate(LocalDate date) {
		this.date = date;
	}

	Seller getSeller() {
		return seller;
	}

	void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	
	
}
