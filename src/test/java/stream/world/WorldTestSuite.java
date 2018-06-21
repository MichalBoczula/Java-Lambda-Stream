package stream.world;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        final  Continent europe = new Continent();
        final  Continent asia = new Continent();
        final  Continent africa = new Continent();

        final BigDecimal people =  new BigDecimal("1");

        final Country Poland = new Country(people);
        final Country Germany = new Country(people);
        europe.addCountry(Poland);
        europe.addCountry(Germany);

        final Country China = new Country(people);
        final Country Japan = new Country(people);
        asia.addCountry(China);
        asia.addCountry(Japan);

        final Country Egypt = new Country(people);
        final Country Ghana = new Country(people);
        africa.addCountry(Egypt);
        africa.addCountry(Ghana);

        final World world = new World();
        world.addContinet(europe);
        world.addContinet(asia);
        world.addContinet(africa);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("6"), totalPeopleQuantity);
    }
}
