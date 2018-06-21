package stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //given
        int[] numInts= new int[20];

        numInts[0] = 1;
        numInts[1] = 2;
        numInts[2] = 3;
        numInts[3] = 4;
        numInts[4] = 5;
        numInts[5] = 6;
        numInts[6] = 7;
        numInts[7] = 8;
        numInts[8] = 9;
        numInts[9] = 10;
        numInts[10] = 11;
        numInts[11] = 12;
        numInts[12] = 13;
        numInts[13] = 14;
        numInts[14] = 15;
        numInts[15] = 16;
        numInts[16] = 17;
        numInts[17] = 18;
        numInts[18] = 19;
        numInts[19] = 20;

        final Numbers numbers = new Numbers();

        //when
        double avr = numbers.getAverage(numInts).getAsDouble();

        //then
        Assert.assertEquals(9.5, avr, 0.01);
    }
}
