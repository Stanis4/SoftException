package logic;
import exception.AngryPeopleException;
import exception.BudgetException;


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
