import JavaBasic.EnumPractice;
import OOPJava.Abstraction.AbstractionPractice;
import OOPJava.Encapsulation.EncapsulationPractice;
import OOPJava.Inheritance.InheritancePractice;
import OOPJava.Polymorphism.PolymorphismPractice;
import OOPJava.SOLID.DIP.DIPPractice;
import OOPJava.SOLID.LSP.LSPPractice;
import OOPJava.SOLID.OCP.OCPPractice;
import OOPJava.SOLID.SRP.SRPPractice;

public class Main {

    public static void main(String[] args) {
        TestName testName = TestName.DIP;
        switch (testName){
            case ENUM:
                EnumPractice.testEnum();
                break;
            case ENCAPSULATION:
                EncapsulationPractice.testEncapsulation();
                break;
            case INHERITANCE:
                InheritancePractice.testInheritance();
                break;
            case POLYMORPHISM:
                PolymorphismPractice.testPolymorphism();
                break;
            case ABSTRACTION:
                AbstractionPractice.testAbstraction();
                break;
            case SRP:
                SRPPractice.testSRP();
                break;
            case OCP:
                OCPPractice.testOCP();
                break;
            case LSP:
                LSPPractice.testLSP();
                break;
            case DIP:
                DIPPractice.testDIP();
                break;
        }
    }
}
