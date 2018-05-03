package abdulrahmank.com.myhealthapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CalorieOutputFragment extends Fragment {

    @BindView(R.id.calorie_progress_bar)
    ProgressBar calorieProgressBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calorie_plot_fragment, null);
        ButterKnife.bind(this, view);
        return view;
    }

    public void setCalorieProgress(int calories) {
        calorieProgressBar.setProgress(calories);
    }
}
