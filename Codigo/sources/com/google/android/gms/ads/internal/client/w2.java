package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w2 extends ea.a {
    public static final Parcelable.Creator<w2> CREATOR = new x2();

    /* renamed from: a, reason: collision with root package name */
    public final int f8785a;

    public w2(int i10) {
        this.f8785a = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8785a;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 2, i11);
        ea.c.b(parcel, a10);
    }
}
