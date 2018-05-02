package tests;

public class Animal {
    private Integer id;
    private String name;
    private String species;

    public Animal(Integer id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private Integer id;
        private String name;
        private String species;

        public Builder id(Integer id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder species(String species){
            this.species = species;
            return this;
        }

        public Animal build(){
            return new Animal(this.id, this.name, this.species);
        }

    }

    @Override
    public String toString(){
        return "Animal[id=" + this.id + ", name=" + this.name + ", species=" + species + "]";
    }
}
