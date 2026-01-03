package je05_tipos_wrappers;

public class TiposWrappers {

    public static void main(String[] args) {
        //exemplo de conversao explicita
        double numeroDouble = 123.36;
        int numeroInt = (int) numeroDouble;
        System.out.println(numeroInt);

        //exemplo de conversao via wrappers
        Double d = 100.0;
        Integer i = d.intValue();
        System.out.println(i);

        //comparacao de objetos wrappers
        Integer obj01 = Integer.valueOf("100");
        Integer obj02 = Integer.valueOf("100");

        System.out.println(obj01.equals(obj02));

        System.out.println(obj01.compareTo(obj02));

    }
}
