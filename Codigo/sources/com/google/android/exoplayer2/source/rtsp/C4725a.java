package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.AbstractC5911y;
import java.util.HashMap;
import p361t6.C11005b3;
import p363t8.C11137a;
import p363t8.C11172r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.rtsp.a */
/* loaded from: classes.dex */
public final class C4725a {

    /* renamed from: a */
    public final String f9297a;

    /* renamed from: b */
    public final int f9298b;

    /* renamed from: c */
    public final String f9299c;

    /* renamed from: d */
    public final int f9300d;

    /* renamed from: e */
    public final int f9301e;

    /* renamed from: f */
    public final String f9302f;

    /* renamed from: g */
    public final String f9303g;

    /* renamed from: h */
    public final String f9304h;

    /* renamed from: i */
    public final AbstractC5911y<String, String> f9305i;

    /* renamed from: j */
    public final c f9306j;

    /* renamed from: com.google.android.exoplayer2.source.rtsp.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final String f9307a;

        /* renamed from: b */
        private final int f9308b;

        /* renamed from: c */
        private final String f9309c;

        /* renamed from: d */
        private final int f9310d;

        /* renamed from: e */
        private final HashMap<String, String> f9311e = new HashMap<>();

        /* renamed from: f */
        private int f9312f = -1;

        /* renamed from: g */
        private String f9313g;

        /* renamed from: h */
        private String f9314h;

        /* renamed from: i */
        private String f9315i;

        public b(String str, int i10, String str2, int i11) {
            this.f9307a = str;
            this.f9308b = i10;
            this.f9309c = str2;
            this.f9310d = i11;
        }

        /* renamed from: i */
        public b m11990i(String str, String str2) {
            this.f9311e.put(str, str2);
            return this;
        }

        /* renamed from: j */
        public C4725a m11991j() {
            try {
                C11137a.m34605g(this.f9311e.containsKey("rtpmap"));
                return new C4725a(this, AbstractC5911y.m15110c(this.f9311e), c.m11996a((String) C11172r0.m34928j(this.f9311e.get("rtpmap"))));
            } catch (C11005b3 e10) {
                throw new IllegalStateException(e10);
            }
        }

        /* renamed from: k */
        public b m11992k(int i10) {
            this.f9312f = i10;
            return this;
        }

        /* renamed from: l */
        public b m11993l(String str) {
            this.f9314h = str;
            return this;
        }

        /* renamed from: m */
        public b m11994m(String str) {
            this.f9315i = str;
            return this;
        }

        /* renamed from: n */
        public b m11995n(String str) {
            this.f9313g = str;
            return this;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f9316a;

        /* renamed from: b */
        public final String f9317b;

        /* renamed from: c */
        public final int f9318c;

        /* renamed from: d */
        public final int f9319d;

        private c(int i10, String str, int i11, int i12) {
            this.f9316a = i10;
            this.f9317b = str;
            this.f9318c = i11;
            this.f9319d = i12;
        }

        /* renamed from: a */
        public static c m11996a(String str) {
            String[] m34893S0 = C11172r0.m34893S0(str, " ");
            C11137a.m34599a(m34893S0.length == 2);
            int m12235g = C4753u.m12235g(m34893S0[0]);
            String[] m34891R0 = C11172r0.m34891R0(m34893S0[1].trim(), "/");
            C11137a.m34599a(m34891R0.length >= 2);
            return new c(m12235g, m34891R0[0], C4753u.m12235g(m34891R0[1]), m34891R0.length == 3 ? C4753u.m12235g(m34891R0[2]) : -1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f9316a == cVar.f9316a && this.f9317b.equals(cVar.f9317b) && this.f9318c == cVar.f9318c && this.f9319d == cVar.f9319d;
        }

        public int hashCode() {
            return ((((((217 + this.f9316a) * 31) + this.f9317b.hashCode()) * 31) + this.f9318c) * 31) + this.f9319d;
        }
    }

    private C4725a(b bVar, AbstractC5911y<String, String> abstractC5911y, c cVar) {
        this.f9297a = bVar.f9307a;
        this.f9298b = bVar.f9308b;
        this.f9299c = bVar.f9309c;
        this.f9300d = bVar.f9310d;
        this.f9302f = bVar.f9313g;
        this.f9303g = bVar.f9314h;
        this.f9301e = bVar.f9312f;
        this.f9304h = bVar.f9315i;
        this.f9305i = abstractC5911y;
        this.f9306j = cVar;
    }

    /* renamed from: a */
    public AbstractC5911y<String, String> m11981a() {
        String str = this.f9305i.get("fmtp");
        if (str == null) {
            return AbstractC5911y.m15111k();
        }
        String[] m34893S0 = C11172r0.m34893S0(str, " ");
        C11137a.m34600b(m34893S0.length == 2, str);
        String[] split = m34893S0[1].split(";\\s?", 0);
        AbstractC5911y.a aVar = new AbstractC5911y.a();
        for (String str2 : split) {
            String[] m34893S02 = C11172r0.m34893S0(str2, "=");
            aVar.m15122f(m34893S02[0], m34893S02[1]);
        }
        return aVar.m15121c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4725a.class != obj.getClass()) {
            return false;
        }
        C4725a c4725a = (C4725a) obj;
        return this.f9297a.equals(c4725a.f9297a) && this.f9298b == c4725a.f9298b && this.f9299c.equals(c4725a.f9299c) && this.f9300d == c4725a.f9300d && this.f9301e == c4725a.f9301e && this.f9305i.equals(c4725a.f9305i) && this.f9306j.equals(c4725a.f9306j) && C11172r0.m34914c(this.f9302f, c4725a.f9302f) && C11172r0.m34914c(this.f9303g, c4725a.f9303g) && C11172r0.m34914c(this.f9304h, c4725a.f9304h);
    }

    public int hashCode() {
        int hashCode = (((((((((((((217 + this.f9297a.hashCode()) * 31) + this.f9298b) * 31) + this.f9299c.hashCode()) * 31) + this.f9300d) * 31) + this.f9301e) * 31) + this.f9305i.hashCode()) * 31) + this.f9306j.hashCode()) * 31;
        String str = this.f9302f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9303g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9304h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
