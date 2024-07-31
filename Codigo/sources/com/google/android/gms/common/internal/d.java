package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class d extends ea.a {
    public static final Parcelable.Creator<d> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final int f9530a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9531b;

    public d(int i10, String str) {
        this.f9530a = i10;
        this.f9531b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f9530a == this.f9530a && q.b(dVar.f9531b, this.f9531b);
    }

    public final int hashCode() {
        return this.f9530a;
    }

    public final String toString() {
        return this.f9530a + ":" + this.f9531b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9530a);
        ea.c.G(parcel, 2, this.f9531b, false);
        ea.c.b(parcel, a10);
    }
}
