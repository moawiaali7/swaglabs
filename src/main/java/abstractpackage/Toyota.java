package abstractpackage;

import interfacepackage.PaintTable;

public abstract class Toyota implements PaintTable {
    //abstract class can implements interface
      void camry(){
         System.out.println("abstract method without abstract keyword");
     }
}
