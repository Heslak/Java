
public class EjecutaFigura {
	public static void main(String[] args) {
		int ap=4;
		String NombreF="0";
		switch (ap){
			case 1:
				System.out.println("1 �rea Tri�ngulo");
				NombreF="Triangulo";
				Triangulo t= new Triangulo();
				t.establecernombFig(NombreF);
				t.establecerbaseyaltura(3.5,10.7);
				t.calculaarea();
				System.out.println(t.obtenernomFig()+" Tiene �rea "+t.obtenareatriang());
				break;
			case 2:
				System.out.println("2 �rea Cuadrado");
				NombreF="Cuadrado";
				Cuadrado c= new Cuadrado();
				c.establecernombFig(NombreF);
				c.establecerladocua(4);
				c.calculaareacua();
				System.out.println(c.obtenernomFig()+" Tiene �rea "+c.obtenareacua());
				break;
			case 3:
				System.out.println("3 �rea Rect�ngulo");
				NombreF="Rectangulo";
				Rectangulo r= new Rectangulo();
				r.establecernombFig(NombreF);
				r.establealturabaserec(4.0,3.0);
				r.calculaarearec();
				System.out.println(r.obtenernomFig()+" Tiene �rea "+r.obtenarearec());
				break;
			case 4:
				System.out.println("4 �rea C�rculo");
				NombreF="Circulo";
				Circulo ci= new Circulo();
				ci.establecernombFig(NombreF);
				ci.establecerradio(4.0);
				ci.calculaareacirc();
				System.out.println(ci.obtenernomFig()+" Tiene �rea "+ci.obtenareacirc());
				break;
		}
	}
}
