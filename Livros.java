public class Livros extends Obras_lit{
    private int nroPaginas;
    private String genero;

    public Livros(String titulo, String anoPubli, String autor, int nroPaginas, String genero){
        super(titulo, anoPubli, autor);
        this.nroPaginas = (nroPaginas > 0)? nroPaginas : 1;
        this.genero = genero;
    }

    public String getGenero(){
        return genero;
    }

    public int getNroPaginas(){
        return nroPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + " [nroPaginas = " + nroPaginas + ", genero = " + genero + "]";
    }
   
}
