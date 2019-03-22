package class16jdbc;

public class Country {

        int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCname() {
            return cname;
        }

        public void setCname(String cname) {
            this.cname = cname;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getSquare() {
            return square;
        }

        public void setSquare(int square) {
            this.square = square;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        String cname;
        int population;
        int square;
        String language;


        public Country(int id, String cname, int population, int square, String language) {
            this.id = id;
            this.cname = cname;
            this.population = population;
            this.square = square;
            this.language = language;
        }



}
