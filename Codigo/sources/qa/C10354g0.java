package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import java.util.HashSet;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.g0 */
/* loaded from: classes.dex */
public class C10354g0 extends AbstractC7138a {
    public static final Parcelable.Creator<C10354g0> CREATOR = new C10363i1();

    /* renamed from: a */
    private final List f25871a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10354g0(List list) {
        this.f25871a = list;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C10354g0)) {
            return false;
        }
        C10354g0 c10354g0 = (C10354g0) obj;
        List list2 = this.f25871a;
        return (list2 == null && c10354g0.f25871a == null) || (list2 != null && (list = c10354g0.f25871a) != null && list2.containsAll(list) && c10354g0.f25871a.containsAll(this.f25871a));
    }

    public int hashCode() {
        return C5270q.m13305c(new HashSet(this.f25871a));
    }

    /* renamed from: u1 */
    public List<C10358h0> m31136u1() {
        return this.f25871a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21204K(parcel, 1, m31136u1(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
