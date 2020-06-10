package Cartas;

import Interfaces.Atacar;

public  class Carta_legendaria extends Carta implements Atacar{

	public int ataqueEspecial1;
	public int ataqueEspecial2;
	public int ataqueEspecial3;
	
	
	public Carta_legendaria(int id_Carta, String nombre_Carta) 
	{
		super(id_Carta, nombre_Carta, "legendario");
		ataqueEspecial1 = ataqueEspecial(4,2);	
		ataqueEspecial2 = ataqueEspecial(7,4);	
		ataqueEspecial3 = ataqueEspecial(11,7);	
	}
	
	
	public int getAtaqueEspecial1() 
	{
		return ataqueEspecial1;
	}
	
	public int ataqueEspecial (int max, int min)
	{	
		int value = getRandomInt(max, min);
		return value;
	}
	
	
	@Override
	public int tirarDados() 
	{
		int dado =(int)(Math.random() * (6 - 1 + 1) + 1);
		return dado;
	}

	@Override
	public String toString() {
		return super.toString() + "ataqueEspecial 1= " + ataqueEspecial1 + "\nataqueEspecial 2= " + ataqueEspecial2 + "\nataqueEspecial 3= " + ataqueEspecial3;
	}
	
	@Override
	public int atacar(int dado) {
		
		int aux = getAtaqueBase();
		
		if (dado == 1)
		{
			aux = ataqueEspecial1;
		}
		if (dado == 2)
		{
			aux = ataqueEspecial2;
		}
		if (dado == 3)
		{
			aux = ataqueEspecial3;
		}
		return aux;
	}
	
}
