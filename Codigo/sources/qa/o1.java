package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o1 extends ea.a {
    public static final Parcelable.Creator<o1> CREATOR = new p1();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f23854a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f23855b;

    public o1(byte[] bArr, byte[] bArr2) {
        this.f23854a = bArr;
        this.f23855b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Arrays.equals(this.f23854a, o1Var.f23854a) && Arrays.equals(this.f23855b, o1Var.f23855b);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f23854a, this.f23855b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.l(parcel, 1, this.f23854a, false);
        ea.c.l(parcel, 2, this.f23855b, false);
        ea.c.b(parcel, a10);
    }
}
