public class Record {
  private String number;
  private String name;
  public Record(String number, String name) {
	  this.number = number;
	  this.name = name;
  }
  public void setName(String name) {
	  this.name = name;
  }
  public void setNumber(String number) {
	  this.number = number;
  }
  public String getNumber() {
	  return number;
  }
  public String getName() {
	  return name;  
  }
}
