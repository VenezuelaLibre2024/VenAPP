package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.AbstractC5228c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.k0 */
/* loaded from: classes.dex */
public final class C5152k0 implements AbstractC5228c.e {

    /* renamed from: a */
    final /* synthetic */ C5156l0 f10507a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5152k0(C5156l0 c5156l0) {
        this.f10507a = c5156l0;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c.e
    /* renamed from: a */
    public final void mo13086a() {
        Handler handler;
        handler = this.f10507a.f10526x.f10465A;
        handler.post(new RunnableC5148j0(this));
    }
}
