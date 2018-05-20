package abdulrahmank.com.myhealthapplication;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalorieOutputView extends RelativeLayout {

    @BindView(R.id.calorie_progress_bar)
    ProgressBar calorieProgressBar;

    public CalorieOutputView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        View view = View.inflate(context, R.layout.calorie_plot_fragment, this);
        ButterKnife.bind(this, view);
    }

    public void setCalorieProgress(Calorie calories) {
        calorieProgressBar.setProgressDrawable(new ColorDrawable(calories.getColor()));
        calorieProgressBar.setProgress(calories.getValue());
    }
}
