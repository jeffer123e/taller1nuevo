
import javax.swing.JOptionPane;
public class persona {
	String nombre;
	double peso;
	double altura;
	double IMC;


	public String getNombre() {
	return nombre;
	}

	public void setNombre(String nombre) {
	this.nombre = nombre;
	}

	public double getPeso() {
	return peso;
	}

	public void setPeso(double peso) {
	this.peso = peso;
	}

	public double getAltura() {
	return altura;
	}

	public void setAltura(double altura) {
	this.altura = altura;
	}

	public double getIMC() {
	return IMC;
	}

	public void setIMC(double iMC) {
	IMC = iMC;
	}

	public void digitar()
	{
	nombre=JOptionPane.showInputDialog("Digite su nombre");
	peso=Double.parseDouble(JOptionPane.showInputDialog("Digite su peso"));

	altura=Double.parseDouble(JOptionPane.showInputDialog("Digite su altura"));
	
	Operaciones_IMC calcular= new Operaciones_IMC();
	IMC=calcular.calcular_IMC(peso,altura);
	calcular.mostrar_IMC(nombre,IMC);
	calcular.clasificar(IMC);
	}
	


	



}