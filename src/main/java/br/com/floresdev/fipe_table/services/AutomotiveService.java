package br.com.floresdev.fipe_table.services;

import br.com.floresdev.fipe_table.models.AutomotiveBrand;
import br.com.floresdev.fipe_table.models.AutomotiveYear;
import br.com.floresdev.fipe_table.models.BaseBrand;
import br.com.floresdev.fipe_table.models.BaseYear;

import java.util.List;
import java.util.stream.Collectors;

public class AutomotiveService {

    private final DataConverter dataConverter = new DataConverter();

    private final String ADDRESS = "https://parallelum.com.br/fipe/api/v1/";

    public String getCategoryAddress(String category) {
        return ADDRESS + category.toLowerCase() + "/marcas/";
    }

    public String getBrandAddress(String categoryAddress, String brandCode) {
        return categoryAddress + brandCode + "/modelos/";
    }

    public String getYearsAddress(String brandAddress, Integer baseModelCode) {
        return brandAddress + baseModelCode + "/anos/";
    }

    public List<BaseBrand> getBaseBrands(String fullAddress) {
        return List.of(dataConverter.convertData(ApiConsumeService.getData(fullAddress), BaseBrand[].class));
    }

    public AutomotiveBrand getAutomotiveBrand(String brandAddress) {
        return dataConverter.convertData(ApiConsumeService.getData(brandAddress + "/modelos/"),
                AutomotiveBrand.class);
    }

    public AutomotiveBrand getFilteredAutomotiveBrand(AutomotiveBrand automotiveBrand, String brandModelName) {
        return new AutomotiveBrand(automotiveBrand.baseModels().stream()
                .filter(b -> b.name().toLowerCase().contains(brandModelName.toLowerCase()))
                .collect(Collectors.toList())
        );
    }

    public List<AutomotiveYear> getAutomotiveYears(List<BaseYear> baseYears, String yearsAddress) {
        return baseYears.stream().map(
                b -> dataConverter.convertData(
                        ApiConsumeService.getData(yearsAddress + b.codigo()), AutomotiveYear.class
                )
        ).collect(Collectors.toList());
    }

    public List<BaseYear> getBaseYears(String yearsAddress) {
        return List.of(dataConverter.convertData(ApiConsumeService.getData(yearsAddress), BaseYear[].class));
    }
}
