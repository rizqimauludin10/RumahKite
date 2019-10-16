package com.example.rumahkite.adapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

import com.example.rumahkite.R;
import com.example.rumahkite.fragment.Form2Fragment;
import com.example.rumahkite.fragment.FormFragment;
import com.example.rumahkite.model.FormModelStepper;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;
import com.stepstone.stepper.viewmodel.StepViewModel;

public class FormStepperAdapter extends AbstractFragmentStepAdapter {
    //private static final String CURRENT_STEP_POSITION_KEY = ;

    public FormStepperAdapter(@NonNull FragmentManager fm, @NonNull Context context) {
        super(fm, context);
    }

    @Override
    public Step createStep(int position) {
        final FormFragment formFragment = new FormFragment();
        final Form2Fragment form2Fragment = new Form2Fragment();
        Bundle bundle = new Bundle();
        //bundle.putInt(CURRENT_STEP_POSITION_KEY, position);
        formFragment.setArguments(bundle);
        form2Fragment.setArguments(bundle);
        return formFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public StepViewModel getViewModel(@IntRange(from = 0)int position) {
        return new StepViewModel.Builder(context) //can be a CharSequence instead
                .setTitle("Finish")
                .create();
    }


}
