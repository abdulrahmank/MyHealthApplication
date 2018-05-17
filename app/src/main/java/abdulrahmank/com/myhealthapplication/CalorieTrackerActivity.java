package abdulrahmank.com.myhealthapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class CalorieTrackerActivity extends AppCompatActivity implements CalorieInputFragment.CalorieInputFragmentCalorieManager {

    private static final int DEFAULT_FULL_CALORIE = 1000;
    private CalorieOutputFragment outputFragment;
    private CalorieInputFragment inputFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputFragment = new CalorieInputFragment();
        inputFragment.setCalorieManager(this);
        outputFragment = new CalorieOutputFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.input_container, inputFragment).commit();
        fragmentManager.beginTransaction().replace(R.id.output_container, outputFragment).commit();
    }

    @Override
    public void updateCalories(int calories) {
        int calorieProgress = calories * 100 / DEFAULT_FULL_CALORIE;
        outputFragment.setCalorieProgress(calorieProgress);
    }
}
