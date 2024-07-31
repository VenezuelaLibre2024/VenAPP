package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzagt;
import io.flutter.plugins.firebase.auth.Constants;
import p081ea.C7140c;

/* renamed from: com.google.firebase.auth.a1 */
/* loaded from: classes.dex */
public class C6046a1 extends AbstractC6072h {
    public static final Parcelable.Creator<C6046a1> CREATOR = new C6141x1();

    /* renamed from: a */
    private String f12847a;

    /* renamed from: b */
    private String f12848b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6046a1(String str, String str2) {
        this.f12847a = C5276s.m13320f(str);
        this.f12848b = C5276s.m13320f(str2);
    }

    /* renamed from: x1 */
    public static zzagt m16463x1(C6046a1 c6046a1, String str) {
        C5276s.m13324j(c6046a1);
        return new zzagt(null, c6046a1.f12847a, c6046a1.mo16464u1(), null, c6046a1.f12848b, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: u1 */
    public String mo16464u1() {
        return Constants.SIGN_IN_METHOD_TWITTER;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: v1 */
    public String mo16465v1() {
        return Constants.SIGN_IN_METHOD_TWITTER;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: w1 */
    public final AbstractC6072h mo16466w1() {
        return new C6046a1(this.f12847a, this.f12848b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f12847a, false);
        C7140c.m21200G(parcel, 2, this.f12848b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
