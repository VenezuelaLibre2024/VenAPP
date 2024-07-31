package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: qa.y */
/* loaded from: classes.dex */
public class C10409y extends AbstractC7138a {
    public static final Parcelable.Creator<C10409y> CREATOR = new C10410y0();

    /* renamed from: a */
    private final String f25938a;

    /* renamed from: b */
    private final String f25939b;

    /* renamed from: c */
    private final String f25940c;

    public C10409y(String str, String str2, String str3) {
        this.f25938a = (String) C5276s.m13324j(str);
        this.f25939b = (String) C5276s.m13324j(str2);
        this.f25940c = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10409y)) {
            return false;
        }
        C10409y c10409y = (C10409y) obj;
        return C5270q.m13304b(this.f25938a, c10409y.f25938a) && C5270q.m13304b(this.f25939b, c10409y.f25939b) && C5270q.m13304b(this.f25940c, c10409y.f25940c);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25938a, this.f25939b, this.f25940c);
    }

    /* renamed from: u1 */
    public String m31194u1() {
        return this.f25940c;
    }

    /* renamed from: v1 */
    public String m31195v1() {
        return this.f25938a;
    }

    /* renamed from: w1 */
    public String m31196w1() {
        return this.f25939b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, m31195v1(), false);
        C7140c.m21200G(parcel, 3, m31196w1(), false);
        C7140c.m21200G(parcel, 4, m31194u1(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
