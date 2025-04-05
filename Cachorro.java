public class Cachorro{
//private para encapsulamento:
private String raca;
private int idade;
private String cor;

//construtor da classe Cachorro:
public Cachorro(String raca, int idade, String cor) {
this.raca = raca;
this.idade = idade;
this.cor = cor;
System.out.println("Sou um cachorro e acabei de ser criado.");
}

//definição do método latir():
public void latir(){
System.out.println(">>Estou latindo");
}

//definição do método dormir():
public void dormir(){
System.out.println(">>Estou dormindo");
}

//get
public String getRaca(){
return raca; 
}

//get
public int getIdade(){
return idade; 
}

//get
public String getCor(){
return cor; 
}

//set
public void setRaca(String raca){
this.raca = raca;
}

//set
public void setIdade(int idade){
this.idade = idade;
}

//set
public void setCor(String cor){
this.cor = cor;
}
}