public class CalculoRus implements EstrategiaCalculoTributario {
    @Override
    public void calcular(double base) {
        System.out.println("Monto base:" + base +" Se paga el monto base: " + base);
    }

}
