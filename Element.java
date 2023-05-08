public class Element implements Comparable<Element>{
  int electrons;
  int protons;
  int atomicMass;
  int charge;
  public Element(){

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
    return -1;
  }


  @Override
  public int compareTo(Element o) {
    return 0;
  }
}
