//
//  5.6.java
//  ProjectName
//
//  Created by Apollo Zhu on m/dd/yy.
//  Copyright © 2015-yyyy WWITDC. All rights reserved.
//

public class Buzz {
   public static void baffle(String blimp) {
      System.out.println(blimp);
      zippo("ping", -5); //10
   }
   public static void zippo(String quince, int flag) { //3, 11
      if (flag < 0) {
         System.out.println(quince + " zoop");
      } 
      else {
         System.out.println("ik");
         baffle(quince); //7
         System.out.println("boo-wa-ha-ha");
      }
   }
   public static void main(String[] args) {
      zippo("rattle", 13); //2
   }
}

/*
   3. "rattle"
   4. "ik\nrattle\nping zoop\nboo-wa-ha-ha\n"
*/