package MainPackage;


import Calculators.Calculator;
import Calculators.ElectrisityCalculator;
import Calculators.GasCalculator;
import Calculators.WaterCalculator;

import java.util.ArrayList;
import java.util.List;

public class InitCalcs {
    Calculator water = new WaterCalculator();
    Calculator electric = new ElectrisityCalculator();
    Calculator gas = new GasCalculator();

    public List listAdder (){
        ArrayList<Calculator>list = new ArrayList<>();
        list.add(water);
        list.add(electric);
        list.add(gas);
        return list;
    }

}
