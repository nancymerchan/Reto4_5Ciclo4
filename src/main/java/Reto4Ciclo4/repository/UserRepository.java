package Reto4Ciclo4.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto4Ciclo4.model.User;
import Reto4Ciclo4.repository.crud.UserCrudRepository;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author Angie
 */
@Repository
public class UserRepository {
    /**
     * Variable que representa el servicio de Usuario
     */
    @Autowired
    private UserCrudRepository userCrudRepository;
    /**
     * Obtener Lista de todos los usuarios
     */
    public List<User> getAll(){
        return (List<User>) userCrudRepository.findAll();
    }
    /**
     * Obtener usuarios por su id
     * @param id
     * @return
     */
    public Optional<User> getUser(int id){
        return userCrudRepository.findById(id);
    }
    /**
     * Metodo para guardar nuevo usuario
     */
    public User save(User user){
        return userCrudRepository.save(user);
    }
    /**
     * Metodo para actualizar nuevo usuario
     */
    public void update(User user){
        userCrudRepository.save(user);
    }
    public void delete(User user){
        userCrudRepository.delete(user);
    }
    public boolean emailExists(String email){
        Optional<User> user=userCrudRepository.findByEmail(email);
        return user.isPresent();
    }
    public Optional<User>authenticateUser(String email, String password){
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
    public List<User>getByMonthBirthtDay(String monthBirthtDay){
        return userCrudRepository.findByMonthBirthtDay(monthBirthtDay);
    }
}
