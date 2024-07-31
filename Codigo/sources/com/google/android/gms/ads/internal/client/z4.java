package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class z4 extends ea.a {
    public static final Parcelable.Creator<z4> CREATOR = new a5();

    /* renamed from: a */
    public final String f8831a;

    /* renamed from: b */
    public final int f8832b;

    /* renamed from: c */
    public final int f8833c;

    /* renamed from: d */
    public final boolean f8834d;

    /* renamed from: e */
    public final int f8835e;

    /* renamed from: f */
    public final int f8836f;

    /* renamed from: r */
    public final z4[] f8837r;

    /* renamed from: s */
    public final boolean f8838s;

    /* renamed from: t */
    public final boolean f8839t;

    /* renamed from: u */
    public boolean f8840u;

    /* renamed from: v */
    public boolean f8841v;

    /* renamed from: w */
    public boolean f8842w;

    /* renamed from: x */
    public boolean f8843x;

    /* renamed from: y */
    public boolean f8844y;

    /* renamed from: z */
    public boolean f8845z;

    public z4() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public z4(Context context, x8.i iVar) {
        this(context, new x8.i[]{iVar});
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z4(android.content.Context r13, x8.i[] r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.z4.<init>(android.content.Context, x8.i[]):void");
    }

    public z4(String str, int i10, int i11, boolean z10, int i12, int i13, z4[] z4VarArr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f8831a = str;
        this.f8832b = i10;
        this.f8833c = i11;
        this.f8834d = z10;
        this.f8835e = i12;
        this.f8836f = i13;
        this.f8837r = z4VarArr;
        this.f8838s = z11;
        this.f8839t = z12;
        this.f8840u = z13;
        this.f8841v = z14;
        this.f8842w = z15;
        this.f8843x = z16;
        this.f8844y = z17;
        this.f8845z = z18;
    }

    public static int u1(DisplayMetrics displayMetrics) {
        return (int) (z1(displayMetrics) * displayMetrics.density);
    }

    public static z4 v1() {
        return new z4("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static z4 w1() {
        return new z4("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static z4 x1() {
        return new z4("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static z4 y1() {
        return new z4("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    private static int z1(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f8831a;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, str, false);
        ea.c.u(parcel, 3, this.f8832b);
        ea.c.u(parcel, 4, this.f8833c);
        ea.c.g(parcel, 5, this.f8834d);
        ea.c.u(parcel, 6, this.f8835e);
        ea.c.u(parcel, 7, this.f8836f);
        ea.c.J(parcel, 8, this.f8837r, i10, false);
        ea.c.g(parcel, 9, this.f8838s);
        ea.c.g(parcel, 10, this.f8839t);
        ea.c.g(parcel, 11, this.f8840u);
        ea.c.g(parcel, 12, this.f8841v);
        ea.c.g(parcel, 13, this.f8842w);
        ea.c.g(parcel, 14, this.f8843x);
        ea.c.g(parcel, 15, this.f8844y);
        ea.c.g(parcel, 16, this.f8845z);
        ea.c.b(parcel, a10);
    }
}
