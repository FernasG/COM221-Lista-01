package br.unifei.imc.CSVService;

import br.unifei.imc.model.Games;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.Reader;
import java.util.List;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;

public class CSVReader {
    public static List<Games> readCSV(String path) {
        try {
            Reader reader = Files.newBufferedReader(Path.of(path));
            CsvToBean<Games> csvToBean = new CsvToBeanBuilder<Games>(reader)
                    .withType(Games.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            return csvToBean.parse();
        } catch (IOException exception) {
            exception.printStackTrace();
            return  null;
        }
    }
}
