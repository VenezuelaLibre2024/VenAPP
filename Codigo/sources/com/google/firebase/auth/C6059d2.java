package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzag;
import com.google.android.gms.internal.p498firebaseauthapi.zzagt;
import p081ea.C7140c;

/* renamed from: com.google.firebase.auth.d2 */
/* loaded from: classes.dex */
public class C6059d2 extends AbstractC6096m0 {
    public static final Parcelable.Creator<C6059d2> CREATOR = new C6055c2();

    /* renamed from: a */
    private final String f12862a;

    /* renamed from: b */
    private final String f12863b;

    /* renamed from: c */
    private final String f12864c;

    /* renamed from: d */
    private final zzagt f12865d;

    /* renamed from: e */
    private final String f12866e;

    /* renamed from: f */
    private final String f12867f;

    /* renamed from: r */
    private final String f12868r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6059d2(String str, String str2, String str3, zzagt zzagtVar, String str4, String str5, String str6) {
        this.f12862a = zzag.zzb(str);
        this.f12863b = str2;
        this.f12864c = str3;
        this.f12865d = zzagtVar;
        this.f12866e = str4;
        this.f12867f = str5;
        this.f12868r = str6;
    }

    /* renamed from: A1 */
    public static zzagt m16488A1(C6059d2 c6059d2, String str) {
        C5276s.m13324j(c6059d2);
        zzagt zzagtVar = c6059d2.f12865d;
        return zzagtVar != null ? zzagtVar : new zzagt(c6059d2.mo16493y1(), c6059d2.mo16492x1(), c6059d2.mo16464u1(), null, c6059d2.mo16494z1(), null, str, c6059d2.f12866e, c6059d2.f12868r);
    }

    /* renamed from: B1 */
    public static C6059d2 m16489B1(zzagt zzagtVar) {
        C5276s.m13325k(zzagtVar, "Must specify a non-null webSignInCredential");
        return new C6059d2(null, null, null, zzagtVar, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C1 */
    public static C6059d2 m16490C1(String str, String str2, String str3, String str4) {
        C5276s.m13321g(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new C6059d2(str, str2, str3, null, null, null, str4);
    }

    /* renamed from: D1 */
    public static C6059d2 m16491D1(String str, String str2, String str3, String str4, String str5) {
        C5276s.m13321g(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new C6059d2(str, str2, str3, null, str4, str5, null);
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: u1 */
    public String mo16464u1() {
        return this.f12862a;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: v1 */
    public String mo16465v1() {
        return this.f12862a;
    }

    @Override // com.google.firebase.auth.AbstractC6072h
    /* renamed from: w1 */
    public final AbstractC6072h mo16466w1() {
        return new C6059d2(this.f12862a, this.f12863b, this.f12864c, this.f12865d, this.f12866e, this.f12867f, this.f12868r);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, mo16464u1(), false);
        C7140c.m21200G(parcel, 2, mo16493y1(), false);
        C7140c.m21200G(parcel, 3, mo16492x1(), false);
        C7140c.m21198E(parcel, 4, this.f12865d, i10, false);
        C7140c.m21200G(parcel, 5, this.f12866e, false);
        C7140c.m21200G(parcel, 6, mo16494z1(), false);
        C7140c.m21200G(parcel, 7, this.f12868r, false);
        C7140c.m21210b(parcel, m21209a);
    }

    @Override // com.google.firebase.auth.AbstractC6096m0
    /* renamed from: x1 */
    public String mo16492x1() {
        return this.f12864c;
    }

    @Override // com.google.firebase.auth.AbstractC6096m0
    /* renamed from: y1 */
    public String mo16493y1() {
        return this.f12863b;
    }

    @Override // com.google.firebase.auth.AbstractC6096m0
    /* renamed from: z1 */
    public String mo16494z1() {
        return this.f12867f;
    }
}
