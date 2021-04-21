/*
Desafio
Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, 
e pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, 
para isso você deve atentar aos requisitos a seguir:

A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
Além disso, a senha pode ter de 6 a 32 caracteres.
Entrada
A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string S, 
correspondente a senha que é inserida pelo usuário no momento do cadastro.

Saída
A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos 
olicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.
 
Exemplo de Entrada	Exemplo de Saída
Entrada
Digital Innovation One
AbcdEfgh99
DigitalInnovationOne123
Digital Innovation One 123
Aass9
Aassd9

Saída
Senha invalida.
Senha valida.
Senha valida.
Senha invalida.
Senha invalida.
Senha valida.
*/

import java.util.Scanner;

public class ValidaSenhaComRequisitos {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        String senha;
        final String requeridosNecessarios = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
        final String requisitosPermitidos = "[a-zA-Z0-9]+";

        while(lerDados.hasNextLine()) {
            senha = lerDados.nextLine();

            if ((senha.length() >=6) && (senha.length() <= 32) &&
              (senha.matches(requisitosPermitidos)) && (senha.matches(requeridosNecessarios))){
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}
