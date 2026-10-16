public class CalculoGeneral implements EstrategiaCalculoTributario {
    @Override
    public void calcular(double base) {
        System.out.println("Monto base:" + base +" Se paga un 18% mas de IGV, mas una percepcion de 2%: " + (base * 118 / 100)*(102/100));
    }
    
}
