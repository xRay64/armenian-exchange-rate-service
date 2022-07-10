package service;

import dto.BestExchangeRateDTO;
import model.ExchangePointData;

import java.util.List;

public interface BestExchangeRatesCalculator {
    BestExchangeRateDTO getBestExchangeRates(List<List<ExchangePointData>> dataLists);
}
