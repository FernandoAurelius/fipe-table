package br.com.floresdev.fipe_table.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AutomotiveCategory(List<BaseBrand> baseBrands) {
    @Override
    public String toString() {
        return baseBrands.toString();
    }
}
