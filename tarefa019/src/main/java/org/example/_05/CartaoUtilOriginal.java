package org.example._05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CartaoUtilOriginal {

    public static final int VISA = 1;
    public static final int MASTERCARD = 2;
    public static final int AMEX = 3;
    public static final int DINERS = 4;
    public static final String CARTAO_OK = "Cartão válido";
    public static final String CARTAO_ERRO = "Cartão inválido";

    public String validar(int bandeira, String numero, String validade) {
        boolean validadeOK = false;
        Date dataValidade = null;
        try {
            dataValidade = new SimpleDateFormat("MM/yyyy").parse(validade);
        } catch (ParseException e) {
            return CARTAO_ERRO;
        }

        Calendar calValidade = new GregorianCalendar();
        calValidade.setTime(dataValidade);

        Calendar calTemp = new GregorianCalendar();
        Calendar calHoje = (GregorianCalendar) calValidade.clone();
        calHoje.set(Calendar.MONTH, calTemp.get(Calendar.MONTH));
        calHoje.set(Calendar.YEAR, calTemp.get(Calendar.YEAR));

        validadeOK = calHoje.before(calValidade);

        if (!validadeOK) {
            return CARTAO_ERRO;
        } else {
            String formatado = "";

            for (int i = 0; i < numero.length(); i++) {
                char c = numero.charAt(i);
                if (Character.isDigit(c)) {
                    formatado += c;
                }
            }

            boolean formatoOK = false;

            switch (bandeira) {
                case VISA:
                    if (formatado.startsWith("4") && (formatado.length() == 13 || formatado.length() == 16)) {
                        formatoOK = true;
                    } else {
                        formatoOK = false;
                    }
                    break;
                case MASTERCARD:
                    if ((formatado.startsWith("51") || formatado.startsWith("52") || formatado.startsWith("53") ||
                            formatado.startsWith("54") || formatado.startsWith("55")) && formatado.length() == 16) {
                        formatoOK = true;
                    } else {
                        formatoOK = false;
                    }
                    break;
                case AMEX:
                    if ((formatado.startsWith("34") || formatado.startsWith("37")) && formatado.length() == 15) {
                        formatoOK = true;
                    } else {
                        formatoOK = false;
                    }
                    break;
                case DINERS:
                    if ((formatado.startsWith("300") || formatado.startsWith("301") || formatado.startsWith("302") ||
                            formatado.startsWith("303") || formatado.startsWith("304") || formatado.startsWith("305") ||
                            formatado.startsWith("36") || formatado.startsWith("38")) && formatado.length() == 14) {
                        formatoOK = true;
                    } else {
                        formatoOK = false;
                    }
                    break;
                default:
                    formatoOK = false;
                    break;
            }

            if (!formatoOK) {
                return CARTAO_ERRO;
            } else {
                int soma = 0;
                int digito = 0;
                int somafim = 0;
                boolean multiplica = false;

                for (int i = formatado.length() - 1; i >= 0; i--) {
                    digito = Integer.parseInt(formatado.substring(i, i + 1));
                    if (multiplica) {
                        somafim = digito * 2;
                        if (somafim > 9) {
                            somafim -= 9;
                        }
                    } else {
                        somafim = digito;
                    }
                    soma += somafim;
                    multiplica = !multiplica;
                }

                int resto = soma % 10;
                if (resto == 0) {
                    return CARTAO_OK;
                } else {
                    return CARTAO_ERRO;
                }
            }
        }
    }
}
