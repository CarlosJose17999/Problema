package Problema2;

import java.util.Arrays;

public class persona {
	//Atributos
		private char sexo='H';
		private String nom;
		private double alt,peso,imc;
		private int edad, dni[];
		
		private boolean r;
		public persona() {
			super();
		}
		
		public persona(char sexo, String nom, int dni[], double alt, double peso, double imc, int edad) {
			super();
			this.sexo = sexo;
			this.nom = nom;
			this.dni = dni;
			this.alt = alt;
			this.peso = peso;
			this.imc = imc;
			this.edad = edad;
		}
		
		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}
		public double getAlt() {
			return alt;
		}

		public void setAlt(double alt) {
			this.alt = alt;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public double getImc() {
			return imc;
		}

		public void setImc(double imc) {
			this.imc = imc;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public persona(String nombre,double peso, double alt,int edad) {
			this.nom=nombre;
			imc=peso/Math.pow(alt, 2);
			if (imc<20) {
				imc=-1;
			}else if(imc>=20 && imc<=25) {
				imc=0;
			}else {
				imc=1;
			}
			
			if (edad>18) {
				r=true;
			}else {
				r=false;
			}
			dni= new int[8];
			int i=0; 
			while(i<8) {
				dni[i]= (int) (Math.random() * 8);	
				i+=1;
			}
			
		}

		@Override
		public String toString() {
			return "Nomb" + nom + ", imc=" + imc + ", dni=" + Arrays.toString(dni) + ", r=" + r + "]";
		}

		

		
		
		
		
	}

