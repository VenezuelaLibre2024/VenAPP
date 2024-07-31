package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes.dex */
abstract class w0 extends h1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f9669d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f9670e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f9671f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f9671f = cVar;
        this.f9669d = i10;
        this.f9670e = bundle;
    }

    @Override // com.google.android.gms.common.internal.h1
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        ca.b bVar;
        if (this.f9669d != 0) {
            this.f9671f.zzp(1, null);
            Bundle bundle = this.f9670e;
            bVar = new ca.b(this.f9669d, bundle != null ? (PendingIntent) bundle.getParcelable(c.KEY_PENDING_INTENT) : null);
        } else {
            if (g()) {
                return;
            }
            this.f9671f.zzp(1, null);
            bVar = new ca.b(8, null);
        }
        f(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.h1
    public final void b() {
    }

    protected abstract void f(ca.b bVar);

    protected abstract boolean g();
}
