package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.C7139b;

/* renamed from: com.google.android.gms.auth.api.credentials.d */
/* loaded from: classes.dex */
public final class C5086d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m21165O = C7139b.m21165O(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            int m21190w = C7139b.m21190w(m21155E);
            if (m21190w != 1000) {
                switch (m21190w) {
                    case 1:
                        z10 = C7139b.m21191x(parcel, m21155E);
                        break;
                    case 2:
                        strArr = C7139b.m21185r(parcel, m21155E);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) C7139b.m21183p(parcel, m21155E, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) C7139b.m21183p(parcel, m21155E, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z11 = C7139b.m21191x(parcel, m21155E);
                        break;
                    case 6:
                        str = C7139b.m21184q(parcel, m21155E);
                        break;
                    case 7:
                        str2 = C7139b.m21184q(parcel, m21155E);
                        break;
                    case 8:
                        z12 = C7139b.m21191x(parcel, m21155E);
                        break;
                    default:
                        C7139b.m21164N(parcel, m21155E);
                        break;
                }
            } else {
                i10 = C7139b.m21157G(parcel, m21155E);
            }
        }
        C7139b.m21189v(parcel, m21165O);
        return new C5083a(i10, z10, strArr, credentialPickerConfig, credentialPickerConfig2, z11, str, str2, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5083a[i10];
    }
}
