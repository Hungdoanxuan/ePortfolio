/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w12a;

/**
 *
 * @author admin
 */
public class Birthday {

    private String name;
    private int day;
    private int month;
    private int year;

    public Birthday(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public static void main(String[] args) {
     String name = "Alice";
     int index = 0;
     Birthday[] birthdays = new Birthday[4];
     Birthday b = new Birthday(name, 1, 1, 2000);

     String old = changeName(b, "Bob");
     System.out.println("Changed name from " + old + " to Bob");
     System.out.println();
        
     System.out.println("After changeName called: The object referenced by b (local to main):");     

     display(b);
     System.out.println();

     addBirthday(birthdays, b, index);
     System.out.println("Index is " + index);

     for (int i = 0; i < 4; i++) {
         if (birthdays[i] != null) {
             display(b);
         }
     }
     System.out.println();   
   }    
  
   public static void display(Birthday b) {
     System.out.printf("Birthday for %s is %d-%d-%d%n", b.getName(),b.getDay(),b.getMonth(),b.getYear());                       
   }
   public static String changeName(Birthday b, String name) {
     String old = b.getName();
     b.setName(name);
     System.out.println("The object referenced by b (local to changeName):");
     display(b);
     System.out.println();
     return old;   
   } 

   public static void addBirthday(Birthday[] bdays, Birthday   b, int i)
   {
      bdays[i] = b;
      i++;
   }
}


