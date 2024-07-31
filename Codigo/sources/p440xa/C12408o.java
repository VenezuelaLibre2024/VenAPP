package p440xa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: xa.o */
/* loaded from: classes2.dex */
public final class C12408o implements Parcelable.Creator<C12407n> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C12407n createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w != 3) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                z10 = C7139b.m21191x(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C12407n(i10, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C12407n[] newArray(int i10) {
        return new C12407n[i10];
    }
}
