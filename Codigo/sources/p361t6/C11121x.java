package p361t6;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.IOException;
import p361t6.InterfaceC11076o;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.C11741z;

/* renamed from: t6.x */
/* loaded from: classes.dex */
public final class C11121x extends C11029f3 {

    /* renamed from: A */
    public static final InterfaceC11076o.a<C11121x> f28865A = new InterfaceC11076o.a() { // from class: t6.w
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            return C11121x.m34566e(bundle);
        }
    };

    /* renamed from: B */
    private static final String f28866B = C11172r0.m34945r0(AdError.NO_FILL_ERROR_CODE);

    /* renamed from: C */
    private static final String f28867C = C11172r0.m34945r0(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);

    /* renamed from: D */
    private static final String f28868D = C11172r0.m34945r0(1003);

    /* renamed from: E */
    private static final String f28869E = C11172r0.m34945r0(1004);

    /* renamed from: F */
    private static final String f28870F = C11172r0.m34945r0(1005);

    /* renamed from: G */
    private static final String f28871G = C11172r0.m34945r0(1006);

    /* renamed from: t */
    public final int f28872t;

    /* renamed from: u */
    public final String f28873u;

    /* renamed from: v */
    public final int f28874v;

    /* renamed from: w */
    public final C11108u1 f28875w;

    /* renamed from: x */
    public final int f28876x;

    /* renamed from: y */
    public final C11741z f28877y;

    /* renamed from: z */
    final boolean f28878z;

    private C11121x(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    private C11121x(int i10, Throwable th2, String str, int i11, String str2, int i12, C11108u1 c11108u1, int i13, boolean z10) {
        this(m34571k(i10, str, str2, i12, c11108u1, i13), th2, i11, i10, str2, i12, c11108u1, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private C11121x(Bundle bundle) {
        super(bundle);
        this.f28872t = bundle.getInt(f28866B, 2);
        this.f28873u = bundle.getString(f28867C);
        this.f28874v = bundle.getInt(f28868D, -1);
        Bundle bundle2 = bundle.getBundle(f28869E);
        this.f28875w = bundle2 == null ? null : C11108u1.f28733A0.mo22759a(bundle2);
        this.f28876x = bundle.getInt(f28870F, 4);
        this.f28878z = bundle.getBoolean(f28871G, false);
        this.f28877y = null;
    }

    private C11121x(String str, Throwable th2, int i10, int i11, String str2, int i12, C11108u1 c11108u1, int i13, C11741z c11741z, long j10, boolean z10) {
        super(str, th2, i10, j10);
        C11137a.m34599a(!z10 || i11 == 1);
        C11137a.m34599a(th2 != null || i11 == 3);
        this.f28872t = i11;
        this.f28873u = str2;
        this.f28874v = i12;
        this.f28875w = c11108u1;
        this.f28876x = i13;
        this.f28877y = c11741z;
        this.f28878z = z10;
    }

    /* renamed from: e */
    public static /* synthetic */ C11121x m34566e(Bundle bundle) {
        return new C11121x(bundle);
    }

    /* renamed from: g */
    public static C11121x m34567g(Throwable th2, String str, int i10, C11108u1 c11108u1, int i11, boolean z10, int i12) {
        return new C11121x(1, th2, null, i12, str, i10, c11108u1, c11108u1 == null ? 4 : i11, z10);
    }

    /* renamed from: h */
    public static C11121x m34568h(IOException iOException, int i10) {
        return new C11121x(0, iOException, i10);
    }

    @Deprecated
    /* renamed from: i */
    public static C11121x m34569i(RuntimeException runtimeException) {
        return m34570j(runtimeException, AdError.NETWORK_ERROR_CODE);
    }

    /* renamed from: j */
    public static C11121x m34570j(RuntimeException runtimeException, int i10) {
        return new C11121x(2, runtimeException, i10);
    }

    /* renamed from: k */
    private static String m34571k(int i10, String str, String str2, int i11, C11108u1 c11108u1, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + c11108u1 + ", format_supported=" + C11172r0.m34902X(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @Override // p361t6.C11029f3, p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle mo22762a = super.mo22762a();
        mo22762a.putInt(f28866B, this.f28872t);
        mo22762a.putString(f28867C, this.f28873u);
        mo22762a.putInt(f28868D, this.f28874v);
        C11108u1 c11108u1 = this.f28875w;
        if (c11108u1 != null) {
            mo22762a.putBundle(f28869E, c11108u1.mo22762a());
        }
        mo22762a.putInt(f28870F, this.f28876x);
        mo22762a.putBoolean(f28871G, this.f28878z);
        return mo22762a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C11121x m34572f(C11741z c11741z) {
        return new C11121x((String) C11172r0.m34928j(getMessage()), getCause(), this.f28279a, this.f28872t, this.f28873u, this.f28874v, this.f28875w, this.f28876x, c11741z, this.f28280b, this.f28878z);
    }
}
