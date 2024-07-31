package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.k0 */
/* loaded from: classes.dex */
public final class C10368k0 extends AbstractC7138a {
    public static final Parcelable.Creator<C10368k0> CREATOR = new C10371l0();

    /* renamed from: a */
    private final long f25887a;

    public C10368k0(long j10) {
        this.f25887a = ((Long) C5276s.m13324j(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10368k0) && this.f25887a == ((C10368k0) obj).f25887a;
    }

    public final int hashCode() {
        return C5270q.m13305c(Long.valueOf(this.f25887a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21234z(parcel, 1, this.f25887a);
        C7140c.m21210b(parcel, m21209a);
    }
}
