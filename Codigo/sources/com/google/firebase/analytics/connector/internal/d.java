package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import cc.a;
import va.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements a.InterfaceC0462a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ e f11595a;

    public d(e eVar) {
        this.f11595a = eVar;
    }

    @Override // wa.u
    public final void a(String str, String str2, Bundle bundle, long j10) {
        a.b bVar;
        if (this.f11595a.f11596a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", b.c(str2));
            bVar = this.f11595a.f11597b;
            bVar.a(2, bundle2);
        }
    }
}
