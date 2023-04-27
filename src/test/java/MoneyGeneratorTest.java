import com.Bridgelabz.cabInvoice.MoneyGenerator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MoneyGeneratorTest {


    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        MoneyGenerator invoiceService = new MoneyGenerator();
        double distance = 2;
        int time = 5;
        Double fare = invoiceService.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0);
    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinimumFare() {
        MoneyGenerator invoiceService = new MoneyGenerator();
        double distance = 0.1;
        int time = 1;
        Double fare = invoiceService.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnTotalFare() {
        MoneyGenerator invoiceService = new MoneyGenerator();
        Ride[] rides = {new Ride(2, 5), new Ride(0.1, 1)
        };
        double fare = invoiceService.calculateFare(rides);
        Assert.assertEquals(30, fare, 0);
    }}