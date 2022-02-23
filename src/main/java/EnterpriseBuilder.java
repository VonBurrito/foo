public class EnterpriseBuilder {
    private Long id;
    private String name;
    private String address;
    private Director director;

    public EnterpriseBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public EnterpriseBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EnterpriseBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EnterpriseBuilder setDirector(Director director) {
        this.director = director;
        return this;
    }

    public Enterprise getEnterpris(){
        return new Enterprise(id, name, address, director);
    }
}
