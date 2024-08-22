package br.com.floresdev.fipe_table.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AutomotiveModel(List<BaseYear> baseYears) {
}
