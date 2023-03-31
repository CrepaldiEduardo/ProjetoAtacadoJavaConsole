package br.com.atacado.dominio;

import java.time.LocalDate;

public class Veiculo extends Frota {

    private int codigoFrota;
    private String placa;

    public int getCodigoFrota() {
        return codigoFrota;
    }

    public void setCodigoFrota(int codigoFrota) {
        this.codigoFrota = codigoFrota;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Veiculo(int codigo, String descricao, LocalDate datainsert) {
        super(codigo, descricao, datainsert);
    }

}
