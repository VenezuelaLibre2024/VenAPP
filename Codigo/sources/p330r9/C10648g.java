package p330r9;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: r9.g */
/* loaded from: classes.dex */
public final class C10648g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        long j10 = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 2:
                    j10 = C7139b.m21160J(parcel, m21155E);
                    break;
                case 3:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 4:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 5:
                    i12 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 6:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10642a(i10, j10, str, i11, i12, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10642a[i10];
    }
}
