package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzagt;
import p081ea.C7140c;

/* renamed from: com.google.firebase.auth.u0 */
/* loaded from: classes.dex */
public class C6128u0 extends AbstractC6072h {
    public static final Parcelable.Creator<C6128u0> CREATOR = new C6133v1();

    /* renamed from: a */
    private final String f13006a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6128u0(String str) {
        this.f13006a = C5276s.m13320f(str);
    }

    /* renamed from: x1 */
    public static zzagt m16612x1(C6128u0 c6128u0, String str) {
        C5276s.m13324j(c6128u0);
        return new zzagt(null, null, c6128u0.mo16464u1(), null, null, c6128u0.f13006a, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: u1 */
    public String mo16464u1() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: v1 */
    public String mo16465v1() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: w1 */
    public final AbstractC6072h mo16466w1() {
        return new C6128u0(this.f13006a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f13006a, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
