package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import java.util.Set;

/* loaded from: classes.dex */
public final class m1 extends ab.d implements f.a, f.b {

    /* renamed from: s, reason: collision with root package name */
    private static final a.AbstractC0146a f9424s = za.e.f32503c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f9425a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f9426b;

    /* renamed from: c, reason: collision with root package name */
    private final a.AbstractC0146a f9427c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f9428d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.common.internal.e f9429e;

    /* renamed from: f, reason: collision with root package name */
    private za.f f9430f;

    /* renamed from: r, reason: collision with root package name */
    private l1 f9431r;

    public m1(Context context, Handler handler, com.google.android.gms.common.internal.e eVar) {
        a.AbstractC0146a abstractC0146a = f9424s;
        this.f9425a = context;
        this.f9426b = handler;
        this.f9429e = (com.google.android.gms.common.internal.e) com.google.android.gms.common.internal.s.k(eVar, "ClientSettings must not be null");
        this.f9428d = eVar.g();
        this.f9427c = abstractC0146a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void g2(m1 m1Var, ab.l lVar) {
        ca.b u12 = lVar.u1();
        if (u12.y1()) {
            com.google.android.gms.common.internal.u0 u0Var = (com.google.android.gms.common.internal.u0) com.google.android.gms.common.internal.s.j(lVar.v1());
            u12 = u0Var.u1();
            if (u12.y1()) {
                m1Var.f9431r.b(u0Var.v1(), m1Var.f9428d);
                m1Var.f9430f.disconnect();
            } else {
                String valueOf = String.valueOf(u12);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            }
        }
        m1Var.f9431r.a(u12);
        m1Var.f9430f.disconnect();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, za.f] */
    public final void h2(l1 l1Var) {
        za.f fVar = this.f9430f;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.f9429e.k(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0146a abstractC0146a = this.f9427c;
        Context context = this.f9425a;
        Looper looper = this.f9426b.getLooper();
        com.google.android.gms.common.internal.e eVar = this.f9429e;
        this.f9430f = abstractC0146a.buildClient(context, looper, eVar, (com.google.android.gms.common.internal.e) eVar.h(), (f.a) this, (f.b) this);
        this.f9431r = l1Var;
        Set set = this.f9428d;
        if (set == null || set.isEmpty()) {
            this.f9426b.post(new j1(this));
        } else {
            this.f9430f.a();
        }
    }

    public final void i2() {
        za.f fVar = this.f9430f;
        if (fVar != null) {
            fVar.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnected(Bundle bundle) {
        this.f9430f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void onConnectionFailed(ca.b bVar) {
        this.f9431r.a(bVar);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnectionSuspended(int i10) {
        this.f9430f.disconnect();
    }

    @Override // ab.f
    public final void v0(ab.l lVar) {
        this.f9426b.post(new k1(this, lVar));
    }
}
