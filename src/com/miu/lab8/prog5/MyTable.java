package com.miu.lab8.prog5;

public class MyTable {

	private  int size =0;
	private Entry[] entries = new Entry[26]; // Alphabetical counts
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		//implement
		for(int i  =0; i < size; i++){
			if(entries[i].ch==c){
				return entries[i].string;
			}
		}
		return null;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		//implement
		if(s==""||(int)c == 0) return;
		if(size>26){
			System.out.println("The max size is 26 only.");
			return;
		}
		 entries[size] = new Entry(c,s);
		 size++;
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		//implement
		String output = "";
		for(int i =0; i<size;i++){
			output += String.format("%s %n",entries[i]);
		}
		return output;
	}
	
	
	private class Entry {
		private String string;
		private char ch;
		Entry(char ch, String str){
			//implement
			this.string = str;
			this.ch= ch;
		}
		//returns a String of the form "ch->str" 
		public String toString() {
			//implement
			return ch+"->"+string;
		}
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		String s = t.get('b');
		System.out.println(s);
		System.out.println(t);
	}

}