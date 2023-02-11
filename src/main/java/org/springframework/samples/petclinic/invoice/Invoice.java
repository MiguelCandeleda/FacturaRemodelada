package org.springframework.samples.petclinic.invoice;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Invoice {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private Date date;

	@Column(nullable = false)
	private String client;

	@Column(nullable = false)
	private Double total;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	// Getters y setters para cada atributo
}
