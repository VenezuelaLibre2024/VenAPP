package com.google.android.gms.dynamic;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f9712a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f9713b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(a aVar, Bundle bundle) {
        this.f9713b = aVar;
        this.f9712a = bundle;
    }

    @Override // com.google.android.gms.dynamic.l
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.dynamic.l
    public final void b(c cVar) {
        c cVar2;
        cVar2 = this.f9713b.f9706a;
        cVar2.onCreate(this.f9712a);
    }
}
