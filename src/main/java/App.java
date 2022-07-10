import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import parser.BankExchangeDataParser;
import parser.BankExchangeDataParserImpl;
import server.WebServer;
import server.WebServerSimple;
import service.*;

public class App {
    private static final int WEB_SERVER_PORT = 9900;

    public static void main(String[] args) throws Exception {

        Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();

        BankExchangeDataParser bankExchangeDataParser = new BankExchangeDataParserImpl();
        ExchangeSiteTableDataProvider exchangeSiteTableDataProvider = new ExchangeSiteTableDataProviderImpl();
        BestExchangeRatesCalculator bestExchangeRatesCalculator = new BestExchangeRatesCalculatorImpl();

        BestExchangeRatesProvider bestExchangeRatesProvider = new BestExchangeRatesProviderImpl(
                bankExchangeDataParser,
                exchangeSiteTableDataProvider,
                bestExchangeRatesCalculator
        );

        WebServer webServer = new WebServerSimple(
                WEB_SERVER_PORT,
                gson,
                bestExchangeRatesProvider
        );

        webServer.start();
        webServer.join();
    }
}
