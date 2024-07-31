package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class d1 extends ea.a {
    public static final Parcelable.Creator<d1> CREATOR = new y1();

    /* renamed from: a, reason: collision with root package name */
    private String f11638a;

    /* renamed from: b, reason: collision with root package name */
    private String f11639b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11640c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11641d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f11642e;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f11643a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f11644b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f11645c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f11646d;

        public d1 a() {
            String str = this.f11643a;
            Uri uri = this.f11644b;
            return new d1(str, uri == null ? null : uri.toString(), this.f11645c, this.f11646d);
        }

        public a b(String str) {
            if (str == null) {
                this.f11645c = true;
            } else {
                this.f11643a = str;
            }
            return this;
        }

        public a c(Uri uri) {
            if (uri == null) {
                this.f11646d = true;
            } else {
                this.f11644b = uri;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(String str, String str2, boolean z10, boolean z11) {
        this.f11638a = str;
        this.f11639b = str2;
        this.f11640c = z10;
        this.f11641d = z11;
        this.f11642e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public String R() {
        return this.f11638a;
    }

    public Uri u1() {
        return this.f11642e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, R(), false);
        ea.c.G(parcel, 3, this.f11639b, false);
        ea.c.g(parcel, 4, this.f11640c);
        ea.c.g(parcel, 5, this.f11641d);
        ea.c.b(parcel, a10);
    }

    public final String zza() {
        return this.f11639b;
    }

    public final boolean zzb() {
        return this.f11640c;
    }

    public final boolean zzc() {
        return this.f11641d;
    }
}
