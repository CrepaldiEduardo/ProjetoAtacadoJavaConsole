package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Subcategoria {
    private int codigo;
    private int codigoCategoria;
    private String categoria;
    private LocalDate datadeInclusao;
    private List<Produto> produtos;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDatadeInclusao() {
        return datadeInclusao;
    }

    public void setDatadeInclusao(LocalDate datadeInclusao) {
        this.datadeInclusao = datadeInclusao;
    }

    public Subcategoria() {
    }

    public Subcategoria(int codigo, int codigoCategoria, String categoria, LocalDate datadeInclusao) {
        this.codigo = codigo;
        this.codigoCategoria = codigoCategoria;
        this.categoria = categoria;
        this.datadeInclusao = datadeInclusao;
    }

}
