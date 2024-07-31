package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import qa.C10379o;
import qa.EnumC10412z;

/* renamed from: qa.w */
/* loaded from: classes.dex */
public class C10403w extends AbstractC7138a {
    public static final Parcelable.Creator<C10403w> CREATOR = new C10404w0();

    /* renamed from: a */
    private final EnumC10412z f25927a;

    /* renamed from: b */
    private final C10379o f25928b;

    public C10403w(String str, int i10) {
        C5276s.m13324j(str);
        try {
            this.f25927a = EnumC10412z.m31197b(str);
            C5276s.m13324j(Integer.valueOf(i10));
            try {
                this.f25928b = C10379o.m31160a(i10);
            } catch (C10379o.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (EnumC10412z.a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10403w)) {
            return false;
        }
        C10403w c10403w = (C10403w) obj;
        return this.f25927a.equals(c10403w.f25927a) && this.f25928b.equals(c10403w.f25928b);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25927a, this.f25928b);
    }

    /* renamed from: u1 */
    public int m31185u1() {
        return this.f25928b.m31161b();
    }

    /* renamed from: v1 */
    public String m31186v1() {
        return this.f25927a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, m31186v1(), false);
        C7140c.m21232x(parcel, 3, Integer.valueOf(m31185u1()), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
