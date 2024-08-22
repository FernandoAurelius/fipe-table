package br.com.floresdev.fipe_table.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BaseYear(@JsonAlias("codigo") String codigo, @JsonAlias("nome") String nome) {
}
