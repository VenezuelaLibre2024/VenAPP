package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class c extends ea.a {
    public static final Parcelable.Creator<c> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    private final int f9798a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9799b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int i10, int i11) {
        this.f9798a = i10;
        this.f9799b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9798a == cVar.f9798a && this.f9799b == cVar.f9799b;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.f9798a), Integer.valueOf(this.f9799b));
    }

    public String toString() {
        return "ActivityTransition [mActivityType=" + this.f9798a + ", mTransitionType=" + this.f9799b + "]";
    }

    public int u1() {
        return this.f9798a;
    }

    public int v1() {
        return this.f9799b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.common.internal.s.j(parcel);
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, u1());
        ea.c.u(parcel, 2, v1());
        ea.c.b(parcel, a10);
    }
}
