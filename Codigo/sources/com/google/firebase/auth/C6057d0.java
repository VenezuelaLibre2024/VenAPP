package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzagt;
import io.flutter.plugins.firebase.auth.Constants;
import p081ea.C7140c;

/* renamed from: com.google.firebase.auth.d0 */
/* loaded from: classes.dex */
public class C6057d0 extends AbstractC6072h {
    public static final Parcelable.Creator<C6057d0> CREATOR = new C6101n1();

    /* renamed from: a */
    private String f12852a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6057d0(String str) {
        this.f12852a = C5276s.m13320f(str);
    }

    /* renamed from: x1 */
    public static zzagt m16482x1(C6057d0 c6057d0, String str) {
        C5276s.m13324j(c6057d0);
        return new zzagt(null, c6057d0.f12852a, c6057d0.mo16464u1(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: u1 */
    public String mo16464u1() {
        return Constants.SIGN_IN_METHOD_GITHUB;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: v1 */
    public String mo16465v1() {
        return Constants.SIGN_IN_METHOD_GITHUB;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: w1 */
    public final AbstractC6072h mo16466w1() {
        return new C6057d0(this.f12852a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f12852a, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
