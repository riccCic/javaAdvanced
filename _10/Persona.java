package javaOopAdvanced._10;

import java.util.Objects;

public class Persona {
    private String nome;
    private int eta;
    private  String indirizzo;

    public Persona(String nome, int eta, String indirizzo) {
        this.nome = nome;
        this.eta = eta;
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return eta == persona.eta && nome.equals(persona.nome) && indirizzo.equals(persona.indirizzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, eta, indirizzo);
    }
}
