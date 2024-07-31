package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import p438x8.C12367i;

/* renamed from: com.google.android.gms.ads.internal.client.z4 */
/* loaded from: classes.dex */
public final class C4947z4 extends AbstractC7138a {
    public static final Parcelable.Creator<C4947z4> CREATOR = new C4789a5();

    /* renamed from: a */
    public final String f9918a;

    /* renamed from: b */
    public final int f9919b;

    /* renamed from: c */
    public final int f9920c;

    /* renamed from: d */
    public final boolean f9921d;

    /* renamed from: e */
    public final int f9922e;

    /* renamed from: f */
    public final int f9923f;

    /* renamed from: r */
    public final C4947z4[] f9924r;

    /* renamed from: s */
    public final boolean f9925s;

    /* renamed from: t */
    public final boolean f9926t;

    /* renamed from: u */
    public boolean f9927u;

    /* renamed from: v */
    public boolean f9928v;

    /* renamed from: w */
    public boolean f9929w;

    /* renamed from: x */
    public boolean f9930x;

    /* renamed from: y */
    public boolean f9931y;

    /* renamed from: z */
    public boolean f9932z;

    public C4947z4() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public C4947z4(Context context, C12367i c12367i) {
        this(context, new C12367i[]{c12367i});
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4947z4(android.content.Context r13, p438x8.C12367i[] r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.C4947z4.<init>(android.content.Context, x8.i[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4947z4(String str, int i10, int i11, boolean z10, int i12, int i13, C4947z4[] c4947z4Arr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f9918a = str;
        this.f9919b = i10;
        this.f9920c = i11;
        this.f9921d = z10;
        this.f9922e = i12;
        this.f9923f = i13;
        this.f9924r = c4947z4Arr;
        this.f9925s = z11;
        this.f9926t = z12;
        this.f9927u = z13;
        this.f9928v = z14;
        this.f9929w = z15;
        this.f9930x = z16;
        this.f9931y = z17;
        this.f9932z = z18;
    }

    /* renamed from: u1 */
    public static int m12526u1(DisplayMetrics displayMetrics) {
        return (int) (m12531z1(displayMetrics) * displayMetrics.density);
    }

    /* renamed from: v1 */
    public static C4947z4 m12527v1() {
        return new C4947z4("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    /* renamed from: w1 */
    public static C4947z4 m12528w1() {
        return new C4947z4("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    /* renamed from: x1 */
    public static C4947z4 m12529x1() {
        return new C4947z4("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    /* renamed from: y1 */
    public static C4947z4 m12530y1() {
        return new C4947z4("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    /* renamed from: z1 */
    private static int m12531z1(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f9918a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, str, false);
        C7140c.m21229u(parcel, 3, this.f9919b);
        C7140c.m21229u(parcel, 4, this.f9920c);
        C7140c.m21215g(parcel, 5, this.f9921d);
        C7140c.m21229u(parcel, 6, this.f9922e);
        C7140c.m21229u(parcel, 7, this.f9923f);
        C7140c.m21203J(parcel, 8, this.f9924r, i10, false);
        C7140c.m21215g(parcel, 9, this.f9925s);
        C7140c.m21215g(parcel, 10, this.f9926t);
        C7140c.m21215g(parcel, 11, this.f9927u);
        C7140c.m21215g(parcel, 12, this.f9928v);
        C7140c.m21215g(parcel, 13, this.f9929w);
        C7140c.m21215g(parcel, 14, this.f9930x);
        C7140c.m21215g(parcel, 15, this.f9931y);
        C7140c.m21215g(parcel, 16, this.f9932z);
        C7140c.m21210b(parcel, m21209a);
    }
}
