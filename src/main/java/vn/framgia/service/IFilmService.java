package vn.framgia.service;

import org.hibernate.Session;
import org.jsoup.select.Elements;
import vn.framgia.bean.FilmBean;
import java.io.Serializable;

/**
 * Created by FRAMGIA\duong.van.tien on 10/04/2017.
 */
public interface IFilmService extends Serializable {
    public Session getSession();
    public boolean cloneData(String urlCloneData);
}
