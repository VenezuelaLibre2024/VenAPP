package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class s extends ea.a {
    public static final Parcelable.Creator<s> CREATOR = new o0();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23861a;

    public s(boolean z10) {
        this.f23861a = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && this.f23861a == ((s) obj).u1();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Boolean.valueOf(this.f23861a));
    }

    public boolean u1() {
        return this.f23861a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, u1());
        ea.c.b(parcel, a10);
    }
}
