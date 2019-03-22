package class16jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        List<Country> countryList;
        int id = 2;
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
        /*Country rescountry = selectById(connection, id);
        System.out.println("id        : " + rescountry.id);
        System.out.println("name      : " + rescountry.cname);
        System.out.println("population: " + rescountry.population);
        System.out.println("square    : " + rescountry.square);
        System.out.println("language  : " + rescountry.language);
        System.out.println("--------------------------");*/

        insertNextCountry(connection, new Country(0, "Дания", 15000, 29000, "Датский"));
//deleteCountryById(connection, 13);
//        deleteCountryByName(connection, "Дания");

        countryList = selectAllCountries(connection);
        for (id = 0; id < countryList.size(); id++) {
            System.out.println(countryList.get(id).getId() + " "
                    + countryList.get(id).getCname() + " "
                    + countryList.get(id).getPopulation() + " "
                    + countryList.get(id).getSquare() + " "
                    + countryList.get(id).getLanguage() + " ");
        }

        connection.close();
    }


    private static Country selectById(Connection dbConnection, int idToFind) throws SQLException {
        PreparedStatement statement = null;
        ResultSet rs = null;
        Country rescountry;
        String cname = "";
        int population = 0;
        int square = 0;
        String language = "";
        String selectTableSQL = "SELECT name, population, square,language " +
                "FROM countries where country_id = ?";

        try {
            statement = dbConnection.prepareStatement(selectTableSQL);
            statement.setInt(1, idToFind);
            statement.execute();
            // execute select SQL statement
            rs = statement.executeQuery();
            while (rs.next()) {

                cname = rs.getString("name");
                population = rs.getInt("population");
                square = rs.getInt("square");
                language = rs.getString("language");

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if (statement != null) {
                statement.close();
            }



        }
        return new Country(idToFind, cname, population, square, language);

    }

    private static List<Country> selectAllCountries(Connection dbConnection) throws SQLException {
        PreparedStatement statement = null;
        ResultSet rs = null;
        Country rescountry;
        List<Country> countryList = new ArrayList<>();
        String cname = "";
        int population = 0;
        int square = 0;
        int id = 0;
        String language = "";
        String selectTableSQL = "SELECT country_id, name, population, square,language " +
                "FROM countries";

        try {
            statement = dbConnection.prepareStatement(selectTableSQL);
            statement.execute();
            // execute select SQL statement
            rs = statement.executeQuery();
            while (rs.next()) {
                id = rs.getInt("country_id");
                cname = rs.getString("name");
                population = rs.getInt("population");
                square = rs.getInt("square");
                language = rs.getString("language");
                countryList.add(new Country(id, cname, population, square, language));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if (statement != null) {
                statement.close();
            }



        }
        return countryList;

    }

    private static void insertNextCountry(Connection dbConnection, Country country)
            throws SQLException {
        PreparedStatement statement = null;
        ResultSet rs = null;
        String selectTableSQL = "INSERT INTO countries (name, population, square,language) " +
                "VALUES (?,?,?,?)";

        try {
            statement = dbConnection.prepareStatement(selectTableSQL);
            statement.setString(1, country.getCname());
            statement.setInt(2, country.getPopulation());
            statement.setInt(3, country.getSquare());
            statement.setString(4, country.getLanguage());
            statement.execute();
            // execute select SQL statement

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if (statement != null) {
                statement.close();
            }



        }


    }


    private static void deleteCountryById(Connection dbConnection, int country_id)
            throws SQLException {
        PreparedStatement statement = null;
        ResultSet rs = null;
        String selectTableSQL = "DELETE FROM countries " +
                "WHERE  country_id=?";

        try {
            statement = dbConnection.prepareStatement(selectTableSQL);
            statement.setInt(1, country_id);
            statement.execute();
            // execute select SQL statement

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if (statement != null) {
                statement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }

        }


    }

    private static void deleteCountryByName(Connection dbConnection, String cname)
            throws SQLException {
        PreparedStatement statement = null;
        ResultSet rs = null;
        String selectTableSQL = "DELETE FROM countries " +
                "WHERE  name=?";

        try {
            statement = dbConnection.prepareStatement(selectTableSQL);
            statement.setString(1, cname);
            statement.execute();
            // execute select SQL statement

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if (statement != null) {
                statement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }

        }


    }

}
