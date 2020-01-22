public class Filter {
    double mass1;
    double mass2;
    Filter(double m1, double m2){
        mass1=m1;
        mass2=m2;
    }
    double delta(){
        return mass2-mass1;
    }
}
