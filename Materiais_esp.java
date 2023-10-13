public class Materiais_esp extends Obras_lit{
    private String descricao;

    public Materiais_esp(String titulo, String anoPubli, String autor, String descricao){
        super(titulo, anoPubli, autor);
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return super.toString() + " [descricao = " + descricao + "]";
    }

    public String getDescricao(){
        return descricao;
    }

    
}
