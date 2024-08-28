package com.example.demo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
@Table(name = "todos")
class Todo {
    private @Id 
    @GeneratedValue Long id;
    private String description;
    private boolean isDone;

    Todo() {}

    Todo(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public Long getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getIsDone() {
        return this.isDone;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }
    
   @Override       
   public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Todo)) return false;
    Todo todo = (Todo) o;
    return Objects.equals(this.id, todo.id) && Objects.equals(this.description, todo.description)
        && this.isDone == todo.isDone;
   }

   @Override
   public int hashCode() {
    return Objects.hash(this.id, this.description, this.isDone);
   }

   @Override
   public String toString() {
    return "Todo{" + "id=" + this.id + ", description='" + this.description + '\'' + ", isDone=" + this.isDone + '}';
   }
    
}