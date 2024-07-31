package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.f */
/* loaded from: classes.dex */
public class C10349f extends AbstractC7138a {
    public static final Parcelable.Creator<C10349f> CREATOR = new C10378n1();

    /* renamed from: a */
    private final boolean f25864a;

    public C10349f(boolean z10) {
        this.f25864a = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10349f) && this.f25864a == ((C10349f) obj).f25864a;
    }

    public int hashCode() {
        return C5270q.m13305c(Boolean.valueOf(this.f25864a));
    }

    /* renamed from: u1 */
    public boolean m31129u1() {
        return this.f25864a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 1, m31129u1());
        C7140c.m21210b(parcel, m21209a);
    }
}
