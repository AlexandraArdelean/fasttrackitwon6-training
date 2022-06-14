package main.ro.fasttrackitwon6.homework.lab15;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        QuoteReader quoteReader = new QuoteReader();
        List<Quote> quotes = quoteReader.readQuotesFromFile("file/quotes.txt");
        // System.out.println(quotes);
        QuoteService service = new QuoteService(quotes);
        //System.out.println(service.getAllQuotes());
        //System.out.println(service.getAuthors());
        //System.out.println(service.getQuotesForAuthor("Buddha"));
        service.setFavourite(5);
        //System.out.println(service.getFavourites());
        System.out.println(service.getRandomQuote());

    }
}
