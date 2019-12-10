package sg.tcc;

import java.io.Serializable;

public class Areas implements Serializable {
	private int codArea;
	private String nomeArea;

        public Areas(int codArea, String nomeArea) {
        this.codArea = codArea;
        this.nomeArea = nomeArea;
        }

        public Areas() { }
        
	public int getCodArea() {
		return this.codArea;
	}

	public void setCodArea(int codArea) {
		this.codArea = codArea;
	}

	public String getNomeArea() {
		return this.nomeArea;
	}

	public void setNomeArea(String nomeArea) {
		this.nomeArea = nomeArea;
	}

    @Override
    public String toString() {
        return "Areas{" + "codArea=" + codArea + ", nomeArea=" + nomeArea + '}';
    }


}