package sg.tcc;

public class Professor_Areas {
    Areas area;
    Professor professor;

    public Professor_Areas(Areas area, Professor professor) {
        this.area = area;
        this.professor = professor;
    }

    public Professor_Areas() { }

    public Areas getArea() {
        return area;
    }

    public void setArea(Areas area) {
        this.area = area;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Area de Interesse: " + area.getNomeArea() + ". Professor: " + professor.getNome() + ".";
    }

    
}


