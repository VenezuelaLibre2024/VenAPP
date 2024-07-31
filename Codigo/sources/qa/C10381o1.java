package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import java.util.Arrays;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.o1 */
/* loaded from: classes.dex */
public final class C10381o1 extends AbstractC7138a {
    public static final Parcelable.Creator<C10381o1> CREATOR = new C10384p1();

    /* renamed from: a */
    private final byte[] f25896a;

    /* renamed from: b */
    private final byte[] f25897b;

    public C10381o1(byte[] bArr, byte[] bArr2) {
        this.f25896a = bArr;
        this.f25897b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10381o1)) {
            return false;
        }
        C10381o1 c10381o1 = (C10381o1) obj;
        return Arrays.equals(this.f25896a, c10381o1.f25896a) && Arrays.equals(this.f25897b, c10381o1.f25897b);
    }

    public final int hashCode() {
        return C5270q.m13305c(this.f25896a, this.f25897b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21220l(parcel, 1, this.f25896a, false);
        C7140c.m21220l(parcel, 2, this.f25897b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
