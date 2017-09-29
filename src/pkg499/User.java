/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg499;

/**
 *
 * @author lee
 */
public class User {
  private String id, password, name;
        
  public User(String Id, String Password, String Name)  
  {
      this.id = Id;
      this.password = Password;
      this.name = Name;
      
  }
  public String getId()
  {
      return id;
  }
  public String getPassword()
  {
      return password;
      
  }
  public String getName()
  {
      return name;
  }
          }

