import java.math.BigDecimal;
import java.math.RoundingMode;

public class RevenueCalculator {
	
	private static final BigDecimal HUNDRED = new BigDecimal(100);

	BigDecimal calculateRevenue(
			BigDecimal marginPercentage,
			BigDecimal costOfGoods){
		BigDecimal revenue = BigDecimal.ZERO;
		if(marginPercentage.intValue() != 0){
			 revenue = (
					(marginPercentage.subtract(costOfGoods))
					.divide(marginPercentage,2,RoundingMode.HALF_UP))
					.multiply(HUNDRED);
			
		}
		return revenue;
	}

}