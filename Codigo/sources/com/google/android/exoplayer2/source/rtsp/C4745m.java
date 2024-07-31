package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.C5867e0;
import com.google.common.collect.C5909x;
import java.util.List;
import java.util.Map;
import p082eb.C7147c;
import p363t8.C11172r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.rtsp.m */
/* loaded from: classes.dex */
public final class C4745m {

    /* renamed from: b */
    public static final C4745m f9433b = new b().m12137e();

    /* renamed from: a */
    private final C5909x<String, String> f9434a;

    /* renamed from: com.google.android.exoplayer2.source.rtsp.m$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final C5909x.a<String, String> f9435a;

        public b() {
            this.f9435a = new C5909x.a<>();
        }

        public b(String str, String str2, int i10) {
            this();
            m12134b("User-Agent", str);
            m12134b("CSeq", String.valueOf(i10));
            if (str2 != null) {
                m12134b("Session", str2);
            }
        }

        /* renamed from: b */
        public b m12134b(String str, String str2) {
            this.f9435a.m15106e(C4745m.m12129c(str.trim()), str2.trim());
            return this;
        }

        /* renamed from: c */
        public b m12135c(List<String> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                String[] m34893S0 = C11172r0.m34893S0(list.get(i10), ":\\s?");
                if (m34893S0.length == 2) {
                    m12134b(m34893S0[0], m34893S0[1]);
                }
            }
            return this;
        }

        /* renamed from: d */
        public b m12136d(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                m12134b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: e */
        public C4745m m12137e() {
            return new C4745m(this);
        }
    }

    private C4745m(b bVar) {
        this.f9434a = bVar.f9435a.m15105d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static String m12129c(String str) {
        return C7147c.m21249a(str, "Accept") ? "Accept" : C7147c.m21249a(str, "Allow") ? "Allow" : C7147c.m21249a(str, "Authorization") ? "Authorization" : C7147c.m21249a(str, "Bandwidth") ? "Bandwidth" : C7147c.m21249a(str, "Blocksize") ? "Blocksize" : C7147c.m21249a(str, "Cache-Control") ? "Cache-Control" : C7147c.m21249a(str, "Connection") ? "Connection" : C7147c.m21249a(str, "Content-Base") ? "Content-Base" : C7147c.m21249a(str, "Content-Encoding") ? "Content-Encoding" : C7147c.m21249a(str, "Content-Language") ? "Content-Language" : C7147c.m21249a(str, "Content-Length") ? "Content-Length" : C7147c.m21249a(str, "Content-Location") ? "Content-Location" : C7147c.m21249a(str, "Content-Type") ? "Content-Type" : C7147c.m21249a(str, "CSeq") ? "CSeq" : C7147c.m21249a(str, "Date") ? "Date" : C7147c.m21249a(str, "Expires") ? "Expires" : C7147c.m21249a(str, "Location") ? "Location" : C7147c.m21249a(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : C7147c.m21249a(str, "Proxy-Require") ? "Proxy-Require" : C7147c.m21249a(str, "Public") ? "Public" : C7147c.m21249a(str, "Range") ? "Range" : C7147c.m21249a(str, "RTP-Info") ? "RTP-Info" : C7147c.m21249a(str, "RTCP-Interval") ? "RTCP-Interval" : C7147c.m21249a(str, "Scale") ? "Scale" : C7147c.m21249a(str, "Session") ? "Session" : C7147c.m21249a(str, "Speed") ? "Speed" : C7147c.m21249a(str, "Supported") ? "Supported" : C7147c.m21249a(str, "Timestamp") ? "Timestamp" : C7147c.m21249a(str, "Transport") ? "Transport" : C7147c.m21249a(str, "User-Agent") ? "User-Agent" : C7147c.m21249a(str, "Via") ? "Via" : C7147c.m21249a(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    /* renamed from: b */
    public C5909x<String, String> m12130b() {
        return this.f9434a;
    }

    /* renamed from: d */
    public String m12131d(String str) {
        AbstractC5907w<String> m12132e = m12132e(str);
        if (m12132e.isEmpty()) {
            return null;
        }
        return (String) C5867e0.m14838d(m12132e);
    }

    /* renamed from: e */
    public AbstractC5907w<String> m12132e(String str) {
        return this.f9434a.get(m12129c(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4745m) {
            return this.f9434a.equals(((C4745m) obj).f9434a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9434a.hashCode();
    }
}
