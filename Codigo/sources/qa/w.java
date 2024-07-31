package qa;

import android.os.Parcel;
import android.os.Parcelable;
import qa.o;
import qa.z;

/* loaded from: classes.dex */
public class w extends ea.a {
    public static final Parcelable.Creator<w> CREATOR = new w0();

    /* renamed from: a, reason: collision with root package name */
    private final z f23885a;

    /* renamed from: b, reason: collision with root package name */
    private final o f23886b;

    public w(String str, int i10) {
        com.google.android.gms.common.internal.s.j(str);
        try {
            this.f23885a = z.b(str);
            com.google.android.gms.common.internal.s.j(Integer.valueOf(i10));
            try {
                this.f23886b = o.a(i10);
            } catch (o.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (z.a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f23885a.equals(wVar.f23885a) && this.f23886b.equals(wVar.f23886b);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23885a, this.f23886b);
    }

    public int u1() {
        return this.f23886b.b();
    }

    public String v1() {
        return this.f23885a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, v1(), false);
        ea.c.x(parcel, 3, Integer.valueOf(u1()), false);
        ea.c.b(parcel, a10);
    }
}
