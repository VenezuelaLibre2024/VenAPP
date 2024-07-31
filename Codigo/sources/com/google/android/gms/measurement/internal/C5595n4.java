package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzoc;
import la.InterfaceC9461f;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
/* loaded from: classes2.dex */
public final class C5595n4 extends AbstractC5688u6 {

    /* renamed from: c */
    private char f11611c;

    /* renamed from: d */
    private long f11612d;

    /* renamed from: e */
    private String f11613e;

    /* renamed from: f */
    private final C5621p4 f11614f;

    /* renamed from: g */
    private final C5621p4 f11615g;

    /* renamed from: h */
    private final C5621p4 f11616h;

    /* renamed from: i */
    private final C5621p4 f11617i;

    /* renamed from: j */
    private final C5621p4 f11618j;

    /* renamed from: k */
    private final C5621p4 f11619k;

    /* renamed from: l */
    private final C5621p4 f11620l;

    /* renamed from: m */
    private final C5621p4 f11621m;

    /* renamed from: n */
    private final C5621p4 f11622n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5595n4(C5712w5 c5712w5) {
        super(c5712w5);
        this.f11611c = (char) 0;
        this.f11612d = -1L;
        this.f11614f = new C5621p4(this, 6, false, false);
        this.f11615g = new C5621p4(this, 6, true, false);
        this.f11616h = new C5621p4(this, 6, false, true);
        this.f11617i = new C5621p4(this, 5, false, false);
        this.f11618j = new C5621p4(this, 5, true, false);
        this.f11619k = new C5621p4(this, 5, false, true);
        this.f11620l = new C5621p4(this, 4, false, false);
        this.f11621m = new C5621p4(this, 3, false, false);
        this.f11622n = new C5621p4(this, 2, false, false);
    }

    /* renamed from: K */
    private final String m14172K() {
        String str;
        synchronized (this) {
            if (this.f11613e == null) {
                this.f11613e = this.f11899a.m14503J() != null ? this.f11899a.m14503J() : "FA";
            }
            C5276s.m13324j(this.f11613e);
            str = this.f11613e;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public static Object m14174q(String str) {
        if (str == null) {
            return null;
        }
        return new C5660s4(str);
    }

    /* renamed from: r */
    private static String m14175r(boolean z10, Object obj) {
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
            if (!(obj instanceof C5660s4)) {
                return z10 ? "-" : String.valueOf(obj);
            }
            str = ((C5660s4) obj).f11818a;
            return str;
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String m14180z = m14180z(C5712w5.class.getCanonicalName());
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m14180z(className).equals(m14180z)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static String m14176s(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String m14175r = m14175r(z10, obj);
        String m14175r2 = m14175r(z10, obj2);
        String m14175r3 = m14175r(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(m14175r)) {
            sb2.append(str2);
            sb2.append(m14175r);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(m14175r2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(m14175r2);
        }
        if (!TextUtils.isEmpty(m14175r3)) {
            sb2.append(str3);
            sb2.append(m14175r3);
        }
        return sb2.toString();
    }

    /* renamed from: z */
    private static String m14180z(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? (zzoc.zza() && C5474e0.f11222H0.m13918a(null).booleanValue()) ? "" : str : str.substring(0, lastIndexOf);
    }

    /* renamed from: A */
    public final C5621p4 m14181A() {
        return this.f11621m;
    }

    /* renamed from: B */
    public final C5621p4 m14182B() {
        return this.f11614f;
    }

    /* renamed from: C */
    public final C5621p4 m14183C() {
        return this.f11616h;
    }

    /* renamed from: D */
    public final C5621p4 m14184D() {
        return this.f11615g;
    }

    /* renamed from: E */
    public final C5621p4 m14185E() {
        return this.f11620l;
    }

    /* renamed from: F */
    public final C5621p4 m14186F() {
        return this.f11622n;
    }

    /* renamed from: G */
    public final C5621p4 m14187G() {
        return this.f11617i;
    }

    /* renamed from: H */
    public final C5621p4 m14188H() {
        return this.f11619k;
    }

    /* renamed from: I */
    public final C5621p4 m14189I() {
        return this.f11618j;
    }

    /* renamed from: J */
    public final String m14190J() {
        Pair<String, Long> m13717a;
        if (mo13679e().f12053d == null || (m13717a = mo13679e().f12053d.m13717a()) == null || m13717a == C5735y4.f12051z) {
            return null;
        }
        return String.valueOf(m13717a.second) + ":" + ((String) m13717a.first);
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

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo13683g() {
        super.mo13683g();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13687i() {
        super.mo13687i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5688u6
    /* renamed from: n */
    protected final boolean mo14040n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final void m14191t(int i10, String str) {
        Log.println(i10, m14172K(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final void m14192u(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z10 && m14193x(i10)) {
            m14191t(i10, m14176s(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        C5276s.m13324j(str);
        C5635q5 m14495B = this.f11899a.m14495B();
        if (m14495B == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (m14495B.m14359m()) {
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= 9) {
                    i10 = 8;
                }
                m14495B.m14248y(new RunnableC5634q4(this, i10, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        m14191t(6, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean m14193x(int i10) {
        return Log.isLoggable(m14172K(), i10);
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
