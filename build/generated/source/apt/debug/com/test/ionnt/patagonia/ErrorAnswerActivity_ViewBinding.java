// Generated code from Butter Knife. Do not modify!
package com.test.ionnt.patagonia;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ErrorAnswerActivity_ViewBinding implements Unbinder {
  private ErrorAnswerActivity target;

  @UiThread
  public ErrorAnswerActivity_ViewBinding(ErrorAnswerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ErrorAnswerActivity_ViewBinding(ErrorAnswerActivity target, View source) {
    this.target = target;

    target.okBtn = Utils.findRequiredViewAsType(source, R.id.okBtn, "field 'okBtn'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ErrorAnswerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.okBtn = null;
  }
}
