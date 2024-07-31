package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class Credential extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new b();

    /* renamed from: a */
    private final String f9173a;

    /* renamed from: b */
    private final String f9174b;

    /* renamed from: c */
    private final Uri f9175c;

    /* renamed from: d */
    private final List f9176d;

    /* renamed from: e */
    private final String f9177e;

    /* renamed from: f */
    private final String f9178f;

    /* renamed from: r */
    private final String f9179r;

    /* renamed from: s */
    private final String f9180s;

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Credential(java.lang.String r4, java.lang.String r5, android.net.Uri r6, java.util.List r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "credential identifier cannot be null"
            java.lang.Object r4 = com.google.android.gms.common.internal.s.k(r4, r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.trim()
            java.lang.String r0 = "credential identifier cannot be empty"
            com.google.android.gms.common.internal.s.g(r4, r0)
            if (r8 == 0) goto L25
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L1d
            goto L25
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Password must not be empty if set"
            r4.<init>(r5)
            throw r4
        L25:
            if (r9 == 0) goto L83
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L30
        L2d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L74
        L30:
            android.net.Uri r0 = android.net.Uri.parse(r9)
            boolean r1 = r0.isAbsolute()
            if (r1 == 0) goto L2d
            boolean r1 = r0.isHierarchical()
            if (r1 == 0) goto L2d
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2d
            java.lang.String r1 = r0.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L55
            goto L2d
        L55:
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "http"
            boolean r1 = r2.equalsIgnoreCase(r1)
            r2 = 1
            if (r1 != 0) goto L70
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "https"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L6f
            goto L70
        L6f:
            r2 = 0
        L70:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L74:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7b
            goto L83
        L7b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Account type must be a valid Http/Https URI"
            r4.<init>(r5)
            throw r4
        L83:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L98
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L90
            goto L98
        L90:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Password and AccountType are mutually exclusive"
            r4.<init>(r5)
            throw r4
        L98:
            if (r5 == 0) goto La5
            java.lang.String r0 = r5.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La5
            r5 = 0
        La5:
            r3.f9174b = r5
            r3.f9175c = r6
            if (r7 != 0) goto Lb0
            java.util.List r5 = java.util.Collections.emptyList()
            goto Lb4
        Lb0:
            java.util.List r5 = java.util.Collections.unmodifiableList(r7)
        Lb4:
            r3.f9176d = r5
            r3.f9173a = r4
            r3.f9177e = r8
            r3.f9178f = r9
            r3.f9179r = r10
            r3.f9180s = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.Credential.<init>(java.lang.String, java.lang.String, android.net.Uri, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public String A1() {
        return this.f9177e;
    }

    public Uri B1() {
        return this.f9175c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f9173a, credential.f9173a) && TextUtils.equals(this.f9174b, credential.f9174b) && q.b(this.f9175c, credential.f9175c) && TextUtils.equals(this.f9177e, credential.f9177e) && TextUtils.equals(this.f9178f, credential.f9178f);
    }

    public int hashCode() {
        return q.c(this.f9173a, this.f9174b, this.f9175c, this.f9177e, this.f9178f);
    }

    public String u1() {
        return this.f9178f;
    }

    public String v1() {
        return this.f9180s;
    }

    public String w1() {
        return this.f9179r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, x1(), false);
        ea.c.G(parcel, 2, z1(), false);
        ea.c.E(parcel, 3, B1(), i10, false);
        ea.c.K(parcel, 4, y1(), false);
        ea.c.G(parcel, 5, A1(), false);
        ea.c.G(parcel, 6, u1(), false);
        ea.c.G(parcel, 9, w1(), false);
        ea.c.G(parcel, 10, v1(), false);
        ea.c.b(parcel, a10);
    }

    public String x1() {
        return this.f9173a;
    }

    public List<IdToken> y1() {
        return this.f9176d;
    }

    public String z1() {
        return this.f9174b;
    }
}
