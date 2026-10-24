package tema2;

public class enum21oct {
    
    public static void main(String[] args) {
        
        /*
            Somos una empresa de transporte y vamos a ver el estado de los paquetes.
            Pedimos por teclado el estado del paquete como String:
            - PENDIENTE
            - PROCESANDO
            - ENVIADO
            - ENTREGADO
            - CANCELADO

            Según la opción mostraremos el estado del pedido:
            - Tu pedido ha sido recibido y está pendiente de pago
            - Tu pedido se está preparando en el almacén
            - El pedido va en camino con el servicio de mensajería
            - El pedido ha sido entregado con éxito
            - El pedido ha sido cancelado
            - Estado del pedido desconocido (si no es uno de los anteriores)                
        */

            String Estado;

            Estado = IO.readln("CUAL ES EL ESTADO DEL PAQUETE? ");

            switch (Estado.toUpperCase()) { //si pongo una variable seguida de toUpperCase convierte todo a mayuscula
                case "PENDIENTE" -> IO.print("Tu pedido ha sido recibido y está pendiente de pago");
                case "PROCEASADO" -> IO.print("Tu pedido se está preparando en el almacén");
                case "ENVIADO" -> IO.print("El pedido va en camino con el servicio de mensajería");
                case "ENTREGADO" -> IO.print("El pedido ha sido entregado con éxito");
                case "CANCELADO" -> IO.print("Estado del pedido desconocido (si no es uno de los anteriores)");
                default -> IO.println("OPCION INCORRECTA");
            }

    }

}