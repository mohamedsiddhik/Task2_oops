public class Store
{
    private String name;
    private String address;

    public Store(String theName, String theAddress)
    {
        this.name = theName;
        this.address = theAddress;
    }

    public String getName() { return this.name; }
    public String getAddress() { return this.address; }
    public void setName(String theName) { this.name = theName; }
    public void setAddress(String theAddress) { this.address = theAddress; }

    public String toString() { return this.name + "\n" + this.address; }

    public static void main(String[] args)
    {
        Store myStore = new Store("no 6", "vivegananthar street.");
        System.out.println(myStore);
        myStore.setName("no7");
        myStore.setAddress("vannarpet.");
        System.out.println(myStore);

    }
}