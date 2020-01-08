package com.myapp;

import com.facebook.react.HeadlessJsTaskService;
import androidx.annotation.Nullable;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.Toast;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.bridge.Arguments;
import android.os.Bundle;
import android.util.Log;

public class MyTaskService extends HeadlessJsTaskService {

  @Override
  protected @Nullable HeadlessJsTaskConfig getTaskConfig(Intent intent) {
    Bundle extras = intent.getExtras();
    Log.e("Connected11","I shouldn't be here");
    if (extras != null) {
      return new HeadlessJsTaskConfig(
          "SomeTaskName",
          Arguments.fromBundle(extras),
          5000, // timeout for the task
          false // optional: defines whether or not  the task is allowed in foreground. Default is false
        );
    }
    return null;
  }
}
