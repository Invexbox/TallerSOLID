package Facturacion;

public class CalculadoraImpuestos {
    public double calcularImpuestosFactura(double subtotal, double tasa) {
        return subtotal * tasa;
    }
}