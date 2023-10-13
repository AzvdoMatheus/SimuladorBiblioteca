public class Revistas extends Obras_lit{
    private final int codigo_ISSN;
    private static int ISSN = 0;
    private String periodicidade;

    public Revistas(String titulo, String anoPubli, String autor, String periodicidade){
        super(titulo, anoPubli, autor);
        ISSN++;
        this.codigo_ISSN = ISSN;
        this.periodicidade = periodicidade;
    }

    public String getPeriodicidade(){
        return periodicidade;
    }

    public int GetCodigoISSN(){
        return codigo_ISSN;
    }

    @Override
    public String toString() {
        return super.toString() + " [codigo_ISSN = " + codigo_ISSN + ", periodicidade = " + periodicidade + "]";
    }
}
