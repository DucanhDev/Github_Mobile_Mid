package vn.edu.usth.homepager_extend;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class issues_activity extends AppCompatActivity {

    private Button filterOpen, filterCreatedByMe, filterVisibility, filterOrganization, filterRepository, filterSort;
    private TextView resetFilters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

        // Buttons
        filterOpen = findViewById(R.id.filterOpen);
        filterCreatedByMe = findViewById(R.id.filterCreatedByMe);
        filterVisibility = findViewById(R.id.filterVisibility);
        filterOrganization = findViewById(R.id.filterOrganization);
        filterRepository = findViewById(R.id.filterRepository);
        filterSort = findViewById(R.id.filterSort);

        resetFilters = findViewById(R.id.reset_filters_button);

        // Set click listeners for filters
        filterOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(issues_activity.this, "Filter: Open", Toast.LENGTH_SHORT).show();
            }
        });

        filterCreatedByMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(issues_activity.this, "Filter: Created by me", Toast.LENGTH_SHORT).show();
            }
        });

        filterVisibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(issues_activity.this, "Filter: Visibility", Toast.LENGTH_SHORT).show();
            }
        });

        filterOrganization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(issues_activity.this, "Filter: Organization", Toast.LENGTH_SHORT).show();
            }
        });

        filterRepository.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(issues_activity.this, "Filter: Repository", Toast.LENGTH_SHORT).show();
            }
        });

        filterSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(issues_activity.this, "Filter: Sort by Newest", Toast.LENGTH_SHORT).show();
            }
        });

        // Reset Filters
        resetFilters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(issues_activity.this, "Resetting Filters", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
