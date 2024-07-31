package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.internal.p */
/* loaded from: classes.dex */
public class C5267p extends AbstractC7138a {
    public static final Parcelable.Creator<C5267p> CREATOR = new C5259m0();

    /* renamed from: a */
    private final int f10728a;

    /* renamed from: b */
    private final int f10729b;

    /* renamed from: c */
    private final int f10730c;

    /* renamed from: d */
    private final long f10731d;

    /* renamed from: e */
    private final long f10732e;

    /* renamed from: f */
    private final String f10733f;

    /* renamed from: r */
    private final String f10734r;

    /* renamed from: s */
    private final int f10735s;

    /* renamed from: t */
    private final int f10736t;

    @Deprecated
    public C5267p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13) {
        this(i10, i11, i12, j10, j11, str, str2, i13, -1);
    }

    public C5267p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f10728a = i10;
        this.f10729b = i11;
        this.f10730c = i12;
        this.f10731d = j10;
        this.f10732e = j11;
        this.f10733f = str;
        this.f10734r = str2;
        this.f10735s = i13;
        this.f10736t = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f10728a);
        C7140c.m21229u(parcel, 2, this.f10729b);
        C7140c.m21229u(parcel, 3, this.f10730c);
        C7140c.m21234z(parcel, 4, this.f10731d);
        C7140c.m21234z(parcel, 5, this.f10732e);
        C7140c.m21200G(parcel, 6, this.f10733f, false);
        C7140c.m21200G(parcel, 7, this.f10734r, false);
        C7140c.m21229u(parcel, 8, this.f10735s);
        C7140c.m21229u(parcel, 9, this.f10736t);
        C7140c.m21210b(parcel, m21209a);
    }
}
