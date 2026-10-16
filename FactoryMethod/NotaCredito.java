public class NotaCredito implements Comprobante {
    @Override
    public void emitir(String ruc, double monto) {
        System.out.println("Enviando correo: " + mensaje);
    }

    String tipo();
    
}
