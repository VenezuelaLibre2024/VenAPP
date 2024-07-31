package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k;

/* loaded from: classes.dex */
public final class u0 extends ea.a {
    public static final Parcelable.Creator<u0> CREATOR = new v0();

    /* renamed from: a */
    final int f9651a;

    /* renamed from: b */
    final IBinder f9652b;

    /* renamed from: c */
    private final ca.b f9653c;

    /* renamed from: d */
    private final boolean f9654d;

    /* renamed from: e */
    private final boolean f9655e;

    public u0(int i10, IBinder iBinder, ca.b bVar, boolean z10, boolean z11) {
        this.f9651a = i10;
        this.f9652b = iBinder;
        this.f9653c = bVar;
        this.f9654d = z10;
        this.f9655e = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f9653c.equals(u0Var.f9653c) && q.b(v1(), u0Var.v1());
    }

    public final ca.b u1() {
        return this.f9653c;
    }

    public final k v1() {
        IBinder iBinder = this.f9652b;
        if (iBinder == null) {
            return null;
        }
        return k.a.f2(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9651a);
        ea.c.t(parcel, 2, this.f9652b, false);
        ea.c.E(parcel, 3, this.f9653c, i10, false);
        ea.c.g(parcel, 4, this.f9654d);
        ea.c.g(parcel, 5, this.f9655e);
        ea.c.b(parcel, a10);
    }
}
