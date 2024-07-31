package p364t9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import p081ea.C7139b;

/* renamed from: t9.j */
/* loaded from: classes.dex */
public final class C11191j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i10;
        int m21165O = C7139b.m21165O(parcel);
        HashSet hashSet = new HashSet();
        int i11 = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        C11182a c11182a = null;
        int i12 = 0;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 1:
                    i12 = C7139b.m21157G(parcel, m21155E);
                    i10 = 1;
                    break;
                case 2:
                    str = C7139b.m21184q(parcel, m21155E);
                    i10 = 2;
                    break;
                case 3:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    i10 = 3;
                    break;
                case 4:
                    bArr = C7139b.m21174g(parcel, m21155E);
                    i10 = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) C7139b.m21183p(parcel, m21155E, PendingIntent.CREATOR);
                    i10 = 5;
                    break;
                case 6:
                    c11182a = (C11182a) C7139b.m21183p(parcel, m21155E, C11182a.CREATOR);
                    i10 = 6;
                    break;
                default:
                    C7139b.m21164N(parcel, m21155E);
                    continue;
            }
            hashSet.add(Integer.valueOf(i10));
        }
        if (parcel.dataPosition() == m21165O) {
            return new C11190i(hashSet, i12, str, i11, bArr, pendingIntent, c11182a);
        }
        throw new C7139b.a("Overread allowed size end=" + m21165O, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11190i[i10];
    }
}
