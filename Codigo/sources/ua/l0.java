package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = true;
        boolean z11 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                iBinder = ea.b.F(parcel, E);
            } else if (w10 == 3) {
                z11 = ea.b.x(parcel, E);
            } else if (w10 == 4) {
                f10 = ea.b.C(parcel, E);
            } else if (w10 == 5) {
                z10 = ea.b.x(parcel, E);
            } else if (w10 != 6) {
                ea.b.N(parcel, E);
            } else {
                f11 = ea.b.C(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new c0(iBinder, z11, f10, z10, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c0[i10];
    }
}
