package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.s */
/* loaded from: classes.dex */
public class C10391s extends AbstractC7138a {
    public static final Parcelable.Creator<C10391s> CREATOR = new C10380o0();

    /* renamed from: a */
    private final boolean f25903a;

    public C10391s(boolean z10) {
        this.f25903a = z10;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10391s) && this.f25903a == ((C10391s) obj).m31165u1();
    }

    public int hashCode() {
        return C5270q.m13305c(Boolean.valueOf(this.f25903a));
    }

    /* renamed from: u1 */
    public boolean m31165u1() {
        return this.f25903a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21215g(parcel, 1, m31165u1());
        C7140c.m21210b(parcel, m21209a);
    }
}
