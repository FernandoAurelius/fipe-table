package br.com.floresdev.fipe_table.utils;

public class AutomotiveUrlBuilder {
    public String getCategoryAddress(String category) {
        return "https://parallelum.com.br/fipe/api/v1/" + category.toLowerCase() + "/marcas/";
    }

    public String getBrandAddress(String categoryAddress, String brandCode) {
        return categoryAddress + brandCode + "/modelos/";
    }

    public String getYearsAddress(String brandAddress, Integer baseModelCode) {
        return brandAddress + baseModelCode + "/anos/";
    }
}

