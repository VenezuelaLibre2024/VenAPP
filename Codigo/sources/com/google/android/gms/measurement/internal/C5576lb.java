package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.measurement.internal.lb */
/* loaded from: classes2.dex */
public final class C5576lb extends AbstractC7138a {
    public static final Parcelable.Creator<C5576lb> CREATOR = new C5589mb();

    /* renamed from: A */
    public final boolean f11538A;

    /* renamed from: B */
    public final String f11539B;

    /* renamed from: C */
    public final Boolean f11540C;

    /* renamed from: D */
    public final long f11541D;

    /* renamed from: E */
    public final List<String> f11542E;

    /* renamed from: F */
    private final String f11543F;

    /* renamed from: G */
    public final String f11544G;

    /* renamed from: H */
    public final String f11545H;

    /* renamed from: I */
    public final String f11546I;

    /* renamed from: J */
    public final boolean f11547J;

    /* renamed from: K */
    public final long f11548K;

    /* renamed from: L */
    public final int f11549L;

    /* renamed from: M */
    public final String f11550M;

    /* renamed from: N */
    public final int f11551N;

    /* renamed from: O */
    public final long f11552O;

    /* renamed from: a */
    public final String f11553a;

    /* renamed from: b */
    public final String f11554b;

    /* renamed from: c */
    public final String f11555c;

    /* renamed from: d */
    public final String f11556d;

    /* renamed from: e */
    public final long f11557e;

    /* renamed from: f */
    public final long f11558f;

    /* renamed from: r */
    public final String f11559r;

    /* renamed from: s */
    public final boolean f11560s;

    /* renamed from: t */
    public final boolean f11561t;

    /* renamed from: u */
    public final long f11562u;

    /* renamed from: v */
    public final String f11563v;

    /* renamed from: w */
    @Deprecated
    private final long f11564w;

    /* renamed from: x */
    public final long f11565x;

    /* renamed from: y */
    public final int f11566y;

    /* renamed from: z */
    public final boolean f11567z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5576lb(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9, String str10, String str11, boolean z14, long j16, int i11, String str12, int i12, long j17) {
        C5276s.m13320f(str);
        this.f11553a = str;
        this.f11554b = TextUtils.isEmpty(str2) ? null : str2;
        this.f11555c = str3;
        this.f11562u = j10;
        this.f11556d = str4;
        this.f11557e = j11;
        this.f11558f = j12;
        this.f11559r = str5;
        this.f11560s = z10;
        this.f11561t = z11;
        this.f11563v = str6;
        this.f11564w = j13;
        this.f11565x = j14;
        this.f11566y = i10;
        this.f11567z = z12;
        this.f11538A = z13;
        this.f11539B = str7;
        this.f11540C = bool;
        this.f11541D = j15;
        this.f11542E = list;
        this.f11543F = null;
        this.f11544G = str9;
        this.f11545H = str10;
        this.f11546I = str11;
        this.f11547J = z14;
        this.f11548K = j16;
        this.f11549L = i11;
        this.f11550M = str12;
        this.f11551N = i12;
        this.f11552O = j17;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5576lb(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9, String str10, String str11, boolean z14, long j16, int i11, String str12, int i12, long j17) {
        this.f11553a = str;
        this.f11554b = str2;
        this.f11555c = str3;
        this.f11562u = j12;
        this.f11556d = str4;
        this.f11557e = j10;
        this.f11558f = j11;
        this.f11559r = str5;
        this.f11560s = z10;
        this.f11561t = z11;
        this.f11563v = str6;
        this.f11564w = j13;
        this.f11565x = j14;
        this.f11566y = i10;
        this.f11567z = z12;
        this.f11538A = z13;
        this.f11539B = str7;
        this.f11540C = bool;
        this.f11541D = j15;
        this.f11542E = list;
        this.f11543F = str8;
        this.f11544G = str9;
        this.f11545H = str10;
        this.f11546I = str11;
        this.f11547J = z14;
        this.f11548K = j16;
        this.f11549L = i11;
        this.f11550M = str12;
        this.f11551N = i12;
        this.f11552O = j17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, this.f11553a, false);
        C7140c.m21200G(parcel, 3, this.f11554b, false);
        C7140c.m21200G(parcel, 4, this.f11555c, false);
        C7140c.m21200G(parcel, 5, this.f11556d, false);
        C7140c.m21234z(parcel, 6, this.f11557e);
        C7140c.m21234z(parcel, 7, this.f11558f);
        C7140c.m21200G(parcel, 8, this.f11559r, false);
        C7140c.m21215g(parcel, 9, this.f11560s);
        C7140c.m21215g(parcel, 10, this.f11561t);
        C7140c.m21234z(parcel, 11, this.f11562u);
        C7140c.m21200G(parcel, 12, this.f11563v, false);
        C7140c.m21234z(parcel, 13, this.f11564w);
        C7140c.m21234z(parcel, 14, this.f11565x);
        C7140c.m21229u(parcel, 15, this.f11566y);
        C7140c.m21215g(parcel, 16, this.f11567z);
        C7140c.m21215g(parcel, 18, this.f11538A);
        C7140c.m21200G(parcel, 19, this.f11539B, false);
        C7140c.m21217i(parcel, 21, this.f11540C, false);
        C7140c.m21234z(parcel, 22, this.f11541D);
        C7140c.m21202I(parcel, 23, this.f11542E, false);
        C7140c.m21200G(parcel, 24, this.f11543F, false);
        C7140c.m21200G(parcel, 25, this.f11544G, false);
        C7140c.m21200G(parcel, 26, this.f11545H, false);
        C7140c.m21200G(parcel, 27, this.f11546I, false);
        C7140c.m21215g(parcel, 28, this.f11547J);
        C7140c.m21234z(parcel, 29, this.f11548K);
        C7140c.m21229u(parcel, 30, this.f11549L);
        C7140c.m21200G(parcel, 31, this.f11550M, false);
        C7140c.m21229u(parcel, 32, this.f11551N);
        C7140c.m21234z(parcel, 34, this.f11552O);
        C7140c.m21210b(parcel, m21209a);
    }
}
