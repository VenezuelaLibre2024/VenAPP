package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class f extends ea.a {
    public static final Parcelable.Creator<f> CREATOR = new o1();

    /* renamed from: a */
    private final u f9552a;

    /* renamed from: b */
    private final boolean f9553b;

    /* renamed from: c */
    private final boolean f9554c;

    /* renamed from: d */
    private final int[] f9555d;

    /* renamed from: e */
    private final int f9556e;

    /* renamed from: f */
    private final int[] f9557f;

    public f(u uVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f9552a = uVar;
        this.f9553b = z10;
        this.f9554c = z11;
        this.f9555d = iArr;
        this.f9556e = i10;
        this.f9557f = iArr2;
    }

    public int u1() {
        return this.f9556e;
    }

    public int[] v1() {
        return this.f9555d;
    }

    public int[] w1() {
        return this.f9557f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, this.f9552a, i10, false);
        ea.c.g(parcel, 2, x1());
        ea.c.g(parcel, 3, y1());
        ea.c.v(parcel, 4, v1(), false);
        ea.c.u(parcel, 5, u1());
        ea.c.v(parcel, 6, w1(), false);
        ea.c.b(parcel, a10);
    }

    public boolean x1() {
        return this.f9553b;
    }

    public boolean y1() {
        return this.f9554c;
    }

    public final u z1() {
        return this.f9552a;
    }
}
