package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k0 extends ea.a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* renamed from: a, reason: collision with root package name */
    private final long f23845a;

    public k0(long j10) {
        this.f23845a = ((Long) com.google.android.gms.common.internal.s.j(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k0) && this.f23845a == ((k0) obj).f23845a;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(Long.valueOf(this.f23845a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.z(parcel, 1, this.f23845a);
        ea.c.b(parcel, a10);
    }
}
