import java.util.HashMap;
import java.util.Map;

public class Balancer{
    //Map<String type, Set<Element>>() reactionTypes = new HashMap();
    boolean reverse = false;
    final int COMBUSTION = 0;
    final int COMBINATION = 1;
    final int SEPARATION = 2;
    final int REPLACEMENT = 3;
    final int DOUBLE_REPLACEMENT = 4;

    Map<Element, Integer> reactants = new HashMap<>();
    Map<Element, Integer> products = new HashMap<>();
    Element reactantOne;
    Element reactantTwo;
    Element reactantThree;
    Element productOne;
    Element productTwo;
    Element productThree;
    public Balancer(int type, Element rOne, Element rTwo, Element pOne){

    }
    public Balancer(int type, Element rOne, Element rTwo, Element pOne, Element pTwo){
        if(type == REPLACEMENT || type == DOUBLE_REPLACEMENT){
            this.reactantOne = rOne;
            this.reactantTwo = rTwo;
            this.productOne = pOne;
            this.productTwo = pTwo;

        }
    }

    private void combustionReaction(){

    }

}