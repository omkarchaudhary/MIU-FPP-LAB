package com.miu.lab8.prog3.lab4.prog6;

public class PersonWithJobComposition {
    private double salary;
    private Person person; //Decomposing Person instead of extended
    PersonWithJobComposition(double salary, Person person){
        this.salary = salary;
        this.person = person;
    }

    @Override
    public boolean equals(Object withJob) {
        if(withJob == null) return false;
        if(withJob.getClass() != this.getClass())
            return false;
        PersonWithJobComposition p = (PersonWithJobComposition)withJob;
        boolean isEqual = this.person.equals(p.person) &&
                this.salary == p.salary;
        return isEqual;
    }
}
