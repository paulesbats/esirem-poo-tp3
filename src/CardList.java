public class CardList {

    private String value;
    private CardList cardNext;

    public String getValue(){
        return this.value;
    }

    public CardList getCardNext(){
        return this.cardNext ;
    }

    public void setValue(String _value){
        this.value=_value;
    }

    public void setCardNext(CardList _cardnext){
        this.cardNext=_cardnext;
    }

}
