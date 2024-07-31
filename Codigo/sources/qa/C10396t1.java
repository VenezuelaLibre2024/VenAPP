package qa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: qa.t1 */
/* loaded from: classes.dex */
public final class C10396t1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String[] strArr = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                bArr = C7139b.m21174g(parcel, m21155E);
            } else if (m21190w == 3) {
                bArr2 = C7139b.m21174g(parcel, m21155E);
            } else if (m21190w == 4) {
                bArr3 = C7139b.m21174g(parcel, m21155E);
            } else if (m21190w != 5) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                strArr = C7139b.m21185r(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10357h(bArr, bArr2, bArr3, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10357h[i10];
    }
}
