package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;

@Deprecated
/* loaded from: classes.dex */
public final class HintRequest extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    final int f9188a;

    /* renamed from: b, reason: collision with root package name */
    private final CredentialPickerConfig f9189b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9190c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9191d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f9192e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9193f;

    /* renamed from: r, reason: collision with root package name */
    private final String f9194r;

    /* renamed from: s, reason: collision with root package name */
    private final String f9195s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HintRequest(int i10, CredentialPickerConfig credentialPickerConfig, boolean z10, boolean z11, String[] strArr, boolean z12, String str, String str2) {
        this.f9188a = i10;
        this.f9189b = (CredentialPickerConfig) s.j(credentialPickerConfig);
        this.f9190c = z10;
        this.f9191d = z11;
        this.f9192e = (String[]) s.j(strArr);
        if (i10 < 2) {
            this.f9193f = true;
            this.f9194r = null;
            this.f9195s = null;
        } else {
            this.f9193f = z12;
            this.f9194r = str;
            this.f9195s = str2;
        }
    }

    public String[] u1() {
        return this.f9192e;
    }

    public CredentialPickerConfig v1() {
        return this.f9189b;
    }

    public String w1() {
        return this.f9195s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, v1(), i10, false);
        ea.c.g(parcel, 2, y1());
        ea.c.g(parcel, 3, this.f9191d);
        ea.c.H(parcel, 4, u1(), false);
        ea.c.g(parcel, 5, z1());
        ea.c.G(parcel, 6, x1(), false);
        ea.c.G(parcel, 7, w1(), false);
        ea.c.u(parcel, AdError.NETWORK_ERROR_CODE, this.f9188a);
        ea.c.b(parcel, a10);
    }

    public String x1() {
        return this.f9194r;
    }

    public boolean y1() {
        return this.f9190c;
    }

    public boolean z1() {
        return this.f9193f;
    }
}
