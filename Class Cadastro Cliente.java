Class Cadastro Cliente

private int = id;
private String = nome;
private String = cpf;
private String = endereco;
private String = cidade;
private String = telefone;


public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


public void cadastrarCliente(){
        this.nome = (JOptionPane.showInputDialog("Digite o Nome do Cliente"));
        this.cpf = (JOptionPane.showInputDialog("Digite o nuemro do seu CPF"));
	this.enedereco = (JOptionPane.showInputDialog("Digite o seu Endereço"));
        this.telefone = (JOptionPane.showInputDialog("Digite o numero do seu Telefone"));
}

\\Precisamos criar um auto incremento no id do cadastro de cliente

	for ( int i = 0; 0 < id; i++); 


\\Acrescentar tbm o ano de nascimento do cliente

	private int = anoNascimento;
        this.anoNascimento =(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu Nascimento")));