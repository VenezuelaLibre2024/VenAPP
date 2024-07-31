package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzqe;
import com.google.android.gms.measurement.internal.C5737y6;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import la.InterfaceC9461f;

/* renamed from: com.google.android.gms.measurement.internal.i4 */
/* loaded from: classes2.dex */
public final class C5530i4 extends AbstractC5733y2 {

    /* renamed from: c */
    private String f11421c;

    /* renamed from: d */
    private String f11422d;

    /* renamed from: e */
    private int f11423e;

    /* renamed from: f */
    private String f11424f;

    /* renamed from: g */
    private String f11425g;

    /* renamed from: h */
    private long f11426h;

    /* renamed from: i */
    private long f11427i;

    /* renamed from: j */
    private List<String> f11428j;

    /* renamed from: k */
    private String f11429k;

    /* renamed from: l */
    private int f11430l;

    /* renamed from: m */
    private String f11431m;

    /* renamed from: n */
    private String f11432n;

    /* renamed from: o */
    private String f11433o;

    /* renamed from: p */
    private long f11434p;

    /* renamed from: q */
    private String f11435q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5530i4(C5712w5 c5712w5, long j10) {
        super(c5712w5);
        this.f11434p = 0L;
        this.f11435q = null;
        this.f11427i = j10;
    }

    /* renamed from: E */
    private final String m13922E() {
        C5621p4 m14189I;
        String str;
        if (zzqe.zza() && mo13672a().m13900n(C5474e0.f11288n0)) {
            m14189I = zzj().m14186F();
            str = "Disabled IID for tests.";
        } else {
            try {
                Class<?> loadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zza());
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        m14189I = zzj().m14188H();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    m14189I = zzj().m14189I();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        }
        m14189I.m14218a(str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final String m13923A() {
        m14545q();
        C5276s.m13324j(this.f11421c);
        return this.f11421c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final String m13924B() {
        mo13687i();
        m14545q();
        C5276s.m13324j(this.f11431m);
        return this.f11431m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final List<String> m13925C() {
        return this.f11428j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final void m13926D() {
        String format;
        mo13687i();
        if (mo13679e().m14553E().m14585l(C5737y6.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            mo13681f().m14026P0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzj().m14181A().m14218a("Analytics Storage consent is not granted");
            format = null;
        }
        C5621p4 m14181A = zzj().m14181A();
        Object[] objArr = new Object[1];
        objArr[0] = format == null ? "null" : "not null";
        m14181A.m14218a(String.format("Resetting session stitching token to %s", objArr));
        this.f11433o = format;
        this.f11434p = zzb().mo28130a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean m13927F(String str) {
        String str2 = this.f11435q;
        boolean z10 = (str2 == null || str2.equals(str)) ? false : true;
        this.f11435q = str;
        return z10;
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

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:3)(6:69|70|(1:72)(2:87|(1:89))|73|74|(22:76|(1:78)(1:85)|80|81|5|(1:68)(1:9)|10|11|13|(1:15)(1:58)|16|(1:18)|19|20|(1:22)(1:55)|23|(1:25)|(3:27|(1:29)(1:32)|30)|33|(3:35|(1:37)(3:39|(3:42|(1:44)(1:45)|40)|46)|38)|(1:48)|(2:50|51)(2:53|54)))|4|5|(1:7)|68|10|11|13|(0)(0)|16|(0)|19|20|(0)(0)|23|(0)|(0)|33|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018b, code lost:
    
        zzj().m14182B().m14220c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.C5595n4.m14174q(r0), r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0154 A[Catch: IllegalStateException -> 0x018a, TryCatch #3 {IllegalStateException -> 0x018a, blocks: (B:20:0x012f, B:23:0x014c, B:25:0x0154, B:27:0x016d, B:29:0x0181, B:30:0x0186, B:32:0x0184), top: B:19:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016d A[Catch: IllegalStateException -> 0x018a, TryCatch #3 {IllegalStateException -> 0x018a, blocks: (B:20:0x012f, B:23:0x014c, B:25:0x0154, B:27:0x016d, B:29:0x0181, B:30:0x0186, B:32:0x0184), top: B:19:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a9  */
    @Override // com.google.android.gms.measurement.internal.AbstractC5733y2
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void mo13928t() {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5530i4.mo13928t():void");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5733y2
    /* renamed from: v */
    protected final boolean mo13704v() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C5576lb m13929w(java.lang.String r47) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5530i4.m13929w(java.lang.String):com.google.android.gms.measurement.internal.lb");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final int m13930x() {
        m14545q();
        return this.f11430l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final int m13931y() {
        m14545q();
        return this.f11423e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final String m13932z() {
        m14545q();
        return this.f11432n;
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
