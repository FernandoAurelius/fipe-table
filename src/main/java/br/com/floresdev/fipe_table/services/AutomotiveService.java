package br.com.floresdev.fipe_table.services;

import br.com.floresdev.fipe_table.models.Data;
import br.com.floresdev.fipe_table.models.Model;
import br.com.floresdev.fipe_table.models.Vehicle;

import java.util.List;
import java.util.stream.Collectors;

public class AutomotiveService {

    private final DataConverter dataConverter = new DataConverter();

    public List<Data> getFipeData(String categoryAddress) {
        return List.of(dataConverter.convertData(categoryAddress, Data[].class));
    }

    public Model getModel(String modelAddress) {
        return dataConverter.convertData(modelAddress,
                Model.class);
    }

    public Model getFilteredModel(Model model, String modelName) {
        return new Model(model.data().stream()
                .filter(b -> b.name().toLowerCase().contains(modelName.toLowerCase()))
                .collect(Collectors.toList())
        );
    }

    public List<Vehicle> getVehicles(List<Data> baseYears, String yearsAddress) {
        return baseYears.stream().map(
                b -> dataConverter.convertData(yearsAddress + b.code(), Vehicle.class)
        ).collect(Collectors.toList());
    }
}
