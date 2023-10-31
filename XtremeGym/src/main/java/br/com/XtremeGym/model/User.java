package br.com.XtremeGym.model;

public class User {
    private String name;
    private String cpf;
    private String email;
    private String Senha;

    public User(String name, String cpf, String email, String senha) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        Senha = senha;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return Senha;
    }
}