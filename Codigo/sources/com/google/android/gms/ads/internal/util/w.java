package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.c3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w extends com.google.android.gms.ads.internal.client.a2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f9072a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f9073b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(z zVar, Context context) {
        this.f9072a = context;
        this.f9073b = zVar;
    }

    @Override // com.google.android.gms.ads.internal.client.c2
    public final void zze(c3 c3Var) {
        if (c3Var == null) {
            return;
        }
        this.f9073b.i(this.f9072a, c3Var.f8627b, true, true);
    }
}
