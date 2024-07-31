package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.x;
import java.util.List;
import java.util.Map;
import t8.r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f8385b = new b().e();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.x<String, String> f8386a;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final x.a<String, String> f8387a;

        public b() {
            this.f8387a = new x.a<>();
        }

        public b(String str, String str2, int i10) {
            this();
            b("User-Agent", str);
            b("CSeq", String.valueOf(i10));
            if (str2 != null) {
                b("Session", str2);
            }
        }

        public b b(String str, String str2) {
            this.f8387a.e(m.c(str.trim()), str2.trim());
            return this;
        }

        public b c(List<String> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                String[] S0 = r0.S0(list.get(i10), ":\\s?");
                if (S0.length == 2) {
                    b(S0[0], S0[1]);
                }
            }
            return this;
        }

        public b d(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public m e() {
            return new m(this);
        }
    }

    private m(b bVar) {
        this.f8386a = bVar.f8387a.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str) {
        return eb.c.a(str, "Accept") ? "Accept" : eb.c.a(str, "Allow") ? "Allow" : eb.c.a(str, "Authorization") ? "Authorization" : eb.c.a(str, "Bandwidth") ? "Bandwidth" : eb.c.a(str, "Blocksize") ? "Blocksize" : eb.c.a(str, "Cache-Control") ? "Cache-Control" : eb.c.a(str, "Connection") ? "Connection" : eb.c.a(str, "Content-Base") ? "Content-Base" : eb.c.a(str, "Content-Encoding") ? "Content-Encoding" : eb.c.a(str, "Content-Language") ? "Content-Language" : eb.c.a(str, "Content-Length") ? "Content-Length" : eb.c.a(str, "Content-Location") ? "Content-Location" : eb.c.a(str, "Content-Type") ? "Content-Type" : eb.c.a(str, "CSeq") ? "CSeq" : eb.c.a(str, "Date") ? "Date" : eb.c.a(str, "Expires") ? "Expires" : eb.c.a(str, "Location") ? "Location" : eb.c.a(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : eb.c.a(str, "Proxy-Require") ? "Proxy-Require" : eb.c.a(str, "Public") ? "Public" : eb.c.a(str, "Range") ? "Range" : eb.c.a(str, "RTP-Info") ? "RTP-Info" : eb.c.a(str, "RTCP-Interval") ? "RTCP-Interval" : eb.c.a(str, "Scale") ? "Scale" : eb.c.a(str, "Session") ? "Session" : eb.c.a(str, "Speed") ? "Speed" : eb.c.a(str, "Supported") ? "Supported" : eb.c.a(str, "Timestamp") ? "Timestamp" : eb.c.a(str, "Transport") ? "Transport" : eb.c.a(str, "User-Agent") ? "User-Agent" : eb.c.a(str, "Via") ? "Via" : eb.c.a(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public com.google.common.collect.x<String, String> b() {
        return this.f8386a;
    }

    public String d(String str) {
        com.google.common.collect.w<String> e10 = e(str);
        if (e10.isEmpty()) {
            return null;
        }
        return (String) com.google.common.collect.e0.d(e10);
    }

    public com.google.common.collect.w<String> e(String str) {
        return this.f8386a.get(c(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.f8386a.equals(((m) obj).f8386a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8386a.hashCode();
    }
}
