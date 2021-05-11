package datas;

import java.time.LocalDate;

public class ExemploDatasJava8 {

    public static void main(String[] args) {

        FormatacaoDatas formatar = new FormatacaoDatas();
        LocalDate hoje = LocalDate.now();
        LocalDate amanha;
        amanha = hoje.plusDays(1);

        System.out.println("Hoje no formato padão LocalDate é " + hoje);
        System.out.println("Hoje no formato Brasil: " + formatar.padraoDoBrasil(hoje));
        System.out.println("Amanhã será " + formatar.padraoDoBrasil(amanha));

    }
}
