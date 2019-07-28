public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.MainRecyclerViewHolder> {

   private final ArrayList<Project> mProjectList;
   private final LayoutInflater mInflater;
   
   private static final int EXTRA_PROJECT_ID;

   class MainRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


       public final TextView projectItemView;

       final MainRecyclerAdapter mAdapter;


       public MainRecyclerViewHolder(View itemView, MainRecyclerAdapter adapter) {

           super(itemView);

           projectItemView = (TextView) itemView.findViewById(R.id.project_textView);

           this.mAdapter = adapter;

           itemView.setOnClickListener(this);

       }


         //Directing from MainActivity to the ProjectActivity

         @Override

         public void onClick(View v) {

           Intent intent = new Intent(getActivity(), ProjectActivity.class);

           intent.putExtra(EXTRA_PROJECT_ID, getAdapterPosition());

           startActivity(intent);

         }

       }



   }


   public MainRecyclerAdapter(Context context, ArrayList<Project> projectList) {

       mInflater = LayoutInflater.from(context);

       this.mProjectList = projectList;

   }


   @Override

   public MainRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       // Inflate an item view.

       View mItemView = mInflater.inflate(R.layout.projrctlist_item, parent, false);

       return new MainRecycleriewHolder(mItemView, this);

   }


   @Override

   public void onBindViewHolder(MainRecyclerViewHolder viewHolder, int position) {

       // Retrieve the data for that position.

       String mCurrentProjectTitle = mProjectList.get(position).getProjectTitle();

       // Add the data to the view holder.

       viewHolder.projectItemView.setText(mCurrentProjectTitle);


   }


   @Override

   public int getItemCount() {

       return mProjectList.size();

   }

}

