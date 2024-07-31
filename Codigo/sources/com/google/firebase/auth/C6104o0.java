package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import io.flutter.plugins.firebase.auth.Constants;
import p081ea.C7140c;

/* renamed from: com.google.firebase.auth.o0 */
/* loaded from: classes.dex */
public class C6104o0 extends AbstractC6072h implements Cloneable {
    public static final Parcelable.Creator<C6104o0> CREATOR = new C6121s1();

    /* renamed from: a */
    private String f12962a;

    /* renamed from: b */
    private String f12963b;

    /* renamed from: c */
    private String f12964c;

    /* renamed from: d */
    private boolean f12965d;

    /* renamed from: e */
    private String f12966e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6104o0(String str, String str2, String str3, boolean z10, String str4) {
        C5276s.m13316b(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f12962a = str;
        this.f12963b = str2;
        this.f12964c = str3;
        this.f12965d = z10;
        this.f12966e = str4;
    }

    /* renamed from: A1 */
    public static C6104o0 m16578A1(String str, String str2) {
        return new C6104o0(null, null, str, true, str2);
    }

    /* renamed from: y1 */
    public static C6104o0 m16579y1(String str, String str2) {
        return new C6104o0(str, str2, null, true, null);
    }

    public /* synthetic */ Object clone() {
        return new C6104o0(this.f12962a, m16580x1(), this.f12964c, this.f12965d, this.f12966e);
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: u1 */
    public String mo16464u1() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: v1 */
    public String mo16465v1() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: w1 */
    public final AbstractC6072h mo16466w1() {
        return (C6104o0) clone();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f12962a, false);
        C7140c.m21200G(parcel, 2, m16580x1(), false);
        C7140c.m21200G(parcel, 4, this.f12964c, false);
        C7140c.m21215g(parcel, 5, this.f12965d);
        C7140c.m21200G(parcel, 6, this.f12966e, false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public String m16580x1() {
        return this.f12963b;
    }

    /* renamed from: z1 */
    public final C6104o0 m16581z1(boolean z10) {
        this.f12965d = false;
        return this;
    }

    public final String zzb() {
        return this.f12964c;
    }

    public final String zzc() {
        return this.f12962a;
    }

    public final String zzd() {
        return this.f12966e;
    }

    public final boolean zze() {
        return this.f12965d;
    }
}
