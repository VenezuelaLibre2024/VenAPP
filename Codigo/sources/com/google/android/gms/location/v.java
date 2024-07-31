package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public class v extends ea.a {
    public static final Parcelable.Creator<v> CREATOR = new c0();

    /* renamed from: a */
    private final List f9883a;

    /* renamed from: b */
    private final int f9884b;

    public v(List list, int i10) {
        this.f9883a = list;
        this.f9884b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return com.google.android.gms.common.internal.q.b(this.f9883a, vVar.f9883a) && this.f9884b == vVar.f9884b;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f9883a, Integer.valueOf(this.f9884b));
    }

    public int u1() {
        return this.f9884b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.common.internal.s.j(parcel);
        int a10 = ea.c.a(parcel);
        ea.c.K(parcel, 1, this.f9883a, false);
        ea.c.u(parcel, 2, u1());
        ea.c.b(parcel, a10);
    }
}
