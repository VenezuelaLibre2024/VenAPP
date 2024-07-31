package qa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import qa.EnumC10333b;
import qa.EnumC10342d0;

/* renamed from: qa.k */
/* loaded from: classes.dex */
public class C10367k extends AbstractC7138a {
    public static final Parcelable.Creator<C10367k> CREATOR = new C10402v1();

    /* renamed from: a */
    private final EnumC10333b f25883a;

    /* renamed from: b */
    private final Boolean f25884b;

    /* renamed from: c */
    private final EnumC10359h1 f25885c;

    /* renamed from: d */
    private final EnumC10342d0 f25886d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10367k(String str, Boolean bool, String str2, String str3) {
        EnumC10333b m31119b;
        EnumC10342d0 enumC10342d0 = null;
        if (str == null) {
            m31119b = null;
        } else {
            try {
                m31119b = EnumC10333b.m31119b(str);
            } catch (EnumC10333b.a | EnumC10342d0.a | C10355g1 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f25883a = m31119b;
        this.f25884b = bool;
        this.f25885c = str2 == null ? null : EnumC10359h1.m31144b(str2);
        if (str3 != null) {
            enumC10342d0 = EnumC10342d0.m31123b(str3);
        }
        this.f25886d = enumC10342d0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10367k)) {
            return false;
        }
        C10367k c10367k = (C10367k) obj;
        return C5270q.m13304b(this.f25883a, c10367k.f25883a) && C5270q.m13304b(this.f25884b, c10367k.f25884b) && C5270q.m13304b(this.f25885c, c10367k.f25885c) && C5270q.m13304b(this.f25886d, c10367k.f25886d);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f25883a, this.f25884b, this.f25885c, this.f25886d);
    }

    /* renamed from: u1 */
    public String m31147u1() {
        EnumC10333b enumC10333b = this.f25883a;
        if (enumC10333b == null) {
            return null;
        }
        return enumC10333b.toString();
    }

    /* renamed from: v1 */
    public Boolean m31148v1() {
        return this.f25884b;
    }

    /* renamed from: w1 */
    public String m31149w1() {
        EnumC10342d0 enumC10342d0 = this.f25886d;
        if (enumC10342d0 == null) {
            return null;
        }
        return enumC10342d0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, m31147u1(), false);
        C7140c.m21217i(parcel, 3, m31148v1(), false);
        EnumC10359h1 enumC10359h1 = this.f25885c;
        C7140c.m21200G(parcel, 4, enumC10359h1 == null ? null : enumC10359h1.toString(), false);
        C7140c.m21200G(parcel, 5, m31149w1(), false);
        C7140c.m21210b(parcel, m21209a);
    }
}
