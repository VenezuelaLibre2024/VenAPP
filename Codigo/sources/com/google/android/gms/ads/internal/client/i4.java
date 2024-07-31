package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i4 extends ea.a {
    public static final Parcelable.Creator<i4> CREATOR = new j4();

    /* renamed from: a, reason: collision with root package name */
    public final int f8675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8676b;

    public i4(int i10, int i11) {
        this.f8675a = i10;
        this.f8676b = i11;
    }

    public i4(x8.y yVar) {
        this.f8675a = yVar.c();
        this.f8676b = yVar.d();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8675a;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        ea.c.u(parcel, 2, this.f8676b);
        ea.c.b(parcel, a10);
    }
}
