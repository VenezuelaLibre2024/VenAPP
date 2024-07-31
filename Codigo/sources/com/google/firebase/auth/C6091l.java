package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzagt;
import io.flutter.plugins.firebase.auth.Constants;
import p081ea.C7140c;

/* renamed from: com.google.firebase.auth.l */
/* loaded from: classes.dex */
public class C6091l extends AbstractC6072h {
    public static final Parcelable.Creator<C6091l> CREATOR = new C6067f2();

    /* renamed from: a */
    private final String f12941a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6091l(String str) {
        this.f12941a = C5276s.m13320f(str);
    }

    /* renamed from: x1 */
    public static zzagt m16563x1(C6091l c6091l, String str) {
        C5276s.m13324j(c6091l);
        return new zzagt(null, c6091l.f12941a, c6091l.mo16464u1(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: u1 */
    public String mo16464u1() {
        return Constants.SIGN_IN_METHOD_FACEBOOK;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: v1 */
    public String mo16465v1() {
        return Constants.SIGN_IN_METHOD_FACEBOOK;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: w1 */
    public final AbstractC6072h mo16466w1() {
        return new C6091l(this.f12941a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f12941a, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
