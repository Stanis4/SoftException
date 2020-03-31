package logics;
import exceptions.InfrastructureException;
import exceptions.LowIncomeException;
import exceptions.NoWorkException;
import exceptions.NotEnoughMoneyException;

public class City extends Country{
    private boolean enoughJobs = false;
    private boolean enoughBudget = true;


    @Override
    public void improveInfrastructure() throws InfrastructureException, LowIncomeException {
        if (enoughJobs){
            throw  new InfrastructureException();
        }
        if (enoughBudget){
            throw new LowIncomeException();
        }
    }

    @Override
    public void makeTaxesLower()  {
        try{
            createWorkPlaces();
            improveInfrastructure();
        }catch (InfrastructureException | LowIncomeException e){
            System.out.println(e.getMessage());
        }
    }




    public void createWorkPlaces(){
    }
}
