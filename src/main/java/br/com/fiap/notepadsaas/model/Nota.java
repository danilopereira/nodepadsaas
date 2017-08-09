package br.com.fiap.notepadsaas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by danilopereira on 08/08/17.
 */
@Document
public class Nota {

    @Id
    private String id;
    private String tipo;
    private String texto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nota)) return false;

        Nota nota = (Nota) o;

        if (id != null ? !id.equals(nota.id) : nota.id != null) return false;
        if (tipo != null ? !tipo.equals(nota.tipo) : nota.tipo != null) return false;
        return texto != null ? texto.equals(nota.texto) : nota.texto == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        result = 31 * result + (texto != null ? texto.hashCode() : 0);
        return result;
    }
}
