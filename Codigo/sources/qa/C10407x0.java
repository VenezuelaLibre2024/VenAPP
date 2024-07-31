package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: qa.x0 */
/* loaded from: classes.dex */
public final class C10407x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        byte[] bArr = null;
        Double d10 = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        C10346e0 c10346e0 = null;
        String str2 = null;
        C10341d c10341d = null;
        Long l10 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    bArr = C7139b.m21174g(parcel, m21155E);
                    break;
                case 3:
                    d10 = C7139b.m21152B(parcel, m21155E);
                    break;
                case 4:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 5:
                    arrayList = C7139b.m21188u(parcel, m21155E, C10400v.CREATOR);
                    break;
                case 6:
                    num = C7139b.m21158H(parcel, m21155E);
                    break;
                case 7:
                    c10346e0 = (C10346e0) C7139b.m21183p(parcel, m21155E, C10346e0.CREATOR);
                    break;
                case 8:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 9:
                    c10341d = (C10341d) C7139b.m21183p(parcel, m21155E, C10341d.CREATOR);
                    break;
                case 10:
                    l10 = C7139b.m21161K(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10406x(bArr, d10, str, arrayList, num, c10346e0, str2, c10341d, l10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10406x[i10];
    }
}
