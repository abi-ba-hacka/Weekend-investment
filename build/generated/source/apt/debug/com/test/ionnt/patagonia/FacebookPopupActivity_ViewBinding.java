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

public class FacebookPopupActivity_ViewBinding implements Unbinder {
  private FacebookPopupActivity target;

  @UiThread
  public FacebookPopupActivity_ViewBinding(FacebookPopupActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FacebookPopupActivity_ViewBinding(FacebookPopupActivity target, View source) {
    this.target = target;

    target.btnAccept = Utils.findRequiredViewAsType(source, R.id.acceptBtn, "field 'btnAccept'", Button.class);
    target.btnCancel = Utils.findRequiredViewAsType(source, R.id.cancelBtn, "field 'btnCancel'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FacebookPopupActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnAccept = null;
    target.btnCancel = null;
  }
}
