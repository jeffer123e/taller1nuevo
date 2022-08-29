public class Operaciones_IMC {
	
	public double calcular_IMC(double peso,double altura)
	{
		double IMC;
		IMC = peso/(altura*altura);
		return IMC;
	}
	
	public void mostrar_IMC(String nombre,double IMC)
	{
	System.out.println("el peso del  Pasiente "+ nombre +" es "+IMC);
	}
	

	public void clasificar(double IMC)
	{
		if (IMC<=18.50)
		{
			System.out.println("el Pasiente tiene peso bajo");
		}
		if (IMC>18.50 && IMC<25)
		{
			System.out.println("el Pasiente tiene peso normal");
		}
		if (IMC>=25)
		{
			System.out.print("el Pasiente tiene sobrepeso");
		}
		
	}
	
	



}