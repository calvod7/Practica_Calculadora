
/**
 * Esta clase tien como funcion una calculadora.
 * @author David Calvo
 * @version 08/02/2017
 */
public class Calculadora {
	
	private int x, y;

	/**
	 * @param x primer operador
	 * @param y segundo operador
	 */
	public Calculadora(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * @return Retorna el valor del primer operador.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Pone valor al primer operador.
	 * @param x primer operador
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return Retorna el valor del segundo operador.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Pone valor al segundo operador.
	 * @param y segundo operador
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Este metodo realiza una suma y lo muestra por pantalla.
	 */
	public void suma(){
		System.out.println(this.getX() + this.getY());
	}
	
	/**
	 * Este metodo realiza una resta y lo muestra por pantalla.
	 */
	public void resta(){
		System.out.println("Esta es la :");
		System.out.println(this.getX() - this.getY());
	}
}