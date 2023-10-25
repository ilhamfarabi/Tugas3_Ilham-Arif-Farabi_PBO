public class DemoKonversiSuhu {
    public static void main (String[] args){
        KonversiSuhu2 panjang = new KonversiSuhu2();
        System.out.println("20 Celcius to fahrenheit = "+panjang.celciusToFahrenheit(20));
        System.out.println("20 Celcius to Reamur = "+panjang.celciusToReamur(20));
        System.out.println("20 Fahrenheit to Reamur = "+panjang.fahrenheitToReamur(20));
    }

}