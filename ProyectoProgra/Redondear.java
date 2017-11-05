import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * Clase que redonde hac�a arriba
 * @author Sergio Acosta Vega
 *
 */
public class Redondear {
	/**
	 * m�todo que redonde hac�a arriba
	 * @param numero n�mero a redondear double
	 * @param cuantos n�mero de d�cimales double
	 * @return n�mero redondeado double
	 */
	
	public double redondeo(double numero, int cuantos)
	{
		BigDecimal bigDecimal = new BigDecimal(numero);
		BigDecimal red = bigDecimal.setScale(cuantos, RoundingMode.HALF_UP);
		return red.doubleValue();
	}
}
