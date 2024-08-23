package br.com.floresdev.fipe_table.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BaseBrand(@JsonAlias("codigo") String code, @JsonAlias("nome") String name) {
    @Override
    public String toString() {
        return String.format("""
                Código: %s | Nome: %s
                """, code, name);
    }
}
