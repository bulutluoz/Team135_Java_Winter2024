package day27_abstractClasses_interfaces;

public class C11_ChildOfMultipleParents
        extends C08_Parent
        implements C10_InterfaceParent2,C09_InterfaceParent1{


    @Override
    public void method2() {
        // InterfaceParent1 "Mutlaka method2'in olmali"
        // InterfaceParent2 "Mutlaka method2'in olmali"

    }

    @Override
    public int method3() {

        return 5;
    }


}
