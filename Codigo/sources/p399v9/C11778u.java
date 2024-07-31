package p399v9;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;
import p399v9.C11758b;

/* renamed from: v9.u */
/* loaded from: classes.dex */
public final class C11778u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        byte[] bArr = null;
        boolean z10 = false;
        String str = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                z10 = C7139b.m21191x(parcel, m21155E);
            } else if (m21190w == 2) {
                bArr = C7139b.m21174g(parcel, m21155E);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                str = C7139b.m21184q(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C11758b.d(z10, bArr, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11758b.d[i10];
    }
}
