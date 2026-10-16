public class Factura implements Comprobante {
    @Override
    public void emitir(String ruc, double monto) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
