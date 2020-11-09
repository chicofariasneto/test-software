import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas = new ArrayList<Double>();
    //	private double[] notas = new double[30];
    private double frequencia;

    public void adicionaNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        int numNotas = notas.size();
        double soma = 0;
        for (Double nota : notas)
            soma += nota;
        return soma / numNotas;
    }

    public boolean aprovado() {
        boolean aprovado;
        if (this.getFrequencia() >= 75 && this.calcularMedia() >= 5)
            aprovado = true;
        else
            aprovado = false;
        return aprovado;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

}