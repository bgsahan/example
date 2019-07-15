@Dao

public interface DaoAccess {


   @Insert

   String addProject(Project project);



   @Query("SELECT * FROM Project ORDER BY project_date desc")

   LiveData<List<Project>> loadallProjects();



   @Query("SELECT * FROM Project WHERE project_id =:projectId")

   LiveData<Project> getProject(int projectId);



   @Update

   void updateTask(Project project);



   @Delete

   void deleteTask(Project project);

}

