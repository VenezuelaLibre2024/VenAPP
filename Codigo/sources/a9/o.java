package a9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        IBinder iBinder = null;
        boolean z10 = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 == 2) {
                iBinder = ea.b.F(parcel, E);
            } else if (w10 != 3) {
                ea.b.N(parcel, E);
            } else {
                iBinder2 = ea.b.F(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new g(z10, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
