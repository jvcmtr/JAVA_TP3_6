public class Endereco {
    private String Logradouro;
    private String Numero;
    private String Bairro;
    private String Cidade;
    private String ZipCode;

    public Endereco(String CEP, String complemento) {
        if (CEP.matches("\\d{3}[.\\s]?\\d{3}[.\\s]?\\d{3}[-.\\s]?\\d{2}")) {
            ZipCode = CEP;
            Numero = complemento;

            String[] values = ConferirCEP(CEP);
            Cidade = values[0];
            Bairro = values[1];
            Logradouro = values[2];
        }
    }

    public static String[] ConferirCEP(String CEP) {
        String cidade = "Rio de Janeiro"; // consultar API do correios
        String logradouro = "R. São José"; // consultar API do correios
        String bairro = "Centro"; // consultar API do correios
        return new String[] { cidade, bairro, logradouro };
    }

    @Override
    public String toString() {
        return (Logradouro + ", " + Numero + " - " + Bairro + ", " + Cidade + " - " + ZipCode);
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }
}
