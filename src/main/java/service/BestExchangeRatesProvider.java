package service;

import dto.BestExchangeRateDTO;
import model.ExchangePointType;

import java.util.Map;

public interface BestExchangeRatesProvider {
    BestExchangeRateDTO getBestExchangeRates(Map<String, ExchangePointType> parseList);
}
