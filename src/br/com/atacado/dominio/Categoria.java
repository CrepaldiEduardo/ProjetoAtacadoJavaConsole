package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Categoria {
    private int codigo;
    private String descricao;
    private LocalDate datadeInclusao;
    private List<Subcategoria> subcategoria;

    public List<Subcategoria> getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(List<Subcategoria> subcategoria) {
        this.subcategoria = subcategoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDatadeInclusao() {
        return datadeInclusao;
    }

    public void setDatadeInclusao(LocalDate datadeInclusao) {
        this.datadeInclusao = datadeInclusao;
    }

    public Categoria() {
    }

    public Categoria(int codigo, String descricao, LocalDate datadeInclusao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.datadeInclusao = datadeInclusao;
    }

}
