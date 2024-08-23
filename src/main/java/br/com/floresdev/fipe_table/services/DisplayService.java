package br.com.floresdev.fipe_table.services;

import br.com.floresdev.fipe_table.models.AutomotiveBrand;
import br.com.floresdev.fipe_table.models.AutomotiveYear;
import br.com.floresdev.fipe_table.models.BaseBrand;
import br.com.floresdev.fipe_table.models.BaseModel;

import java.util.List;

public class DisplayService {

    public void startMessage() {
        System.out.println("""
                -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
                Bem-vindo(a) ao FIPE Table! Aqui, você pode consultar opções diversas de automóveis sem burocracia!
                Primeiro, vamos solicitar que você insira a categoria do automóvel que deseja consultar o valor.
                
                ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = !
                ATENÇÃO! Você deve entrar com o exato nome da categoria para que a consulta funcione corretamente.
                ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = ! = !
                
                As categorias são: "CARROS", "MOTOS" e "CAMINHOES" 
                """);
    }

    public void showBaseBrands(List<BaseBrand> baseBrands) {
        baseBrands.forEach(System.out::println);
        System.out.println();
    }

    public void showBaseModels(AutomotiveBrand automotiveBrand) {
        for (BaseModel baseModel : automotiveBrand.baseModels()) {
            System.out.println(baseModel);
        }
        System.out.println();
    }

    public void showAutomotiveYears(List<AutomotiveYear> automotiveYears) {
        automotiveYears.forEach(System.out::println);
    }

}
