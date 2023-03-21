package ComposicionCono;

public class Cono {

		 private Circulo base;
		 private float altura;
		 private String color;
		 /**
		  * Metodo constructor de Cono
		  * cX, cY y r crearan el Circulo base del Cono
		  * @param cX coordenada del eje x del circulo
		  * @param cY coordenada del eje y del circulo
		  * @param r radio del Circulo
		  * @param h Float de la altura del cono
		  * @param color String del color del cono
		  */
		 public Cono (float cX, float cY, float r, float h, String color) { // constructor
			 this.base = new Circulo(cX, cY, r);
			 this.altura = h;
			 this.color = color;
		 }
		 /**
		  * Metodo que extrae el valor de la base del Cono
		  * @return El objeto Circulo usado en la base
		  */
		 public Circulo getBase() {
			 return base;
		 }
		 /**
		  * Metodo que inserta el valor de la base del Cono
		  * @param base El objeto Circulo que se desea añadir
		  */
		 public void setBase(Circulo base) {
			 this.base = base;
		 }
		 /**
		  * Metodo que extrae el valor de la altura del Cono
		  * @return Float del valor de la altura del Cono
		  */
		 public float getAltura() {
			 return altura;
		 }
		 /**
		  * Metodo que inserta el valor de la base del Cono
		  * @param altura El valor float que se desea añadir
		  */
		 public void setAltura(float altura) {
			 this.altura = altura;
		 }
		 /**
		  * Metodo que extrae el valor del color del Cono
		  * @return String del valor del color del Cono
		  */
		 public String getColor() {
			 return color;
		 }
		 /**
		  * Metodo que inserta el valor del color del Cono
		  * @param color String del valor del color del Cono
		  */
		 public void setColor(String color) {
			 this.color = color;
		 }
		 /**
		  * Metodo que imprime la informacion contenida en el Cono
		  * Usa para la base el metodo imprimir de la clase Circulo 
		  * y para lo demas " h=" + altura + " c=" + color
		  */
		 public void imprimir () {
			 base.imprimir();
			 System.out.println(" h=" + altura + " c=" + color);
		 }
}
