package Exemplo01;

public class Disciplina {
    private String nome;
    private Aluno aluno;
    private Professor professor;

    public Disciplina(Aluno aluno, String nome, Professor professor) {
        this.aluno = aluno;
        this.nome = nome;
        this.professor = professor;
    }

    public Disciplina(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void cadastrarAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void ministrarDisciplina(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina{" + " nome= '" + nome + '\'' + ",  aluno=" + aluno.nome + ",  professor=" + professor.nome + '}';
    }
}
