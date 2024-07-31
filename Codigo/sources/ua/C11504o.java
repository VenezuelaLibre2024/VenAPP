package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.o */
/* loaded from: classes2.dex */
public class C11504o extends AbstractC7138a {
    public static final Parcelable.Creator<C11504o> CREATOR = new C11517u0();

    /* renamed from: a */
    private final int f29861a;

    /* renamed from: b */
    private final Float f29862b;

    public C11504o(int i10, Float f10) {
        boolean z10 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        C5276s.m13316b(z10, "Invalid PatternItem: type=" + i10 + " length=" + f10);
        this.f29861a = i10;
        this.f29862b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11504o)) {
            return false;
        }
        C11504o c11504o = (C11504o) obj;
        return this.f29861a == c11504o.f29861a && C5270q.m13304b(this.f29862b, c11504o.f29862b);
    }

    public int hashCode() {
        return C5270q.m13305c(Integer.valueOf(this.f29861a), this.f29862b);
    }

    public String toString() {
        return "[PatternItem: type=" + this.f29861a + " length=" + this.f29862b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f29861a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 2, i11);
        C7140c.m21227s(parcel, 3, this.f29862b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
