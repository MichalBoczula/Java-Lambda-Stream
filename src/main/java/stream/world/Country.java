package stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal peopleQuantity;
    private final String name;

    public Country(BigDecimal peopleQuantity, String name) {
        this.peopleQuantity = peopleQuantity;
        this.name = name;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

    public String getName() {
        return name;
    }
}
