package p440xa;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import p081ea.C7139b;
import p081ea.C7140c;

/* renamed from: xa.p */
/* loaded from: classes2.dex */
public final class C12409p implements Parcelable.Creator<C12395b> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m40066a(C12395b c12395b, Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, c12395b.m40059x1(), false);
        C7140c.m21198E(parcel, 3, c12395b.m40058w1(), i10, false);
        C7140c.m21198E(parcel, 4, c12395b.m40056u1(), i10, false);
        C7140c.m21234z(parcel, 5, c12395b.m40057v1());
        C7140c.m21220l(parcel, 6, c12395b.m40060y1(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C12395b createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j10 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w == 2) {
                str = C7139b.m21184q(parcel, m21155E);
            } else if (m21190w == 3) {
                dataHolder = (DataHolder) C7139b.m21183p(parcel, m21155E, DataHolder.CREATOR);
            } else if (m21190w == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) C7139b.m21183p(parcel, m21155E, ParcelFileDescriptor.CREATOR);
            } else if (m21190w == 5) {
                j10 = C7139b.m21160J(parcel, m21155E);
            } else if (m21190w != 6) {
                C7139b.m21164N(parcel, m21155E);
            } else {
                bArr = C7139b.m21174g(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C12395b(str, dataHolder, parcelFileDescriptor, j10, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C12395b[] newArray(int i10) {
        return new C12395b[i10];
    }
}
