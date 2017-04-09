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

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.mPedirPatagonia = Utils.findRequiredViewAsType(source, R.id.pedir_patagonia, "field 'mPedirPatagonia'", Button.class);
    target.mJugarGanar = Utils.findRequiredViewAsType(source, R.id.jugar_ganar, "field 'mJugarGanar'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPedirPatagonia = null;
    target.mJugarGanar = null;
  }
}
