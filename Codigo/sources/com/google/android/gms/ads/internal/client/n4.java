package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n4 extends ea.a {
    public static final Parcelable.Creator<n4> CREATOR = new o4();

    /* renamed from: a */
    public final boolean f8712a;

    /* renamed from: b */
    public final boolean f8713b;

    /* renamed from: c */
    public final boolean f8714c;

    public n4(x8.c0 c0Var) {
        this(c0Var.c(), c0Var.b(), c0Var.a());
    }

    public n4(boolean z10, boolean z11, boolean z12) {
        this.f8712a = z10;
        this.f8713b = z11;
        this.f8714c = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f8712a;
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 2, z10);
        ea.c.g(parcel, 3, this.f8713b);
        ea.c.g(parcel, 4, this.f8714c);
        ea.c.b(parcel, a10);
    }
}
