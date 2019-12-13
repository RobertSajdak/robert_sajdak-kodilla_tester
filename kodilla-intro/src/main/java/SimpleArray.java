public class SimpleArray {
    public static void main(String[] args) {

        String[] musicJMJ = new String[6];
        musicJMJ[0] = "Oxygene 4";
        musicJMJ[1] = "Randez Vous 2";
        musicJMJ[2] = "Equinoxe 4";
        musicJMJ[3] = "Oxygene 2";
        musicJMJ[4] = "Calypso";
        musicJMJ[5] = "Popcorn";

        String track = musicJMJ[3];
        System.out.println(track);

        int numberOfElements = musicJMJ.length;
        System.out.println("Moja tablica ma" + " " + numberOfElements + " elementów.");
    }
}
