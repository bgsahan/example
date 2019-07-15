@Entity

public class Project implements Serializable {


   @PrimaryKey(autoGenerate = true)

   private int project_id;


   @ColumnInfo(name = "project_title")

   private String project_title;


   @ColumnInfo(name = "ptoject_notes")

   private String project_notes;


   @ColumnInfo(name = "project_todo")

   private String project_todo;


   @ColumnInfo(name = "project_date")

   @TypeConverters({TimestampConverter.class})

   private Date project_date;


   public int getProjectId() {

       return project_id;

   }


   public void setProjectId(int id) {

       this.project_id = id;

   }


   //TODO: Add all getters&setters


}

