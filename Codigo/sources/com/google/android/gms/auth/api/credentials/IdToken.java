package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;

@Deprecated
/* loaded from: classes.dex */
public final class IdToken extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new u9.b();

    /* renamed from: a, reason: collision with root package name */
    private final String f9196a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9197b;

    public IdToken(String str, String str2) {
        s.b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        s.b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f9196a = str;
        this.f9197b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return q.b(this.f9196a, idToken.f9196a) && q.b(this.f9197b, idToken.f9197b);
    }

    public String u1() {
        return this.f9196a;
    }

    public String v1() {
        return this.f9197b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, u1(), false);
        ea.c.G(parcel, 2, v1(), false);
        ea.c.b(parcel, a10);
    }
}
