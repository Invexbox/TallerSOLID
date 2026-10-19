package Notificaciones;
class NotificacionEmail implements Notificacion {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Email: " + mensaje);
    }
}