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

public class TriviaPatagoniaActivity_ViewBinding implements Unbinder {
  private TriviaPatagoniaActivity target;

  @UiThread
  public TriviaPatagoniaActivity_ViewBinding(TriviaPatagoniaActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TriviaPatagoniaActivity_ViewBinding(TriviaPatagoniaActivity target, View source) {
    this.target = target;

    target.mAnswer1 = Utils.findRequiredViewAsType(source, R.id.answerBtn1, "field 'mAnswer1'", Button.class);
    target.mAnswer2 = Utils.findRequiredViewAsType(source, R.id.answerBtn2, "field 'mAnswer2'", Button.class);
    target.mAnswer3 = Utils.findRequiredViewAsType(source, R.id.answerBtn3, "field 'mAnswer3'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TriviaPatagoniaActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mAnswer1 = null;
    target.mAnswer2 = null;
    target.mAnswer3 = null;
  }
}
