package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import ca.C1894b;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.internal.AbstractC5228c;
import com.google.android.gms.common.internal.InterfaceC5252k;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.p0 */
/* loaded from: classes.dex */
public final class C5168p0 implements AbstractC5228c.c, InterfaceC5157l1 {

    /* renamed from: a */
    private final C5101a.f f10556a;

    /* renamed from: b */
    private final C5115b f10557b;

    /* renamed from: c */
    private InterfaceC5252k f10558c = null;

    /* renamed from: d */
    private Set f10559d = null;

    /* renamed from: e */
    private boolean f10560e = false;

    /* renamed from: f */
    final /* synthetic */ C5135g f10561f;

    public C5168p0(C5135g c5135g, C5101a.f fVar, C5115b c5115b) {
        this.f10561f = c5135g;
        this.f10556a = fVar;
        this.f10557b = c5115b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m13154h() {
        InterfaceC5252k interfaceC5252k;
        if (!this.f10560e || (interfaceC5252k = this.f10558c) == null) {
            return;
        }
        this.f10556a.getRemoteService(interfaceC5252k, this.f10559d);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5157l1
    /* renamed from: a */
    public final void mo13132a(C1894b c1894b) {
        Map map;
        map = this.f10561f.f10478w;
        C5156l0 c5156l0 = (C5156l0) map.get(this.f10557b);
        if (c5156l0 != null) {
            c5156l0.m13119F(c1894b);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5157l1
    /* renamed from: b */
    public final void mo13133b(InterfaceC5252k interfaceC5252k, Set set) {
        if (interfaceC5252k == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo13132a(new C1894b(4));
        } else {
            this.f10558c = interfaceC5252k;
            this.f10559d = set;
            m13154h();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC5228c.c
    /* renamed from: c */
    public final void mo13155c(C1894b c1894b) {
        Handler handler;
        handler = this.f10561f.f10465A;
        handler.post(new RunnableC5165o0(this, c1894b));
    }
}
