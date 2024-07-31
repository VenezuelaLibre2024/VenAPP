package p440xa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: xa.k */
/* loaded from: classes2.dex */
public final class C12404k implements Parcelable.Creator<C12403j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C12403j createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        long j10 = 0;
        C12394a[] c12394aArr = null;
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                j10 = C7139b.m21160J(parcel, m21155E);
            } else if (m21190w == 3) {
                c12394aArr = (C12394a[]) C7139b.m21187t(parcel, m21155E, C12394a.CREATOR);
            } else if (m21190w == 4) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w != 5) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                z10 = C7139b.m21191x(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C12403j(j10, c12394aArr, i10, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C12403j[] newArray(int i10) {
        return new C12403j[i10];
    }
}
