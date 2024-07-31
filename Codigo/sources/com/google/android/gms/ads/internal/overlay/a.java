package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcei;
import ea.b;
import g9.j;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = b.O(parcel);
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        j jVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzcei zzceiVar = null;
        String str4 = null;
        com.google.android.gms.ads.internal.j jVar2 = null;
        IBinder iBinder6 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        while (parcel.dataPosition() < O) {
            int E = b.E(parcel);
            switch (b.w(E)) {
                case 2:
                    jVar = (j) b.p(parcel, E, j.CREATOR);
                    break;
                case 3:
                    iBinder = b.F(parcel, E);
                    break;
                case 4:
                    iBinder2 = b.F(parcel, E);
                    break;
                case 5:
                    iBinder3 = b.F(parcel, E);
                    break;
                case 6:
                    iBinder4 = b.F(parcel, E);
                    break;
                case 7:
                    str = b.q(parcel, E);
                    break;
                case 8:
                    z10 = b.x(parcel, E);
                    break;
                case 9:
                    str2 = b.q(parcel, E);
                    break;
                case 10:
                    iBinder5 = b.F(parcel, E);
                    break;
                case 11:
                    i10 = b.G(parcel, E);
                    break;
                case 12:
                    i11 = b.G(parcel, E);
                    break;
                case 13:
                    str3 = b.q(parcel, E);
                    break;
                case 14:
                    zzceiVar = (zzcei) b.p(parcel, E, zzcei.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    b.N(parcel, E);
                    break;
                case 16:
                    str4 = b.q(parcel, E);
                    break;
                case 17:
                    jVar2 = (com.google.android.gms.ads.internal.j) b.p(parcel, E, com.google.android.gms.ads.internal.j.CREATOR);
                    break;
                case 18:
                    iBinder6 = b.F(parcel, E);
                    break;
                case 19:
                    str5 = b.q(parcel, E);
                    break;
                case 24:
                    str6 = b.q(parcel, E);
                    break;
                case 25:
                    str7 = b.q(parcel, E);
                    break;
                case 26:
                    iBinder7 = b.F(parcel, E);
                    break;
                case 27:
                    iBinder8 = b.F(parcel, E);
                    break;
                case 28:
                    iBinder9 = b.F(parcel, E);
                    break;
                case 29:
                    z11 = b.x(parcel, E);
                    break;
            }
        }
        b.v(parcel, O);
        return new AdOverlayInfoParcel(jVar, iBinder, iBinder2, iBinder3, iBinder4, str, z10, str2, iBinder5, i10, i11, str3, zzceiVar, str4, jVar2, iBinder6, str5, str6, str7, iBinder7, iBinder8, iBinder9, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
