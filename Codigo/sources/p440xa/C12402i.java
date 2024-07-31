package p440xa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: xa.i */
/* loaded from: classes2.dex */
public final class C12402i implements Parcelable.Creator<C12394a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C12394a createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        int i10 = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 3) {
                bArr = C7139b.m21174g(parcel, m21155E);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                i10 = C7139b.m21157G(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C12394a(str, bArr, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C12394a[] newArray(int i10) {
        return new C12394a[i10];
    }
}
