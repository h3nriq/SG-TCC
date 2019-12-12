package sg.tcc;

public class Avaliadores {
        DefineTemaOrientador proposta;
        Professor avaliador;
	private double nota;

    public Avaliadores(DefineTemaOrientador proposta, Professor avaliador) {
        this.proposta = proposta;
        this.avaliador = avaliador;
    }
        
    public Avaliadores() { }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public DefineTemaOrientador getProposta() {
        return proposta;
    }

    public void setProposta(DefineTemaOrientador proposta) {
        this.proposta = proposta;
    }

    public Professor getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Professor avaliador) {
        this.avaliador = avaliador;
    }

    @Override
    public String toString() {
        return "Proposta=" + proposta.getId() + ", avaliador=" + avaliador + '}';
    }
        
    
    
}