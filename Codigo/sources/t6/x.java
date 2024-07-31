package t6;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.IOException;
import t6.o;

/* loaded from: classes.dex */
public final class x extends f3 {
    public static final o.a<x> A = new o.a() { // from class: t6.w
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            return x.e(bundle);
        }
    };
    private static final String B = t8.r0.r0(AdError.NO_FILL_ERROR_CODE);
    private static final String C = t8.r0.r0(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
    private static final String D = t8.r0.r0(1003);
    private static final String E = t8.r0.r0(1004);
    private static final String F = t8.r0.r0(1005);
    private static final String G = t8.r0.r0(1006);

    /* renamed from: t, reason: collision with root package name */
    public final int f26579t;

    /* renamed from: u, reason: collision with root package name */
    public final String f26580u;

    /* renamed from: v, reason: collision with root package name */
    public final int f26581v;

    /* renamed from: w, reason: collision with root package name */
    public final u1 f26582w;

    /* renamed from: x, reason: collision with root package name */
    public final int f26583x;

    /* renamed from: y, reason: collision with root package name */
    public final v7.z f26584y;

    /* renamed from: z, reason: collision with root package name */
    final boolean f26585z;

    private x(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    private x(int i10, Throwable th2, String str, int i11, String str2, int i12, u1 u1Var, int i13, boolean z10) {
        this(k(i10, str, str2, i12, u1Var, i13), th2, i11, i10, str2, i12, u1Var, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private x(Bundle bundle) {
        super(bundle);
        this.f26579t = bundle.getInt(B, 2);
        this.f26580u = bundle.getString(C);
        this.f26581v = bundle.getInt(D, -1);
        Bundle bundle2 = bundle.getBundle(E);
        this.f26582w = bundle2 == null ? null : u1.A0.a(bundle2);
        this.f26583x = bundle.getInt(F, 4);
        this.f26585z = bundle.getBoolean(G, false);
        this.f26584y = null;
    }

    private x(String str, Throwable th2, int i10, int i11, String str2, int i12, u1 u1Var, int i13, v7.z zVar, long j10, boolean z10) {
        super(str, th2, i10, j10);
        t8.a.a(!z10 || i11 == 1);
        t8.a.a(th2 != null || i11 == 3);
        this.f26579t = i11;
        this.f26580u = str2;
        this.f26581v = i12;
        this.f26582w = u1Var;
        this.f26583x = i13;
        this.f26584y = zVar;
        this.f26585z = z10;
    }

    public static /* synthetic */ x e(Bundle bundle) {
        return new x(bundle);
    }

    public static x g(Throwable th2, String str, int i10, u1 u1Var, int i11, boolean z10, int i12) {
        return new x(1, th2, null, i12, str, i10, u1Var, u1Var == null ? 4 : i11, z10);
    }

    public static x h(IOException iOException, int i10) {
        return new x(0, iOException, i10);
    }

    @Deprecated
    public static x i(RuntimeException runtimeException) {
        return j(runtimeException, AdError.NETWORK_ERROR_CODE);
    }

    public static x j(RuntimeException runtimeException, int i10) {
        return new x(2, runtimeException, i10);
    }

    private static String k(int i10, String str, String str2, int i11, u1 u1Var, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + u1Var + ", format_supported=" + t8.r0.X(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @Override // t6.f3, t6.o
    public Bundle a() {
        Bundle a10 = super.a();
        a10.putInt(B, this.f26579t);
        a10.putString(C, this.f26580u);
        a10.putInt(D, this.f26581v);
        u1 u1Var = this.f26582w;
        if (u1Var != null) {
            a10.putBundle(E, u1Var.a());
        }
        a10.putInt(F, this.f26583x);
        a10.putBoolean(G, this.f26585z);
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x f(v7.z zVar) {
        return new x((String) t8.r0.j(getMessage()), getCause(), this.f26090a, this.f26579t, this.f26580u, this.f26581v, this.f26582w, this.f26583x, zVar, this.f26091b, this.f26585z);
    }
}
