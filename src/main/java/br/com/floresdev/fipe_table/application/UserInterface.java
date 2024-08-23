package br.com.floresdev.fipe_table.application;

import br.com.floresdev.fipe_table.services.AutomotiveService;
import br.com.floresdev.fipe_table.services.DisplayService;

import java.util.List;

public class UserInterface {

    private final DisplayService displayService = new DisplayService();
    private final UserInteraction userInteraction = new UserInteraction();
    private final AutomotiveService automotiveService = new AutomotiveService();

    public void start() {
        displayService.startMessage();

        // Recebe a categoria de automóvel e um novo endereço completo com base na categoria
        String category = userInteraction.getCategory();
        String fullAddress = automotiveService.getFullAddress(category);

        // Exibe lista de BaseBrands
        displayService.showBaseBrands(List.of(automotiveService.getBaseBrands(fullAddress)));

        // Instancia novo AutomotiveBrand e exibe lista de BaseModels
        String brandCode = userInteraction.getBrandCode();
        displayService.showBaseModels(automotiveService.getAutomotiveBrand(brandCode, fullAddress));

//        String baseModelName = userInteraction.getBaseModelName();
//        // Cria nova lista de BaseModel com base na lista antiga filtrada pelo nome inserido
//        /* Exibe a nova lista */
//        displayService.showBaseModels(null);
//        Integer baseModelCode = userInteraction.getBaseModelCode();
//        // Instancia novo AutomotiveModel com base no código fornecido
//        /* Para cada BaseYear dentro de AutomotiveModel, instancia novo AutomotiveYear com base no código do BaseYear
//        e armazena numa lista de AutomotiveYear */
//        displayService.showAutomotiveYears(null);
    }

}
