package wa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class e implements Parcelable.Creator<com.google.android.gms.measurement.internal.d0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.measurement.internal.d0 createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        com.google.android.gms.measurement.internal.z zVar = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 3) {
                zVar = (com.google.android.gms.measurement.internal.z) ea.b.p(parcel, E, com.google.android.gms.measurement.internal.z.CREATOR);
            } else if (w10 == 4) {
                str2 = ea.b.q(parcel, E);
            } else if (w10 != 5) {
                ea.b.N(parcel, E);
            } else {
                j10 = ea.b.J(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new com.google.android.gms.measurement.internal.d0(str, zVar, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.measurement.internal.d0[] newArray(int i10) {
        return new com.google.android.gms.measurement.internal.d0[i10];
    }
}
