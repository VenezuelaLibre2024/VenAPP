package com.google.android.exoplayer2.source.rtsp;

import java.util.Map;
import t6.u1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f8348a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8349b;

    /* renamed from: c, reason: collision with root package name */
    public final u1 f8350c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.common.collect.y<String, String> f8351d;

    public h(u1 u1Var, int i10, int i11, Map<String, String> map) {
        this.f8348a = i10;
        this.f8349b = i11;
        this.f8350c = u1Var;
        this.f8351d = com.google.common.collect.y.c(map);
    }

    public static String a(String str) {
        String g10 = eb.c.g(str);
        g10.hashCode();
        char c10 = 65535;
        switch (g10.hashCode()) {
            case -1922091719:
                if (g10.equals("MPEG4-GENERIC")) {
                    c10 = 0;
                    break;
                }
                break;
            case 64593:
                if (g10.equals("AC3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2194728:
                if (g10.equals("H264")) {
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

    public static boolean b(a aVar) {
        String g10 = eb.c.g(aVar.f8262j.f8273b);
        g10.hashCode();
        char c10 = 65535;
        switch (g10.hashCode()) {
            case -1922091719:
                if (g10.equals("MPEG4-GENERIC")) {
                    c10 = 0;
                    break;
                }
                break;
            case 64593:
                if (g10.equals("AC3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2194728:
                if (g10.equals("H264")) {
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
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f8348a == hVar.f8348a && this.f8349b == hVar.f8349b && this.f8350c.equals(hVar.f8350c) && this.f8351d.equals(hVar.f8351d);
    }

    public int hashCode() {
        return ((((((217 + this.f8348a) * 31) + this.f8349b) * 31) + this.f8350c.hashCode()) * 31) + this.f8351d.hashCode();
    }
}
