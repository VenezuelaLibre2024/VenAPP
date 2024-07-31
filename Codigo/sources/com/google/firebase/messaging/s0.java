package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class s0 implements Parcelable.Creator<r0> {
    public static void c(r0 r0Var, Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.j(parcel, 2, r0Var.f12156a, false);
        ea.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public r0 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            if (ea.b.w(E) != 2) {
                ea.b.N(parcel, E);
            } else {
                bundle = ea.b.f(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new r0(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public r0[] newArray(int i10) {
        return new r0[i10];
    }
}
