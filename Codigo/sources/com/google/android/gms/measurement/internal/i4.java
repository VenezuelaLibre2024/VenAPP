package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzqe;
import com.google.android.gms.measurement.internal.y6;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class i4 extends y2 {

    /* renamed from: c */
    private String f10249c;

    /* renamed from: d */
    private String f10250d;

    /* renamed from: e */
    private int f10251e;

    /* renamed from: f */
    private String f10252f;

    /* renamed from: g */
    private String f10253g;

    /* renamed from: h */
    private long f10254h;

    /* renamed from: i */
    private long f10255i;

    /* renamed from: j */
    private List<String> f10256j;

    /* renamed from: k */
    private String f10257k;

    /* renamed from: l */
    private int f10258l;

    /* renamed from: m */
    private String f10259m;

    /* renamed from: n */
    private String f10260n;

    /* renamed from: o */
    private String f10261o;

    /* renamed from: p */
    private long f10262p;

    /* renamed from: q */
    private String f10263q;

    public i4(w5 w5Var, long j10) {
        super(w5Var);
        this.f10262p = 0L;
        this.f10263q = null;
        this.f10255i = j10;
    }

    private final String E() {
        p4 I;
        String str;
        if (zzqe.zza() && a().n(e0.f10116n0)) {
            I = zzj().F();
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
                        I = zzj().H();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    I = zzj().I();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        }
        I.a(str);
        return null;
    }

    public final String A() {
        q();
        com.google.android.gms.common.internal.s.j(this.f10249c);
        return this.f10249c;
    }

    public final String B() {
        i();
        q();
        com.google.android.gms.common.internal.s.j(this.f10259m);
        return this.f10259m;
    }

    public final List<String> C() {
        return this.f10256j;
    }

    public final void D() {
        String format;
        i();
        if (e().E().l(y6.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            f().P0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzj().A().a("Analytics Storage consent is not granted");
            format = null;
        }
        p4 A = zzj().A();
        Object[] objArr = new Object[1];
        objArr[0] = format == null ? "null" : "not null";
        A.a(String.format("Resetting session stitching token to %s", objArr));
        this.f10261o = format;
        this.f10262p = zzb().a();
    }

    public final boolean F(String str) {
        String str2 = this.f10263q;
        boolean z10 = (str2 == null || str2.equals(str)) ? false : true;
        this.f10263q = str;
        return z10;
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

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:3)(6:69|70|(1:72)(2:87|(1:89))|73|74|(22:76|(1:78)(1:85)|80|81|5|(1:68)(1:9)|10|11|13|(1:15)(1:58)|16|(1:18)|19|20|(1:22)(1:55)|23|(1:25)|(3:27|(1:29)(1:32)|30)|33|(3:35|(1:37)(3:39|(3:42|(1:44)(1:45)|40)|46)|38)|(1:48)|(2:50|51)(2:53|54)))|4|5|(1:7)|68|10|11|13|(0)(0)|16|(0)|19|20|(0)(0)|23|(0)|(0)|33|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018b, code lost:
    
        zzj().B().c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.n4.q(r0), r2);
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
    @Override // com.google.android.gms.measurement.internal.y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void t() {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i4.t():void");
    }

    @Override // com.google.android.gms.measurement.internal.y2
    protected final boolean v() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.lb w(java.lang.String r47) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i4.w(java.lang.String):com.google.android.gms.measurement.internal.lb");
    }

    public final int x() {
        q();
        return this.f10258l;
    }

    public final int y() {
        q();
        return this.f10251e;
    }

    public final String z() {
        q();
        return this.f10260n;
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
