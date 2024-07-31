package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class f extends ea.a {
    public static final Parcelable.Creator<f> CREATOR = new n1();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23822a;

    public f(boolean z10) {
        this.f23822a = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f23822a == ((f) obj).f23822a;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Boolean.valueOf(this.f23822a));
    }

    public boolean u1() {
        return this.f23822a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, u1());
        ea.c.b(parcel, a10);
    }
}
