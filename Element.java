public class Element{
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
}
