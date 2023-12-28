class Number {
    public static void main(String[] args){
        String name="Al Amin";
        int age=24;
        String s=String.format("I am %s.I am %d", name,age);
        System.out.println(s);
        System.err.println(s.isEmpty());
        System.err.println(s.toUpperCase());
        System.err.println(s.toLowerCase());
        String st="Sky is blue";
        String nst=st.replace("blue", "red");
        System.out.println(nst);
    }  
}
