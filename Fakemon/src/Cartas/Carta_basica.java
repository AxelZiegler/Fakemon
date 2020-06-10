package Cartas;

import Interfaces.Atacar;

public  class Carta_basica extends Carta implements Atacar{

	public int ataqueEspecial1;

	
	public Carta_basica(int id_Carta, String nombre_Carta) 
	{
		super(id_Carta, nombre_Carta, "basico");
		ataqueEspecial1 = ataqueEspecial(3,1);	
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
		return super.toString() + "ataqueEspecial 1= " + ataqueEspecial1;
	}
	
	@Override
	public int atacar(int dado) {
		int aux = getAtaqueBase();
		if (dado == 1)
		{
			aux = ataqueEspecial1;
		}
		return aux;
	}
		
}
