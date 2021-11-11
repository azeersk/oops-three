public abstract class Email{
    public void Details(){
        System.out.println("Name: "+"Azeer Saheb");
        System.out.println("Information About: "+"java language");
    }
    abstract void Message();
}

class GMail extends Email{
    void Message(){
        System.out.println("Message: Java Contains Collections,OOPs,Basics,Data Structures.");
    }
}

class Send{
    public static void main(String[] args) {
        GMail message = new GMail();
        message.Details();
        message.Message();
    }
}
