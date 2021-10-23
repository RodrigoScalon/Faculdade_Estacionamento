public class NaoAluno extends Aluno {

    public double taxaAdicional;

    public NaoAluno() {
        super();
    }

    public NaoAluno(String nome, Integer hora, Double valorHora, double taxaAdicional) {
        super(nome, hora, valorHora);
        this.taxaAdicional = taxaAdicional;
    }

    public double getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public double pagamento (){
        return super.pagamento() + taxaAdicional;
    }
}
