package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.common.collect.w;
import java.util.HashMap;
import t8.r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.collect.y<String, String> f8285a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.common.collect.w<com.google.android.exoplayer2.source.rtsp.a> f8286b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8287c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8288d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8289e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8290f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f8291g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8292h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8293i;

    /* renamed from: j, reason: collision with root package name */
    public final String f8294j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8295k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8296l;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f8297a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private final w.a<com.google.android.exoplayer2.source.rtsp.a> f8298b = new w.a<>();

        /* renamed from: c, reason: collision with root package name */
        private int f8299c = -1;

        /* renamed from: d, reason: collision with root package name */
        private String f8300d;

        /* renamed from: e, reason: collision with root package name */
        private String f8301e;

        /* renamed from: f, reason: collision with root package name */
        private String f8302f;

        /* renamed from: g, reason: collision with root package name */
        private Uri f8303g;

        /* renamed from: h, reason: collision with root package name */
        private String f8304h;

        /* renamed from: i, reason: collision with root package name */
        private String f8305i;

        /* renamed from: j, reason: collision with root package name */
        private String f8306j;

        /* renamed from: k, reason: collision with root package name */
        private String f8307k;

        /* renamed from: l, reason: collision with root package name */
        private String f8308l;

        public b m(String str, String str2) {
            this.f8297a.put(str, str2);
            return this;
        }

        public b n(com.google.android.exoplayer2.source.rtsp.a aVar) {
            this.f8298b.a(aVar);
            return this;
        }

        public c0 o() {
            if (this.f8300d == null || this.f8301e == null || this.f8302f == null) {
                throw new IllegalStateException("One of more mandatory SDP fields are not set.");
            }
            return new c0(this);
        }

        public b p(int i10) {
            this.f8299c = i10;
            return this;
        }

        public b q(String str) {
            this.f8304h = str;
            return this;
        }

        public b r(String str) {
            this.f8307k = str;
            return this;
        }

        public b s(String str) {
            this.f8305i = str;
            return this;
        }

        public b t(String str) {
            this.f8301e = str;
            return this;
        }

        public b u(String str) {
            this.f8308l = str;
            return this;
        }

        public b v(String str) {
            this.f8306j = str;
            return this;
        }

        public b w(String str) {
            this.f8300d = str;
            return this;
        }

        public b x(String str) {
            this.f8302f = str;
            return this;
        }

        public b y(Uri uri) {
            this.f8303g = uri;
            return this;
        }
    }

    private c0(b bVar) {
        this.f8285a = com.google.common.collect.y.c(bVar.f8297a);
        this.f8286b = bVar.f8298b.k();
        this.f8287c = (String) r0.j(bVar.f8300d);
        this.f8288d = (String) r0.j(bVar.f8301e);
        this.f8289e = (String) r0.j(bVar.f8302f);
        this.f8291g = bVar.f8303g;
        this.f8292h = bVar.f8304h;
        this.f8290f = bVar.f8299c;
        this.f8293i = bVar.f8305i;
        this.f8294j = bVar.f8307k;
        this.f8295k = bVar.f8308l;
        this.f8296l = bVar.f8306j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f8290f == c0Var.f8290f && this.f8285a.equals(c0Var.f8285a) && this.f8286b.equals(c0Var.f8286b) && this.f8288d.equals(c0Var.f8288d) && this.f8287c.equals(c0Var.f8287c) && this.f8289e.equals(c0Var.f8289e) && r0.c(this.f8296l, c0Var.f8296l) && r0.c(this.f8291g, c0Var.f8291g) && r0.c(this.f8294j, c0Var.f8294j) && r0.c(this.f8295k, c0Var.f8295k) && r0.c(this.f8292h, c0Var.f8292h) && r0.c(this.f8293i, c0Var.f8293i);
    }

    public int hashCode() {
        int hashCode = (((((((((((217 + this.f8285a.hashCode()) * 31) + this.f8286b.hashCode()) * 31) + this.f8288d.hashCode()) * 31) + this.f8287c.hashCode()) * 31) + this.f8289e.hashCode()) * 31) + this.f8290f) * 31;
        String str = this.f8296l;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.f8291g;
        int hashCode3 = (hashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.f8294j;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8295k;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f8292h;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f8293i;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }
}
