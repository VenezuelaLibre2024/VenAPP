package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import cc.a;
import va.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f implements a.InterfaceC0462a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ g f11600a;

    public f(g gVar) {
        this.f11600a = gVar;
    }

    @Override // wa.u
    public final void a(String str, String str2, Bundle bundle, long j10) {
        a.b bVar;
        if (str == null || !b.l(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        bVar = this.f11600a.f11601a;
        bVar.a(3, bundle2);
    }
}
