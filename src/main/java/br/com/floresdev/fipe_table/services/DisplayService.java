package br.com.floresdev.fipe_table.services;

import br.com.floresdev.fipe_table.models.Model;
import br.com.floresdev.fipe_table.models.Vehicle;
import br.com.floresdev.fipe_table.models.Data;

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
                
                As categorias são: "CARROS", "MOTOS" e "CAMINHOES":\s
                """);
    }

    public void showFipeData(List<Data> baseBrands) {
        baseBrands.forEach(System.out::println);
        System.out.println();
    }

    public void showModels(Model model) {
        for (Data data : model.data()) {
            System.out.println(data);
        }
        System.out.println();
    }

    public void showVehicles(List<Vehicle> vehicles) {
        System.out.println("\n!=!=! INFORMAÇÕES DOS VEÍCULOS A SEGUIR !=!=!\n");
        vehicles.forEach(System.out::println);
    }

}
