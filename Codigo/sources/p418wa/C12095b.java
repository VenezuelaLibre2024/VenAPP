package p418wa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: wa.b */
/* loaded from: classes2.dex */
public final class C12095b implements Parcelable.Creator<C12097c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C12097c createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            if (C7139b.m21190w(m21155E) != 1) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                bundle = C7139b.m21173f(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C12097c(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C12097c[] newArray(int i10) {
        return new C12097c[i10];
    }
}
