package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.r */
/* loaded from: classes.dex */
public class C10388r extends AbstractC7138a {
    public static final Parcelable.Creator<C10388r> CREATOR = new C10356g2();

    /* renamed from: a */
    private final String f25901a;

    public C10388r(String str) {
        this.f25901a = (String) C5276s.m13324j(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10388r) {
            return this.f25901a.equals(((C10388r) obj).f25901a);
        }
        return false;
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25901a);
    }

    /* renamed from: u1 */
    public String m31164u1() {
        return this.f25901a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, m31164u1(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
