package sg.tcc;

public class ProjetosPesquisa {
	private int id;
	private String nomeProjeto;
	private String descricao;

    public ProjetosPesquisa(int nrProjeto, String nomeProjeto, String descricao) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
    }

    public ProjetosPesquisa() { }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Id=" + id + ". Nome do Projeto: " + nomeProjeto + ". Descrição: " + descricao;
    }



}