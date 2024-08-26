package br.com.floresdev.fipe_table.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Vehicle(@JsonAlias("TipoVeiculo") Integer type, @JsonAlias("Valor") String price,
                      @JsonAlias("Marca") String brand, @JsonAlias("Modelo") String model,
                      @JsonAlias("AnoModelo") Integer year, @JsonAlias("Combustivel") String fuel,
                      @JsonAlias("CodigoFipe") String fipeCode,
                      @JsonAlias("MesReferencia") String referenceMonth,
                      @JsonAlias("SiglaCombustivel") Character fuelAcronym) {
    @Override
    public String toString() {
        return String.format("""
                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                MODELO: %s
                
                Informações gerais:
                Tipo do veículo: %d | Valor: %s | Marca: %s
                Ano do modelo: %d | Tipo de combustível: %s | Código FIPE: %s
                Mês de referência: %s | Sigla do combustível: %s
                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                """, model, type, price, brand, year, fuel, fipeCode, referenceMonth, fuelAcronym);
    }
}
