package com.viacep.estudo.viacepestudo.cliente;
import com.viacep.estudo.viacepestudo.dominio.Endereco;
import com.viacep.estudo.viacepestudo.servicoDeCep;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System in).nextLine();
        Endereco endereco = servicodeCep.buscaEnderecoPelo(cep);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());


    }
}
