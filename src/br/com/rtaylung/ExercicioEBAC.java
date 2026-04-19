package br.com.rtaylung;

public class ExercicioEBAC {

    // Boxing
    Boolean verifyBox = true;
    Boolean verifyBox2 = Boolean.FALSE;
    Long valorLongBox = 123123123l;
    Character valorCharBox = 'a';
    Integer metasBox = 1;
    Float notasBox = 1.5f;
    Double notas2Box = 1.5;
    String nomeBox = "Alef";

    // Unboxing
    boolean verify = Boolean.TRUE;
    long valorLongo = Long.valueOf(123123123L);
    char valorChar = Character.valueOf('A');
    int metas = Integer.valueOf(123);
    float notas = Float.valueOf(123.0f);
    double notas2 = Double.valueOf(123.123);

    String nome = String.valueOf("Alef");


    // ---------- <<EXERCÍCIO>> ------------

    public static void main(String[] args) {
        //Cating

        int carros = 3;
        System.out.println(carros);
        short asdf = (short) carros;
        System.out.println(asdf);

        float media = 2.3f;
        System.out.println(media);
        double media2 = (double) media;
        System.out.println(media2);

        int calcB = 8;
        System.out.println(calcB);
        short calcB2 = (short) calcB;
        System.out.println(calcB2);
    }

}
