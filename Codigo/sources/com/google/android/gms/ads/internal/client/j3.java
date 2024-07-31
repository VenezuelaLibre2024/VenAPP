package com.google.android.gms.ads.internal.client;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j3 extends a2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ j3(i3 i3Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.c2
    public final void zze(c3 c3Var) {
        x8.s sVar;
        sVar = m3.h().f8704g;
        if (sVar != null) {
            sVar.onAdInspectorClosed(c3Var == null ? null : new x8.d(c3Var.f8626a, c3Var.f8627b, c3Var.f8628c));
        }
    }
}
