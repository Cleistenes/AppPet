public class Main {
    public static void main(String[] args) {
        String nome = "Luciano";
        System.out.println(nome);

        Service tosquia = new Service(1, "tosquia", 30);

        System.out.println(tosquia.getDescricao());
        System.out.println(tosquia.getValor());

        Client cliente = new Client(1, "Tamires", 'F', "910796245", "luna@gmail.com", "33333333", "com papai e mamãe", "4685-250", "Luna", "4 anos", 'F', "Schnauzer");

        System.out.println(cliente);

        User usuario = new User(1, "tosquiadora", 32);

    }
}