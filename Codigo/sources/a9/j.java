package a9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        IBinder iBinder = null;
        boolean z10 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 != 2) {
                ea.b.N(parcel, E);
            } else {
                iBinder = ea.b.F(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new a(z10, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
