class EnderecoComercial{
    String endereco;

    public EnderecoComercial (String endereco ){
        this.endereco  = endereco ;
    }

    public String getEnderecoComercial(){
      return this.endereco;
    }

    public void imprime(){
        System.out.println("Endereço: " + endereco + "\n");
    }
    
}