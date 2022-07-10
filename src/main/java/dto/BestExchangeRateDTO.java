package dto;

import lombok.Getter;
import model.ExchangePointData;

@Getter
public class BestExchangeRateDTO {
    private final ExchangePointData dollarBestPoint;
    private final ExchangePointData roubleBestPoint;
    private final float bestExchangeRate;
    public BestExchangeRateDTO(ExchangePointData dollarBestPoint, ExchangePointData roubleBestPoint) {
        this.dollarBestPoint = dollarBestPoint;
        this.roubleBestPoint = roubleBestPoint;
        this.bestExchangeRate = dollarBestPoint.getUSDRate() / roubleBestPoint.getRUBRate();
    }
}

