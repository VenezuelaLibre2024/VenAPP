package com.google.android.gms.common.internal;

import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h0 extends i0 {

    /* renamed from: a */
    final /* synthetic */ Intent f9579a;

    /* renamed from: b */
    final /* synthetic */ com.google.android.gms.common.api.internal.j f9580b;

    public h0(Intent intent, com.google.android.gms.common.api.internal.j jVar, int i10) {
        this.f9579a = intent;
        this.f9580b = jVar;
    }

    @Override // com.google.android.gms.common.internal.i0
    public final void a() {
        Intent intent = this.f9579a;
        if (intent != null) {
            this.f9580b.startActivityForResult(intent, 2);
        }
    }
}
