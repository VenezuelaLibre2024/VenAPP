package qa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: qa.w0 */
/* loaded from: classes.dex */
public final class C10404w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        Integer num = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                num = C7139b.m21158H(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10403w(str, num.intValue());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10403w[i10];
    }
}