package Notificaciones;
class NotificacionSignal implements Notificacion {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Signal: " + mensaje);
    }
}