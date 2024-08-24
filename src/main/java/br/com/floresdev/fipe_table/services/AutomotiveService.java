package br.com.floresdev.fipe_table.services;

import br.com.floresdev.fipe_table.models.AutomotiveBrand;
import br.com.floresdev.fipe_table.models.AutomotiveYear;
import br.com.floresdev.fipe_table.models.BaseBrand;
import br.com.floresdev.fipe_table.models.BaseYear;

import java.util.List;
import java.util.stream.Collectors;

public class AutomotiveService {

    private final DataConverter dataConverter = new DataConverter();

    public List<BaseBrand> getBaseBrands(String categoryAddress) {
        return List.of(dataConverter.convertData(categoryAddress, BaseBrand[].class));
    }

    public AutomotiveBrand getAutomotiveBrand(String brandAddress) {
        return dataConverter.convertData(brandAddress,
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
                b -> dataConverter.convertData(yearsAddress + b.codigo(), AutomotiveYear.class)
        ).collect(Collectors.toList());
    }

    public List<BaseYear> getBaseYears(String yearsAddress) {
        return List.of(dataConverter.convertData(yearsAddress, BaseYear[].class));
    }
}
