package ru.lesson.lessons;

public class Clinic {
    private final Client [] clients;

    public Clinic (final int size){
        this.clients = new Client[size];
    }

    public void addClient(final int position, final Client client){
        this.clients[position] = client;
    }

    public Client[] findClientByPetName(final String name){
        return new Client[]{};
    }
 }
