package com.netrava.prac6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.netrava.prac6.databinding.FragmentBinding;

public class ThirdFragment extends Fragment {
    FragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentBinding.inflate(inflater, container, false);

        binding.textView.setText("3");

        return binding.getRoot();
    }
}
