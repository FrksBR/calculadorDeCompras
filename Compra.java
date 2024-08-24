import java.util.UUID;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private Double valor;

    public Compra(Double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;

    }
    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descricao + '('+ valor +')';
    }

    @Override
    public int compareTo(Compra o) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(o.valor));
    }
}
