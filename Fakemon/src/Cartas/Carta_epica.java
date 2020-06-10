package Cartas;

import Interfaces.Atacar;

public  class Carta_epica extends Carta implements Atacar{

	public int ataqueEspecial1;
	public int ataqueEspecial2;

	
	public Carta_epica(int id_Carta, String nombre_Carta) 
	{
		super(id_Carta, nombre_Carta, "epico");
		ataqueEspecial1 = ataqueEspecial(4,2);	
		ataqueEspecial2 = ataqueEspecial(7,4);	
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
		return super.toString() + "ataqueEspecial 1= " + ataqueEspecial1 + "\nataqueEspecial 2= " + ataqueEspecial2;
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
		return aux;
	}

	
}
