package Pagos;
class PagoPayPal implements Pago {
    private boolean loggedIn;

    public PagoPayPal(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    @Override
    public boolean realizarCobro(double monto) {
        if (!loggedIn) {
            return false;
        }

        System.out.println("Cobro con PayPal: " + monto);
        return true;
    }
}