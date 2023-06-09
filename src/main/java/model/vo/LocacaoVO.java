package model.vo;

import java.time.LocalDate;

public class LocacaoVO {
	private int id;
	private CarroVO carro;
	private ClienteVO cliente;
	private LocalDate dataLocacao;
	private LocalDate dataPrevistaDevolucao;
	private LocalDate dataEfetivaDevolucao;
	private int valorPrevisto;
	private int valorEfetivo;
	private double multa;
	private boolean estado;
	
	public LocacaoVO() {
		super();
	}
	
	public LocacaoVO (
			int id, 
			CarroVO carro, 
			ClienteVO cliente, 
			LocalDate dataLocacao, 	
			LocalDate dataPrevistaDevolucao, 
			LocalDate dataEfetivaDevolucao, 
			int valorPrevisto,
			int valorEfetivo,
			int multa,
			boolean estado
	) {
		super();
		this.id = id;
		this.carro = carro;
		this.cliente = cliente;
		this.dataLocacao = dataLocacao;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
		this.dataEfetivaDevolucao = dataEfetivaDevolucao;
		this.valorPrevisto = valorPrevisto;
		this.valorEfetivo = valorEfetivo;
		this.multa = multa;
		this.estado = estado;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public CarroVO getCarro() {
		return carro;
	}
	public void setCarro(CarroVO carro) {
		this.carro = carro;
	}
	
	public ClienteVO getCliente() {
		return cliente;
	}
	
	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}
	
	public LocalDate getDataLocacao() {
		return dataLocacao;
	}
	
	public void setDataLocacao(LocalDate dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	
	public LocalDate getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}
	
	public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}
	
	public LocalDate getDataEfetivaDevolucao() {
		return dataEfetivaDevolucao;
	}
	
	public void setDataEfetivaDevolucao(LocalDate dataEfetivaDevolucao) {
		this.dataEfetivaDevolucao = dataEfetivaDevolucao;
	}
	
	public int getValorPrevisto() { 
		return valorPrevisto;
	}
	
	public void setValorPrevisto(int valor) {
		this.valorPrevisto = valor;
	}
	
	public int getValorEfetivo() {
		return valorEfetivo;
	}
	
	public void setValorEfetivo(int valorEfetivo) {
		this.valorEfetivo = valorEfetivo;
	}
	
	public double getMulta() {
		return multa;
	}
	
	public void setMulta(int multa) {
		this.multa = multa;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return id + " / " + carro;
	}

}