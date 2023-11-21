// Generated by view binder compiler. Do not edit!
package com.example.mmmmmmmmmmm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mmmmmmmmmmm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDonateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnDonate;

  @NonNull
  public final TextView customTitle;

  @NonNull
  public final EditText editTextDescription;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Toolbar toolbar;

  private ActivityDonateBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnDonate,
      @NonNull TextView customTitle, @NonNull EditText editTextDescription,
      @NonNull ImageView imageView, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.btnDonate = btnDonate;
    this.customTitle = customTitle;
    this.editTextDescription = editTextDescription;
    this.imageView = imageView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDonateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDonateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_donate, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDonateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDonate;
      Button btnDonate = ViewBindings.findChildViewById(rootView, id);
      if (btnDonate == null) {
        break missingId;
      }

      id = R.id.custom_title;
      TextView customTitle = ViewBindings.findChildViewById(rootView, id);
      if (customTitle == null) {
        break missingId;
      }

      id = R.id.editTextDescription;
      EditText editTextDescription = ViewBindings.findChildViewById(rootView, id);
      if (editTextDescription == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityDonateBinding((ConstraintLayout) rootView, btnDonate, customTitle,
          editTextDescription, imageView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
