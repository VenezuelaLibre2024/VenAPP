package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m0 extends ea.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23852a;

    public m0(boolean z10) {
        this.f23852a = ((Boolean) com.google.android.gms.common.internal.s.j(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m0) && this.f23852a == ((m0) obj).f23852a;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(Boolean.valueOf(this.f23852a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, this.f23852a);
        ea.c.b(parcel, a10);
    }
}
