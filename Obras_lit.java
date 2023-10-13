public class Obras_lit implements Comparable<Obras_lit>{
    private static int codigo = 0;
    private final int codigoFinal;
    private String titulo;
    private String anoPubli;
    private String autor;

    public Obras_lit(String titulo, String anoPubli, String autor){
        codigo++;
        this.codigoFinal = codigo;
        this.titulo = titulo;
        this.anoPubli = anoPubli;
        this.autor = autor;
    }

    public String getAnoPubli(){
        return anoPubli;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getCodigoFinal(){
        return codigoFinal;
    }

   @Override
   public String toString() {
        return "[autor = " + autor + ", codigoFinal = " + codigoFinal + ", titulo = " + titulo + ", anoPubli = " + anoPubli + "]";
    }


    @Override
    public int compareTo(Obras_lit outraObra) {

        int result = this.getAutor().compareTo(outraObra.getAutor());
        return result;
    }
    
}