package br.com.floresdev.fipe_table.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AutomotiveYear(@JsonAlias("TipoVeiculo") Integer type, @JsonAlias("Valor") String price,
                             @JsonAlias("Marca") String name, @JsonAlias("Modelo") String model,
                             @JsonAlias("AnoModelo") Integer year, @JsonAlias("Combustivel") String fuel,
                             @JsonAlias("CodigoFipe") String fipeCode,
                             @JsonAlias("MesReferencia") String referenceMonth,
                             @JsonAlias("SiglaCombustivel") Character fuelAcronym) {
}
