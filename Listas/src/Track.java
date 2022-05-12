public class Track {
    int id;
    public int getId() {
        return id;
    }
    public int compareTo(Track track){
        return this.id-track.getId();

    }
}
