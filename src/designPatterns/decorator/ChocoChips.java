package designPatterns.decorator;

public class ChocoChips implements IceCreamConeConstituents{

    private IceCreamConeConstituents incCreamConeConstituents;

    public ChocoChips(IceCreamConeConstituents iceCreamConeConstituents){
        this.incCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost() {
        return incCreamConeConstituents.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return incCreamConeConstituents.getDescription() + " + Choco Chips";
    }
}
