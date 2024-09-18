package vn.edu.usth.homepager_extend;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class discussion_activity extends AppCompatActivity {

    private Button filterCreatedByMe, filterUnanswered, filterSort;
    private TextView resetFilters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discussion);

        // Buttons
        filterCreatedByMe = findViewById(R.id.filterCreatedByMe);
        filterUnanswered = findViewById(R.id.filterUnanswered);
        filterSort = findViewById(R.id.filterSort);


        // Set click listeners for filters
        filterCreatedByMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(discussion_activity.this, "Filter: Created by me", Toast.LENGTH_SHORT).show();
            }
        });

        filterUnanswered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(discussion_activity.this, "Filter: Unanswered", Toast.LENGTH_SHORT).show();
            }
        });

        filterSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(discussion_activity.this, "Filter: Sort by Newest", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

