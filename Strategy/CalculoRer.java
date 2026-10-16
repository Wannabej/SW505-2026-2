public class CalculoRer implements EstrategiaCalculoTributario {
    @Override
    public void calcular(double base) {
        System.out.println("Monto base:" + base + " Se paga un 18% mas de IGV: " + (base * 118 / 100));
    }

}
