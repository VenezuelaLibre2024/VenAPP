package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r0 extends ea.a {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* renamed from: a, reason: collision with root package name */
    private final byte[][] f23860a;

    public r0(byte[][] bArr) {
        com.google.android.gms.common.internal.s.a(bArr != null);
        com.google.android.gms.common.internal.s.a(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            com.google.android.gms.common.internal.s.a(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            com.google.android.gms.common.internal.s.a(bArr[i11] != null);
            int length = bArr[i11].length;
            com.google.android.gms.common.internal.s.a(length == 32 || length == 64);
            i10 += 2;
        }
        this.f23860a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            return Arrays.deepEquals(this.f23860a, ((r0) obj).f23860a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        for (byte[] bArr : this.f23860a) {
            i10 ^= com.google.android.gms.common.internal.q.c(bArr);
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.m(parcel, 1, this.f23860a, false);
        ea.c.b(parcel, a10);
    }
}
