package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.y;
import java.util.HashMap;
import t6.b3;
import t8.r0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final String f8253a;

    /* renamed from: b */
    public final int f8254b;

    /* renamed from: c */
    public final String f8255c;

    /* renamed from: d */
    public final int f8256d;

    /* renamed from: e */
    public final int f8257e;

    /* renamed from: f */
    public final String f8258f;

    /* renamed from: g */
    public final String f8259g;

    /* renamed from: h */
    public final String f8260h;

    /* renamed from: i */
    public final com.google.common.collect.y<String, String> f8261i;

    /* renamed from: j */
    public final c f8262j;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final String f8263a;

        /* renamed from: b */
        private final int f8264b;

        /* renamed from: c */
        private final String f8265c;

        /* renamed from: d */
        private final int f8266d;

        /* renamed from: e */
        private final HashMap<String, String> f8267e = new HashMap<>();

        /* renamed from: f */
        private int f8268f = -1;

        /* renamed from: g */
        private String f8269g;

        /* renamed from: h */
        private String f8270h;

        /* renamed from: i */
        private String f8271i;

        public b(String str, int i10, String str2, int i11) {
            this.f8263a = str;
            this.f8264b = i10;
            this.f8265c = str2;
            this.f8266d = i11;
        }

        public b i(String str, String str2) {
            this.f8267e.put(str, str2);
            return this;
        }

        public a j() {
            try {
                t8.a.g(this.f8267e.containsKey("rtpmap"));
                return new a(this, com.google.common.collect.y.c(this.f8267e), c.a((String) r0.j(this.f8267e.get("rtpmap"))));
            } catch (b3 e10) {
                throw new IllegalStateException(e10);
            }
        }

        public b k(int i10) {
            this.f8268f = i10;
            return this;
        }

        public b l(String str) {
            this.f8270h = str;
            return this;
        }

        public b m(String str) {
            this.f8271i = str;
            return this;
        }

        public b n(String str) {
            this.f8269g = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f8272a;

        /* renamed from: b */
        public final String f8273b;

        /* renamed from: c */
        public final int f8274c;

        /* renamed from: d */
        public final int f8275d;

        private c(int i10, String str, int i11, int i12) {
            this.f8272a = i10;
            this.f8273b = str;
            this.f8274c = i11;
            this.f8275d = i12;
        }

        public static c a(String str) {
            String[] S0 = r0.S0(str, " ");
            t8.a.a(S0.length == 2);
            int g10 = u.g(S0[0]);
            String[] R0 = r0.R0(S0[1].trim(), "/");
            t8.a.a(R0.length >= 2);
            return new c(g10, R0[0], u.g(R0[1]), R0.length == 3 ? u.g(R0[2]) : -1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f8272a == cVar.f8272a && this.f8273b.equals(cVar.f8273b) && this.f8274c == cVar.f8274c && this.f8275d == cVar.f8275d;
        }

        public int hashCode() {
            return ((((((217 + this.f8272a) * 31) + this.f8273b.hashCode()) * 31) + this.f8274c) * 31) + this.f8275d;
        }
    }

    private a(b bVar, com.google.common.collect.y<String, String> yVar, c cVar) {
        this.f8253a = bVar.f8263a;
        this.f8254b = bVar.f8264b;
        this.f8255c = bVar.f8265c;
        this.f8256d = bVar.f8266d;
        this.f8258f = bVar.f8269g;
        this.f8259g = bVar.f8270h;
        this.f8257e = bVar.f8268f;
        this.f8260h = bVar.f8271i;
        this.f8261i = yVar;
        this.f8262j = cVar;
    }

    /* synthetic */ a(b bVar, com.google.common.collect.y yVar, c cVar, C0142a c0142a) {
        this(bVar, yVar, cVar);
    }

    public com.google.common.collect.y<String, String> a() {
        String str = this.f8261i.get("fmtp");
        if (str == null) {
            return com.google.common.collect.y.k();
        }
        String[] S0 = r0.S0(str, " ");
        t8.a.b(S0.length == 2, str);
        String[] split = S0[1].split(";\\s?", 0);
        y.a aVar = new y.a();
        for (String str2 : split) {
            String[] S02 = r0.S0(str2, "=");
            aVar.f(S02[0], S02[1]);
        }
        return aVar.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8253a.equals(aVar.f8253a) && this.f8254b == aVar.f8254b && this.f8255c.equals(aVar.f8255c) && this.f8256d == aVar.f8256d && this.f8257e == aVar.f8257e && this.f8261i.equals(aVar.f8261i) && this.f8262j.equals(aVar.f8262j) && r0.c(this.f8258f, aVar.f8258f) && r0.c(this.f8259g, aVar.f8259g) && r0.c(this.f8260h, aVar.f8260h);
    }

    public int hashCode() {
        int hashCode = (((((((((((((217 + this.f8253a.hashCode()) * 31) + this.f8254b) * 31) + this.f8255c.hashCode()) * 31) + this.f8256d) * 31) + this.f8257e) * 31) + this.f8261i.hashCode()) * 31) + this.f8262j.hashCode()) * 31;
        String str = this.f8258f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8259g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8260h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
