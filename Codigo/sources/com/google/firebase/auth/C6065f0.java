package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzagt;
import io.flutter.plugins.firebase.auth.Constants;
import p081ea.C7140c;

/* renamed from: com.google.firebase.auth.f0 */
/* loaded from: classes.dex */
public class C6065f0 extends AbstractC6072h {
    public static final Parcelable.Creator<C6065f0> CREATOR = new C6105o1();

    /* renamed from: a */
    private final String f12893a;

    /* renamed from: b */
    private final String f12894b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6065f0(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f12893a = str;
        this.f12894b = str2;
    }

    /* renamed from: x1 */
    public static zzagt m16524x1(C6065f0 c6065f0, String str) {
        C5276s.m13324j(c6065f0);
        return new zzagt(c6065f0.f12893a, c6065f0.f12894b, c6065f0.mo16464u1(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: u1 */
    public String mo16464u1() {
        return Constants.SIGN_IN_METHOD_GOOGLE;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: v1 */
    public String mo16465v1() {
        return Constants.SIGN_IN_METHOD_GOOGLE;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: w1 */
    public final AbstractC6072h mo16466w1() {
        return new C6065f0(this.f12893a, this.f12894b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f12893a, false);
        C7140c.m21200G(parcel, 2, this.f12894b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
