package qa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class h0 extends ea.a {
    public static final Parcelable.Creator<h0> CREATOR = new k1();

    /* renamed from: a, reason: collision with root package name */
    private final int f23834a;

    /* renamed from: b, reason: collision with root package name */
    private final short f23835b;

    /* renamed from: c, reason: collision with root package name */
    private final short f23836c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(int i10, short s10, short s11) {
        this.f23834a = i10;
        this.f23835b = s10;
        this.f23836c = s11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f23834a == h0Var.f23834a && this.f23835b == h0Var.f23835b && this.f23836c == h0Var.f23836c;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.f23834a), Short.valueOf(this.f23835b), Short.valueOf(this.f23836c));
    }

    public short u1() {
        return this.f23835b;
    }

    public short v1() {
        return this.f23836c;
    }

    public int w1() {
        return this.f23834a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, w1());
        ea.c.F(parcel, 2, u1());
        ea.c.F(parcel, 3, v1());
        ea.c.b(parcel, a10);
    }
}
