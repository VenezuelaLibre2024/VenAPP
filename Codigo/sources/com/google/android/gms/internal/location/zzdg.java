package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import ea.b;

/* loaded from: classes2.dex */
public final class zzdg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        int i10 = 1;
        zzdd zzddVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 1:
                    i10 = b.G(parcel, E);
                    break;
                case 2:
                    zzddVar = (zzdd) b.p(parcel, E, zzdd.CREATOR);
                    break;
                case 3:
                    iBinder = b.F(parcel, E);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.p(parcel, E, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = b.F(parcel, E);
                    break;
                case 6:
                    iBinder3 = b.F(parcel, E);
                    break;
                case 7:
                default:
                    b.N(parcel, E);
                    break;
                case 8:
                    str = b.q(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new zzdf(i10, zzddVar, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdf[i10];
    }
}
