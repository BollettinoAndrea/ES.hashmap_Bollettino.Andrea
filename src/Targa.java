import java.util.*;

class Targa {
    private String numero;

    public Targa(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Targa targa = (Targa) obj;
        return numero.equals(targa.numero);
    }

    @Override
    public int hashCode() {
        return numero.hashCode();
    }

    @Override
    public String toString() {
        return numero;
    }
}
