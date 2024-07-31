package qa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: qa.a1 */
/* loaded from: classes.dex */
public final class C10331a1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                bArr = C7139b.m21174g(parcel, m21155E);
            } else if (m21190w == 3) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 4) {
                str2 = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 5) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                str3 = C7139b.m21184q(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10330a0(bArr, str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10330a0[i10];
    }
}
