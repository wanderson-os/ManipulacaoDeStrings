/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manipulacaodestrings;

import java.util.ArrayList;

/**
 *
 * @author Wanderson
 */
public class Gerencia {

    private String palavra, palavraInvertida, vogais = "aAeEiIoOuU", consoantes = "BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz";
    private int chave;

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavraInvertida() {
        return palavraInvertida;
    }

    public void setPalavraInvertida(String palavraInvertida) {
        this.palavraInvertida = palavraInvertida;
    }

    public String inverter() {
        palavraInvertida = new StringBuilder(palavra).reverse().toString();

        return palavraInvertida;

    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public String palindromo() {

        if (palavra.equals(inverter())) {
            palavra = "É um palíndromo";
        } else {
            palavra = "Não é um palindromo";
        }
        return palavra;

    }

    public String vogais() {
        String vogalAux = "", vogalNaoRepetida = "";
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < vogais.length(); j++) {
                if (palavra.charAt(i) == vogais.charAt(j)) {
                    vogalAux += palavra.charAt(i);

                }
            }
        }
        for (int i = 0; i < vogalAux.length(); i++) {
            if (!vogalNaoRepetida.contains(String.valueOf(vogalAux.charAt(i)))) {
                vogalNaoRepetida += vogalAux.charAt(i);
            }
        }

        return vogalNaoRepetida;
    }

    public String consoantes() {
        String consoanteAux = "", consoanteNaoRepetida = "";
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < consoantes.length(); j++) {
                if (palavra.charAt(i) == consoantes.charAt(j)) {
                    consoanteAux += palavra.charAt(i);

                }
            }
        }
        for (int i = 0; i < consoanteAux.length(); i++) {
            if (!consoanteNaoRepetida.contains(String.valueOf(consoanteAux.charAt(i)))) {
                consoanteNaoRepetida += consoanteAux.charAt(i);
            }
        }

        return consoanteNaoRepetida;
    }

    public String criptografar() {
        ArrayList<Integer> numeros = new ArrayList<>();
        String criptografada = "";
        char c;
        int n;
        for (int i = 0; i < palavra.length(); i++) {
            n = palavra.charAt(i);
            numeros.add(n);
        }

        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.get(i) >= 65 && numeros.get(i) <= 90) {
                if (numeros.get(i) + chave > 90) {
                    numeros.set(i, numeros.get(i) + chave + 6);
                } else {
                    numeros.set(i, numeros.get(i) + chave);
                }

            } else if (numeros.get(i) >= 97) {
                if (numeros.get(i) + chave > 122) {
                    numeros.set(i, numeros.get(i) + chave - 58);
                } else {
                    numeros.set(i, numeros.get(i) + chave);
                }
            }
        }
        for (int i = 0; i < numeros.size(); i++) {
            c = (char) numeros.get(i).intValue();
            criptografada += String.valueOf(c);

        }

        return criptografada;
    }

    public String descriptografar() {
        ArrayList<Integer> numeros = new ArrayList<>();
        String descriptografada = "";
        char c;
        int n;
        for (int i = 0; i < palavra.length(); i++) {
            n = palavra.charAt(i);
            numeros.add(n);
        }

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("N: " + numeros.get(i));

            if (numeros.get(i) >= 65 && numeros.get(i) <= 90) {
                if (numeros.get(i) - chave < 65) {
                    numeros.set(i, numeros.get(i) - 65 - chave + 123);
                } else {
                    numeros.set(i, numeros.get(i) - chave);
                }

            } else if (numeros.get(i) >= 97) {
                if (numeros.get(i) - chave < 97) {
                    numeros.set(i, numeros.get(i) + chave + 6);
                } else {
                    numeros.set(i, numeros.get(i) - chave);
                }
            }
        }
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("N2: " + numeros.get(i));
            c = (char) numeros.get(i).intValue();
            descriptografada += String.valueOf(c);

        }

        return descriptografada;
    }
}
