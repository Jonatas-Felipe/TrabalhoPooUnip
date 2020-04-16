class Empresa{
  private String cnpj;
  private String razaoSocial;
  private EnderecoComercial enderecoComercial;

  public Empresa(String cnpj, String razaoSocial, EnderecoComercial enderecoComercial){
    this.setCNPJ(cnpj);
    this.setRazaoSocial(razaoSocial);
    this.setEnderecoComercial(enderecoComercial);
  }

  public Empresa(String cnpj, String razaoSocial){
    this.setCNPJ(cnpj);
    this.setRazaoSocial(razaoSocial);
  }

  public void setCNPJ(String cnpj){
    this.cnpj = cnpj;
  }

  public void setRazaoSocial(String razaoSocial){
    this.razaoSocial = razaoSocial;
  }

  public void setEnderecoComercial(EnderecoComercial enderecoComercial){
    this.enderecoComercial = enderecoComercial;
  }

  public String getCNPJ(){
    return this.cnpj;
  }

  public String getRazaoSocial(){
    return this.razaoSocial;
  }

  public EnderecoComercial getEnderecoComercial(){
    return this.enderecoComercial;
  }

  public void imprime(){
    System.out.println("CNPJ: "+ cnpj +"\nRazão Social: "+ razaoSocial +"\nEndereço Comercial: "+ enderecoComercial.getEnderecoComercial() + "\n");
  }
}