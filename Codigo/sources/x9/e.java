package x9;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 1) {
                i11 = ea.b.G(parcel, E);
            } else if (w10 == 2) {
                pendingIntent = (PendingIntent) ea.b.p(parcel, E, PendingIntent.CREATOR);
            } else if (w10 == 3) {
                i12 = ea.b.G(parcel, E);
            } else if (w10 == 4) {
                bundle = ea.b.f(parcel, E);
            } else if (w10 == 5) {
                bArr = ea.b.g(parcel, E);
            } else if (w10 != 1000) {
                ea.b.N(parcel, E);
            } else {
                i10 = ea.b.G(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new c(i10, i11, pendingIntent, i12, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
