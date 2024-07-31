package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C4954j;
import com.google.android.gms.internal.ads.zzcei;
import p081ea.C7139b;
import p121g9.C7516j;

/* renamed from: com.google.android.gms.ads.internal.overlay.a */
/* loaded from: classes.dex */
public final class C4960a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        C7516j c7516j = null;
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
        C4954j c4954j = null;
        IBinder iBinder6 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            switch (C7139b.m21190w(m21155E)) {
                case 2:
                    c7516j = (C7516j) C7139b.m21183p(parcel, m21155E, C7516j.CREATOR);
                    break;
                case 3:
                    iBinder = C7139b.m21156F(parcel, m21155E);
                    break;
                case 4:
                    iBinder2 = C7139b.m21156F(parcel, m21155E);
                    break;
                case 5:
                    iBinder3 = C7139b.m21156F(parcel, m21155E);
                    break;
                case 6:
                    iBinder4 = C7139b.m21156F(parcel, m21155E);
                    break;
                case 7:
                    str = C7139b.m21184q(parcel, m21155E);
                    break;
                case 8:
                    z10 = C7139b.m21191x(parcel, m21155E);
                    break;
                case 9:
                    str2 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 10:
                    iBinder5 = C7139b.m21156F(parcel, m21155E);
                    break;
                case 11:
                    i10 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 12:
                    i11 = C7139b.m21157G(parcel, m21155E);
                    break;
                case 13:
                    str3 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 14:
                    zzceiVar = (zzcei) C7139b.m21183p(parcel, m21155E, zzcei.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    C7139b.m21164N(parcel, m21155E);
                    break;
                case 16:
                    str4 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 17:
                    c4954j = (C4954j) C7139b.m21183p(parcel, m21155E, C4954j.CREATOR);
                    break;
                case 18:
                    iBinder6 = C7139b.m21156F(parcel, m21155E);
                    break;
                case 19:
                    str5 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 24:
                    str6 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 25:
                    str7 = C7139b.m21184q(parcel, m21155E);
                    break;
                case 26:
                    iBinder7 = C7139b.m21156F(parcel, m21155E);
                    break;
                case 27:
                    iBinder8 = C7139b.m21156F(parcel, m21155E);
                    break;
                case 28:
                    iBinder9 = C7139b.m21156F(parcel, m21155E);
                    break;
                case 29:
                    z11 = C7139b.m21191x(parcel, m21155E);
                    break;
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new AdOverlayInfoParcel(c7516j, iBinder, iBinder2, iBinder3, iBinder4, str, z10, str2, iBinder5, i10, i11, str3, zzceiVar, str4, c4954j, iBinder6, str5, str6, str7, iBinder7, iBinder8, iBinder9, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
