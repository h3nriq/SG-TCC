package sg.tcc;
public class DefineTemaOrientador {
	private int id;
	private String descricao;
	private double notaFinal;
        Aluno aluno;
        Professor orientador;
        TemasSugeridos tema;

    public DefineTemaOrientador(String descricao, Aluno aluno, Professor orientador, TemasSugeridos tema) {
        //int id,
        //this.id = id;
        //double notaFinal,
        this.descricao = descricao;
        //this.notaFinal = notaFinal;
        this.aluno = aluno;
        this.orientador = orientador;
        this.tema = tema;
    }

    public DefineTemaOrientador() { }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public TemasSugeridos getTema() {
        return tema;
    }

    public void setTema(TemasSugeridos tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Id: " + id + ". Descrição: " + descricao + ". Aluno: " + aluno.getNome() + ". Orientador: " + orientador.getNome()  + ". Tema original: " + tema.getNomeTema();
    }
       
}

