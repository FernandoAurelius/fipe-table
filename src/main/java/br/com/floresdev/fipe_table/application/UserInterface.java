package br.com.floresdev.fipe_table.application;

import br.com.floresdev.fipe_table.models.Model;
import br.com.floresdev.fipe_table.services.AutomotiveService;
import br.com.floresdev.fipe_table.services.DisplayService;
import br.com.floresdev.fipe_table.utils.AutomotiveUrlBuilder;

public class UserInterface {

    private DisplayService displayService;
    private UserInteraction userInteraction;
    private AutomotiveService automotiveService;
    private AutomotiveUrlBuilder automotiveUrlBuilder;

    public UserInterface(DisplayService displayService, UserInteraction userInteraction, AutomotiveService automotiveService, AutomotiveUrlBuilder automotiveUrlBuilder) {
        this.displayService = displayService;
        this.userInteraction = userInteraction;
        this.automotiveService = automotiveService;
        this.automotiveUrlBuilder = automotiveUrlBuilder;
    }

    public void start() {
        displayService.startMessage();

        // Recebe a categoria de automóvel e um novo endereço completo com base na categoria
        String category = userInteraction.getCategory();
        String categoryAddress = automotiveUrlBuilder.getCategoryAddress(category);

        // Exibe lista de marcas base
        displayService.showFipeData(automotiveService.getFipeData(categoryAddress));

        // Instancia novo Model e exibe lista de modelos base
        String brandCode = userInteraction.getBrandCode();
        String brandAddress = automotiveUrlBuilder.getBrandAddress(categoryAddress, brandCode);
        Model model = automotiveService.getModel(brandAddress);
        displayService.showModels(model);

        // Cria nova lista de modelos base com base na lista antiga filtrada pelo nome inserido
        String baseModelName = userInteraction.getBaseModelName();
        model = automotiveService.getFilteredModel(model, baseModelName);
        displayService.showModels(model);

        Integer baseModelCode = userInteraction.getBaseModelCode();
        String yearsAddress = automotiveUrlBuilder.getYearsAddress(brandAddress, baseModelCode);
        /* Para cada ano base dentro de Model, instancia novo Vehicle com base no código do ano base
        e armazena numa lista de AutomotiveYear */
        displayService.showVehicles(automotiveService.getVehicles(
                automotiveService.getFipeData(yearsAddress), yearsAddress)
        );
    }

}
