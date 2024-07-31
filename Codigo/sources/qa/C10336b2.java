package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.util.HashSet;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.b2 */
/* loaded from: classes.dex */
public final class C10336b2 extends AbstractC7138a {
    public static final Parcelable.Creator<C10336b2> CREATOR = new C10340c2();

    /* renamed from: a */
    private final List f25844a;

    public C10336b2(List list) {
        this.f25844a = (List) C5276s.m13324j(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10336b2)) {
            return false;
        }
        C10336b2 c10336b2 = (C10336b2) obj;
        return this.f25844a.containsAll(c10336b2.f25844a) && c10336b2.f25844a.containsAll(this.f25844a);
    }

    public final int hashCode() {
        return C5270q.m13305c(new HashSet(this.f25844a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21204K(parcel, 1, this.f25844a, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
