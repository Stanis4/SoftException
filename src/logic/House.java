package logic;

import exception.NoWorkException;
import exception.NotEnoughMoneyException;

public class House extends City {
    private boolean hasCar = true;
    private boolean hasJob = false;

    @Override
    public void improveInfrastructure() throws NotEnoughMoneyException, NoWorkException  {
        if (hasCar){
            throw new NotEnoughMoneyException();
        }
        if(hasJob){
            throw new NoWorkException();
        }
    }

    @Override
    public void makeTaxesLower()  {
        try {
            improveInfrastructure();
        } catch (NotEnoughMoneyException | NoWorkException e){
            System.out.println(e.getMessage());
        }

    }
}
