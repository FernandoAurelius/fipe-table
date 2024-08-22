package br.com.floresdev.fipe_table.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AutomotiveCategory(List<AutomotiveBrand> brands) {
}
