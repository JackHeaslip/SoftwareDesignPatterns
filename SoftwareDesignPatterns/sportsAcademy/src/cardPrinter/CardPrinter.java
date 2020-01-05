package cardPrinter;

public class CardPrinter {
    private boolean emptyInk;
    private boolean emptyCards;
    private boolean heated;

    public static CardPrinter onlyCardPrinter;

    private CardPrinter(){
        emptyInk = false;
        heated = false;
    }

    public static CardPrinter getInstance(){
        if(onlyCardPrinter == null){
            onlyCardPrinter = new CardPrinter();
        }
        return onlyCardPrinter;
    }

    public void changeInk(){
        if(isEmptyInk()){
            System.out.println("Please Change card printer ink");
            emptyInk = false;
            heated = false;
        }
    }

    public void fillCards(){
        if(isEmptyCards()){
            System.out.println("Please place blank cards into card printer");

            emptyCards = false;
            heated = false;
        }
    }

    public void heatInk(){
        if(!isEmptyInk() && !isEmptyCards() && !isheated()){
            System.out.println("Set printer to warm up mode");

            heated = true;
        }
    }

    public boolean isEmptyInk(){
        return emptyInk;
    }

    public boolean isEmptyCards(){
        return emptyCards;
    }

    public boolean isheated(){
        return heated;
    }

}