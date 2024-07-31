package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import java.util.Arrays;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.q1 */
/* loaded from: classes.dex */
public final class C10387q1 extends AbstractC7138a {
    public static final Parcelable.Creator<C10387q1> CREATOR = new C10390r1();

    /* renamed from: a */
    private final boolean f25899a;

    /* renamed from: b */
    private final byte[] f25900b;

    public C10387q1(boolean z10, byte[] bArr) {
        this.f25899a = z10;
        this.f25900b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10387q1)) {
            return false;
        }
        C10387q1 c10387q1 = (C10387q1) obj;
        return this.f25899a == c10387q1.f25899a && Arrays.equals(this.f25900b, c10387q1.f25900b);
    }

    public final int hashCode() {
        return C5270q.m13305c(Boolean.valueOf(this.f25899a), this.f25900b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 1, this.f25899a);
        C7140c.m21220l(parcel, 2, this.f25900b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
