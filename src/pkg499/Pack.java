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
public class Pack {
  private String pactype, desti, driver;
        
  public Pack(String pactype, String desti, String driver)  
  {
      this.pactype = pactype;
      this.desti = desti;
      this.driver = driver;
      
  }
  public String getpack()
  {
      return pactype;
  }
  public String getdesti()
  {
      return desti;
      
  }
  public String getdriver()
  {
      return driver;
  }
          }

