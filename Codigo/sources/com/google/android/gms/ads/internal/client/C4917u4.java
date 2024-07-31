package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.internal.ads.zzced;
import java.util.ArrayList;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.ads.internal.client.u4 */
/* loaded from: classes.dex */
public final class C4917u4 extends AbstractC7138a {
    public static final Parcelable.Creator<C4917u4> CREATOR = new C4929w4();

    /* renamed from: A */
    public final String f9826A;

    /* renamed from: B */
    public final String f9827B;

    /* renamed from: C */
    @Deprecated
    public final boolean f9828C;

    /* renamed from: D */
    public final C4785a1 f9829D;

    /* renamed from: E */
    public final int f9830E;

    /* renamed from: F */
    public final String f9831F;

    /* renamed from: G */
    public final List f9832G;

    /* renamed from: H */
    public final int f9833H;

    /* renamed from: I */
    public final String f9834I;

    /* renamed from: J */
    public final int f9835J;

    /* renamed from: a */
    public final int f9836a;

    /* renamed from: b */
    @Deprecated
    public final long f9837b;

    /* renamed from: c */
    public final Bundle f9838c;

    /* renamed from: d */
    @Deprecated
    public final int f9839d;

    /* renamed from: e */
    public final List f9840e;

    /* renamed from: f */
    public final boolean f9841f;

    /* renamed from: r */
    public final int f9842r;

    /* renamed from: s */
    public final boolean f9843s;

    /* renamed from: t */
    public final String f9844t;

    /* renamed from: u */
    public final C4857k4 f9845u;

    /* renamed from: v */
    public final Location f9846v;

    /* renamed from: w */
    public final String f9847w;

    /* renamed from: x */
    public final Bundle f9848x;

    /* renamed from: y */
    public final Bundle f9849y;

    /* renamed from: z */
    public final List f9850z;

    public C4917u4(int i10, long j10, Bundle bundle, int i11, List list, boolean z10, int i12, boolean z11, String str, C4857k4 c4857k4, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z12, C4785a1 c4785a1, int i13, String str5, List list3, int i14, String str6, int i15) {
        this.f9836a = i10;
        this.f9837b = j10;
        this.f9838c = bundle == null ? new Bundle() : bundle;
        this.f9839d = i11;
        this.f9840e = list;
        this.f9841f = z10;
        this.f9842r = i12;
        this.f9843s = z11;
        this.f9844t = str;
        this.f9845u = c4857k4;
        this.f9846v = location;
        this.f9847w = str2;
        this.f9848x = bundle2 == null ? new Bundle() : bundle2;
        this.f9849y = bundle3;
        this.f9850z = list2;
        this.f9826A = str3;
        this.f9827B = str4;
        this.f9828C = z12;
        this.f9829D = c4785a1;
        this.f9830E = i13;
        this.f9831F = str5;
        this.f9832G = list3 == null ? new ArrayList() : list3;
        this.f9833H = i14;
        this.f9834I = str6;
        this.f9835J = i15;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4917u4)) {
            return false;
        }
        C4917u4 c4917u4 = (C4917u4) obj;
        return this.f9836a == c4917u4.f9836a && this.f9837b == c4917u4.f9837b && zzced.zza(this.f9838c, c4917u4.f9838c) && this.f9839d == c4917u4.f9839d && C5270q.m13304b(this.f9840e, c4917u4.f9840e) && this.f9841f == c4917u4.f9841f && this.f9842r == c4917u4.f9842r && this.f9843s == c4917u4.f9843s && C5270q.m13304b(this.f9844t, c4917u4.f9844t) && C5270q.m13304b(this.f9845u, c4917u4.f9845u) && C5270q.m13304b(this.f9846v, c4917u4.f9846v) && C5270q.m13304b(this.f9847w, c4917u4.f9847w) && zzced.zza(this.f9848x, c4917u4.f9848x) && zzced.zza(this.f9849y, c4917u4.f9849y) && C5270q.m13304b(this.f9850z, c4917u4.f9850z) && C5270q.m13304b(this.f9826A, c4917u4.f9826A) && C5270q.m13304b(this.f9827B, c4917u4.f9827B) && this.f9828C == c4917u4.f9828C && this.f9830E == c4917u4.f9830E && C5270q.m13304b(this.f9831F, c4917u4.f9831F) && C5270q.m13304b(this.f9832G, c4917u4.f9832G) && this.f9833H == c4917u4.f9833H && C5270q.m13304b(this.f9834I, c4917u4.f9834I) && this.f9835J == c4917u4.f9835J;
    }

    public final int hashCode() {
        return C5270q.m13305c(Integer.valueOf(this.f9836a), Long.valueOf(this.f9837b), this.f9838c, Integer.valueOf(this.f9839d), this.f9840e, Boolean.valueOf(this.f9841f), Integer.valueOf(this.f9842r), Boolean.valueOf(this.f9843s), this.f9844t, this.f9845u, this.f9846v, this.f9847w, this.f9848x, this.f9849y, this.f9850z, this.f9826A, this.f9827B, Boolean.valueOf(this.f9828C), Integer.valueOf(this.f9830E), this.f9831F, this.f9832G, Integer.valueOf(this.f9833H), this.f9834I, Integer.valueOf(this.f9835J));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f9836a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, i11);
        C7140c.m21234z(parcel, 2, this.f9837b);
        C7140c.m21218j(parcel, 3, this.f9838c, false);
        C7140c.m21229u(parcel, 4, this.f9839d);
        C7140c.m21202I(parcel, 5, this.f9840e, false);
        C7140c.m21215g(parcel, 6, this.f9841f);
        C7140c.m21229u(parcel, 7, this.f9842r);
        C7140c.m21215g(parcel, 8, this.f9843s);
        C7140c.m21200G(parcel, 9, this.f9844t, false);
        C7140c.m21198E(parcel, 10, this.f9845u, i10, false);
        C7140c.m21198E(parcel, 11, this.f9846v, i10, false);
        C7140c.m21200G(parcel, 12, this.f9847w, false);
        C7140c.m21218j(parcel, 13, this.f9848x, false);
        C7140c.m21218j(parcel, 14, this.f9849y, false);
        C7140c.m21202I(parcel, 15, this.f9850z, false);
        C7140c.m21200G(parcel, 16, this.f9826A, false);
        C7140c.m21200G(parcel, 17, this.f9827B, false);
        C7140c.m21215g(parcel, 18, this.f9828C);
        C7140c.m21198E(parcel, 19, this.f9829D, i10, false);
        C7140c.m21229u(parcel, 20, this.f9830E);
        C7140c.m21200G(parcel, 21, this.f9831F, false);
        C7140c.m21202I(parcel, 22, this.f9832G, false);
        C7140c.m21229u(parcel, 23, this.f9833H);
        C7140c.m21200G(parcel, 24, this.f9834I, false);
        C7140c.m21229u(parcel, 25, this.f9835J);
        C7140c.m21210b(parcel, m21209a);
    }
}
