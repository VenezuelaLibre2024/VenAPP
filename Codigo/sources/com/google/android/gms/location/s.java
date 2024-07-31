package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class s extends ea.a {
    public static final Parcelable.Creator<s> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9877a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9878b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9879c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9880d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9881e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9882f;

    public s(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f9877a = z10;
        this.f9878b = z11;
        this.f9879c = z12;
        this.f9880d = z13;
        this.f9881e = z14;
        this.f9882f = z15;
    }

    public boolean u1() {
        return this.f9882f;
    }

    public boolean v1() {
        return this.f9879c;
    }

    public boolean w1() {
        return this.f9880d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, x1());
        ea.c.g(parcel, 2, z1());
        ea.c.g(parcel, 3, v1());
        ea.c.g(parcel, 4, w1());
        ea.c.g(parcel, 5, y1());
        ea.c.g(parcel, 6, u1());
        ea.c.b(parcel, a10);
    }

    public boolean x1() {
        return this.f9877a;
    }

    public boolean y1() {
        return this.f9881e;
    }

    public boolean z1() {
        return this.f9878b;
    }
}
