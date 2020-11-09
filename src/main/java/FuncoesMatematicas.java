public class FuncoesMatematicas {

    public static long calcularPotencia(int base, int expoente) {
        long resultado = 1;
        int p;
        if (expoente < 0)
            p = 0 - expoente;
        else
            p = expoente;
        while (p != 0) {
            resultado *= base;
            p = p - 1;
        }
        if (expoente < 0)
            resultado = 1 / resultado;
        return resultado;
    }


    public static long calcularFatorial(int numero) {
        long resultado = 1;
        for (int contador = numero; contador >= 1; contador--)
            resultado *= contador;
        return resultado;
    }
}