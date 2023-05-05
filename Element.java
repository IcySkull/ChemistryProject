public class Element implements Comparable<Element>{
  int electrons;
  int protons;
  int atomicMass;
  int charge
  public Element(int electrons, int protons, int mass){
    this.electrons = electrons;
    this.protons = protons;
    this.atomicMass = mass;
    this.charge = protons-electrons;
  }
  public Element(int charge, int protons, int mass){
    this.electrons = protons-charge;
    this.protons = protons;
    this.atomicMass = mass;
    this.charge = charge;
  }
  public Element(int charge, int protons){
    this.charge = protons;
    this.protons = protons;
    this.electrons = protons - charge;
  }
  public Element(int charge){
    this.charge = charge;
  }
  
  public int getCharge(){
    return this.charge;
  }
  public int getChargeType(){
    if(this.charge == 0)return 0;
    if(this.charge >= 1)return 1;
    if(this.charge <= -1)return -1;
    return null;
  }

  @Override
  public int compareTo(Element o){
    return getCharge().compareTo(o)
  }

}
