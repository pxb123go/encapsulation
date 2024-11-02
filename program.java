class main {
    private String name;
    public String show() {
        return name;
    }
    public void setname(String name){
this.name=name;
    }
}
class program{
    public static void main(String[] args) {
        main n=new main();
        n.setname("Pradyun");
        System.out.println("Your name is " + n.show());
    }
}