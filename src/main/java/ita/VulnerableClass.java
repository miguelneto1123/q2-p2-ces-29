package ita;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VulnerableClass {
	public void vulnerableMethod(String FILENAME){
		boolean cont = true;
		while (cont) {
		    Scanner console = new Scanner(System.in);
		    System.out.print("Digite a operacao desejada para realizar no arquivo <R para ler um arquivo, "
		    		+ "W para escrever em um arquivo> ou Q para sair");
			
		    String opr= console.nextLine();
			
		    if (opr.toUpperCase().equals("R")){
				BufferedReader br;
				
				try {
					String sCurrentLine;

					br = new BufferedReader(new FileReader(FILENAME), 2048);

					while ((sCurrentLine = br.readLine()) != null) {
						System.out.println(sCurrentLine);
					}

				} catch (IOException e) {

					e.printStackTrace();

				} 
			}
			
			else if (opr.toUpperCase().equals("W")){
				  BufferedWriter buffWrite;
				  
				  try {
					buffWrite = new BufferedWriter(new FileWriter(FILENAME), 2048);
					System.out.println("Escreva algo: ");
				    String linha = console.nextLine();
				    buffWrite.append(linha);
				    buffWrite.append("\n");
				     
				} catch (IOException e) {
					e.printStackTrace();
				} 
			} else if (opr.toUpperCase().equals("Q")) {
				cont = false;
			} else {
				System.out.println("Please input a valid value");
			}
		}
	}
}
