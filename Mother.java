class Mother{
   Child[] Child = new Child[5];
   void show(){
       for(int i = 0 ; i < Child.length ; i++){
           System.out.println(Child[i].getName());
       }
   }
}