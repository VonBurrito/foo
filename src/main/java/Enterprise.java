public class Enterprise {

    private Long id;
    private String name;
    private String address;
    private Director director;

    public Enterprise() {
    }

    public Enterprise(Long id, String name, String address, Director director) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.director = director;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", director=" + director +
                '}';
    }
}
