package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.p0 */
/* loaded from: classes.dex */
public final class C10383p0 extends AbstractC7138a {
    public static final Parcelable.Creator<C10383p0> CREATOR = new C10386q0();

    /* renamed from: a */
    private final String f25898a;

    public C10383p0(String str) {
        this.f25898a = (String) C5276s.m13324j(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10383p0) {
            return this.f25898a.equals(((C10383p0) obj).f25898a);
        }
        return false;
    }

    public final int hashCode() {
        return C5270q.m13305c(this.f25898a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f25898a, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
