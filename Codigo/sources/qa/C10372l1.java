package qa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: qa.l1 */
/* loaded from: classes.dex */
public final class C10372l1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        C10354g0 c10354g0 = null;
        C10381o1 c10381o1 = null;
        C10349f c10349f = null;
        C10387q1 c10387q1 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                c10354g0 = (C10354g0) C7139b.m21183p(parcel, m21155E, C10354g0.CREATOR);
            } else if (m21190w == 2) {
                c10381o1 = (C10381o1) C7139b.m21183p(parcel, m21155E, C10381o1.CREATOR);
            } else if (m21190w == 3) {
                c10349f = (C10349f) C7139b.m21183p(parcel, m21155E, C10349f.CREATOR);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                c10387q1 = (C10387q1) C7139b.m21183p(parcel, m21155E, C10387q1.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10345e(c10354g0, c10381o1, c10349f, c10387q1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10345e[i10];
    }
}
