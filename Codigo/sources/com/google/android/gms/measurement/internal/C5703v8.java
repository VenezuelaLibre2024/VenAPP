package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import ca.C1912k;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzcv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import la.InterfaceC9461f;
import p081ea.AbstractC7138a;
import p200ka.C9214b;
import p418wa.C12097c;
import p418wa.InterfaceC12109i;

/* renamed from: com.google.android.gms.measurement.internal.v8 */
/* loaded from: classes2.dex */
public final class C5703v8 extends AbstractC5733y2 {

    /* renamed from: c */
    private final ServiceConnectionC5665s9 f11906c;

    /* renamed from: d */
    private InterfaceC12109i f11907d;

    /* renamed from: e */
    private volatile Boolean f11908e;

    /* renamed from: f */
    private final AbstractC5681u f11909f;

    /* renamed from: g */
    private final C5614oa f11910g;

    /* renamed from: h */
    private final List<Runnable> f11911h;

    /* renamed from: i */
    private final AbstractC5681u f11912i;

    /* JADX INFO: Access modifiers changed from: protected */
    public C5703v8(C5712w5 c5712w5) {
        super(c5712w5);
        this.f11911h = new ArrayList();
        this.f11910g = new C5614oa(c5712w5.zzb());
        this.f11906c = new ServiceConnectionC5665s9(this);
        this.f11909f = new C5739y8(this, c5712w5);
        this.f11912i = new C5522h9(this, c5712w5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m14375F(C5703v8 c5703v8, ComponentName componentName) {
        c5703v8.mo13687i();
        if (c5703v8.f11907d != null) {
            c5703v8.f11907d = null;
            c5703v8.zzj().m14186F().m14219b("Disconnected from device MeasurementService", componentName);
            c5703v8.mo13687i();
            c5703v8.m14403T();
        }
    }

    /* renamed from: I */
    private final void m14377I(Runnable runnable) {
        mo13687i();
        if (m14407X()) {
            runnable.run();
        } else {
            if (this.f11911h.size() >= 1000) {
                zzj().m14182B().m14218a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f11911h.add(runnable);
            this.f11912i.m14351b(60000L);
            m14403T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public final void m14378a0() {
        mo13687i();
        zzj().m14186F().m14219b("Processing queued up service tasks", Integer.valueOf(this.f11911h.size()));
        Iterator<Runnable> it = this.f11911h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e10) {
                zzj().m14182B().m14219b("Task exception while flushing queue", e10);
            }
        }
        this.f11911h.clear();
        this.f11912i.m14350a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public final void m14379b0() {
        mo13687i();
        this.f11910g.m14217c();
        this.f11909f.m14351b(C5474e0.f11229L.m13918a(null).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ef  */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m14380c0() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5703v8.m14380c0():boolean");
    }

    /* renamed from: e0 */
    private final C5576lb m14382e0(boolean z10) {
        return mo13691k().m13929w(z10 ? zzj().m14190J() : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public static /* synthetic */ void m14384g0(C5703v8 c5703v8) {
        c5703v8.mo13687i();
        if (c5703v8.m14407X()) {
            c5703v8.zzj().m14186F().m14218a("Inactivity, disconnecting from the service");
            c5703v8.m14404U();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final void m14387A(zzcv zzcvVar, String str, String str2) {
        mo13687i();
        m14545q();
        m14377I(new RunnableC5639q9(this, str, str2, m14382e0(false), zzcvVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final void m14388B(zzcv zzcvVar, String str, String str2, boolean z10) {
        mo13687i();
        m14545q();
        m14377I(new RunnableC5727x8(this, str, str2, m14382e0(false), z10, zzcvVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final void m14389C(C5460d c5460d) {
        C5276s.m13324j(c5460d);
        mo13687i();
        m14545q();
        m14377I(new RunnableC5613o9(this, true, m14382e0(true), mo13693l().m14081z(c5460d), new C5460d(c5460d), c5460d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public final void m14390D(C5461d0 c5461d0, String str) {
        C5276s.m13324j(c5461d0);
        mo13687i();
        m14545q();
        m14377I(new RunnableC5574l9(this, true, m14382e0(true), mo13693l().m14075A(c5461d0), c5461d0, str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final void m14391E(C5625p8 c5625p8) {
        mo13687i();
        m14545q();
        m14377I(new RunnableC5483e9(this, c5625p8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public final void m14392H(C5524hb c5524hb) {
        mo13687i();
        m14545q();
        m14377I(new RunnableC5444b9(this, m14382e0(true), mo13693l().m14076B(c5524hb), c5524hb));
    }

    /* renamed from: J */
    public final void m14393J(AtomicReference<String> atomicReference) {
        mo13687i();
        m14545q();
        m14377I(new RunnableC5470d9(this, atomicReference, m14382e0(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public final void m14394K(AtomicReference<List<C5601na>> atomicReference, Bundle bundle) {
        mo13687i();
        m14545q();
        m14377I(new RunnableC5751z8(this, atomicReference, m14382e0(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public final void m14395L(AtomicReference<List<C5460d>> atomicReference, String str, String str2, String str3) {
        mo13687i();
        m14545q();
        m14377I(new RunnableC5600n9(this, atomicReference, str, str2, str3, m14382e0(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public final void m14396M(AtomicReference<List<C5524hb>> atomicReference, String str, String str2, String str3, boolean z10) {
        mo13687i();
        m14545q();
        m14377I(new RunnableC5626p9(this, atomicReference, str, str2, str3, m14382e0(false), z10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final void m14397N(InterfaceC12109i interfaceC12109i) {
        mo13687i();
        C5276s.m13324j(interfaceC12109i);
        this.f11907d = interfaceC12109i;
        m14379b0();
        m14378a0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final void m14398O(InterfaceC12109i interfaceC12109i, AbstractC7138a abstractC7138a, C5576lb c5576lb) {
        int i10;
        C5621p4 m14182B;
        String str;
        mo13687i();
        m14545q();
        int i11 = 100;
        int i12 = 0;
        while (i12 < 1001 && i11 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractC7138a> m14080x = mo13693l().m14080x(100);
            if (m14080x != null) {
                arrayList.addAll(m14080x);
                i10 = m14080x.size();
            } else {
                i10 = 0;
            }
            if (abstractC7138a != null && i10 < 100) {
                arrayList.add(abstractC7138a);
            }
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                AbstractC7138a abstractC7138a2 = (AbstractC7138a) obj;
                if (abstractC7138a2 instanceof C5461d0) {
                    try {
                        interfaceC12109i.mo13609V0((C5461d0) abstractC7138a2, c5576lb);
                    } catch (RemoteException e10) {
                        e = e10;
                        m14182B = zzj().m14182B();
                        str = "Failed to send event to the service";
                        m14182B.m14219b(str, e);
                    }
                } else if (abstractC7138a2 instanceof C5524hb) {
                    try {
                        interfaceC12109i.mo13613c2((C5524hb) abstractC7138a2, c5576lb);
                    } catch (RemoteException e11) {
                        e = e11;
                        m14182B = zzj().m14182B();
                        str = "Failed to send user property to the service";
                        m14182B.m14219b(str, e);
                    }
                } else if (abstractC7138a2 instanceof C5460d) {
                    try {
                        interfaceC12109i.mo13612b2((C5460d) abstractC7138a2, c5576lb);
                    } catch (RemoteException e12) {
                        e = e12;
                        m14182B = zzj().m14182B();
                        str = "Failed to send conditional user property to the service";
                        m14182B.m14219b(str, e);
                    }
                } else {
                    zzj().m14182B().m14218a("Discarding data. Unrecognized parcel type.");
                }
            }
            i12++;
            i11 = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: P */
    public final void m14399P(boolean z10) {
        mo13687i();
        m14545q();
        if (z10) {
            mo13693l().m14077C();
        }
        if (m14409Z()) {
            m14377I(new RunnableC5587m9(this, m14382e0(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public final C12097c m14400Q() {
        mo13687i();
        m14545q();
        InterfaceC12109i interfaceC12109i = this.f11907d;
        if (interfaceC12109i == null) {
            m14403T();
            zzj().m14181A().m14218a("Failed to get consents; not connected to service yet.");
            return null;
        }
        C5576lb m14382e0 = m14382e0(false);
        C5276s.m13324j(m14382e0);
        try {
            C12097c mo13610X = interfaceC12109i.mo13610X(m14382e0);
            m14379b0();
            return mo13610X;
        } catch (RemoteException e10) {
            zzj().m14182B().m14219b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public final Boolean m14401R() {
        return this.f11908e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S */
    public final void m14402S() {
        mo13687i();
        m14545q();
        C5576lb m14382e0 = m14382e0(true);
        mo13693l().m14078D();
        m14377I(new RunnableC5509g9(this, m14382e0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public final void m14403T() {
        mo13687i();
        m14545q();
        if (m14407X()) {
            return;
        }
        if (m14380c0()) {
            this.f11906c.m14339a();
            return;
        }
        if (mo13672a().m13894N()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (!((queryIntentServices == null || queryIntentServices.isEmpty()) ? false : true)) {
            zzj().m14182B().m14218a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f11906c.m14340b(intent);
    }

    /* renamed from: U */
    public final void m14404U() {
        mo13687i();
        m14545q();
        this.f11906c.m14341d();
        try {
            C9214b.m27395b().m27401c(zza(), this.f11906c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f11907d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public final void m14405V() {
        mo13687i();
        m14545q();
        C5576lb m14382e0 = m14382e0(false);
        mo13693l().m14077C();
        m14377I(new RunnableC5431a9(this, m14382e0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W */
    public final void m14406W() {
        mo13687i();
        m14545q();
        m14377I(new RunnableC5548j9(this, m14382e0(true)));
    }

    /* renamed from: X */
    public final boolean m14407X() {
        mo13687i();
        m14545q();
        return this.f11907d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public final boolean m14408Y() {
        mo13687i();
        m14545q();
        return !m14380c0() || mo13681f().m14009B0() >= 200900;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public final boolean m14409Z() {
        mo13687i();
        m14545q();
        return !m14380c0() || mo13681f().m14009B0() >= C5474e0.f11296r0.m13918a(null).intValue();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5486f mo13672a() {
        return super.mo13672a();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5730y mo13675c() {
        return super.mo13675c();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5582m4 mo13677d() {
        return super.mo13677d();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C5735y4 mo13679e() {
        return super.mo13679e();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C5537ib mo13681f() {
        return super.mo13681f();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo13683g() {
        super.mo13683g();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13687i() {
        super.mo13687i();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5718x mo13689j() {
        return super.mo13689j();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5530i4 mo13691k() {
        return super.mo13691k();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5569l4 mo13693l() {
        return super.mo13693l();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5442b7 mo13695m() {
        return super.mo13695m();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C5612o8 mo13697n() {
        return super.mo13697n();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C5703v8 mo13698o() {
        return super.mo13698o();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C5471da mo13699p() {
        return super.mo13699p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5733y2
    /* renamed from: v */
    protected final boolean mo13704v() {
        return false;
    }

    /* renamed from: x */
    public final void m14410x(Bundle bundle) {
        mo13687i();
        m14545q();
        m14377I(new RunnableC5535i9(this, m14382e0(false), bundle));
    }

    /* renamed from: y */
    public final void m14411y(zzcv zzcvVar) {
        mo13687i();
        m14545q();
        m14377I(new RunnableC5457c9(this, m14382e0(false), zzcvVar));
    }

    /* renamed from: z */
    public final void m14412z(zzcv zzcvVar, C5461d0 c5461d0, String str) {
        mo13687i();
        m14545q();
        if (mo13681f().m14043p(C1912k.f7932a) == 0) {
            m14377I(new RunnableC5561k9(this, c5461d0, str, zzcvVar));
        } else {
            zzj().m14187G().m14218a("Not bundling data. Service unavailable or out of date");
            mo13681f().m14025P(zzcvVar, new byte[0]);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ InterfaceC9461f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5473e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5595n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5635q5 zzl() {
        return super.zzl();
    }
}
