package p440xa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: xa.h */
/* loaded from: classes2.dex */
public final class C12401h implements Parcelable.Creator<C12400g> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C12400g createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            if (C7139b.m21190w(m21155E) != 2) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                str = C7139b.m21184q(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C12400g(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C12400g[] newArray(int i10) {
        return new C12400g[i10];
    }
}