package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class f0 extends ea.a {
    public static final Parcelable.Creator<f0> CREATOR = new e1();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23823a;

    public f0(boolean z10) {
        this.f23823a = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f0) && this.f23823a == ((f0) obj).f23823a;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Boolean.valueOf(this.f23823a));
    }

    public boolean u1() {
        return this.f23823a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, u1());
        ea.c.b(parcel, a10);
    }
}
