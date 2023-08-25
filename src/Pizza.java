public class Pizza {
    private String name;
    private int price;
    private int size;
    public String showPizza(){
        return "Name："+name+"\nSize："+size+"inch\nPrice："+price+"$";
    }
    public Pizza(String name, int price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public Pizza() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
