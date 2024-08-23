package br.com.floresdev.fipe_table.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BaseModel(@JsonAlias("codigo") Integer code, @JsonAlias("nome") String name) {
    @Override
    public String toString() {
        return String.format("""
                Código: %d | Nome: %s
                """, code, name);
    }
}
