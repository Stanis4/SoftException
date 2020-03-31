package logics;
import exceptions.AngryPeopleException;
import exceptions.BudgetException;
import exceptions.NoWorkException;
import exceptions.NotEnoughMoneyException;


public class Country {
    private boolean lowTaxes = false;
    private boolean highPrices = true;


    public void improveInfrastructure() throws BudgetException, AngryPeopleException{
        if (lowTaxes){
            throw new BudgetException();
        }
        if (highPrices){
            throw new AngryPeopleException();
        }
    }


    public void makeTaxesLower() {
        try{
            increaseExport();
            improveInfrastructure();
        }
        catch (BudgetException | AngryPeopleException e){
            System.out.println(e.getMessage());
        }
    }




    public void increaseExport(){
    }

}
