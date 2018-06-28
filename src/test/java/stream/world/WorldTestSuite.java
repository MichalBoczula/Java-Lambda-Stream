package stream.world;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        final  Continent europe = new Continent("Europe");
        final  Continent asia = new Continent("Asia");
        final  Continent africa = new Continent("Africa");

        final Country poland = new Country(new BigDecimal(3800000), "Poland");
        final Country germany = new Country(new BigDecimal(8200000), "Germany");
        europe.addCountry(poland);
        europe.addCountry(germany);

        final Country china = new Country(new BigDecimal(137900000), "China");
        final Country japan = new Country(new BigDecimal(12700000), "Japan");
        asia.addCountry(china);
        asia.addCountry(japan);

        final Country egypt = new Country(new BigDecimal(9500000), "Egypt");
        final Country ghana = new Country(new BigDecimal(2800000), "Ghana");
        africa.addCountry(egypt);
        africa.addCountry(ghana);

        final World world = new World();
        world.addContinet(europe);
        world.addContinet(asia);
        world.addContinet(africa);

        BigDecimal localTotalPeople = new BigDecimal(174900000);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(localTotalPeople, totalPeopleQuantity);
    }
}
