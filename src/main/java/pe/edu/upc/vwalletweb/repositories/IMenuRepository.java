package pe.edu.upc.vwalletweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.vwalletweb.entities.Menu;

import java.util.List;

@Repository
public interface IMenuRepository extends JpaRepository<Menu, Integer> {
    @Query(value = "SELECT m.* FROM menu m \n" +
            "JOIN cafeteria c ON m.cafeteria_id = c.id_cafeteria \n" +
            "WHERE c.sede_cafeteria = 'San Isidro'", nativeQuery = true)
    List<String[]> MenuDisponiblePorSede();

    @Query(value = "SELECT dr.menu_id, SUM(m.precio_menu) AS total_gasto \n" +
            "FROM detallereservas dr \n" +
            "         JOIN menu m ON dr.menu_id = m.id_menu \n" +
            "GROUP BY dr.menu_id \n" +
            "ORDER BY total_gasto DESC \n" +
            "LIMIT 3; \n", nativeQuery = true)
    List<String[]> menusCaros();
}