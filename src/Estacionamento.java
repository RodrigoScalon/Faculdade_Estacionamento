public class Estacionamento {

    public static void main(String[] args) {

        Aluno x = new Aluno("Rodrigo", 2, 1.50 );
        Aluno y = new NaoAluno("Fraga" , 2,  1.50, 2.00);

        System.out.printf("Aluno: %s, Horas: %s, Valor Hora: %.2f - "
                ,x.getNome(), x.getHora(), x.getValorHora());
        System.out.printf("Total Aluno: %s%n ", + x.pagamento());

        System.out.printf("Não Aluno: %s, Horas: %s, Valor Hora: %.2f, Adicional: %.2f - "
                ,y.getNome(), y.getHora(), y.getValorHora(), ((NaoAluno) y).getTaxaAdicional());
        System.out.printf("Total Não Aluno: %s ", + y.pagamento());

    }
}
