package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import ca.C1912k;
import ca.C1914l;
import com.google.android.gms.common.internal.C5276s;
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
import la.C9476u;
import p418wa.AbstractBinderC12107h;
import p418wa.C12097c;
import p418wa.C12120r;

/* renamed from: com.google.android.gms.measurement.internal.a6 */
/* loaded from: classes2.dex */
public final class BinderC5428a6 extends AbstractBinderC12107h {

    /* renamed from: a */
    private final C5705va f11073a;

    /* renamed from: b */
    private Boolean f11074b;

    /* renamed from: c */
    private String f11075c;

    public BinderC5428a6(C5705va c5705va) {
        this(c5705va, null);
    }

    private BinderC5428a6(C5705va c5705va, String str) {
        C5276s.m13324j(c5705va);
        this.f11073a = c5705va;
        this.f11075c = null;
    }

    /* renamed from: g2 */
    private final void m13596g2(Runnable runnable) {
        C5276s.m13324j(runnable);
        if (this.f11073a.zzl().m14243E()) {
            runnable.run();
        } else {
            this.f11073a.zzl().m14248y(runnable);
        }
    }

    /* renamed from: i2 */
    private final void m13597i2(String str, boolean z10) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            this.f11073a.zzj().m14182B().m14218a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f11074b == null) {
                    if (!"com.google.android.gms".equals(this.f11075c) && !C9476u.m28181a(this.f11073a.zza(), Binder.getCallingUid()) && !C1914l.m10108a(this.f11073a.zza()).m10113c(Binder.getCallingUid())) {
                        z11 = false;
                        this.f11074b = Boolean.valueOf(z11);
                    }
                    z11 = true;
                    this.f11074b = Boolean.valueOf(z11);
                }
                if (this.f11074b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f11073a.zzj().m14182B().m14219b("Measurement Service called with invalid calling package. appId", C5595n4.m14174q(str));
                throw e10;
            }
        }
        if (this.f11075c == null && C1912k.m10105k(this.f11073a.zza(), Binder.getCallingUid(), str)) {
            this.f11075c = str;
        }
        if (str.equals(this.f11075c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    /* renamed from: k2 */
    private final void m13598k2(C5576lb c5576lb, boolean z10) {
        C5276s.m13324j(c5576lb);
        C5276s.m13320f(c5576lb.f11553a);
        m13597i2(c5576lb.f11553a, false);
        this.f11073a.m14463i0().m14034e0(c5576lb.f11554b, c5576lb.f11539B);
    }

    /* renamed from: m2 */
    private final void m13599m2(C5461d0 c5461d0, C5576lb c5576lb) {
        this.f11073a.m14464j0();
        this.f11073a.m14471o(c5461d0, c5576lb);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: A0 */
    public final void mo13600A0(C5576lb c5576lb) {
        C5276s.m13320f(c5576lb.f11553a);
        C5276s.m13324j(c5576lb.f11544G);
        RunnableC5584m6 runnableC5584m6 = new RunnableC5584m6(this, c5576lb);
        C5276s.m13324j(runnableC5584m6);
        if (this.f11073a.zzl().m14243E()) {
            runnableC5584m6.run();
        } else {
            this.f11073a.zzl().m14242B(runnableC5584m6);
        }
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: C0 */
    public final void mo13601C0(final Bundle bundle, C5576lb c5576lb) {
        m13598k2(c5576lb, false);
        final String str = c5576lb.f11553a;
        C5276s.m13324j(str);
        m13596g2(new Runnable() { // from class: com.google.android.gms.measurement.internal.z5
            @Override // java.lang.Runnable
            public final void run() {
                BinderC5428a6.this.m13616h2(str, bundle);
            }
        });
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: D0 */
    public final void mo13602D0(C5576lb c5576lb) {
        m13598k2(c5576lb, false);
        m13596g2(new RunnableC5454c6(this, c5576lb));
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: I1 */
    public final List<C5524hb> mo13603I1(String str, String str2, boolean z10, C5576lb c5576lb) {
        m13598k2(c5576lb, false);
        String str3 = c5576lb.f11553a;
        C5276s.m13324j(str3);
        try {
            List<C5550jb> list = (List) this.f11073a.zzl().m14245r(new CallableC5493f6(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5550jb c5550jb : list) {
                if (z10 || !C5537ib.m13972C0(c5550jb.f11492c)) {
                    arrayList.add(new C5524hb(c5550jb));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f11073a.zzj().m14182B().m14220c("Failed to query user properties. appId", C5595n4.m14174q(c5576lb.f11553a), e10);
            return Collections.emptyList();
        }
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: J */
    public final void mo13604J(long j10, String str, String str2, String str3) {
        m13596g2(new RunnableC5480e6(this, str2, str3, str, j10));
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: K */
    public final List<C5460d> mo13605K(String str, String str2, String str3) {
        m13597i2(str, true);
        try {
            return (List) this.f11073a.zzl().m14245r(new CallableC5558k6(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f11073a.zzj().m14182B().m14219b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: N0 */
    public final String mo13606N0(C5576lb c5576lb) {
        m13598k2(c5576lb, false);
        return this.f11073a.m14445M(c5576lb);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: P1 */
    public final void mo13607P1(C5461d0 c5461d0, String str, String str2) {
        C5276s.m13324j(c5461d0);
        C5276s.m13320f(str);
        m13597i2(str, true);
        m13596g2(new RunnableC5597n6(this, c5461d0, str));
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: T */
    public final void mo13608T(C5460d c5460d) {
        C5276s.m13324j(c5460d);
        C5276s.m13324j(c5460d.f11165c);
        C5276s.m13320f(c5460d.f11163a);
        m13597i2(c5460d.f11163a, true);
        m13596g2(new RunnableC5506g6(this, new C5460d(c5460d)));
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: V0 */
    public final void mo13609V0(C5461d0 c5461d0, C5576lb c5576lb) {
        C5276s.m13324j(c5461d0);
        m13598k2(c5576lb, false);
        m13596g2(new RunnableC5610o6(this, c5461d0, c5576lb));
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: X */
    public final C12097c mo13610X(C5576lb c5576lb) {
        m13598k2(c5576lb, false);
        C5276s.m13320f(c5576lb.f11553a);
        if (!zznp.zza()) {
            return new C12097c(null);
        }
        try {
            return (C12097c) this.f11073a.zzl().m14247w(new CallableC5571l6(this, c5576lb)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f11073a.zzj().m14182B().m14220c("Failed to get consent. appId", C5595n4.m14174q(c5576lb.f11553a), e10);
            return new C12097c(null);
        }
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: a1 */
    public final byte[] mo13611a1(C5461d0 c5461d0, String str) {
        C5276s.m13320f(str);
        C5276s.m13324j(c5461d0);
        m13597i2(str, true);
        this.f11073a.zzj().m14181A().m14219b("Log and bundle. event", this.f11073a.m14453a0().m14167c(c5461d0.f11174a));
        long mo28132c = this.f11073a.zzb().mo28132c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f11073a.zzl().m14247w(new CallableC5636q6(this, c5461d0, str)).get();
            if (bArr == null) {
                this.f11073a.zzj().m14182B().m14219b("Log and bundle returned null. appId", C5595n4.m14174q(str));
                bArr = new byte[0];
            }
            this.f11073a.zzj().m14181A().m14221d("Log and bundle processed. event, size, time_ms", this.f11073a.m14453a0().m14167c(c5461d0.f11174a), Integer.valueOf(bArr.length), Long.valueOf((this.f11073a.zzb().mo28132c() / 1000000) - mo28132c));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f11073a.zzj().m14182B().m14221d("Failed to log and bundle. appId, event, error", C5595n4.m14174q(str), this.f11073a.m14453a0().m14167c(c5461d0.f11174a), e10);
            return null;
        }
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: b2 */
    public final void mo13612b2(C5460d c5460d, C5576lb c5576lb) {
        C5276s.m13324j(c5460d);
        C5276s.m13324j(c5460d.f11165c);
        m13598k2(c5576lb, false);
        C5460d c5460d2 = new C5460d(c5460d);
        c5460d2.f11163a = c5576lb.f11553a;
        m13596g2(new RunnableC5467d6(this, c5460d2, c5576lb));
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: c2 */
    public final void mo13613c2(C5524hb c5524hb, C5576lb c5576lb) {
        C5276s.m13324j(c5524hb);
        m13598k2(c5576lb, false);
        m13596g2(new RunnableC5623p6(this, c5524hb, c5576lb));
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: d */
    public final List<C5460d> mo13614d(String str, String str2, C5576lb c5576lb) {
        m13598k2(c5576lb, false);
        String str3 = c5576lb.f11553a;
        C5276s.m13324j(str3);
        try {
            return (List) this.f11073a.zzl().m14245r(new CallableC5519h6(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f11073a.zzj().m14182B().m14219b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: d1 */
    public final void mo13615d1(C5576lb c5576lb) {
        m13598k2(c5576lb, false);
        m13596g2(new RunnableC5441b6(this, c5576lb));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h2 */
    public final /* synthetic */ void m13616h2(String str, Bundle bundle) {
        this.f11073a.m14452Z().m14145c0(str, bundle);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: j0 */
    public final List<C5601na> mo13617j0(C5576lb c5576lb, Bundle bundle) {
        m13598k2(c5576lb, false);
        C5276s.m13324j(c5576lb.f11553a);
        try {
            return (List) this.f11073a.zzl().m14245r(new CallableC5675t6(this, c5576lb, bundle)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f11073a.zzj().m14182B().m14220c("Failed to get trigger URIs. appId", C5595n4.m14174q(c5576lb.f11553a), e10);
            return Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j2 */
    public final C5461d0 m13618j2(C5461d0 c5461d0, C5576lb c5576lb) {
        C5742z c5742z;
        boolean z10 = false;
        if ("_cmp".equals(c5461d0.f11174a) && (c5742z = c5461d0.f11175b) != null && c5742z.zza() != 0) {
            String m14606z1 = c5461d0.f11175b.m14606z1("_cis");
            if ("referrer broadcast".equals(m14606z1) || "referrer API".equals(m14606z1)) {
                z10 = true;
            }
        }
        if (!z10) {
            return c5461d0;
        }
        this.f11073a.zzj().m14185E().m14219b("Event has been filtered ", c5461d0.toString());
        return new C5461d0("_cmpx", c5461d0.f11175b, c5461d0.f11176c, c5461d0.f11177d);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: l0 */
    public final List<C5524hb> mo13619l0(C5576lb c5576lb, boolean z10) {
        m13598k2(c5576lb, false);
        String str = c5576lb.f11553a;
        C5276s.m13324j(str);
        try {
            List<C5550jb> list = (List) this.f11073a.zzl().m14245r(new CallableC5662s6(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5550jb c5550jb : list) {
                if (z10 || !C5537ib.m13972C0(c5550jb.f11492c)) {
                    arrayList.add(new C5524hb(c5550jb));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f11073a.zzj().m14182B().m14220c("Failed to get user properties. appId", C5595n4.m14174q(c5576lb.f11553a), e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l2 */
    public final void m13620l2(C5461d0 c5461d0, C5576lb c5576lb) {
        boolean z10;
        if (!this.f11073a.m14456c0().m13956R(c5576lb.f11553a)) {
            m13599m2(c5461d0, c5576lb);
            return;
        }
        this.f11073a.zzj().m14186F().m14219b("EES config found for", c5576lb.f11553a);
        C5531i5 m14456c0 = this.f11073a.m14456c0();
        String str = c5576lb.f11553a;
        zzb zzbVar = TextUtils.isEmpty(str) ? null : m14456c0.f11442j.get(str);
        if (zzbVar == null) {
            this.f11073a.zzj().m14186F().m14219b("EES not loaded for", c5576lb.f11553a);
        } else {
            try {
                Map<String, Object> m13755J = this.f11073a.m14462h0().m13755J(c5461d0.f11175b.m14603w1(), true);
                String m38856a = C12120r.m38856a(c5461d0.f11174a);
                if (m38856a == null) {
                    m38856a = c5461d0.f11174a;
                }
                z10 = zzbVar.zza(new zzad(m38856a, c5461d0.f11177d, m13755J));
            } catch (zzc unused) {
                this.f11073a.zzj().m14182B().m14220c("EES error. appId, eventName", c5576lb.f11554b, c5461d0.f11174a);
                z10 = false;
            }
            if (z10) {
                if (zzbVar.zzd()) {
                    this.f11073a.zzj().m14186F().m14219b("EES edited event", c5461d0.f11174a);
                    c5461d0 = this.f11073a.m14462h0().m13749B(zzbVar.zza().zzb());
                }
                m13599m2(c5461d0, c5576lb);
                if (zzbVar.zzc()) {
                    for (zzad zzadVar : zzbVar.zza().zzc()) {
                        this.f11073a.zzj().m14186F().m14219b("EES logging created event", zzadVar.zzb());
                        m13599m2(this.f11073a.m14462h0().m13749B(zzadVar), c5576lb);
                    }
                    return;
                }
                return;
            }
            this.f11073a.zzj().m14186F().m14219b("EES was not applied to event", c5461d0.f11174a);
        }
        m13599m2(c5461d0, c5576lb);
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: p */
    public final List<C5524hb> mo13621p(String str, String str2, String str3, boolean z10) {
        m13597i2(str, true);
        try {
            List<C5550jb> list = (List) this.f11073a.zzl().m14245r(new CallableC5532i6(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5550jb c5550jb : list) {
                if (z10 || !C5537ib.m13972C0(c5550jb.f11492c)) {
                    arrayList.add(new C5524hb(c5550jb));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f11073a.zzj().m14182B().m14220c("Failed to get user properties as. appId", C5595n4.m14174q(str), e10);
            return Collections.emptyList();
        }
    }

    @Override // p418wa.InterfaceC12109i
    /* renamed from: t0 */
    public final void mo13622t0(C5576lb c5576lb) {
        C5276s.m13320f(c5576lb.f11553a);
        m13597i2(c5576lb.f11553a, false);
        m13596g2(new RunnableC5545j6(this, c5576lb));
    }
}
