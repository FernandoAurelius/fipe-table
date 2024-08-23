package br.com.floresdev.fipe_table.services;

import br.com.floresdev.fipe_table.models.AutomotiveBrand;
import br.com.floresdev.fipe_table.models.BaseBrand;
import java.util.stream.Collectors;

public class AutomotiveService {

    private final DataConverter dataConverter = new DataConverter();

    private final String ADDRESS = "https://parallelum.com.br/fipe/api/v1/";

    public String getFullAddress(String category) {
        return ADDRESS + category.toLowerCase() + "/marcas/";
    }

    public BaseBrand[] getBaseBrands(String fullAddress) {
        return dataConverter.convertData(ApiConsumeService.getData(fullAddress), BaseBrand[].class);
    }

    public AutomotiveBrand getAutomotiveBrand(String brandCode, String fullAddress) {
        return dataConverter.convertData(ApiConsumeService.getData(fullAddress + brandCode + "/modelos/"),
                AutomotiveBrand.class);
    }

    public AutomotiveBrand getFilteredAutomotiveBrand(AutomotiveBrand automotiveBrand, String brandModelName) {
        return new AutomotiveBrand(automotiveBrand.baseModels().stream()
                .filter(b -> b.name().toLowerCase().contains(brandModelName.toLowerCase()))
                .collect(Collectors.toList())
        );
    }

}
