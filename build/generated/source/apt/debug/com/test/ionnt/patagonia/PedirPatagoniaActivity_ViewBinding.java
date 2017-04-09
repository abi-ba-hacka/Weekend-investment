// Generated code from Butter Knife. Do not modify!
package com.test.ionnt.patagonia;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PedirPatagoniaActivity_ViewBinding implements Unbinder {
  private PedirPatagoniaActivity target;

  @UiThread
  public PedirPatagoniaActivity_ViewBinding(PedirPatagoniaActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PedirPatagoniaActivity_ViewBinding(PedirPatagoniaActivity target, View source) {
    this.target = target;

    target.addBeer1 = Utils.findRequiredViewAsType(source, R.id.addBeer, "field 'addBeer1'", ImageView.class);
    target.addBeer2 = Utils.findRequiredViewAsType(source, R.id.addBeer2, "field 'addBeer2'", ImageView.class);
    target.addBeer3 = Utils.findRequiredViewAsType(source, R.id.addBeer3, "field 'addBeer3'", ImageView.class);
    target.lessBeer1 = Utils.findRequiredViewAsType(source, R.id.lessBeer, "field 'lessBeer1'", ImageView.class);
    target.lessBeer2 = Utils.findRequiredViewAsType(source, R.id.lessBeer2, "field 'lessBeer2'", ImageView.class);
    target.lessBeer3 = Utils.findRequiredViewAsType(source, R.id.lessBeer3, "field 'lessBeer3'", ImageView.class);
    target.mQtyBeerText1 = Utils.findRequiredViewAsType(source, R.id.qty_beer1, "field 'mQtyBeerText1'", TextView.class);
    target.mQtyBeerText2 = Utils.findRequiredViewAsType(source, R.id.qty_beer2, "field 'mQtyBeerText2'", TextView.class);
    target.mQtyBeerText3 = Utils.findRequiredViewAsType(source, R.id.qty_beer3, "field 'mQtyBeerText3'", TextView.class);
    target.mPintSelect1 = Utils.findRequiredViewAsType(source, R.id.pint1, "field 'mPintSelect1'", ImageView.class);
    target.mPintSelect2 = Utils.findRequiredViewAsType(source, R.id.pint2, "field 'mPintSelect2'", ImageView.class);
    target.mPintSelect3 = Utils.findRequiredViewAsType(source, R.id.pint3, "field 'mPintSelect3'", ImageView.class);
    target.mConductorDesignado = Utils.findRequiredViewAsType(source, R.id.conductor_designado, "field 'mConductorDesignado'", Button.class);
    target.mNoseQuePedir = Utils.findRequiredViewAsType(source, R.id.nosequepedir, "field 'mNoseQuePedir'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PedirPatagoniaActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.addBeer1 = null;
    target.addBeer2 = null;
    target.addBeer3 = null;
    target.lessBeer1 = null;
    target.lessBeer2 = null;
    target.lessBeer3 = null;
    target.mQtyBeerText1 = null;
    target.mQtyBeerText2 = null;
    target.mQtyBeerText3 = null;
    target.mPintSelect1 = null;
    target.mPintSelect2 = null;
    target.mPintSelect3 = null;
    target.mConductorDesignado = null;
    target.mNoseQuePedir = null;
  }
}
