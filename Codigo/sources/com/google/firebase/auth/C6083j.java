package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import p081ea.C7140c;

/* renamed from: com.google.firebase.auth.j */
/* loaded from: classes.dex */
public class C6083j extends AbstractC6072h {
    public static final Parcelable.Creator<C6083j> CREATOR = new C6063e2();

    /* renamed from: a */
    private String f12923a;

    /* renamed from: b */
    private String f12924b;

    /* renamed from: c */
    private final String f12925c;

    /* renamed from: d */
    private String f12926d;

    /* renamed from: e */
    private boolean f12927e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6083j(String str, String str2) {
        this(str, str2, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6083j(String str, String str2, String str3, String str4, boolean z10) {
        this.f12923a = C5276s.m13320f(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f12924b = str2;
        this.f12925c = str3;
        this.f12926d = str4;
        this.f12927e = z10;
    }

    /* renamed from: y1 */
    public static boolean m16550y1(String str) {
        C6064f m16519c;
        return (TextUtils.isEmpty(str) || (m16519c = C6064f.m16519c(str)) == null || m16519c.m16522b() != 4) ? false : true;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: u1 */
    public String mo16464u1() {
        return "password";
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: v1 */
    public String mo16465v1() {
        return !TextUtils.isEmpty(this.f12924b) ? "password" : "emailLink";
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: w1 */
    public final AbstractC6072h mo16466w1() {
        return new C6083j(this.f12923a, this.f12924b, this.f12925c, this.f12926d, this.f12927e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f12923a, false);
        C7140c.m21200G(parcel, 2, this.f12924b, false);
        C7140c.m21200G(parcel, 3, this.f12925c, false);
        C7140c.m21200G(parcel, 4, this.f12926d, false);
        C7140c.m21215g(parcel, 5, this.f12927e);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public final C6083j m16551x1(AbstractC6045a0 abstractC6045a0) {
        this.f12926d = abstractC6045a0.zze();
        this.f12927e = true;
        return this;
    }

    public final String zzb() {
        return this.f12926d;
    }

    public final String zzc() {
        return this.f12923a;
    }

    public final String zzd() {
        return this.f12924b;
    }

    public final String zze() {
        return this.f12925c;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.f12925c);
    }

    public final boolean zzg() {
        return this.f12927e;
    }
}
