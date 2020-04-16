class EmpresaFamiliar extends Empresa{
  private String nomeDaFamilia;
 
  public EmpresaFamiliar(String nomeDaFamilia, Empresa empresa){
    super(empresa.getCNPJ(), empresa.getRazaoSocial(), empresa.getEnderecoComercial());
    this.nomeDaFamilia = nomeDaFamilia;
  }

  public void imprime(){
    super.imprime();
		System.out.println("Nome da família: " + nomeDaFamilia + "\n");
  }
}