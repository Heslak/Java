import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * Clase que redonde hacía arriba
 * @author Sergio Acosta Vega
 *
 */
public class Redondear {
	/**
	 * método que redonde hacía arriba
	 * @param numero número a redondear double
	 * @param cuantos número de décimales double
	 * @return número redondeado double
	 */
	
	public double redondeo(double numero, int cuantos)
	{
		BigDecimal bigDecimal = new BigDecimal(numero);
		BigDecimal red = bigDecimal.setScale(cuantos, RoundingMode.HALF_UP);
		return red.doubleValue();
	}
}
