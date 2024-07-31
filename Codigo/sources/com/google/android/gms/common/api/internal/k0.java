package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.c;

/* loaded from: classes.dex */
public final class k0 implements c.e {

    /* renamed from: a */
    final /* synthetic */ l0 f9393a;

    public k0(l0 l0Var) {
        this.f9393a = l0Var;
    }

    @Override // com.google.android.gms.common.internal.c.e
    public final void a() {
        Handler handler;
        handler = this.f9393a.f9412x.A;
        handler.post(new j0(this));
    }
}
