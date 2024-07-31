package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class e extends ea.a {
    public static final Parcelable.Creator<e> CREATOR = new z1();

    /* renamed from: a, reason: collision with root package name */
    private final String f11654a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11655b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11656c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11657d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11658e;

    /* renamed from: f, reason: collision with root package name */
    private final String f11659f;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f11660r;

    /* renamed from: s, reason: collision with root package name */
    private String f11661s;

    /* renamed from: t, reason: collision with root package name */
    private int f11662t;

    /* renamed from: u, reason: collision with root package name */
    private String f11663u;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f11664a;

        /* renamed from: b, reason: collision with root package name */
        private String f11665b;

        /* renamed from: c, reason: collision with root package name */
        private String f11666c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f11667d;

        /* renamed from: e, reason: collision with root package name */
        private String f11668e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f11669f;

        /* renamed from: g, reason: collision with root package name */
        private String f11670g;

        private a() {
            this.f11669f = false;
        }

        public e a() {
            if (this.f11664a != null) {
                return new e(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public a b(String str, boolean z10, String str2) {
            this.f11666c = str;
            this.f11667d = z10;
            this.f11668e = str2;
            return this;
        }

        public a c(String str) {
            this.f11670g = str;
            return this;
        }

        public a d(boolean z10) {
            this.f11669f = z10;
            return this;
        }

        public a e(String str) {
            this.f11665b = str;
            return this;
        }

        public a f(String str) {
            this.f11664a = str;
            return this;
        }
    }

    private e(a aVar) {
        this.f11654a = aVar.f11664a;
        this.f11655b = aVar.f11665b;
        this.f11656c = null;
        this.f11657d = aVar.f11666c;
        this.f11658e = aVar.f11667d;
        this.f11659f = aVar.f11668e;
        this.f11660r = aVar.f11669f;
        this.f11663u = aVar.f11670g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7) {
        this.f11654a = str;
        this.f11655b = str2;
        this.f11656c = str3;
        this.f11657d = str4;
        this.f11658e = z10;
        this.f11659f = str5;
        this.f11660r = z11;
        this.f11661s = str6;
        this.f11662t = i10;
        this.f11663u = str7;
    }

    public static a A1() {
        return new a();
    }

    public static e D1() {
        return new e(new a());
    }

    public final void B1(int i10) {
        this.f11662t = i10;
    }

    public final void C1(String str) {
        this.f11661s = str;
    }

    public boolean u1() {
        return this.f11660r;
    }

    public boolean v1() {
        return this.f11658e;
    }

    public String w1() {
        return this.f11659f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, z1(), false);
        ea.c.G(parcel, 2, y1(), false);
        ea.c.G(parcel, 3, this.f11656c, false);
        ea.c.G(parcel, 4, x1(), false);
        ea.c.g(parcel, 5, v1());
        ea.c.G(parcel, 6, w1(), false);
        ea.c.g(parcel, 7, u1());
        ea.c.G(parcel, 8, this.f11661s, false);
        ea.c.u(parcel, 9, this.f11662t);
        ea.c.G(parcel, 10, this.f11663u, false);
        ea.c.b(parcel, a10);
    }

    public String x1() {
        return this.f11657d;
    }

    public String y1() {
        return this.f11655b;
    }

    public String z1() {
        return this.f11654a;
    }

    public final int zza() {
        return this.f11662t;
    }

    public final String zzc() {
        return this.f11663u;
    }

    public final String zzd() {
        return this.f11656c;
    }

    public final String zze() {
        return this.f11661s;
    }
}
