package codeAcademyJava.Project;

public class DNA2 {
    int start, stop;
    String dna;
    public DNA2(String dna) {
        start = dna.indexOf("ATG");
        stop = dna.indexOf("TGA");
        this.dna = dna;
    }
    public void checkDNA2() {
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            System.out.println(dna + " has a protein and it is " + dna.substring(start, stop + 3));
        } else {
            System.out.println(dna + " does not have a protein");
        }
    }
    public static void main(String[] args) {
        new DNA2("ATGCGATACGCTTGA").checkDNA2();
//        DNA2 dna2 = new DNA2("ATGCGATACGTGA");
//        dna2.checkDNA2();
        new DNA2("ATGCGATACGTGA").checkDNA2();
        new DNA2("ATTAATATGTACTGA").checkDNA2();
    }
}