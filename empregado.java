public class empregado{
private String nome;
private int idade, Tipo;
private double salario, comissao, bonus;

public double calculaSalario(){
if(Tipo == 1){
return salario;}

else if (Tipo == 2){
    return salario + salario + comissao;
}
    else if (Tipo == 3){
return  salario + bonus;
}else{
    return 0.;
}
}

public String getNome (){
return this.nome;
}
public void setNome (String nome){
this.nome = nome;
}
public int getIdade (){
return this.idade;
}
public void setIdade (int idade){
this.idade = idade;

}
public void setSalario (double salario){
    this.salario = salario;
    }
    public double getSalario (){
    return this.salario;

    }
    public void setComissao (double comissao){
    this.comissao = comissao;
    }
    public double getComissao (){
    return this.comissao;
    }
    public void setBonus (double bonus){
    this.bonus = bonus;
    }
    public double getBonus (){
    return this.bonus;
    }

    public void setTipo(int i) {
        
        throw new UnsupportedOperationException();
    }
}

