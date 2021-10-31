package academy.devdojo.estudojava.javacore.ZZIjdbc.repository;

import academy.devdojo.estudojava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.estudojava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in database, rows affected '{}' ", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' in database, rows affected '{}' ", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
            e.printStackTrace();
        }
    }

    public static void update(Producer producer) {
        String sql = " UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');"
                .formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Uptade producer '{}', rows affected '{}' ", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
            e.printStackTrace();
        }
    }

    // ResultSet.png
    public static List<Producer> findAll() {
        log.info("Finding all Producers");
        return findByName("");
//        String sql = "SELECT id, name FROM anime_store.producer;";
//        List<Producer> producers = new ArrayList<>();
//        try (Connection conn = ConnectionFactory.getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)) {
//            while (rs.next()) {
////                int id = rs.getInt("id");
////                String name = rs.getString("name");
////                Producer producer = Producer.builder().id(id).name(name).build();
////                producers.add(producer);
//                Producer producer = Producer
//                        .builder()
//                        .id(rs.getInt("id"))
//                        .name(rs.getString("name"))
//                        .build();
//                producers.add(producer);
//            }
//        } catch (SQLException e) {
//            log.error("Erro while trying to find all producers", e);
//        }
//        return producers;
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding Producers by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Erro while trying to find all producers", e);
        }
        return producers;
    }
}
