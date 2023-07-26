package br.com.gilmarioarantes.validacpf.model;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidaCPFTeste {

    private ValidaCPF validador;

    @Test
    public void setUp() {
        validador = new ValidaCPF();
    }

    @Test
    public void testValidCPF() {
        assertTrue(validador.isCPF("12345678909"));
    }

    @Test
    public void testCpfInvalidoMenos11Digitos() {
        assertFalse(validador.isCPF("123456"));      // CPF com menos de 11 dígitos (inválido)
    }

    @Test
    public void testCpfInvalidoMaior11Digitos() {
        assertFalse(validador.isCPF("1234567890987654321")); // CPF com mais de 11 dígitos (inválido)
    }

    @Test
    public void testInvalidoCPFNaoNumericoCaracter() {
        assertFalse(validador.isCPF("abcdefghijk")); // CPF com caracteres não numéricos (inválido)
    }

    @Test
    public void testInvalidoCPFAllDigits() {
        assertFalse(validador.isCPF("11111111111")); // CPF com todos os dígitos como 1 (inválido)
    }

    @Test
    public void testValidoCPFWithLeadingZeros() {
        assertTrue(validador.isCPF("00000000191")); // CPF válido com zeros à esquerda
    }

    @Test
    public void testValidoCPFWithFormattedString() {
        assertTrue(validador.isCPF("123.456.789-09")); // CPF válido com string formatada
    }

    @Test
    public void testInvalidoCPFWithInvalidChecksum() {
        assertFalse(validador.isCPF("12345678912")); // CPF inválido com checksum incorreto
    }

}
