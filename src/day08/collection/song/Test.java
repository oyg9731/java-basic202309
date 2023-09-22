package day08.collection.song;

public class Test {
    public static void main(String[] args) {
        ArtistRepository ar = new ArtistRepository();
        ar.addNewArtist("르세라핌", "Unforgiven");
        ar.addNewArtist("트와이스", "TT");
        ar.addNewArtist("에스파", "도깨비불");

        System.out.println(ar.isRegistered("르세라핌"));
        System.out.println(ar.isRegistered("뉴진스"));

        System.out.println(ArtistRepository.getArtistList());
    }
}
