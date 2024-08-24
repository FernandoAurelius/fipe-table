package br.com.floresdev.fipe_table.application;

import br.com.floresdev.fipe_table.models.AutomotiveBrand;
import br.com.floresdev.fipe_table.services.AutomotiveService;
import br.com.floresdev.fipe_table.services.DisplayService;

public class UserInterface {

    private final DisplayService displayService = new DisplayService();
    private final UserInteraction userInteraction = new UserInteraction();
    private final AutomotiveService automotiveService = new AutomotiveService();

    public void start() {
        displayService.startMessage();

        // Recebe a categoria de automóvel e um novo endereço completo com base na categoria
        String category = userInteraction.getCategory();
        String categoryAddress = automotiveService.getCategoryAddress(category);

        // Exibe lista de BaseBrands
        displayService.showBaseBrands(automotiveService.getBaseBrands(categoryAddress));

        // Instancia novo AutomotiveBrand e exibe lista de BaseModels
        String brandCode = userInteraction.getBrandCode();
        String brandAddress = automotiveService.getBrandAddress(categoryAddress, brandCode);
        AutomotiveBrand automotiveBrand = automotiveService.getAutomotiveBrand(brandAddress);
        displayService.showBaseModels(automotiveBrand);

        // Cria nova lista de BaseModel com base na lista antiga filtrada pelo nome inserido
        String baseModelName = userInteraction.getBaseModelName();
        automotiveBrand = automotiveService.getFilteredAutomotiveBrand(automotiveBrand, baseModelName);
        displayService.showBaseModels(automotiveBrand);

        Integer baseModelCode = userInteraction.getBaseModelCode();
        String yearsAddress = automotiveService.getYearsAddress(brandAddress, baseModelCode);
        /* Para cada BaseYear dentro de AutomotiveModel, instancia novo AutomotiveYear com base no código do BaseYear
        e armazena numa lista de AutomotiveYear */
        displayService.showAutomotiveYears(automotiveService.getAutomotiveYears(
                automotiveService.getBaseYears(yearsAddress), yearsAddress)
        );
    }

}
