package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q1 extends ea.a {
    public static final Parcelable.Creator<q1> CREATOR = new r1();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23857a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f23858b;

    public q1(boolean z10, byte[] bArr) {
        this.f23857a = z10;
        this.f23858b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.f23857a == q1Var.f23857a && Arrays.equals(this.f23858b, q1Var.f23858b);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(Boolean.valueOf(this.f23857a), this.f23858b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, this.f23857a);
        ea.c.l(parcel, 2, this.f23858b, false);
        ea.c.b(parcel, a10);
    }
}
