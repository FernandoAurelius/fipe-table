package br.com.floresdev.fipe_table.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record BaseBrand(@JsonAlias("codigo") String code, @JsonAlias("nome") String name) {
}
