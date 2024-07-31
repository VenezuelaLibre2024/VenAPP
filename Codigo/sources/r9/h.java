package r9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        String str = null;
        Account account = null;
        int i11 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i10 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                i11 = ea.b.G(parcel, E);
            } else if (w10 == 3) {
                str = ea.b.q(parcel, E);
            } else if (w10 != 4) {
                ea.b.N(parcel, E);
            } else {
                account = (Account) ea.b.p(parcel, E, Account.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new b(i10, i11, str, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
