abstract class Exp{
    abstract Value eval();
    abstract String toString();

    abstract boolean hasZero();
}

abstract class Value extends Exp{

}
///////////////////////////////////////
class Int extends Value {
    public int i;
    Int(int i) {
	this.i = i;
    }

    Value eval() {
	return this;
    }

    String toString(){
	return "" + i;
    }

    boolean hasZero() {
	return i==0;
    }
}

///////////////////////////////////////
class Negate extends Exp {
    public Exp e;
    Negate(Exp e) {
	this.e = e;
    }

    Value eval() {
	return new Int(- ((Int) (e.eval())).i);
    }

    String toString() {
	return "-(" + e.toString() + ")" ;
    }

    boolean hasZero() {
	return e.hasZero() ;
    }
}

///////////////////////////////////////

class Add extends Exp {
    Exp e1;
    Exp e2;
    Add(Exp e1, Exp e2) {
	this.e1 = e1;
	this.e2 = e2;
    }

    Value eval() {
        return new Int(((Int)(e1.eval())).i + ((Int)(e2.eval())).i);
    }

    String toString() {
	return "(" + e1.toString() + "+" + e2.toString() + ")" ;
    }

    boolean hasZero() {
	return e1.hasZero() || e2.hasZero();
    }
}


