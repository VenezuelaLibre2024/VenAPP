package v9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            if (ea.b.w(E) != 1) {
                ea.b.N(parcel, E);
            } else {
                pendingIntent = (PendingIntent) ea.b.p(parcel, E, PendingIntent.CREATOR);
            }
        }
        ea.b.v(parcel, O);
        return new f(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
