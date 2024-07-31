package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class e0 extends ea.a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: a, reason: collision with root package name */
    private final int f9823a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9824b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9825c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9826d;

    public e0(int i10, int i11, int i12, int i13) {
        com.google.android.gms.common.internal.s.o(i10 >= 0 && i10 <= 23, "Start hour must be in range [0, 23].");
        com.google.android.gms.common.internal.s.o(i11 >= 0 && i11 <= 59, "Start minute must be in range [0, 59].");
        com.google.android.gms.common.internal.s.o(i12 >= 0 && i12 <= 23, "End hour must be in range [0, 23].");
        com.google.android.gms.common.internal.s.o(i13 >= 0 && i13 <= 59, "End minute must be in range [0, 59].");
        com.google.android.gms.common.internal.s.o(((i10 + i11) + i12) + i13 > 0, "Parameters can't be all 0.");
        this.f9823a = i10;
        this.f9824b = i11;
        this.f9825c = i12;
        this.f9826d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f9823a == e0Var.f9823a && this.f9824b == e0Var.f9824b && this.f9825c == e0Var.f9825c && this.f9826d == e0Var.f9826d;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.f9823a), Integer.valueOf(this.f9824b), Integer.valueOf(this.f9825c), Integer.valueOf(this.f9826d));
    }

    public final String toString() {
        return "UserPreferredSleepWindow [startHour=" + this.f9823a + ", startMinute=" + this.f9824b + ", endHour=" + this.f9825c + ", endMinute=" + this.f9826d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.common.internal.s.j(parcel);
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9823a);
        ea.c.u(parcel, 2, this.f9824b);
        ea.c.u(parcel, 3, this.f9825c);
        ea.c.u(parcel, 4, this.f9826d);
        ea.c.b(parcel, a10);
    }
}
