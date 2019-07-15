@Database(entities = {Project.class}, version = 1, exportSchema = false)

public abstract class ProjectDatabase extends RoomDatabase {


   public abstract DaoAccess daoAccess();

}

