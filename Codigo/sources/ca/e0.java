package ca;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 1:
                    str = ea.b.q(parcel, E);
                    break;
                case 2:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 3:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 4:
                    iBinder = ea.b.F(parcel, E);
                    break;
                case 5:
                    z12 = ea.b.x(parcel, E);
                    break;
                case 6:
                    z13 = ea.b.x(parcel, E);
                    break;
                default:
                    ea.b.N(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new d0(str, z10, z11, iBinder, z12, z13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d0[i10];
    }
}
