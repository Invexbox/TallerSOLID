package Notificaciones;
class NotificacionSMS implements Notificacion {
    @Override
    public void notificar(String mensaje) {
        System.out.println("SMS: " + mensaje);
    }
}