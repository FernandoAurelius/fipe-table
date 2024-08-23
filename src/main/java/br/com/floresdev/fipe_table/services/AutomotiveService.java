package br.com.floresdev.fipe_table.services;

import br.com.floresdev.fipe_table.models.AutomotiveCategory;

public class AutomotiveService {

    private final DataConverter dataConverter = new DataConverter();

    private final String ADDRESS = "https://parallelum.com.br/fipe/api/v1/";

    public AutomotiveCategory getAutomotiveCategory(String category) {
        return new AutomotiveCategory(
                dataConverter.convertData(
                        ApiConsumeService.getData(ADDRESS + category.toLowerCase() + "/marcas/"),
                        AutomotiveCategory.class
                ).baseBrands()
        );
    }
}
