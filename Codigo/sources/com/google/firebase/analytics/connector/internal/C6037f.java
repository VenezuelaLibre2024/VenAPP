package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import cc.InterfaceC1940a;
import va.C11784a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.analytics.connector.internal.f */
/* loaded from: classes.dex */
public final class C6037f implements C11784a.a {

    /* renamed from: a */
    private final /* synthetic */ C6038g f12815a;

    public C6037f(C6038g c6038g) {
        this.f12815a = c6038g;
    }

    @Override // p418wa.InterfaceC12123u
    /* renamed from: a */
    public final void mo13588a(String str, String str2, Bundle bundle, long j10) {
        InterfaceC1940a.b bVar;
        if (str == null || !C6033b.m16326l(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        bVar = this.f12815a.f12816a;
        bVar.mo10154a(3, bundle2);
    }
}
