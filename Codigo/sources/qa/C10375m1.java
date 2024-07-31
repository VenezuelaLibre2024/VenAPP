package qa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: qa.m1 */
/* loaded from: classes.dex */
public final class C10375m1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        C10388r c10388r = null;
        C10336b2 c10336b2 = null;
        C10350f0 c10350f0 = null;
        C10360h2 c10360h2 = null;
        C10368k0 c10368k0 = null;
        C10374m0 c10374m0 = null;
        C10344d2 c10344d2 = null;
        C10383p0 c10383p0 = null;
        C10391s c10391s = null;
        C10389r0 c10389r0 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    c10388r = (C10388r) C7139b.m21183p(parcel, m21155E, C10388r.CREATOR);
                    break;
                case 3:
                    c10336b2 = (C10336b2) C7139b.m21183p(parcel, m21155E, C10336b2.CREATOR);
                    break;
                case 4:
                    c10350f0 = (C10350f0) C7139b.m21183p(parcel, m21155E, C10350f0.CREATOR);
                    break;
                case 5:
                    c10360h2 = (C10360h2) C7139b.m21183p(parcel, m21155E, C10360h2.CREATOR);
                    break;
                case 6:
                    c10368k0 = (C10368k0) C7139b.m21183p(parcel, m21155E, C10368k0.CREATOR);
                    break;
                case 7:
                    c10374m0 = (C10374m0) C7139b.m21183p(parcel, m21155E, C10374m0.CREATOR);
                    break;
                case 8:
                    c10344d2 = (C10344d2) C7139b.m21183p(parcel, m21155E, C10344d2.CREATOR);
                    break;
                case 9:
                    c10383p0 = (C10383p0) C7139b.m21183p(parcel, m21155E, C10383p0.CREATOR);
                    break;
                case 10:
                    c10391s = (C10391s) C7139b.m21183p(parcel, m21155E, C10391s.CREATOR);
                    break;
                case 11:
                    c10389r0 = (C10389r0) C7139b.m21183p(parcel, m21155E, C10389r0.CREATOR);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10341d(c10388r, c10336b2, c10350f0, c10360h2, c10368k0, c10374m0, c10344d2, c10383p0, c10391s, c10389r0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10341d[i10];
    }
}
