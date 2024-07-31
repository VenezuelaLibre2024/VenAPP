package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class mb implements Parcelable.Creator<lb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lb createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 0;
        long j17 = -2147483648L;
        String str10 = "";
        String str11 = str10;
        String str12 = str11;
        int i12 = 100;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            switch (ea.b.w(E)) {
                case 2:
                    str = ea.b.q(parcel, E);
                    break;
                case 3:
                    str2 = ea.b.q(parcel, E);
                    break;
                case 4:
                    str3 = ea.b.q(parcel, E);
                    break;
                case 5:
                    str4 = ea.b.q(parcel, E);
                    break;
                case 6:
                    j10 = ea.b.J(parcel, E);
                    break;
                case 7:
                    j11 = ea.b.J(parcel, E);
                    break;
                case 8:
                    str5 = ea.b.q(parcel, E);
                    break;
                case 9:
                    z10 = ea.b.x(parcel, E);
                    break;
                case 10:
                    z12 = ea.b.x(parcel, E);
                    break;
                case 11:
                    j17 = ea.b.J(parcel, E);
                    break;
                case 12:
                    str6 = ea.b.q(parcel, E);
                    break;
                case 13:
                    j12 = ea.b.J(parcel, E);
                    break;
                case 14:
                    j13 = ea.b.J(parcel, E);
                    break;
                case 15:
                    i10 = ea.b.G(parcel, E);
                    break;
                case 16:
                    z11 = ea.b.x(parcel, E);
                    break;
                case 17:
                case 20:
                case 33:
                default:
                    ea.b.N(parcel, E);
                    break;
                case 18:
                    z13 = ea.b.x(parcel, E);
                    break;
                case 19:
                    str7 = ea.b.q(parcel, E);
                    break;
                case 21:
                    bool = ea.b.y(parcel, E);
                    break;
                case 22:
                    j14 = ea.b.J(parcel, E);
                    break;
                case 23:
                    arrayList = ea.b.s(parcel, E);
                    break;
                case 24:
                    str8 = ea.b.q(parcel, E);
                    break;
                case 25:
                    str10 = ea.b.q(parcel, E);
                    break;
                case 26:
                    str11 = ea.b.q(parcel, E);
                    break;
                case 27:
                    str9 = ea.b.q(parcel, E);
                    break;
                case 28:
                    z14 = ea.b.x(parcel, E);
                    break;
                case 29:
                    j15 = ea.b.J(parcel, E);
                    break;
                case 30:
                    i12 = ea.b.G(parcel, E);
                    break;
                case 31:
                    str12 = ea.b.q(parcel, E);
                    break;
                case 32:
                    i11 = ea.b.G(parcel, E);
                    break;
                case 34:
                    j16 = ea.b.J(parcel, E);
                    break;
            }
        }
        ea.b.v(parcel, O);
        return new lb(str, str2, str3, str4, j10, j11, str5, z10, z12, j17, str6, j12, j13, i10, z11, z13, str7, bool, j14, arrayList, str8, str10, str11, str9, z14, j15, i12, str12, i11, j16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lb[] newArray(int i10) {
        return new lb[i10];
    }
}
