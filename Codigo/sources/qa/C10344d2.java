package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.d2 */
/* loaded from: classes.dex */
public final class C10344d2 extends AbstractC7138a {
    public static final Parcelable.Creator<C10344d2> CREATOR = new C10348e2();

    /* renamed from: a */
    private final boolean f25855a;

    public C10344d2(boolean z10) {
        this.f25855a = ((Boolean) C5276s.m13324j(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10344d2) && this.f25855a == ((C10344d2) obj).f25855a;
    }

    public final int hashCode() {
        return C5270q.m13305c(Boolean.valueOf(this.f25855a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 1, this.f25855a);
        C7140c.m21210b(parcel, m21209a);
    }
}
