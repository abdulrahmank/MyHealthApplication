package abdulrahmank.com.myhealthapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalorieTrackerActivityWithCustomView extends AppCompatActivity implements CalorieInputView.CalorieInputFragmentCalorieManager {

    private static final int DEFAULT_FULL_CALORIE = 1000;
    @BindView(R.id.output_container)
    CalorieOutputView outputView;
    @BindView(R.id.input_container)
    CalorieInputView inputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_custom_view);
        ButterKnife.bind(this);
        inputView.setCalorieManager(this);
    }

    @Override
    public void updateCalories(int calories) {
        int calorieProgress = calories * 100 / DEFAULT_FULL_CALORIE;
        outputView.setCalorieProgress(calorieProgress);
    }
}
