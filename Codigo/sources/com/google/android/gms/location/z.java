package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes2.dex */
public final class z extends ea.a {
    public static final Parcelable.Creator<z> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final int f9886a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9887b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9888c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9889d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(int i10, int i11, long j10, long j11) {
        this.f9886a = i10;
        this.f9887b = i11;
        this.f9888c = j10;
        this.f9889d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f9886a == zVar.f9886a && this.f9887b == zVar.f9887b && this.f9888c == zVar.f9888c && this.f9889d == zVar.f9889d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.f9887b), Integer.valueOf(this.f9886a), Long.valueOf(this.f9889d), Long.valueOf(this.f9888c));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f9886a + " Cell status: " + this.f9887b + " elapsed time NS: " + this.f9889d + " system time ms: " + this.f9888c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9886a);
        ea.c.u(parcel, 2, this.f9887b);
        ea.c.z(parcel, 3, this.f9888c);
        ea.c.z(parcel, 4, this.f9889d);
        ea.c.b(parcel, a10);
    }
}
