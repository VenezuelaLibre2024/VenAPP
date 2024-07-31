package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class r extends ea.a {
    public static final Parcelable.Creator<r> CREATOR = new g2();

    /* renamed from: a, reason: collision with root package name */
    private final String f23859a;

    public r(String str) {
        this.f23859a = (String) com.google.android.gms.common.internal.s.j(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f23859a.equals(((r) obj).f23859a);
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23859a);
    }

    public String u1() {
        return this.f23859a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, u1(), false);
        ea.c.b(parcel, a10);
    }
}
