// Generated by view binder compiler. Do not edit!
package com.example.Jack7_1P.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.Jack7_1P.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AdvertPostBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonRemove;

  @NonNull
  public final TextView textDate;

  @NonNull
  public final TextView textDes;

  @NonNull
  public final TextView textLocation;

  @NonNull
  public final TextView textPhoneNum;

  @NonNull
  public final TextView textTypeItem;

  private AdvertPostBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonRemove,
      @NonNull TextView textDate, @NonNull TextView textDes, @NonNull TextView textLocation,
      @NonNull TextView textPhoneNum, @NonNull TextView textTypeItem) {
    this.rootView = rootView;
    this.buttonRemove = buttonRemove;
    this.textDate = textDate;
    this.textDes = textDes;
    this.textLocation = textLocation;
    this.textPhoneNum = textPhoneNum;
    this.textTypeItem = textTypeItem;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AdvertPostBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdvertPostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.advert_post, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdvertPostBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonRemove;
      Button buttonRemove = ViewBindings.findChildViewById(rootView, id);
      if (buttonRemove == null) {
        break missingId;
      }

      id = R.id.textDate;
      TextView textDate = ViewBindings.findChildViewById(rootView, id);
      if (textDate == null) {
        break missingId;
      }

      id = R.id.textDes;
      TextView textDes = ViewBindings.findChildViewById(rootView, id);
      if (textDes == null) {
        break missingId;
      }

      id = R.id.textLocation;
      TextView textLocation = ViewBindings.findChildViewById(rootView, id);
      if (textLocation == null) {
        break missingId;
      }

      id = R.id.textPhoneNum;
      TextView textPhoneNum = ViewBindings.findChildViewById(rootView, id);
      if (textPhoneNum == null) {
        break missingId;
      }

      id = R.id.textTypeItem;
      TextView textTypeItem = ViewBindings.findChildViewById(rootView, id);
      if (textTypeItem == null) {
        break missingId;
      }

      return new AdvertPostBinding((ConstraintLayout) rootView, buttonRemove, textDate, textDes,
          textLocation, textPhoneNum, textTypeItem);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}