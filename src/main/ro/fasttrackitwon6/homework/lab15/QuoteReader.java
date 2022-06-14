package main.ro.fasttrackitwon6.homework.lab15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class QuoteReader {
    public List<Quote> readQuotesFromFile(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(filePath));
        List<Quote> quotes = new ArrayList<>();
        int lineNum = 1;
        for (String line : lines) {
            quotes.add(readQuotesFromLine(lineNum, line));
            lineNum++;
        }
        return quotes;
    }

    private static Quote readQuotesFromLine(int id, String line) {
        String[] tokens = line.split(Pattern.quote("~"));
        return new Quote(id, tokens[0], tokens[1]);
    }
}
