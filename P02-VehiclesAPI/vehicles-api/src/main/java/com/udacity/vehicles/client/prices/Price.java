package com.udacity.vehicles.client.prices;

import org.springframework.hateoas.ResourceSupport;

import java.math.BigDecimal;

/**
 * Represents the price of a given vehicle, including currency.
 */
public class Price extends ResourceSupport {

    private String currency;
    private BigDecimal price;
    private Long vehicleId;

    public Price() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString() {
        return "Price{" +
                "currency='" + currency + '\'' +
                ", price=" + price +
                ", vehicleId=" + vehicleId +
                '}';
    }
}
