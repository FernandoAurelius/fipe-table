package br.com.floresdev.fipe_table.application;

import br.com.floresdev.fipe_table.models.AutomotiveBrand;
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

        // Exibe lista de BaseBrands
        displayService.showBaseBrands(automotiveService.getBaseBrands(categoryAddress));

        // Instancia novo AutomotiveBrand e exibe lista de BaseModels
        String brandCode = userInteraction.getBrandCode();
        String brandAddress = automotiveUrlBuilder.getBrandAddress(categoryAddress, brandCode);
        AutomotiveBrand automotiveBrand = automotiveService.getAutomotiveBrand(brandAddress);
        displayService.showBaseModels(automotiveBrand);

        // Cria nova lista de BaseModel com base na lista antiga filtrada pelo nome inserido
        String baseModelName = userInteraction.getBaseModelName();
        automotiveBrand = automotiveService.getFilteredAutomotiveBrand(automotiveBrand, baseModelName);
        displayService.showBaseModels(automotiveBrand);

        Integer baseModelCode = userInteraction.getBaseModelCode();
        String yearsAddress = automotiveUrlBuilder.getYearsAddress(brandAddress, baseModelCode);
        /* Para cada BaseYear dentro de AutomotiveModel, instancia novo AutomotiveYear com base no código do BaseYear
        e armazena numa lista de AutomotiveYear */
        displayService.showAutomotiveYears(automotiveService.getAutomotiveYears(
                automotiveService.getBaseYears(yearsAddress), yearsAddress)
        );
    }

}
