package abdulrahmank.com.myhealthapplication;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CalorieInputView extends RelativeLayout {

    interface CalorieInputFragmentCalorieManager {
        void updateCalories(int calories);
    }

    @BindView(R.id.calorie_edit_text)
    EditText calorieEditText;

    CalorieInputFragmentCalorieManager calorieManager;

    public CalorieInputView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        View view = View.inflate(context, R.layout.calorie_input_fragment, this);
        ButterKnife.bind(this, view);

    }

    public void setCalorieManager(CalorieInputFragmentCalorieManager calorieManager) {
        this.calorieManager = calorieManager;
    }

    @OnClick(R.id.calorie_submit_btn)
    public void onCalorieSubmit() {
        this.calorieManager.updateCalories(Integer.parseInt(calorieEditText.getText().toString()));
    }
}
