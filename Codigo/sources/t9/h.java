package t9;

import android.os.Parcel;
import android.os.Parcelable;
import ea.b;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        HashSet hashSet = new HashSet();
        i iVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            int i11 = 1;
            if (w10 != 1) {
                i11 = 2;
                if (w10 != 2) {
                    i11 = 3;
                    if (w10 != 3) {
                        i11 = 4;
                        if (w10 != 4) {
                            i11 = 5;
                            if (w10 != 5) {
                                ea.b.N(parcel, E);
                            } else {
                                str3 = ea.b.q(parcel, E);
                            }
                        } else {
                            str2 = ea.b.q(parcel, E);
                        }
                    } else {
                        str = ea.b.q(parcel, E);
                    }
                } else {
                    iVar = (i) ea.b.p(parcel, E, i.CREATOR);
                }
            } else {
                i10 = ea.b.G(parcel, E);
            }
            hashSet.add(Integer.valueOf(i11));
        }
        if (parcel.dataPosition() == O) {
            return new g(hashSet, i10, iVar, str, str2, str3);
        }
        throw new b.a("Overread allowed size end=" + O, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
