package p438x8;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.C4930x;
import com.google.android.gms.ads.internal.client.C4947z4;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;

/* renamed from: x8.i */
/* loaded from: classes.dex */
public final class C12367i {

    /* renamed from: a */
    private final int f33209a;

    /* renamed from: b */
    private final int f33210b;

    /* renamed from: c */
    private final String f33211c;

    /* renamed from: d */
    private boolean f33212d;

    /* renamed from: e */
    private boolean f33213e;

    /* renamed from: f */
    private int f33214f;

    /* renamed from: g */
    private boolean f33215g;

    /* renamed from: h */
    private int f33216h;

    /* renamed from: i */
    public static final C12367i f33198i = new C12367i(320, 50, "320x50_mb");

    /* renamed from: j */
    public static final C12367i f33199j = new C12367i(468, 60, "468x60_as");

    /* renamed from: k */
    public static final C12367i f33200k = new C12367i(320, 100, "320x100_as");

    /* renamed from: l */
    public static final C12367i f33201l = new C12367i(728, 90, "728x90_as");

    /* renamed from: m */
    public static final C12367i f33202m = new C12367i(300, 250, "300x250_as");

    /* renamed from: n */
    public static final C12367i f33203n = new C12367i(160, 600, "160x600_as");

    /* renamed from: o */
    @Deprecated
    public static final C12367i f33204o = new C12367i(-1, -2, "smart_banner");

    /* renamed from: p */
    public static final C12367i f33205p = new C12367i(-3, -4, "fluid");

    /* renamed from: q */
    public static final C12367i f33206q = new C12367i(0, 0, "invalid");

    /* renamed from: s */
    public static final C12367i f33208s = new C12367i(50, 50, "50x50_mb");

    /* renamed from: r */
    public static final C12367i f33207r = new C12367i(-3, 0, "search_v2");

    public C12367i(int i10, int i11) {
        this(i10, i11, (i10 == -1 ? "FULL" : String.valueOf(i10)) + "x" + (i11 == -2 ? "AUTO" : String.valueOf(i11)) + "_as");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12367i(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i10);
        }
        if (i11 >= 0 || i11 == -2 || i11 == -4) {
            this.f33209a = i10;
            this.f33210b = i11;
            this.f33211c = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i11);
        }
    }

    /* renamed from: a */
    public static C12367i m39993a(Context context, int i10) {
        C12367i zzc = zzcdv.zzc(context, i10, 50, 0);
        zzc.f33212d = true;
        return zzc;
    }

    /* renamed from: b */
    public static C12367i m39994b(Context context, int i10) {
        int zza = zzcdv.zza(context, 0);
        if (zza == -1) {
            return f33206q;
        }
        C12367i c12367i = new C12367i(i10, 0);
        c12367i.f33214f = zza;
        c12367i.f33213e = true;
        return c12367i;
    }

    /* renamed from: e */
    public static C12367i m39995e(int i10, int i11) {
        C12367i c12367i = new C12367i(i10, 0);
        c12367i.f33214f = i11;
        c12367i.f33213e = true;
        if (i11 < 32) {
            zzcec.zzj("The maximum height set for the inline adaptive ad size was " + i11 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return c12367i;
    }

    /* renamed from: f */
    public static C12367i m39996f(Context context, int i10) {
        C12367i zzc = zzcdv.zzc(context, i10, 50, 2);
        zzc.f33212d = true;
        return zzc;
    }

    /* renamed from: g */
    public static C12367i m39997g(Context context, int i10) {
        int zza = zzcdv.zza(context, 2);
        C12367i c12367i = new C12367i(i10, 0);
        if (zza == -1) {
            return f33206q;
        }
        c12367i.f33214f = zza;
        c12367i.f33213e = true;
        return c12367i;
    }

    /* renamed from: h */
    public static C12367i m39998h(Context context, int i10) {
        C12367i zzc = zzcdv.zzc(context, i10, 50, 1);
        zzc.f33212d = true;
        return zzc;
    }

    /* renamed from: i */
    public static C12367i m39999i(Context context, int i10) {
        int zza = zzcdv.zza(context, 1);
        C12367i c12367i = new C12367i(i10, 0);
        if (zza == -1) {
            return f33206q;
        }
        c12367i.f33214f = zza;
        c12367i.f33213e = true;
        return c12367i;
    }

    /* renamed from: c */
    public int m40000c() {
        return this.f33210b;
    }

    /* renamed from: d */
    public int m40001d(Context context) {
        int i10 = this.f33210b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -2) {
            return C4947z4.m12526u1(context.getResources().getDisplayMetrics());
        }
        C4930x.m12474b();
        return zzcdv.zzx(context, i10);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12367i)) {
            return false;
        }
        C12367i c12367i = (C12367i) obj;
        return this.f33209a == c12367i.f33209a && this.f33210b == c12367i.f33210b && this.f33211c.equals(c12367i.f33211c);
    }

    public int hashCode() {
        return this.f33211c.hashCode();
    }

    /* renamed from: j */
    public int m40002j() {
        return this.f33209a;
    }

    /* renamed from: k */
    public int m40003k(Context context) {
        int i10 = this.f33209a;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            C4930x.m12474b();
            return zzcdv.zzx(context, i10);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<C4947z4> creator = C4947z4.CREATOR;
        return displayMetrics.widthPixels;
    }

    /* renamed from: l */
    public boolean m40004l() {
        return this.f33209a == -3 && this.f33210b == -4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final int m40005m() {
        return this.f33216h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final int m40006n() {
        return this.f33214f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final void m40007o(int i10) {
        this.f33214f = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m40008p(int i10) {
        this.f33216h = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final void m40009q(boolean z10) {
        this.f33213e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m40010r(boolean z10) {
        this.f33215g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean m40011s() {
        return this.f33212d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m40012t() {
        return this.f33213e;
    }

    public String toString() {
        return this.f33211c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean m40013u() {
        return this.f33215g;
    }
}
