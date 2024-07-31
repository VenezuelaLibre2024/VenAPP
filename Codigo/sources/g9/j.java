package g9;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;

/* loaded from: classes.dex */
public final class j extends ea.a {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final String f16122a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16123b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16124c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16125d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16126e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16127f;

    /* renamed from: r, reason: collision with root package name */
    public final String f16128r;

    /* renamed from: s, reason: collision with root package name */
    public final Intent f16129s;

    /* renamed from: t, reason: collision with root package name */
    public final f0 f16130t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f16131u;

    public j(Intent intent, f0 f0Var) {
        this(null, null, null, null, null, null, null, intent, com.google.android.gms.dynamic.d.h2(f0Var).asBinder(), false);
    }

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z10) {
        this.f16122a = str;
        this.f16123b = str2;
        this.f16124c = str3;
        this.f16125d = str4;
        this.f16126e = str5;
        this.f16127f = str6;
        this.f16128r = str7;
        this.f16129s = intent;
        this.f16130t = (f0) com.google.android.gms.dynamic.d.g2(b.a.f2(iBinder));
        this.f16131u = z10;
    }

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7, f0 f0Var) {
        this(str, str2, str3, str4, str5, str6, str7, null, com.google.android.gms.dynamic.d.h2(f0Var).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f16122a;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, str, false);
        ea.c.G(parcel, 3, this.f16123b, false);
        ea.c.G(parcel, 4, this.f16124c, false);
        ea.c.G(parcel, 5, this.f16125d, false);
        ea.c.G(parcel, 6, this.f16126e, false);
        ea.c.G(parcel, 7, this.f16127f, false);
        ea.c.G(parcel, 8, this.f16128r, false);
        ea.c.E(parcel, 9, this.f16129s, i10, false);
        ea.c.t(parcel, 10, com.google.android.gms.dynamic.d.h2(this.f16130t).asBinder(), false);
        ea.c.g(parcel, 11, this.f16131u);
        ea.c.b(parcel, a10);
    }
}
