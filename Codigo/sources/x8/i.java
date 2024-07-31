package x8;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final int f30689a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30690b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30691c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30692d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30693e;

    /* renamed from: f, reason: collision with root package name */
    private int f30694f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30695g;

    /* renamed from: h, reason: collision with root package name */
    private int f30696h;

    /* renamed from: i, reason: collision with root package name */
    public static final i f30678i = new i(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final i f30679j = new i(468, 60, "468x60_as");

    /* renamed from: k, reason: collision with root package name */
    public static final i f30680k = new i(320, 100, "320x100_as");

    /* renamed from: l, reason: collision with root package name */
    public static final i f30681l = new i(728, 90, "728x90_as");

    /* renamed from: m, reason: collision with root package name */
    public static final i f30682m = new i(300, 250, "300x250_as");

    /* renamed from: n, reason: collision with root package name */
    public static final i f30683n = new i(160, 600, "160x600_as");

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final i f30684o = new i(-1, -2, "smart_banner");

    /* renamed from: p, reason: collision with root package name */
    public static final i f30685p = new i(-3, -4, "fluid");

    /* renamed from: q, reason: collision with root package name */
    public static final i f30686q = new i(0, 0, "invalid");

    /* renamed from: s, reason: collision with root package name */
    public static final i f30688s = new i(50, 50, "50x50_mb");

    /* renamed from: r, reason: collision with root package name */
    public static final i f30687r = new i(-3, 0, "search_v2");

    public i(int i10, int i11) {
        this(i10, i11, (i10 == -1 ? "FULL" : String.valueOf(i10)) + "x" + (i11 == -2 ? "AUTO" : String.valueOf(i11)) + "_as");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i10);
        }
        if (i11 >= 0 || i11 == -2 || i11 == -4) {
            this.f30689a = i10;
            this.f30690b = i11;
            this.f30691c = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i11);
        }
    }

    public static i a(Context context, int i10) {
        i zzc = zzcdv.zzc(context, i10, 50, 0);
        zzc.f30692d = true;
        return zzc;
    }

    public static i b(Context context, int i10) {
        int zza = zzcdv.zza(context, 0);
        if (zza == -1) {
            return f30686q;
        }
        i iVar = new i(i10, 0);
        iVar.f30694f = zza;
        iVar.f30693e = true;
        return iVar;
    }

    public static i e(int i10, int i11) {
        i iVar = new i(i10, 0);
        iVar.f30694f = i11;
        iVar.f30693e = true;
        if (i11 < 32) {
            zzcec.zzj("The maximum height set for the inline adaptive ad size was " + i11 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return iVar;
    }

    public static i f(Context context, int i10) {
        i zzc = zzcdv.zzc(context, i10, 50, 2);
        zzc.f30692d = true;
        return zzc;
    }

    public static i g(Context context, int i10) {
        int zza = zzcdv.zza(context, 2);
        i iVar = new i(i10, 0);
        if (zza == -1) {
            return f30686q;
        }
        iVar.f30694f = zza;
        iVar.f30693e = true;
        return iVar;
    }

    public static i h(Context context, int i10) {
        i zzc = zzcdv.zzc(context, i10, 50, 1);
        zzc.f30692d = true;
        return zzc;
    }

    public static i i(Context context, int i10) {
        int zza = zzcdv.zza(context, 1);
        i iVar = new i(i10, 0);
        if (zza == -1) {
            return f30686q;
        }
        iVar.f30694f = zza;
        iVar.f30693e = true;
        return iVar;
    }

    public int c() {
        return this.f30690b;
    }

    public int d(Context context) {
        int i10 = this.f30690b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -2) {
            return z4.u1(context.getResources().getDisplayMetrics());
        }
        com.google.android.gms.ads.internal.client.x.b();
        return zzcdv.zzx(context, i10);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f30689a == iVar.f30689a && this.f30690b == iVar.f30690b && this.f30691c.equals(iVar.f30691c);
    }

    public int hashCode() {
        return this.f30691c.hashCode();
    }

    public int j() {
        return this.f30689a;
    }

    public int k(Context context) {
        int i10 = this.f30689a;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            com.google.android.gms.ads.internal.client.x.b();
            return zzcdv.zzx(context, i10);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<z4> creator = z4.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean l() {
        return this.f30689a == -3 && this.f30690b == -4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m() {
        return this.f30696h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int n() {
        return this.f30694f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(int i10) {
        this.f30694f = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(int i10) {
        this.f30696h = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(boolean z10) {
        this.f30693e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(boolean z10) {
        this.f30695g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s() {
        return this.f30692d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t() {
        return this.f30693e;
    }

    public String toString() {
        return this.f30691c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u() {
        return this.f30695g;
    }
}
