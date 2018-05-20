package abdulrahmank.com.myhealthapplication;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.time.OffsetTime;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CalorieOutputFragment extends OutputFragment {

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
        if(calories > 500) {
            calorieProgressBar.setProgressDrawable(new ColorDrawable(Color.RED));
        }
        calorieProgressBar.setProgress(calories);
    }
}
