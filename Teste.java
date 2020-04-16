class Teste{
  public static void main(String[] args){
    EnderecoComercial enderecoComercial = new EnderecoComercial("Endereço");
    enderecoComercial.imprime();
    
    Empresa empresa1 = new Empresa("CNPJ", "RAZÃO SOCIAL", enderecoComercial);
    empresa1.imprime();

    
    Empresa empresa2 = new Empresa("CNPJ2", "RAZÃO SOCIAL2", enderecoComercial);
    empresa2.imprime();

    EmpresaFamiliar empresaFamiliar = new EmpresaFamiliar("EMPRESA FAMILIAR", empresa1);
    empresaFamiliar.imprime();
    
  }
}