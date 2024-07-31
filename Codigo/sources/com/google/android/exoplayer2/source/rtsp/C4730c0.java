package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.AbstractC5911y;
import java.util.HashMap;
import p363t8.C11172r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.rtsp.c0 */
/* loaded from: classes.dex */
public final class C4730c0 {

    /* renamed from: a */
    public final AbstractC5911y<String, String> f9329a;

    /* renamed from: b */
    public final AbstractC5907w<C4725a> f9330b;

    /* renamed from: c */
    public final String f9331c;

    /* renamed from: d */
    public final String f9332d;

    /* renamed from: e */
    public final String f9333e;

    /* renamed from: f */
    public final int f9334f;

    /* renamed from: g */
    public final Uri f9335g;

    /* renamed from: h */
    public final String f9336h;

    /* renamed from: i */
    public final String f9337i;

    /* renamed from: j */
    public final String f9338j;

    /* renamed from: k */
    public final String f9339k;

    /* renamed from: l */
    public final String f9340l;

    /* renamed from: com.google.android.exoplayer2.source.rtsp.c0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final HashMap<String, String> f9341a = new HashMap<>();

        /* renamed from: b */
        private final AbstractC5907w.a<C4725a> f9342b = new AbstractC5907w.a<>();

        /* renamed from: c */
        private int f9343c = -1;

        /* renamed from: d */
        private String f9344d;

        /* renamed from: e */
        private String f9345e;

        /* renamed from: f */
        private String f9346f;

        /* renamed from: g */
        private Uri f9347g;

        /* renamed from: h */
        private String f9348h;

        /* renamed from: i */
        private String f9349i;

        /* renamed from: j */
        private String f9350j;

        /* renamed from: k */
        private String f9351k;

        /* renamed from: l */
        private String f9352l;

        /* renamed from: m */
        public b m12016m(String str, String str2) {
            this.f9341a.put(str, str2);
            return this;
        }

        /* renamed from: n */
        public b m12017n(C4725a c4725a) {
            this.f9342b.mo14724a(c4725a);
            return this;
        }

        /* renamed from: o */
        public C4730c0 m12018o() {
            if (this.f9344d == null || this.f9345e == null || this.f9346f == null) {
                throw new IllegalStateException("One of more mandatory SDP fields are not set.");
            }
            return new C4730c0(this);
        }

        /* renamed from: p */
        public b m12019p(int i10) {
            this.f9343c = i10;
            return this;
        }

        /* renamed from: q */
        public b m12020q(String str) {
            this.f9348h = str;
            return this;
        }

        /* renamed from: r */
        public b m12021r(String str) {
            this.f9351k = str;
            return this;
        }

        /* renamed from: s */
        public b m12022s(String str) {
            this.f9349i = str;
            return this;
        }

        /* renamed from: t */
        public b m12023t(String str) {
            this.f9345e = str;
            return this;
        }

        /* renamed from: u */
        public b m12024u(String str) {
            this.f9352l = str;
            return this;
        }

        /* renamed from: v */
        public b m12025v(String str) {
            this.f9350j = str;
            return this;
        }

        /* renamed from: w */
        public b m12026w(String str) {
            this.f9344d = str;
            return this;
        }

        /* renamed from: x */
        public b m12027x(String str) {
            this.f9346f = str;
            return this;
        }

        /* renamed from: y */
        public b m12028y(Uri uri) {
            this.f9347g = uri;
            return this;
        }
    }

    private C4730c0(b bVar) {
        this.f9329a = AbstractC5911y.m15110c(bVar.f9341a);
        this.f9330b = bVar.f9342b.m15094k();
        this.f9331c = (String) C11172r0.m34928j(bVar.f9344d);
        this.f9332d = (String) C11172r0.m34928j(bVar.f9345e);
        this.f9333e = (String) C11172r0.m34928j(bVar.f9346f);
        this.f9335g = bVar.f9347g;
        this.f9336h = bVar.f9348h;
        this.f9334f = bVar.f9343c;
        this.f9337i = bVar.f9349i;
        this.f9338j = bVar.f9351k;
        this.f9339k = bVar.f9352l;
        this.f9340l = bVar.f9350j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4730c0.class != obj.getClass()) {
            return false;
        }
        C4730c0 c4730c0 = (C4730c0) obj;
        return this.f9334f == c4730c0.f9334f && this.f9329a.equals(c4730c0.f9329a) && this.f9330b.equals(c4730c0.f9330b) && this.f9332d.equals(c4730c0.f9332d) && this.f9331c.equals(c4730c0.f9331c) && this.f9333e.equals(c4730c0.f9333e) && C11172r0.m34914c(this.f9340l, c4730c0.f9340l) && C11172r0.m34914c(this.f9335g, c4730c0.f9335g) && C11172r0.m34914c(this.f9338j, c4730c0.f9338j) && C11172r0.m34914c(this.f9339k, c4730c0.f9339k) && C11172r0.m34914c(this.f9336h, c4730c0.f9336h) && C11172r0.m34914c(this.f9337i, c4730c0.f9337i);
    }

    public int hashCode() {
        int hashCode = (((((((((((217 + this.f9329a.hashCode()) * 31) + this.f9330b.hashCode()) * 31) + this.f9332d.hashCode()) * 31) + this.f9331c.hashCode()) * 31) + this.f9333e.hashCode()) * 31) + this.f9334f) * 31;
        String str = this.f9340l;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.f9335g;
        int hashCode3 = (hashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.f9338j;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9339k;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9336h;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9337i;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }
}
