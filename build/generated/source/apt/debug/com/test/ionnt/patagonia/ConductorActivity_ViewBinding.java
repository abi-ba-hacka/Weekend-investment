// Generated code from Butter Knife. Do not modify!
package com.test.ionnt.patagonia;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ConductorActivity_ViewBinding implements Unbinder {
  private ConductorActivity target;

  @UiThread
  public ConductorActivity_ViewBinding(ConductorActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ConductorActivity_ViewBinding(ConductorActivity target, View source) {
    this.target = target;

    target.mOkButton = Utils.findRequiredViewAsType(source, R.id.ok, "field 'mOkButton'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ConductorActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mOkButton = null;
  }
}
