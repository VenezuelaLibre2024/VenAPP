package t9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ea.b;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i10;
        int O = ea.b.O(parcel);
        HashSet hashSet = new HashSet();
        int i11 = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        int i12 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    i12 = ea.b.G(parcel, E);
                    i10 = 1;
                    break;
                case 2:
                    str = ea.b.q(parcel, E);
                    i10 = 2;
                    break;
                case 3:
                    i11 = ea.b.G(parcel, E);
                    i10 = 3;
                    break;
                case 4:
                    bArr = ea.b.g(parcel, E);
                    i10 = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) ea.b.p(parcel, E, PendingIntent.CREATOR);
                    i10 = 5;
                    break;
                case 6:
                    aVar = (a) ea.b.p(parcel, E, a.CREATOR);
                    i10 = 6;
                    break;
                default:
                    ea.b.N(parcel, E);
                    continue;
            }
            hashSet.add(Integer.valueOf(i10));
        }
        if (parcel.dataPosition() == O) {
            return new i(hashSet, i12, str, i11, bArr, pendingIntent, aVar);
        }
        throw new b.a("Overread allowed size end=" + O, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
