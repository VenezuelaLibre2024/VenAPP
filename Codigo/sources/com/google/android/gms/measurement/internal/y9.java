package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import c9.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class y9 extends ua {

    /* renamed from: d */
    private final Map<String, x9> f10867d;

    /* renamed from: e */
    public final d5 f10868e;

    /* renamed from: f */
    public final d5 f10869f;

    /* renamed from: g */
    public final d5 f10870g;

    /* renamed from: h */
    public final d5 f10871h;

    /* renamed from: i */
    public final d5 f10872i;

    public y9(va vaVar) {
        super(vaVar);
        this.f10867d = new HashMap();
        y4 e10 = e();
        e10.getClass();
        this.f10868e = new d5(e10, "last_delete_stale", 0L);
        y4 e11 = e();
        e11.getClass();
        this.f10869f = new d5(e11, "backoff", 0L);
        y4 e12 = e();
        e12.getClass();
        this.f10870g = new d5(e12, "last_upload", 0L);
        y4 e13 = e();
        e13.getClass();
        this.f10871h = new d5(e13, "last_upload_attempt", 0L);
        y4 e14 = e();
        e14.getClass();
        this.f10872i = new d5(e14, "midnight_offset", 0L);
    }

    @Deprecated
    private final Pair<String, Boolean> t(String str) {
        x9 x9Var;
        a.C0117a c0117a;
        i();
        long b10 = zzb().b();
        x9 x9Var2 = this.f10867d.get(str);
        if (x9Var2 != null && b10 < x9Var2.f10824c) {
            return new Pair<>(x9Var2.f10822a, Boolean.valueOf(x9Var2.f10823b));
        }
        c9.a.d(true);
        long x10 = a().x(str) + b10;
        try {
            long s10 = a().s(str, e0.f10095d);
            if (s10 > 0) {
                try {
                    c0117a = c9.a.a(zza());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (x9Var2 != null && b10 < x9Var2.f10824c + s10) {
                        return new Pair<>(x9Var2.f10822a, Boolean.valueOf(x9Var2.f10823b));
                    }
                    c0117a = null;
                }
            } else {
                c0117a = c9.a.a(zza());
            }
        } catch (Exception e10) {
            zzj().A().b("Unable to get advertising id", e10);
            x9Var = new x9("", false, x10);
        }
        if (c0117a == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String a10 = c0117a.a();
        x9Var = a10 != null ? new x9(a10, c0117a.b(), x10) : new x9("", c0117a.b(), x10);
        this.f10867d.put(str, x9Var);
        c9.a.d(false);
        return new Pair<>(x9Var.f10822a, Boolean.valueOf(x9Var.f10823b));
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

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ db j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ pb k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ m l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ i5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ y9 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ta o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean s() {
        return false;
    }

    public final Pair<String, Boolean> u(String str, y6 y6Var) {
        return y6Var.x() ? t(str) : new Pair<>("", Boolean.FALSE);
    }

    @Deprecated
    public final String v(String str, boolean z10) {
        i();
        String str2 = z10 ? (String) t(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest O0 = ib.O0();
        if (O0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, O0.digest(str2.getBytes())));
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
