package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public void updateUser(Long id, User updatedUser) {
        em.merge(updatedUser);
    }
    @Override
    public void removeUser(User user) {
        em.remove(em.contains(user) ? user : em.merge(user));
    }
    @Override
    public User getUserById(Long id) {
        return em.find(User.class, id);
    }
    @Override
    public List<User> getListUser() {
        return em.createQuery("from User", User.class).getResultList();
    }
}
