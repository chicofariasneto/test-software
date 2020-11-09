public class Credito {

    /**
     * Verifica se é possível obter crédito de acordo com as informações nos parâmetros
     *
     * @param parcelas int
     * @param confiavel boolean
     * @param salario double
     * @return boolean
     */
    public boolean concedeCredito(int parcelas, boolean confiavel, double salario) {
        if (parcelas > 12)
            return false;
        else if (confiavel == false)
            return false;
        else if (salario < 5000)
            return false;
        else
            return true;
    }

    /**
     * Verifica se é possível conceder crédito então, se sim, retorna o valor do crédito (20000)
     * caso não seja, retorna 0 (Zero)
     *
     * @param parcelas
     * @param confiavel
     * @param salario
     * @return boolean
     */
    public double definirCredito(int parcelas, boolean confiavel, double salario) {
        if (concedeCredito(parcelas, confiavel, salario) == true)
            return 20000;
        else
            return 0;
    }

}