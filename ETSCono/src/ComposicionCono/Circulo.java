package ComposicionCono;

public class Circulo {
		 private float x, y;
		 private float radio;
		 /**
		  * Metodo constructor de Circulo
		  * @param cX Float de coordenada del eje x del circulo
		  * @param cY Float de coordenada del eje y del circulo
		  * @param r Float de radio del Circulo
		  */
		 public Circulo (float cX, float cY, float r) { // constructor
			 this.x = cX;
			 this.y = cY;
			 this.radio = r;
		 }
		 /**
		  * Metodo que extrae el valor de la coordenada del eje x del Circulo
		  * @return Float de coordenada del eje x
		  */
		 public float getX() { return x; }
		 /**
		  * Metodo que establece el valor de la coordenada del eje x del Circulo
		  * @param x Float de coordenada del eje x a establecer
		  */
		 public void setX(float x) { this.x = x; }
		 /**
		  * Metodo que extrae el valor de la coordenada del eje y del Circulo
		  * @return Float de coordenada del eje y
		  */
		 public float getY() { return y; }
		 /**
		  * Metodo que establece el valor de la coordenada del eje y del Circulo
		  * @param y Float de coordenada del eje y a establecer
		  */
		 public void setY(float y) { this.y = y; }
		 /**
		  * Metodo que extrae el valor del radio del Circulo
		  * @return Float del valor de radio
		  */
		 public float getRadio() { return radio; }
		 /**
		  *  Metodo que establece el valor del radio del Circulo
		  * @param radio Float del valor de radio a establecer
		  */
		 public void setRadio(float radio) { this.radio = radio; }
		 /**
		  * Metodo que calcula el area del circulo
		  * @return Float de  Math.PI*radio*radio;
		  */
		 public float area() { return (float)Math.PI*radio*radio; }
		 /**
		  * Metodo que imprime la informacion contenida en el Circulo
		  */
		 public void imprimir () {
		 System.out.print(" x=" + x);
		 System.out.print(" y=" + y);
		 System.out.print(" r=" + radio);
		 System.out.print(" A=" + area());
		 }
		
}
