package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.ReflectedParcelable;

@Deprecated
/* loaded from: classes.dex */
public final class CredentialPickerConfig extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    final int f9181a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9182b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9183c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9184d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f9185a = false;

        /* renamed from: b, reason: collision with root package name */
        private boolean f9186b = true;

        /* renamed from: c, reason: collision with root package name */
        private int f9187c = 1;

        public CredentialPickerConfig a() {
            return new CredentialPickerConfig(2, this.f9185a, this.f9186b, false, this.f9187c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CredentialPickerConfig(int i10, boolean z10, boolean z11, boolean z12, int i11) {
        this.f9181a = i10;
        this.f9182b = z10;
        this.f9183c = z11;
        if (i10 < 2) {
            this.f9184d = true == z12 ? 3 : 1;
        } else {
            this.f9184d = i11;
        }
    }

    @Deprecated
    public boolean u1() {
        return this.f9184d == 3;
    }

    public boolean v1() {
        return this.f9182b;
    }

    public boolean w1() {
        return this.f9183c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 1, v1());
        ea.c.g(parcel, 2, w1());
        ea.c.g(parcel, 3, u1());
        ea.c.u(parcel, 4, this.f9184d);
        ea.c.u(parcel, AdError.NETWORK_ERROR_CODE, this.f9181a);
        ea.c.b(parcel, a10);
    }
}
