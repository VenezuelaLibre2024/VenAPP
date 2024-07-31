package qa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p081ea.C7139b;

/* renamed from: qa.t0 */
/* loaded from: classes.dex */
public final class C10395t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        C10409y c10409y = null;
        C10330a0 c10330a0 = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d10 = null;
        ArrayList arrayList2 = null;
        C10367k c10367k = null;
        Integer num = null;
        C10346e0 c10346e0 = null;
        String str = null;
        C10341d c10341d = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    c10409y = (C10409y) C7139b.m21183p(parcel, m21155E, C10409y.CREATOR);
                    break;
                case 3:
                    c10330a0 = (C10330a0) C7139b.m21183p(parcel, m21155E, C10330a0.CREATOR);
                    break;
                case 4:
                    bArr = C7139b.m21174g(parcel, m21155E);
                    break;
                case 5:
                    arrayList = C7139b.m21188u(parcel, m21155E, C10403w.CREATOR);
                    break;
                case 6:
                    d10 = C7139b.m21152B(parcel, m21155E);
                    break;
                case 7:
                    arrayList2 = C7139b.m21188u(parcel, m21155E, C10400v.CREATOR);
                    break;
                case 8:
                    c10367k = (C10367k) C7139b.m21183p(parcel, m21155E, C10367k.CREATOR);
                    break;
                case 9:
                    num = C7139b.m21158H(parcel, m21155E);
                    break;
                case 10:
                    c10346e0 = (C10346e0) C7139b.m21183p(parcel, m21155E, C10346e0.CREATOR);
                    break;
                case 11:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 12:
                    c10341d = (C10341d) C7139b.m21183p(parcel, m21155E, C10341d.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10397u(c10409y, c10330a0, bArr, arrayList, d10, arrayList2, c10367k, num, c10346e0, str, c10341d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10397u[i10];
    }
}
