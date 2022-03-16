import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String response="";
		
		Scanner sc = new Scanner(System.in); 
		int turno=1;
		
		
	 
		int cantidadPokemones=0;
		List<Pockemon> listPockemones =new ArrayList<>();
		
		do {
			Pockemon pockemon =new Pockemon(); 
			System.out.println("Ingrese el nonbre del pockemon "+(cantidadPokemones+1)); 
			pockemon.setName(sc.nextLine()); 
			System.out.println("Ingrese la vida del pockemon "+(cantidadPokemones+1));
			pockemon.setLife(Integer.parseInt(sc.nextLine()));
			System.out.println("Ingrese el power del pockemon "+(cantidadPokemones+1));
			pockemon.setPower(Integer.parseInt(sc.nextLine()));
			
			
			cantidadPokemones++;
			listPockemones.add(pockemon);
			
		}while(cantidadPokemones==1);
		 
	 
		while(listPockemones.get(0).getLife()>0&&listPockemones.get(1).getLife()>0)
		{
			if(turno==1)
			{
				listPockemones.get(1).setLife( listPockemones.get(1).getLife()-listPockemones.get(0).getPower());
				turno=0;
			}
			else
			{
				listPockemones.get(0).setLife( listPockemones.get(0).getLife()-listPockemones.get(1).getPower());
				turno=1;
			}
			
		}
	 
		System.out.println("and the winner  iiiiiiiiiis");
		
		for(Pockemon pockemon:listPockemones)
		{
			if(pockemon.getLife()>0)
			{
				System.out.println("*************************"+pockemon.getName()+"***************************");

			}
		}
		
		
		
		
	 
	 
	
	}
	

	
	
	

}
