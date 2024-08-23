package br.com.floresdev.fipe_table.application;

import java.util.Scanner;

public class UserInteraction {

    private static final Scanner SC = new Scanner(System.in);

    public String getCategory() {
        System.out.print("Entre com a categoria aqui: ");
        return SC.next();
    }

    public String getBrandCode() {
        System.out.print("Com base na lista de marcas acima, entre com o código da marca que deseja consultar: ");
        return SC.next();
    }

    public String getBaseModelName() {
        System.out.print("Entre com um trecho do nome do veículo que gostaria de consultar: ");
        return SC.nextLine();
    }

    public Integer getBaseModelCode() {
        System.out.print("Com base nos modelos acima, entre com o código do modelo que deseja consultar: ");
        return SC.nextInt();
    }

}
