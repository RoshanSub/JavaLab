public class Q37{
	String bookName;
	String author;
	int price;
	Q37(String bookName, String author, int price){
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		}
		void infoDisplay(){
		System.out.println("Book Name: " + bookName);
		System.out.println("Book Author: " + author);
		System.out.println("Book Price: " + price);
		}
		public static void main(String[] args){
		Q37 b = new Q37("JAVA","Roshan Subedi",444);
		b.infoDisplay();
	}
}