package br.com.floresdev.fipe_table.application;

import br.com.floresdev.fipe_table.services.AutomotiveService;
import br.com.floresdev.fipe_table.services.DisplayService;

public class UserInterface {

    private final DisplayService displayService = new DisplayService();
    private final UserInteraction userInteraction = new UserInteraction();
    private final AutomotiveService automotiveService = new AutomotiveService();

    public void start() {
        displayService.startMessage();
        String category = userInteraction.getCategory();
        // Instancia um novo AutomotiveCategory
        displayService.showBaseBrands(automotiveService.getAutomotiveCategory(category).baseBrands());
        String brandCode = userInteraction.getBrandCode();
        // Instancia um novo AutomotiveBrand
        displayService.showBaseModels(null);
        String baseModelName = userInteraction.getBaseModelName();
        // Cria nova lista de BaseModel com base na lista antiga filtrada pelo nome inserido
        /* Exibe a nova lista */
        displayService.showBaseModels(null);
        Integer baseModelCode = userInteraction.getBaseModelCode();
        // Instancia novo AutomotiveModel com base no código fornecido
        /* Para cada BaseYear dentro de AutomotiveModel, instancia novo AutomotiveYear com base no código do BaseYear
        e armazena numa lista de AutomotiveYear */
        displayService.showAutomotiveYears(null);
    }

}
