public class DemoType1{
     public static void main(String[] args){
	        //Float f =1.22f;
			//String floatString = f.toString();
			//System.out.println(floatString);
			
			
			//Double d =15555.56565d;
			//String dString = d.toString();
			//System.out.println(dString);
			
			
			//Boolean b= true;
			//String bString = b.toString();
			//System.out.println(bString);
			
			//long l =500;
			//int i= (int)l;
			//long ll =i;
			//System.out.println(ll);
			
			
		    //Long l=100L;
			//Long l= new Long(500);
		    //int i=l.intValue();
			//byte b =l.byteValue();
			//short s=l.shortValue();
			
			//Long l= 500L;
			//Integer ii =Integer.parseInt(l.toString());
			
			//Double d = Double.parseDouble(l.toString());
				try{
					String s = "500L";
					Integer i = Integer.parseInt(s);
					System.out.println(i);
				}catch(NumberFormatException e){
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			 
				System.out.println("Good Job." );
			
			
			
			
			
			
			
			
			
			
			
			
	 }
}
