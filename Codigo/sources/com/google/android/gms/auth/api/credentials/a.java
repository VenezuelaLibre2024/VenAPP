package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.s;

@Deprecated
/* loaded from: classes.dex */
public final class a extends ea.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    final int f9198a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9199b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f9200c;

    /* renamed from: d, reason: collision with root package name */
    private final CredentialPickerConfig f9201d;

    /* renamed from: e, reason: collision with root package name */
    private final CredentialPickerConfig f9202e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9203f;

    /* renamed from: r, reason: collision with root package name */
    private final String f9204r;

    /* renamed from: s, reason: collision with root package name */
    private final String f9205s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f9206t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10, boolean z10, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z11, String str, String str2, boolean z12) {
        this.f9198a = i10;
        this.f9199b = z10;
        this.f9200c = (String[]) s.j(strArr);
        this.f9201d = credentialPickerConfig == null ? new CredentialPickerConfig.a().a() : credentialPickerConfig;
        this.f9202e = credentialPickerConfig2 == null ? new CredentialPickerConfig.a().a() : credentialPickerConfig2;
        if (i10 < 3) {
            this.f9203f = true;
            this.f9204r = null;
            this.f9205s = null;
        } else {
            this.f9203f = z11;
            this.f9204r = str;
            this.f9205s = str2;
        }
        this.f9206t = z12;
    }

    public boolean A1() {
        return this.f9199b;
    }

    public String[] u1() {
        return this.f9200c;
    }

    public CredentialPickerConfig v1() {
        return this.f9202e;
    }

    public CredentialPickerConfig w1() {
        return this.f9201d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, A1());
        ea.c.H(parcel, 2, u1(), false);
        ea.c.E(parcel, 3, w1(), i10, false);
        ea.c.E(parcel, 4, v1(), i10, false);
        ea.c.g(parcel, 5, z1());
        ea.c.G(parcel, 6, y1(), false);
        ea.c.G(parcel, 7, x1(), false);
        ea.c.g(parcel, 8, this.f9206t);
        ea.c.u(parcel, AdError.NETWORK_ERROR_CODE, this.f9198a);
        ea.c.b(parcel, a10);
    }

    public String x1() {
        return this.f9205s;
    }

    public String y1() {
        return this.f9204r;
    }

    public boolean z1() {
        return this.f9203f;
    }
}
