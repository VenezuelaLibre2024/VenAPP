package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zznp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class a6 extends wa.h {

    /* renamed from: a */
    private final va f9953a;

    /* renamed from: b */
    private Boolean f9954b;

    /* renamed from: c */
    private String f9955c;

    public a6(va vaVar) {
        this(vaVar, null);
    }

    private a6(va vaVar, String str) {
        com.google.android.gms.common.internal.s.j(vaVar);
        this.f9953a = vaVar;
        this.f9955c = null;
    }

    private final void g2(Runnable runnable) {
        com.google.android.gms.common.internal.s.j(runnable);
        if (this.f9953a.zzl().E()) {
            runnable.run();
        } else {
            this.f9953a.zzl().y(runnable);
        }
    }

    private final void i2(String str, boolean z10) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            this.f9953a.zzj().B().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f9954b == null) {
                    if (!"com.google.android.gms".equals(this.f9955c) && !la.u.a(this.f9953a.zza(), Binder.getCallingUid()) && !ca.l.a(this.f9953a.zza()).c(Binder.getCallingUid())) {
                        z11 = false;
                        this.f9954b = Boolean.valueOf(z11);
                    }
                    z11 = true;
                    this.f9954b = Boolean.valueOf(z11);
                }
                if (this.f9954b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f9953a.zzj().B().b("Measurement Service called with invalid calling package. appId", n4.q(str));
                throw e10;
            }
        }
        if (this.f9955c == null && ca.k.k(this.f9953a.zza(), Binder.getCallingUid(), str)) {
            this.f9955c = str;
        }
        if (str.equals(this.f9955c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void k2(lb lbVar, boolean z10) {
        com.google.android.gms.common.internal.s.j(lbVar);
        com.google.android.gms.common.internal.s.f(lbVar.f10366a);
        i2(lbVar.f10366a, false);
        this.f9953a.i0().e0(lbVar.f10367b, lbVar.B);
    }

    private final void m2(d0 d0Var, lb lbVar) {
        this.f9953a.j0();
        this.f9953a.o(d0Var, lbVar);
    }

    @Override // wa.i
    public final void A0(lb lbVar) {
        com.google.android.gms.common.internal.s.f(lbVar.f10366a);
        com.google.android.gms.common.internal.s.j(lbVar.G);
        m6 m6Var = new m6(this, lbVar);
        com.google.android.gms.common.internal.s.j(m6Var);
        if (this.f9953a.zzl().E()) {
            m6Var.run();
        } else {
            this.f9953a.zzl().B(m6Var);
        }
    }

    @Override // wa.i
    public final void C0(Bundle bundle, lb lbVar) {
        k2(lbVar, false);
        String str = lbVar.f10366a;
        com.google.android.gms.common.internal.s.j(str);
        g2(new Runnable() { // from class: com.google.android.gms.measurement.internal.z5

            /* renamed from: b */
            private /* synthetic */ String f10882b;

            /* renamed from: c */
            private /* synthetic */ Bundle f10883c;

            public /* synthetic */ z5(String str2, Bundle bundle2) {
                r2 = str2;
                r3 = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a6.this.h2(r2, r3);
            }
        });
    }

    @Override // wa.i
    public final void D0(lb lbVar) {
        k2(lbVar, false);
        g2(new c6(this, lbVar));
    }

    @Override // wa.i
    public final List<hb> I1(String str, String str2, boolean z10, lb lbVar) {
        k2(lbVar, false);
        String str3 = lbVar.f10366a;
        com.google.android.gms.common.internal.s.j(str3);
        try {
            List<jb> list = (List) this.f9953a.zzl().r(new f6(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (jb jbVar : list) {
                if (z10 || !ib.C0(jbVar.f10320c)) {
                    arrayList.add(new hb(jbVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f9953a.zzj().B().c("Failed to query user properties. appId", n4.q(lbVar.f10366a), e10);
            return Collections.emptyList();
        }
    }

    @Override // wa.i
    public final void J(long j10, String str, String str2, String str3) {
        g2(new e6(this, str2, str3, str, j10));
    }

    @Override // wa.i
    public final List<d> K(String str, String str2, String str3) {
        i2(str, true);
        try {
            return (List) this.f9953a.zzl().r(new k6(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f9953a.zzj().B().b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // wa.i
    public final String N0(lb lbVar) {
        k2(lbVar, false);
        return this.f9953a.M(lbVar);
    }

    @Override // wa.i
    public final void P1(d0 d0Var, String str, String str2) {
        com.google.android.gms.common.internal.s.j(d0Var);
        com.google.android.gms.common.internal.s.f(str);
        i2(str, true);
        g2(new n6(this, d0Var, str));
    }

    @Override // wa.i
    public final void T(d dVar) {
        com.google.android.gms.common.internal.s.j(dVar);
        com.google.android.gms.common.internal.s.j(dVar.f10045c);
        com.google.android.gms.common.internal.s.f(dVar.f10043a);
        i2(dVar.f10043a, true);
        g2(new g6(this, new d(dVar)));
    }

    @Override // wa.i
    public final void V0(d0 d0Var, lb lbVar) {
        com.google.android.gms.common.internal.s.j(d0Var);
        k2(lbVar, false);
        g2(new o6(this, d0Var, lbVar));
    }

    @Override // wa.i
    public final wa.c X(lb lbVar) {
        k2(lbVar, false);
        com.google.android.gms.common.internal.s.f(lbVar.f10366a);
        if (!zznp.zza()) {
            return new wa.c(null);
        }
        try {
            return (wa.c) this.f9953a.zzl().w(new l6(this, lbVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f9953a.zzj().B().c("Failed to get consent. appId", n4.q(lbVar.f10366a), e10);
            return new wa.c(null);
        }
    }

    @Override // wa.i
    public final byte[] a1(d0 d0Var, String str) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(d0Var);
        i2(str, true);
        this.f9953a.zzj().A().b("Log and bundle. event", this.f9953a.a0().c(d0Var.f10054a));
        long c10 = this.f9953a.zzb().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f9953a.zzl().w(new q6(this, d0Var, str)).get();
            if (bArr == null) {
                this.f9953a.zzj().B().b("Log and bundle returned null. appId", n4.q(str));
                bArr = new byte[0];
            }
            this.f9953a.zzj().A().d("Log and bundle processed. event, size, time_ms", this.f9953a.a0().c(d0Var.f10054a), Integer.valueOf(bArr.length), Long.valueOf((this.f9953a.zzb().c() / 1000000) - c10));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f9953a.zzj().B().d("Failed to log and bundle. appId, event, error", n4.q(str), this.f9953a.a0().c(d0Var.f10054a), e10);
            return null;
        }
    }

    @Override // wa.i
    public final void b2(d dVar, lb lbVar) {
        com.google.android.gms.common.internal.s.j(dVar);
        com.google.android.gms.common.internal.s.j(dVar.f10045c);
        k2(lbVar, false);
        d dVar2 = new d(dVar);
        dVar2.f10043a = lbVar.f10366a;
        g2(new d6(this, dVar2, lbVar));
    }

    @Override // wa.i
    public final void c2(hb hbVar, lb lbVar) {
        com.google.android.gms.common.internal.s.j(hbVar);
        k2(lbVar, false);
        g2(new p6(this, hbVar, lbVar));
    }

    @Override // wa.i
    public final List<d> d(String str, String str2, lb lbVar) {
        k2(lbVar, false);
        String str3 = lbVar.f10366a;
        com.google.android.gms.common.internal.s.j(str3);
        try {
            return (List) this.f9953a.zzl().r(new h6(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f9953a.zzj().B().b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // wa.i
    public final void d1(lb lbVar) {
        k2(lbVar, false);
        g2(new b6(this, lbVar));
    }

    public final /* synthetic */ void h2(String str, Bundle bundle) {
        this.f9953a.Z().c0(str, bundle);
    }

    @Override // wa.i
    public final List<na> j0(lb lbVar, Bundle bundle) {
        k2(lbVar, false);
        com.google.android.gms.common.internal.s.j(lbVar.f10366a);
        try {
            return (List) this.f9953a.zzl().r(new t6(this, lbVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f9953a.zzj().B().c("Failed to get trigger URIs. appId", n4.q(lbVar.f10366a), e10);
            return Collections.emptyList();
        }
    }

    public final d0 j2(d0 d0Var, lb lbVar) {
        z zVar;
        boolean z10 = false;
        if ("_cmp".equals(d0Var.f10054a) && (zVar = d0Var.f10055b) != null && zVar.zza() != 0) {
            String z12 = d0Var.f10055b.z1("_cis");
            if ("referrer broadcast".equals(z12) || "referrer API".equals(z12)) {
                z10 = true;
            }
        }
        if (!z10) {
            return d0Var;
        }
        this.f9953a.zzj().E().b("Event has been filtered ", d0Var.toString());
        return new d0("_cmpx", d0Var.f10055b, d0Var.f10056c, d0Var.f10057d);
    }

    @Override // wa.i
    public final List<hb> l0(lb lbVar, boolean z10) {
        k2(lbVar, false);
        String str = lbVar.f10366a;
        com.google.android.gms.common.internal.s.j(str);
        try {
            List<jb> list = (List) this.f9953a.zzl().r(new s6(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (jb jbVar : list) {
                if (z10 || !ib.C0(jbVar.f10320c)) {
                    arrayList.add(new hb(jbVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f9953a.zzj().B().c("Failed to get user properties. appId", n4.q(lbVar.f10366a), e10);
            return null;
        }
    }

    public final void l2(d0 d0Var, lb lbVar) {
        boolean z10;
        if (!this.f9953a.c0().R(lbVar.f10366a)) {
            m2(d0Var, lbVar);
            return;
        }
        this.f9953a.zzj().F().b("EES config found for", lbVar.f10366a);
        i5 c02 = this.f9953a.c0();
        String str = lbVar.f10366a;
        zzb zzbVar = TextUtils.isEmpty(str) ? null : c02.f10270j.get(str);
        if (zzbVar == null) {
            this.f9953a.zzj().F().b("EES not loaded for", lbVar.f10366a);
        } else {
            try {
                Map<String, Object> J = this.f9953a.h0().J(d0Var.f10055b.w1(), true);
                String a10 = wa.r.a(d0Var.f10054a);
                if (a10 == null) {
                    a10 = d0Var.f10054a;
                }
                z10 = zzbVar.zza(new zzad(a10, d0Var.f10057d, J));
            } catch (zzc unused) {
                this.f9953a.zzj().B().c("EES error. appId, eventName", lbVar.f10367b, d0Var.f10054a);
                z10 = false;
            }
            if (z10) {
                if (zzbVar.zzd()) {
                    this.f9953a.zzj().F().b("EES edited event", d0Var.f10054a);
                    d0Var = this.f9953a.h0().B(zzbVar.zza().zzb());
                }
                m2(d0Var, lbVar);
                if (zzbVar.zzc()) {
                    for (zzad zzadVar : zzbVar.zza().zzc()) {
                        this.f9953a.zzj().F().b("EES logging created event", zzadVar.zzb());
                        m2(this.f9953a.h0().B(zzadVar), lbVar);
                    }
                    return;
                }
                return;
            }
            this.f9953a.zzj().F().b("EES was not applied to event", d0Var.f10054a);
        }
        m2(d0Var, lbVar);
    }

    @Override // wa.i
    public final List<hb> p(String str, String str2, String str3, boolean z10) {
        i2(str, true);
        try {
            List<jb> list = (List) this.f9953a.zzl().r(new i6(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (jb jbVar : list) {
                if (z10 || !ib.C0(jbVar.f10320c)) {
                    arrayList.add(new hb(jbVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f9953a.zzj().B().c("Failed to get user properties as. appId", n4.q(str), e10);
            return Collections.emptyList();
        }
    }

    @Override // wa.i
    public final void t0(lb lbVar) {
        com.google.android.gms.common.internal.s.f(lbVar.f10366a);
        i2(lbVar.f10366a, false);
        g2(new j6(this, lbVar));
    }
}
