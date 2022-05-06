public class Aluno {
    private String nome;
    private double notaFinal;

    public Aluno(String nome, int media1, int media2) {
        this.nome = nome;
        this.notaFinal = (media1 + media2)/2.0;

    }

    public double getNotaFinal(){
        return notaFinal;
    }


}
