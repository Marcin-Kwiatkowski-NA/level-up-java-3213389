package com.linkedin.javacodechallenges;

public class TicketHolder {
  private String name;
  private int tickets;


  public String getName() {
    return name;
  }


  public int getTickets() {
    return tickets;
  }


  public TicketHolder (String name, int tickets){
    this.tickets = tickets;
    this.name = name;
  }
  
}
