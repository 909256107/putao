package com.putao.domain;

/**
 * @author Mr Duan
 * @create 2020-04-23 12:46
 */
public class Putao {
    private int id;
    private String name;
    private String bieming;
    private String characters;
    private String forms;
    private String projects;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBieming() {
        return bieming;
    }

    public void setBieming(String bieming) {
        this.bieming = bieming;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public String getForms() {
        return forms;
    }

    public void setForms(String forms) {
        this.forms = forms;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Putao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bieming='" + bieming + '\'' +
                ", characters='" + characters + '\'' +
                ", forms='" + forms + '\'' +
                ", projects='" + projects + '\'' +
                '}';
    }
}
