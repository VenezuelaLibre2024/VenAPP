package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.AbstractC5911y;
import java.util.Map;
import p082eb.C7147c;
import p361t6.C11108u1;

/* renamed from: com.google.android.exoplayer2.source.rtsp.h */
/* loaded from: classes.dex */
public final class C4739h {

    /* renamed from: a */
    public final int f9392a;

    /* renamed from: b */
    public final int f9393b;

    /* renamed from: c */
    public final C11108u1 f9394c;

    /* renamed from: d */
    public final AbstractC5911y<String, String> f9395d;

    public C4739h(C11108u1 c11108u1, int i10, int i11, Map<String, String> map) {
        this.f9392a = i10;
        this.f9393b = i11;
        this.f9394c = c11108u1;
        this.f9395d = AbstractC5911y.m15110c(map);
    }

    /* renamed from: a */
    public static String m12053a(String str) {
        String m21255g = C7147c.m21255g(str);
        m21255g.hashCode();
        char c10 = 65535;
        switch (m21255g.hashCode()) {
            case -1922091719:
                if (m21255g.equals("MPEG4-GENERIC")) {
                    c10 = 0;
                    break;
                }
                break;
            case 64593:
                if (m21255g.equals("AC3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2194728:
                if (m21255g.equals("H264")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "audio/mp4a-latm";
            case 1:
                return "audio/ac3";
            case 2:
                return "video/avc";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static boolean m12054b(C4725a c4725a) {
        String m21255g = C7147c.m21255g(c4725a.f9306j.f9317b);
        m21255g.hashCode();
        char c10 = 65535;
        switch (m21255g.hashCode()) {
            case -1922091719:
                if (m21255g.equals("MPEG4-GENERIC")) {
                    c10 = 0;
                    break;
                }
                break;
            case 64593:
                if (m21255g.equals("AC3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2194728:
                if (m21255g.equals("H264")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4739h.class != obj.getClass()) {
            return false;
        }
        C4739h c4739h = (C4739h) obj;
        return this.f9392a == c4739h.f9392a && this.f9393b == c4739h.f9393b && this.f9394c.equals(c4739h.f9394c) && this.f9395d.equals(c4739h.f9395d);
    }

    public int hashCode() {
        return ((((((217 + this.f9392a) * 31) + this.f9393b) * 31) + this.f9394c.hashCode()) * 31) + this.f9395d.hashCode();
    }
}
