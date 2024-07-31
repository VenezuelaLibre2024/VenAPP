package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class v8 extends y2 {

    /* renamed from: c */
    private final s9 f10708c;

    /* renamed from: d */
    private wa.i f10709d;

    /* renamed from: e */
    private volatile Boolean f10710e;

    /* renamed from: f */
    private final u f10711f;

    /* renamed from: g */
    private final oa f10712g;

    /* renamed from: h */
    private final List<Runnable> f10713h;

    /* renamed from: i */
    private final u f10714i;

    public v8(w5 w5Var) {
        super(w5Var);
        this.f10713h = new ArrayList();
        this.f10712g = new oa(w5Var.zzb());
        this.f10708c = new s9(this);
        this.f10711f = new y8(this, w5Var);
        this.f10714i = new h9(this, w5Var);
    }

    public static /* synthetic */ void F(v8 v8Var, ComponentName componentName) {
        v8Var.i();
        if (v8Var.f10709d != null) {
            v8Var.f10709d = null;
            v8Var.zzj().F().b("Disconnected from device MeasurementService", componentName);
            v8Var.i();
            v8Var.T();
        }
    }

    private final void I(Runnable runnable) {
        i();
        if (X()) {
            runnable.run();
        } else {
            if (this.f10713h.size() >= 1000) {
                zzj().B().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f10713h.add(runnable);
            this.f10714i.b(60000L);
            T();
        }
    }

    public final void a0() {
        i();
        zzj().F().b("Processing queued up service tasks", Integer.valueOf(this.f10713h.size()));
        Iterator<Runnable> it = this.f10713h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e10) {
                zzj().B().b("Task exception while flushing queue", e10);
            }
        }
        this.f10713h.clear();
        this.f10714i.a();
    }

    public final void b0() {
        i();
        this.f10712g.c();
        this.f10711f.b(e0.L.a(null).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean c0() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v8.c0():boolean");
    }

    private final lb e0(boolean z10) {
        return k().w(z10 ? zzj().J() : null);
    }

    public static /* synthetic */ void g0(v8 v8Var) {
        v8Var.i();
        if (v8Var.X()) {
            v8Var.zzj().F().a("Inactivity, disconnecting from the service");
            v8Var.U();
        }
    }

    public final void A(zzcv zzcvVar, String str, String str2) {
        i();
        q();
        I(new q9(this, str, str2, e0(false), zzcvVar));
    }

    public final void B(zzcv zzcvVar, String str, String str2, boolean z10) {
        i();
        q();
        I(new x8(this, str, str2, e0(false), z10, zzcvVar));
    }

    public final void C(d dVar) {
        com.google.android.gms.common.internal.s.j(dVar);
        i();
        q();
        I(new o9(this, true, e0(true), l().z(dVar), new d(dVar), dVar));
    }

    public final void D(d0 d0Var, String str) {
        com.google.android.gms.common.internal.s.j(d0Var);
        i();
        q();
        I(new l9(this, true, e0(true), l().A(d0Var), d0Var, str));
    }

    public final void E(p8 p8Var) {
        i();
        q();
        I(new e9(this, p8Var));
    }

    public final void H(hb hbVar) {
        i();
        q();
        I(new b9(this, e0(true), l().B(hbVar), hbVar));
    }

    public final void J(AtomicReference<String> atomicReference) {
        i();
        q();
        I(new d9(this, atomicReference, e0(false)));
    }

    public final void K(AtomicReference<List<na>> atomicReference, Bundle bundle) {
        i();
        q();
        I(new z8(this, atomicReference, e0(false), bundle));
    }

    public final void L(AtomicReference<List<d>> atomicReference, String str, String str2, String str3) {
        i();
        q();
        I(new n9(this, atomicReference, str, str2, str3, e0(false)));
    }

    public final void M(AtomicReference<List<hb>> atomicReference, String str, String str2, String str3, boolean z10) {
        i();
        q();
        I(new p9(this, atomicReference, str, str2, str3, e0(false), z10));
    }

    public final void N(wa.i iVar) {
        i();
        com.google.android.gms.common.internal.s.j(iVar);
        this.f10709d = iVar;
        b0();
        a0();
    }

    public final void O(wa.i iVar, ea.a aVar, lb lbVar) {
        int i10;
        p4 B;
        String str;
        i();
        q();
        int i11 = 100;
        int i12 = 0;
        while (i12 < 1001 && i11 == 100) {
            ArrayList arrayList = new ArrayList();
            List<ea.a> x10 = l().x(100);
            if (x10 != null) {
                arrayList.addAll(x10);
                i10 = x10.size();
            } else {
                i10 = 0;
            }
            if (aVar != null && i10 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                ea.a aVar2 = (ea.a) obj;
                if (aVar2 instanceof d0) {
                    try {
                        iVar.V0((d0) aVar2, lbVar);
                    } catch (RemoteException e10) {
                        e = e10;
                        B = zzj().B();
                        str = "Failed to send event to the service";
                        B.b(str, e);
                    }
                } else if (aVar2 instanceof hb) {
                    try {
                        iVar.c2((hb) aVar2, lbVar);
                    } catch (RemoteException e11) {
                        e = e11;
                        B = zzj().B();
                        str = "Failed to send user property to the service";
                        B.b(str, e);
                    }
                } else if (aVar2 instanceof d) {
                    try {
                        iVar.b2((d) aVar2, lbVar);
                    } catch (RemoteException e12) {
                        e = e12;
                        B = zzj().B();
                        str = "Failed to send conditional user property to the service";
                        B.b(str, e);
                    }
                } else {
                    zzj().B().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i12++;
            i11 = i10;
        }
    }

    public final void P(boolean z10) {
        i();
        q();
        if (z10) {
            l().C();
        }
        if (Z()) {
            I(new m9(this, e0(false)));
        }
    }

    public final wa.c Q() {
        i();
        q();
        wa.i iVar = this.f10709d;
        if (iVar == null) {
            T();
            zzj().A().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        lb e02 = e0(false);
        com.google.android.gms.common.internal.s.j(e02);
        try {
            wa.c X = iVar.X(e02);
            b0();
            return X;
        } catch (RemoteException e10) {
            zzj().B().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    public final Boolean R() {
        return this.f10710e;
    }

    public final void S() {
        i();
        q();
        lb e02 = e0(true);
        l().D();
        I(new g9(this, e02));
    }

    public final void T() {
        i();
        q();
        if (X()) {
            return;
        }
        if (c0()) {
            this.f10708c.a();
            return;
        }
        if (a().N()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (!((queryIntentServices == null || queryIntentServices.isEmpty()) ? false : true)) {
            zzj().B().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f10708c.b(intent);
    }

    public final void U() {
        i();
        q();
        this.f10708c.d();
        try {
            ka.b.b().c(zza(), this.f10708c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f10709d = null;
    }

    public final void V() {
        i();
        q();
        lb e02 = e0(false);
        l().C();
        I(new a9(this, e02));
    }

    public final void W() {
        i();
        q();
        I(new j9(this, e0(true)));
    }

    public final boolean X() {
        i();
        q();
        return this.f10709d != null;
    }

    public final boolean Y() {
        i();
        q();
        return !c0() || f().B0() >= 200900;
    }

    public final boolean Z() {
        i();
        q();
        return !c0() || f().B0() >= e0.f10124r0.a(null).intValue();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ x j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ i4 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ l4 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ b7 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ o8 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ v8 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ da p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.y2
    protected final boolean v() {
        return false;
    }

    public final void x(Bundle bundle) {
        i();
        q();
        I(new i9(this, e0(false), bundle));
    }

    public final void y(zzcv zzcvVar) {
        i();
        q();
        I(new c9(this, e0(false), zzcvVar));
    }

    public final void z(zzcv zzcvVar, d0 d0Var, String str) {
        i();
        q();
        if (f().p(ca.k.f6983a) == 0) {
            I(new k9(this, d0Var, str, zzcvVar));
        } else {
            zzj().G().a("Not bundling data. Service unavailable or out of date");
            f().P(zzcvVar, new byte[0]);
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ la.f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
