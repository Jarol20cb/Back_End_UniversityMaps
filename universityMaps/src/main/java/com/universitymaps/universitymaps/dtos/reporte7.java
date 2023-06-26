package com.universitymaps.universitymaps.dtos;

public class reporte7 {
    private String metodoPago;
    private int sumaMonto;

    public reporte7() {
    }

    public reporte7(String metodoPago, int sumaMonto) {
        this.metodoPago = metodoPago;
        this.sumaMonto = sumaMonto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getSumaMonto() {
        return sumaMonto;
    }

    public void setSumaMonto(int sumaMonto) {
        this.sumaMonto = sumaMonto;
    }
}
