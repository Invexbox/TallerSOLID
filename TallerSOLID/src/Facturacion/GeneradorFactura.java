package Facturacion;

public class GeneradorFactura {
    public void generarFactura(double subtotal, double impuestos) {
        System.out.println("Factura");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Impuestos: " + impuestos);
        System.out.println("Total: " + (subtotal + impuestos));
    }
}