package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class w extends ea.a {
    public static final Parcelable.Creator<w> CREATOR = new b0();

    /* renamed from: a, reason: collision with root package name */
    private final int f9667a;

    /* renamed from: b, reason: collision with root package name */
    private List f9668b;

    public w(int i10, List list) {
        this.f9667a = i10;
        this.f9668b = list;
    }

    public final int u1() {
        return this.f9667a;
    }

    public final List v1() {
        return this.f9668b;
    }

    public final void w1(p pVar) {
        if (this.f9668b == null) {
            this.f9668b = new ArrayList();
        }
        this.f9668b.add(pVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9667a);
        ea.c.K(parcel, 2, this.f9668b, false);
        ea.c.b(parcel, a10);
    }
}
