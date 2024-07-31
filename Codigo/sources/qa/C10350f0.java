package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.f0 */
/* loaded from: classes.dex */
public class C10350f0 extends AbstractC7138a {
    public static final Parcelable.Creator<C10350f0> CREATOR = new C10347e1();

    /* renamed from: a */
    private final boolean f25865a;

    public C10350f0(boolean z10) {
        this.f25865a = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10350f0) && this.f25865a == ((C10350f0) obj).f25865a;
    }

    public int hashCode() {
        return C5270q.m13305c(Boolean.valueOf(this.f25865a));
    }

    /* renamed from: u1 */
    public boolean m31130u1() {
        return this.f25865a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 1, m31130u1());
        C7140c.m21210b(parcel, m21209a);
    }
}
