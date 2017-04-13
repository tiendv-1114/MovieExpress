package vn.framgia.dao.impl;

import org.springframework.stereotype.Repository;
import vn.framgia.dao.IFilmDAO;
import vn.framgia.model.Film;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import java.util.List;

/**
 * Created by FRAMGIA\duong.van.tien on 10/04/2017.
 */
@Repository
public class FilmDAOImpl extends GenericDAO<Film, Integer> implements IFilmDAO {
    public FilmDAOImpl() {
        super.setPersistentClass(Film.class);
    }
}
