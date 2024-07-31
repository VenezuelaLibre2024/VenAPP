package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h2 extends ea.a {
    public static final Parcelable.Creator<h2> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23837a;

    public h2(boolean z10) {
        this.f23837a = ((Boolean) com.google.android.gms.common.internal.s.j(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h2) && this.f23837a == ((h2) obj).f23837a;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(Boolean.valueOf(this.f23837a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, this.f23837a);
        ea.c.b(parcel, a10);
    }
}
