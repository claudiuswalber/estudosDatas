package datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatacaoDatas {

    public static String padraoDoBrasil (LocalDate dataParaFormatar){
        DateTimeFormatter formatadaData = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String padraoBrasil = dataParaFormatar.format(formatadaData);
        return padraoBrasil;

    }
}

