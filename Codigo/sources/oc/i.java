package oc;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                j10 = ea.b.J(parcel, E);
            } else if (w10 != 2) {
                ea.b.N(parcel, E);
            } else {
                j11 = ea.b.J(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new f(j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i10) {
        return new f[i10];
    }
}
