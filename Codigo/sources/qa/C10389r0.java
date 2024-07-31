package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.util.Arrays;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.r0 */
/* loaded from: classes.dex */
public final class C10389r0 extends AbstractC7138a {
    public static final Parcelable.Creator<C10389r0> CREATOR = new C10392s0();

    /* renamed from: a */
    private final byte[][] f25902a;

    public C10389r0(byte[][] bArr) {
        C5276s.m13315a(bArr != null);
        C5276s.m13315a(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            C5276s.m13315a(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            C5276s.m13315a(bArr[i11] != null);
            int length = bArr[i11].length;
            C5276s.m13315a(length == 32 || length == 64);
            i10 += 2;
        }
        this.f25902a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10389r0) {
            return Arrays.deepEquals(this.f25902a, ((C10389r0) obj).f25902a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        for (byte[] bArr : this.f25902a) {
            i10 ^= C5270q.m13305c(bArr);
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21221m(parcel, 1, this.f25902a, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
