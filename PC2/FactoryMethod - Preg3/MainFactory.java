public class MainFactory {
    public static void main(String[] args) {
       
        EmisorComprobante factoryEmail = new EmailFactory();
        factoryEmail.procesarYEnviar("¡Bienvenido a la plataforma!");

        
        EmisorComprobante factorySMS = new SMSFactory();
        factorySMS.procesarYEnviar("Tu código de verificación es 1234");

        EmisorComprobante factorySMS = new SMSFactory();
        factorySMS.procesarYEnviar("Tu código de verificación es 1234");
    }
}
