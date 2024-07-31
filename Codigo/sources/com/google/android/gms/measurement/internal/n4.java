package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzoc;

/* loaded from: classes2.dex */
public final class n4 extends u6 {

    /* renamed from: c */
    private char f10424c;

    /* renamed from: d */
    private long f10425d;

    /* renamed from: e */
    private String f10426e;

    /* renamed from: f */
    private final p4 f10427f;

    /* renamed from: g */
    private final p4 f10428g;

    /* renamed from: h */
    private final p4 f10429h;

    /* renamed from: i */
    private final p4 f10430i;

    /* renamed from: j */
    private final p4 f10431j;

    /* renamed from: k */
    private final p4 f10432k;

    /* renamed from: l */
    private final p4 f10433l;

    /* renamed from: m */
    private final p4 f10434m;

    /* renamed from: n */
    private final p4 f10435n;

    public n4(w5 w5Var) {
        super(w5Var);
        this.f10424c = (char) 0;
        this.f10425d = -1L;
        this.f10427f = new p4(this, 6, false, false);
        this.f10428g = new p4(this, 6, true, false);
        this.f10429h = new p4(this, 6, false, true);
        this.f10430i = new p4(this, 5, false, false);
        this.f10431j = new p4(this, 5, true, false);
        this.f10432k = new p4(this, 5, false, true);
        this.f10433l = new p4(this, 4, false, false);
        this.f10434m = new p4(this, 3, false, false);
        this.f10435n = new p4(this, 2, false, false);
    }

    private final String K() {
        String str;
        synchronized (this) {
            if (this.f10426e == null) {
                this.f10426e = this.f10701a.J() != null ? this.f10701a.J() : "FA";
            }
            com.google.android.gms.common.internal.s.j(this.f10426e);
            str = this.f10426e;
        }
        return str;
    }

    public static Object q(String str) {
        if (str == null) {
            return null;
        }
        return new s4(str);
    }

    private static String r(boolean z10, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str2 = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            if (!(obj instanceof s4)) {
                return z10 ? "-" : String.valueOf(obj);
            }
            str = ((s4) obj).f10620a;
            return str;
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String z11 = z(w5.class.getCanonicalName());
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && z(className).equals(z11)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb2.toString();
    }

    public static String s(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String r10 = r(z10, obj);
        String r11 = r(z10, obj2);
        String r12 = r(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(r10)) {
            sb2.append(str2);
            sb2.append(r10);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(r11)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(r11);
        }
        if (!TextUtils.isEmpty(r12)) {
            sb2.append(str3);
            sb2.append(r12);
        }
        return sb2.toString();
    }

    private static String z(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? (zzoc.zza() && e0.H0.a(null).booleanValue()) ? "" : str : str.substring(0, lastIndexOf);
    }

    public final p4 A() {
        return this.f10434m;
    }

    public final p4 B() {
        return this.f10427f;
    }

    public final p4 C() {
        return this.f10429h;
    }

    public final p4 D() {
        return this.f10428g;
    }

    public final p4 E() {
        return this.f10433l;
    }

    public final p4 F() {
        return this.f10435n;
    }

    public final p4 G() {
        return this.f10430i;
    }

    public final p4 H() {
        return this.f10432k;
    }

    public final p4 I() {
        return this.f10431j;
    }

    public final String J() {
        Pair<String, Long> a10;
        if (e().f10838d == null || (a10 = e().f10838d.a()) == null || a10 == y4.f10836z) {
            return null;
        }
        return String.valueOf(a10.second) + ":" + ((String) a10.first);
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

    @Override // com.google.android.gms.measurement.internal.u6
    protected final boolean n() {
        return false;
    }

    public final void t(int i10, String str) {
        Log.println(i10, K(), str);
    }

    public final void u(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z10 && x(i10)) {
            t(i10, s(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        com.google.android.gms.common.internal.s.j(str);
        q5 B = this.f10701a.B();
        if (B == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (B.m()) {
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= 9) {
                    i10 = 8;
                }
                B.y(new q4(this, i10, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        t(6, str2);
    }

    public final boolean x(int i10) {
        return Log.isLoggable(K(), i10);
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
