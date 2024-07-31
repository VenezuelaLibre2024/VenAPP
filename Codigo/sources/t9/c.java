package t9;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        ArrayList arrayList = null;
        e eVar = null;
        int i11 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            int i12 = 1;
            if (w10 != 1) {
                i12 = 2;
                if (w10 != 2) {
                    i12 = 3;
                    if (w10 != 3) {
                        i12 = 4;
                        if (w10 != 4) {
                            ea.b.N(parcel, E);
                        } else {
                            eVar = (e) ea.b.p(parcel, E, e.CREATOR);
                        }
                    } else {
                        i10 = ea.b.G(parcel, E);
                    }
                } else {
                    arrayList = ea.b.u(parcel, E, g.CREATOR);
                }
            } else {
                i11 = ea.b.G(parcel, E);
            }
            hashSet.add(Integer.valueOf(i12));
        }
        if (parcel.dataPosition() == O) {
            return new b(hashSet, i11, arrayList, i10, eVar);
        }
        throw new b.a("Overread allowed size end=" + O, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
