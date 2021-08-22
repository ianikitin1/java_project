package main.lab_1.task_4;

public class Casino {
    private double prob;
    private double prize;
    private double pay;

    public void setProb(double prob) { this.prob = prob; }
    public double getProb() { return prob; }

    public void setPrize(double prize) { this.prize = prize; }
    public double getPrize() { return prize; }

    public void setPay(double pay) { this.pay = pay; }
    public double getPay() { return pay; }

    public Casino () {
    }

    public boolean profitableGamble (double prob, double prize, double pay) {
        return prob * prize > pay;
        /* тоже самое:
        if (prob * prize > pay){
            return true;
        }
        else {
            return  false;
        }
        */
    }
}
