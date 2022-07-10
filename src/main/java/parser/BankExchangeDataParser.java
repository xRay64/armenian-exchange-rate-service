package parser;

import model.ExchangePointData;
import model.ExchangePointType;
import org.jsoup.select.Elements;

import java.util.List;

public interface BankExchangeDataParser {
    List<ExchangePointData> parse(Elements bankRowElements, ExchangePointType exchangePointType);
}
