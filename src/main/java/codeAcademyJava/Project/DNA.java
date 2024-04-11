package codeAcademyJava.Project;

public class DNA{
    public static void main(String[] args){
        // -. .-.   .-. .-.   .
        //   \   \ /   \   \ /
        //  / \   \   / \   \
        // ~   `-~ `-`   `-~ `-
  /*This program determines whether there is a protein in a strand of DNA.
     A protein has the following qualities:
        It begins with a “start codon”: ATG.
        It ends with a “stop codon”: TGA.
        In between, each additional codon is a sequence of three nucleotides. */

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna1;
        int start = dna.indexOf("ATG");
        int stop = dna.indexOf("TGA");
        // System.out.print(dna.substring(start+3,stop));
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0){
            System.out.println("Protein: " + dna.substring(start, stop+3));
        }
    }
}
