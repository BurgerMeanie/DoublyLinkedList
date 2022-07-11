import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        Album rubberSoul = new Album(1, 14, "Rubber Soul",
                "John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr");
        assertEquals("1: 14 -- John Lennon, Paul McCartney, George Harrison, " +
                "Ringo Starr", rubberSoul.toString());
    }

    @org.junit.jupiter.api.Test
    void compareTo() {
        Album rubberSoul = new Album(1, 14, "Rubber Soul",
                "John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr");
        Album whiteAlbum = new Album(2, 30, "The BEATLES",
                "John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr");
        assertEquals(rubberSoul.compareTo(whiteAlbum), -16);
    }
}