package tn.esprit.gestionzoo.entities;


public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) { super(message); }
    public InvalidAgeException() { super("L'âge ne doit pas être négatif"); }
}

