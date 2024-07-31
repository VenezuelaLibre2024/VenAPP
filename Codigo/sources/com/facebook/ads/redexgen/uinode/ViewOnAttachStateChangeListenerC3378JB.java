package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.JB */
/* loaded from: assets/audience_network.dex */
public class ViewOnAttachStateChangeListenerC3378JB implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC3376J9 A00;
    public final /* synthetic */ C3377JA A01;

    public ViewOnAttachStateChangeListenerC3378JB(C3377JA c3377ja, EnumC3376J9 enumC3376J9) {
        this.A01 = c3377ja;
        this.A00 = enumC3376J9;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
