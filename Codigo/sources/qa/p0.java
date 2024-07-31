package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p0 extends ea.a {
    public static final Parcelable.Creator<p0> CREATOR = new q0();

    /* renamed from: a, reason: collision with root package name */
    private final String f23856a;

    public p0(String str) {
        this.f23856a = (String) com.google.android.gms.common.internal.s.j(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.f23856a.equals(((p0) obj).f23856a);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23856a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f23856a, false);
        ea.c.b(parcel, a10);
    }
}
