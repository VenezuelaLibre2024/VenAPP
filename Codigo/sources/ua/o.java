package ua;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class o extends ea.a {
    public static final Parcelable.Creator<o> CREATOR = new u0();

    /* renamed from: a, reason: collision with root package name */
    private final int f27541a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f27542b;

    public o(int i10, Float f10) {
        boolean z10 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        com.google.android.gms.common.internal.s.b(z10, "Invalid PatternItem: type=" + i10 + " length=" + f10);
        this.f27541a = i10;
        this.f27542b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f27541a == oVar.f27541a && com.google.android.gms.common.internal.q.b(this.f27542b, oVar.f27542b);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.f27541a), this.f27542b);
    }

    public String toString() {
        return "[PatternItem: type=" + this.f27541a + " length=" + this.f27542b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f27541a;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 2, i11);
        ea.c.s(parcel, 3, this.f27542b, false);
        ea.c.b(parcel, a10);
    }
}
