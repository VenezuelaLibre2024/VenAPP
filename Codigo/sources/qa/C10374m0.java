package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.m0 */
/* loaded from: classes.dex */
public final class C10374m0 extends AbstractC7138a {
    public static final Parcelable.Creator<C10374m0> CREATOR = new C10377n0();

    /* renamed from: a */
    private final boolean f25894a;

    public C10374m0(boolean z10) {
        this.f25894a = ((Boolean) C5276s.m13324j(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10374m0) && this.f25894a == ((C10374m0) obj).f25894a;
    }

    public final int hashCode() {
        return C5270q.m13305c(Boolean.valueOf(this.f25894a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 1, this.f25894a);
        C7140c.m21210b(parcel, m21209a);
    }
}
