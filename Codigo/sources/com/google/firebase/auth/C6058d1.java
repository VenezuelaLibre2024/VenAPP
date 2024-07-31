package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.firebase.auth.d1 */
/* loaded from: classes.dex */
public class C6058d1 extends AbstractC7138a {
    public static final Parcelable.Creator<C6058d1> CREATOR = new C6144y1();

    /* renamed from: a */
    private String f12853a;

    /* renamed from: b */
    private String f12854b;

    /* renamed from: c */
    private boolean f12855c;

    /* renamed from: d */
    private boolean f12856d;

    /* renamed from: e */
    private Uri f12857e;

    /* renamed from: com.google.firebase.auth.d1$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private String f12858a;

        /* renamed from: b */
        private Uri f12859b;

        /* renamed from: c */
        private boolean f12860c;

        /* renamed from: d */
        private boolean f12861d;

        /* renamed from: a */
        public C6058d1 m16485a() {
            String str = this.f12858a;
            Uri uri = this.f12859b;
            return new C6058d1(str, uri == null ? null : uri.toString(), this.f12860c, this.f12861d);
        }

        /* renamed from: b */
        public a m16486b(String str) {
            if (str == null) {
                this.f12860c = true;
            } else {
                this.f12858a = str;
            }
            return this;
        }

        /* renamed from: c */
        public a m16487c(Uri uri) {
            if (uri == null) {
                this.f12861d = true;
            } else {
                this.f12859b = uri;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6058d1(String str, String str2, boolean z10, boolean z11) {
        this.f12853a = str;
        this.f12854b = str2;
        this.f12855c = z10;
        this.f12856d = z11;
        this.f12857e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    /* renamed from: R */
    public String m16483R() {
        return this.f12853a;
    }

    /* renamed from: u1 */
    public Uri m16484u1() {
        return this.f12857e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, m16483R(), false);
        C7140c.m21200G(parcel, 3, this.f12854b, false);
        C7140c.m21215g(parcel, 4, this.f12855c);
        C7140c.m21215g(parcel, 5, this.f12856d);
        C7140c.m21210b(parcel, m21209a);
    }

    public final String zza() {
        return this.f12854b;
    }

    public final boolean zzb() {
        return this.f12855c;
    }

    public final boolean zzc() {
        return this.f12856d;
    }
}
