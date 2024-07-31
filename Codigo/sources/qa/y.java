package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class y extends ea.a {
    public static final Parcelable.Creator<y> CREATOR = new y0();

    /* renamed from: a, reason: collision with root package name */
    private final String f23896a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23897b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23898c;

    public y(String str, String str2, String str3) {
        this.f23896a = (String) com.google.android.gms.common.internal.s.j(str);
        this.f23897b = (String) com.google.android.gms.common.internal.s.j(str2);
        this.f23898c = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return com.google.android.gms.common.internal.q.b(this.f23896a, yVar.f23896a) && com.google.android.gms.common.internal.q.b(this.f23897b, yVar.f23897b) && com.google.android.gms.common.internal.q.b(this.f23898c, yVar.f23898c);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23896a, this.f23897b, this.f23898c);
    }

    public String u1() {
        return this.f23898c;
    }

    public String v1() {
        return this.f23896a;
    }

    public String w1() {
        return this.f23897b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, v1(), false);
        ea.c.G(parcel, 3, w1(), false);
        ea.c.G(parcel, 4, u1(), false);
        ea.c.b(parcel, a10);
    }
}
