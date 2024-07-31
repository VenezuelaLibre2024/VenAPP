package oc;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b2 implements Parcelable.Creator<y1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y1 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    str = ea.b.q(parcel, E);
                    break;
                case 2:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 3:
                    str5 = ea.b.q(parcel, E);
                    break;
                case 4:
                    str4 = ea.b.q(parcel, E);
                    break;
                case 5:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 6:
                    str6 = ea.b.q(parcel, E);
                    break;
                case 7:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 8:
                    str7 = ea.b.q(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new y1(str, str2, str3, str4, str5, str6, z10, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y1[] newArray(int i10) {
        return new y1[i10];
    }
}
