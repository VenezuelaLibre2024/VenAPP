package p330r9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: r9.h */
/* loaded from: classes.dex */
public final class C10649h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        String str = null;
        Account account = null;
        int i11 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 1) {
                i10 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 2) {
                i11 = C7139b.m21157G(parcel, m21155E);
            } else if (m21190w == 3) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w != 4) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                account = (Account) C7139b.m21183p(parcel, m21155E, Account.CREATOR);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C10643b(i10, i11, str, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10643b[i10];
    }
}
