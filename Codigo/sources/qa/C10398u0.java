package qa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: qa.u0 */
/* loaded from: classes.dex */
public final class C10398u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        C10357h c10357h = null;
        C10353g c10353g = null;
        C10361i c10361i = null;
        C10345e c10345e = null;
        String str3 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 2:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 3:
                    bArr = C7139b.m21174g(parcel, m21155E);
                    break;
                case 4:
                    c10357h = (C10357h) C7139b.m21183p(parcel, m21155E, C10357h.CREATOR);
                    break;
                case 5:
                    c10353g = (C10353g) C7139b.m21183p(parcel, m21155E, C10353g.CREATOR);
                    break;
                case 6:
                    c10361i = (C10361i) C7139b.m21183p(parcel, m21155E, C10361i.CREATOR);
                    break;
                case 7:
                    c10345e = (C10345e) C7139b.m21183p(parcel, m21155E, C10345e.CREATOR);
                    break;
                case 8:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10394t(str, str2, bArr, c10357h, c10353g, c10361i, c10345e, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10394t[i10];
    }
}
