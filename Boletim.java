public class Boletim {

    private AlunoFundamental alunoFundamental;
    private AlunoMedio alunoMedio;
    private AlunoFaculdade alunoFaculdade;
    private  Aluno alunoPosgraduação;
    private  Aluno alunoMestrado;
    private Aluno aluno;

    public Boletim(Aluno aluno){
        this.aluno = aluno;

    }
    public void imprimir(){
        System.out.println("O aluno " + aluno.getNome() + " tem a média: " + aluno.calculaMediaGeral());
    }
}