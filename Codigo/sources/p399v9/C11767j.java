package p399v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: v9.j */
/* loaded from: classes.dex */
public class C11767j extends AbstractC7138a {
    public static final Parcelable.Creator<C11767j> CREATOR = new C11759b0();

    /* renamed from: a */
    private final String f31166a;

    /* renamed from: b */
    private final String f31167b;

    public C11767j(String str, String str2) {
        this.f31166a = C5276s.m13321g(((String) C5276s.m13325k(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f31167b = C5276s.m13320f(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11767j)) {
            return false;
        }
        C11767j c11767j = (C11767j) obj;
        return C5270q.m13304b(this.f31166a, c11767j.f31166a) && C5270q.m13304b(this.f31167b, c11767j.f31167b);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f31166a, this.f31167b);
    }

    /* renamed from: u1 */
    public String m37244u1() {
        return this.f31166a;
    }

    /* renamed from: v1 */
    public String m37245v1() {
        return this.f31167b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, m37244u1(), false);
        C7140c.m21200G(parcel, 2, m37245v1(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
