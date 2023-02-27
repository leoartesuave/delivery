package com.delivery.delivery.model;



import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "pedidos")
public class pedidos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@NotBlank(message = "nome!")
	@Size(min = 3, max = 100, message = "nome deve ter menos de 100 caracteres")
	private String nome;
	
	@NotBlank(message = "pedido!")
	@Size(min = 3, max = 100, message = "pedido deve ter menos de 100 caracteres")
	private String pedido;
	
	@NotBlank(message = "endereco!")
	@Size(min = 3, max = 100, message = "endereco deve ter menos de 100 caracteres")
	private String endereco;
	
	@NotBlank(message = "cpf!")
	@Size(min = 11, max = 11, message = "nome deve ter menos de 100 caracteres")
	private int cpf;

	@UpdateTimestamp
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
}
