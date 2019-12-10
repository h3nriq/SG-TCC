package sg.tcc;

public class TemasSugeridos {
	private int codTema;
	private String nomeTema;
	private boolean reservado;
        Professor professor;
        ProjetosPesquisa projetospesquisa;

    public TemasSugeridos(int codTema, String nomeTema, boolean reservado, Professor professor) {
        this.codTema = codTema;
        this.nomeTema = nomeTema;
        this.reservado = reservado;
        this.professor = professor;
        this.projetospesquisa = projetospesquisa;
    }

    public TemasSugeridos() {     }

    public int getCodTema() {
        return codTema;
    }

    public void setCodTema(int codTema) {
        this.codTema = codTema;
    }

    public String getNomeTema() {
        return nomeTema;
    }

    public void setNomeTema(String nomeTema) {
        this.nomeTema = nomeTema;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ProjetosPesquisa getProjetospesquisa() {
        return projetospesquisa;
    }

    public void setProjetospesquisa(ProjetosPesquisa projetospesquisa) {
        this.projetospesquisa = projetospesquisa;
    }

    @Override
    public String toString() {
        return "TemasSugeridos{" + "codTema=" + codTema + ", nomeTema=" + nomeTema + ", reservado=" + reservado + ", professor=" + professor + ", projetospesquisa=" + projetospesquisa + '}';
    }
    


}