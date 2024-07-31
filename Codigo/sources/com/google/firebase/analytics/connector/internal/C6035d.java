package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import cc.InterfaceC1940a;
import va.C11784a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.analytics.connector.internal.d */
/* loaded from: classes.dex */
public final class C6035d implements C11784a.a {

    /* renamed from: a */
    private final /* synthetic */ C6036e f12810a;

    public C6035d(C6036e c6036e) {
        this.f12810a = c6036e;
    }

    @Override // p418wa.InterfaceC12123u
    /* renamed from: a */
    public final void mo13588a(String str, String str2, Bundle bundle, long j10) {
        InterfaceC1940a.b bVar;
        if (this.f12810a.f12811a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", C6033b.m16317c(str2));
            bVar = this.f12810a.f12812b;
            bVar.mo10154a(2, bundle2);
        }
    }
}
