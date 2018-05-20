package abdulrahmank.com.myhealthapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CalorieInputFragment extends Fragment {

    @BindView(R.id.calorie_edit_text)
    EditText calorieEditText;

    interface CalorieInputFragmentCalorieManager {
        void updateCalories(int calories);
    }

    CalorieInputFragmentCalorieManager calorieManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calorie_input_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.calorieManager = (CalorieInputFragmentCalorieManager) context;
    }

    @OnClick(R.id.calorie_submit_btn)
    public void onCalorieSubmit() {
        calorieManager.updateCalories(Integer.parseInt(calorieEditText.getText().toString()));
    }
}
