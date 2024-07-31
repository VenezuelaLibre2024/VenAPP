package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.ads.internal.j */
/* loaded from: classes.dex */
public final class C4954j extends AbstractC7138a {
    public static final Parcelable.Creator<C4954j> CREATOR = new C4955k();

    /* renamed from: a */
    public final boolean f9955a;

    /* renamed from: b */
    public final boolean f9956b;

    /* renamed from: c */
    public final String f9957c;

    /* renamed from: d */
    public final boolean f9958d;

    /* renamed from: e */
    public final float f9959e;

    /* renamed from: f */
    public final int f9960f;

    /* renamed from: r */
    public final boolean f9961r;

    /* renamed from: s */
    public final boolean f9962s;

    /* renamed from: t */
    public final boolean f9963t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4954j(boolean z10, boolean z11, String str, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this.f9955a = z10;
        this.f9956b = z11;
        this.f9957c = str;
        this.f9958d = z12;
        this.f9959e = f10;
        this.f9960f = i10;
        this.f9961r = z13;
        this.f9962s = z14;
        this.f9963t = z15;
    }

    public C4954j(boolean z10, boolean z11, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this(z10, z11, null, z12, f10, -1, z13, z14, z15);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f9955a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 2, z10);
        C7140c.m21215g(parcel, 3, this.f9956b);
        C7140c.m21200G(parcel, 4, this.f9957c, false);
        C7140c.m21215g(parcel, 5, this.f9958d);
        C7140c.m21225q(parcel, 6, this.f9959e);
        C7140c.m21229u(parcel, 7, this.f9960f);
        C7140c.m21215g(parcel, 8, this.f9961r);
        C7140c.m21215g(parcel, 9, this.f9962s);
        C7140c.m21215g(parcel, 10, this.f9963t);
        C7140c.m21210b(parcel, m21209a);
    }
}
