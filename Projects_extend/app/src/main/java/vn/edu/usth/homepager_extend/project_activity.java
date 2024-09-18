package vn.edu.usth.homepager_extend;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class project_activity extends AppCompatActivity {

    private Button filterAllprojects, filterOpen, filterSort;
    private TextView resetFilters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        // Buttons
        filterAllprojects = findViewById(R.id.filterAllprojects);
        filterOpen = findViewById(R.id.filterOpen);
        filterSort = findViewById(R.id.filterSort);


        // Set click listeners for filters
        filterAllprojects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(project_activity.this, "Filter: All projects", Toast.LENGTH_SHORT).show();
            }
        });

        filterOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(project_activity.this, "Filter: Open", Toast.LENGTH_SHORT).show();
            }
        });

        filterSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(project_activity.this, "Filter: Sort:Most recently viewed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

