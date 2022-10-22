package Week11.Task1;

public class HousePrices {
    private static int price;

    public void setPrice(int price) {
        this.price = price;
    }
    public void addPrice(int price) {
        this.price += price;
    }

    public void addTaxtoPrice(StatesTax statesTax) {
        this.price = this.price*(1+statesTax.getTaxRate()/100);
    }

    public int getPrice() {
        return price;
    }
    House house = new House();

    public void roomCountToPrice(){
        switch (house.getRoomCount()){
            case roomCount0:
                addPrice(house.getRoomCount().getPrice());
                break;
            case roomCount1:
                addPrice(house.getRoomCount().getPrice());
                break;
            case roomCount2:
                addPrice(house.getRoomCount().getPrice());
                break;
            case roomCount3:
                addPrice(house.getRoomCount().getPrice());;
                break;
            case roomCount4:
                addPrice(house.getRoomCount().getPrice());
                break;
            case roomCount5:
                addPrice(house.getRoomCount().getPrice());
                break;
        }
    }

    public void conditionToPrice(){
        switch (house.getCondition()){
            case New:
                addPrice(house.getCondition().getPrice());
                break;
            case LikeNew:
                addPrice(house.getCondition().getPrice());
                break;
            case Old:
                addPrice(house.getCondition().getPrice());
                break;
        }
    }

    public void houseTypeToPrice(){
        switch (house.getHouseType()){
            case Apartment:
                addPrice(house.getHouseType().getPrice());
                break;
            case Condo:
                addPrice(house.getHouseType().getPrice());
                break;
            case House:
                addPrice(house.getHouseType().getPrice());
                break;
        }
    }

    private void calculateTotalPriceOfHouse(){
        switch (house.getStatesTax()){
            case NEW_YORK:
                addTaxtoPrice(house.getStatesTax());
                break;
            case NEW_JERSEY:
                addTaxtoPrice(house.getStatesTax());
                break;
            case FLORIDA:
                addTaxtoPrice(house.getStatesTax());
                break;
            case OHIO:
                addTaxtoPrice(house.getStatesTax());
                break;
        }
    }

    /*public int getMonthlyPayment(){
    }*/
}
