package metodoformulario;

/**
 *
 * @author aluno
 */import java.util.Scanner;
public class MetodoFormulario {

    /**
     * @param nome
     */
    public static void formNome(String nome){
        Scanner scanner = new Scanner(System.in);
        boolean infoValida = false;
        
        do{
            System.out.println("Informe seu nome:");
            nome = scanner.next();
            
            if(nome.length() > 3){
                infoValida = true;
            } else {
                System.out.println("Nome precisa conter mais de 3 caracteres.");
            }
            
        }while(!infoValida);
        System.out.println(" ");
        
    }
    
    public static void formIdade(int idade){
        Scanner scanner = new Scanner(System.in);
        boolean infoValida = false;
        
        do{
            System.out.println("Informe sua idade:");
            idade = scanner.nextInt();
            
            if(idade > 0 && idade <150){
                infoValida = true;
            } else{
                System.out.println("Idade precisa ser entre 0 e 150 anos.");
            }
            
        } while(!infoValida);
        System.out.println(" ");
        
    }
    
    public static void formEmail(String email){
        Scanner scanner = new Scanner(System.in);
        boolean infoValida = false;
        
        do{
            System.out.println("Informe seu email: ");
            email = scanner.next();
            
            if(email.equalsIgnoreCase("gmail.com")){
                infoValida = true;
            } else {
                System.out.println("E-mail precisa ser gmail.com");
            }
            
        } while(!infoValida);
        System.out.println("");
    }
    
    public static void formCelular(int celular){
        Scanner scanner = new Scanner(System.in);
        boolean infoValida = false;
        
        do{
            System.out.println("Informe seu número para contato: ");
            celular = scanner.nextInt();
            String str = Integer.toString(celular);
            
            if(celular > 10){
                infoValida = true;
            } else {
                System.out.println("Informe seu número acompanhado do DDD");
            }
            
        } while(!infoValida);
        System.out.println(" ");
        
    }
    
    public static void formEndereco(String endereco){
        Scanner scanner = new Scanner(System.in);
        boolean infoValida = false;
        
        do{
            System.out.println("Informe seu endereço: ");
            endereco = scanner.next();
            
            if(endereco.length() > 10){
                infoValida = true;
            } else {
                System.out.println("Endereço precisa conter mais de 10 caracteres.");
            }
        }while(!infoValida);
        System.out.println(" ");
        
    }
    
    public static void formSalario(double salario){
        Scanner scanner = new Scanner(System.in);
        boolean infoValida = false;
        
        do{
            System.out.println("Informe seu salário:");
            salario = scanner.nextDouble();
            
            if(salario > 0){
                infoValida = true;
            } else{
                System.out.println("Salário precisa ser maior que R$0,00");
            }
            
        } while(!infoValida);
        System.out.println(" ");
    }
    
    public static void formSexo(String sexo){
        Scanner scanner = new Scanner(System.in);
        boolean infoValida = false;
        
        do{
            System.out.println("Informe seu Sexo:");
            sexo = scanner.next();
            
            if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser informado como 'M' ou 'F ");
            }
            
        } while(!infoValida);
        System.out.println(" ");
        
    }
    
    public static void formEstadoCivil(String estadoCivil){
        Scanner scanner = new Scanner(System.in);
        boolean infoValida = false;
        
        do {
            System.out.println("Informe seu Estado Civil");
            estadoCivil = scanner.next();
            
            if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            } else {
                System.out.println("Estado Civil precisa ser inserido como 's', 'c', 'v' ou 'd'.");
            }
            
        } while(!infoValida);
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Preencha o formulário: ");
        
        String nome = null;
        int idade = 0;
        String email = null;
        int celular = 0;
        String endereco = null;
        double salario = 0;
        String sexo = null;
        String estadoCivil = null;
        
        formNome(nome);
        formIdade(idade);
        formEmail(email);
        formCelular(celular);
        formEndereco(endereco);
        formSalario(salario);
        formSexo(sexo);
        formEstadoCivil(estadoCivil);
    }
    
}
