package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f5 extends ea.a {
    public static final Parcelable.Creator<f5> CREATOR = new g5();

    /* renamed from: a, reason: collision with root package name */
    public final int f8664a;

    public f5(int i10) {
        this.f8664a = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8664a;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 2, i11);
        ea.c.b(parcel, a10);
    }
}
