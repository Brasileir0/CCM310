package com.mycompany.lab06.teste;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifvnobre
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Agente> agentes = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String nomeL, profissaoL, OABL, escolaL, empresaL, agenteL;
        boolean modo_agenteL = false;
        
        System.out.println("Digite x no nome para encerrar o processo");
        while(true) {
            System.out.println("--- AGENTE ---");
            System.out.println("Nome.....: ");
            nomeL = in.nextLine();
            if (nomeL.equals("x")) {
                break;
            }
            System.out.println("Profissão: ");
            profissaoL = in.nextLine();
            System.out.println("Deseja que ele seja um agente? ");
            agenteL = in.next();
            if (agenteL.equals("sim")) {
                modo_agenteL = true;
            } if (agenteL.equals("não")) {
                modo_agenteL = false;
            }
            if (profissaoL.equals("Professor")) {
                System.out.println("Escola...: ");
                escolaL = in.nextLine();
                agentes.add(new Professor(nomeL, profissaoL, escolaL, modo_agenteL));
            }
            if (profissaoL.equals("Advogado")) {
                System.out.println("OAB......: ");
                OABL = in.nextLine();
                agentes.add(new Advogado(nomeL, profissaoL, OABL, modo_agenteL));
            }
            if (profissaoL.equals("Empresario")) {
                System.out.println("Empresa..: ");
                empresaL = in.nextLine();
                agentes.add(new Empresario(nomeL, profissaoL, empresaL, modo_agenteL));
            }
            in.nextLine();
        }// while
        
        int cont = 0, num;
        String resp;
        System.out.println("Deseja transformar algum dos não agente em agente? (sim/não)");
        for(Agente i : agentes) {
            if (!i.isModo_agente()) {
                System.out.println(cont + " - " + i.getNome());
            }
            cont++;
        }
        resp = in.next();
        if (resp.equals("sim")) {
            System.out.println("Qual das posições?");
            num = in.nextInt();
            agentes.get(num).modo_agente_on();  
        }
        
        System.out.println("--- PESSOAS CADASTRADAS ---");
        for(Agente i : agentes) {
                i.apresentacao();
        }
    }
}
