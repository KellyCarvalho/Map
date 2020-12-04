package application;

import java.util.TreeMap;
import java.util.Map;

public class UsandoMap {

	public static void main(String[] args) {
		Map<String,String >cookies= new TreeMap<>();
		cookies.put("Usuário", "Maria1");
		cookies.put("Nome", "Maria");
		cookies.put("Telefone", "7155555555");
		cookies.remove("Telefone");
		
		System.out.println("Todos os cookies");
		
		for(String chave: cookies.keySet()) {
			System.out.println(chave+": "+cookies.get(chave));
		}
				
		if(cookies.containsValue("Maria")) {
			
			System.out.println("Valor "+cookies.get("Nome")+" existe");
			
		}
	

	}

}
