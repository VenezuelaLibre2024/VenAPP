package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class u extends ea.a {
    public static final Parcelable.Creator<u> CREATOR = new f1();

    /* renamed from: a, reason: collision with root package name */
    private final int f9646a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9647b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9648c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9649d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9650e;

    public u(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f9646a = i10;
        this.f9647b = z10;
        this.f9648c = z11;
        this.f9649d = i11;
        this.f9650e = i12;
    }

    public int u1() {
        return this.f9649d;
    }

    public int v1() {
        return this.f9650e;
    }

    public boolean w1() {
        return this.f9647b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, y1());
        ea.c.g(parcel, 2, w1());
        ea.c.g(parcel, 3, x1());
        ea.c.u(parcel, 4, u1());
        ea.c.u(parcel, 5, v1());
        ea.c.b(parcel, a10);
    }

    public boolean x1() {
        return this.f9648c;
    }

    public int y1() {
        return this.f9646a;
    }
}
