public class CardList {

    private String value;
    private Card cardNext;

    public String getValue(){
        return this.value;
    }

    public Card getCardNext(){
        return this.cardNext ;
    }

    public void setValue(String _value){
        this.value=_value;
    }

    public void setCardNext(Card _cardnext){
        this.cardNext=_cardnext;
    }

}
