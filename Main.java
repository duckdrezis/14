public class Main {

    public static void main(String[] args) {

        Aluno aluno05 = new AlunoPosGraduacao(10.0, 8.0, 7.0, 4.0, 5.0);
        aluno05.setNome("Bruno");

        Aluno aluno04 = new AlunoMestrado(10.0, 8.0, 7.0, 4.0, 5.0);
        aluno04.setNome("Cleber");

        Boletim boletim = new Boletim(aluno05);
        boletim.imprimir();

        Boletim boletim2 = new Boletim(aluno04);
        boletim2.imprimir();
    }
}