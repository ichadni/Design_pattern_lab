package simplejavacalculator;

public interface Calc {//open new interface for apply factory design pattern
    double calculateMono(Calculator.MonoOperatorModes newMode, Double num);
    enum BiOperatorModes{

    }
    enum MonoOperatorModes{

    }
    double calculateBiImpl();
    double calculateBi(Calculator.BiOperatorModes newMode, Double num);
    Double calculateEqual(Double num);
    enum triOperatorModes{

    }
}
