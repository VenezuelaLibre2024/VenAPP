package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes.dex */
final class b2 extends r0 {

    /* renamed from: a */
    final /* synthetic */ Dialog f9331a;

    /* renamed from: b */
    final /* synthetic */ c2 f9332b;

    public b2(c2 c2Var, Dialog dialog) {
        this.f9332b = c2Var;
        this.f9331a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final void a() {
        this.f9332b.f9342b.d();
        if (this.f9331a.isShowing()) {
            this.f9331a.dismiss();
        }
    }
}
