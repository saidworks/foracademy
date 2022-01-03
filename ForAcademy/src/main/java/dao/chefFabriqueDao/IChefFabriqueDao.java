package dao.chefFabriqueDao;

import models.ChefFabrique;
import models.Secretaire;

import java.util.List;

public interface IChefFabriqueDao {
    void saveChefFabrique(ChefFabrique chefFabrique);
    ChefFabrique selectById(int id);
    List<ChefFabrique> selectAll();
    void deleteChefFabrique(int id);

    void updateChefFabrique(ChefFabrique chefFabrique);
    void updateDetailsChefFabrique(ChefFabrique chefFabrique, String col, String newValue);
}
