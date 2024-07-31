package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.source.rtsp.C4725a;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.AbstractC5911y;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11145e;
import p363t8.C11172r0;
import p363t8.C11179x;
import p396v6.C11631a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.rtsp.r */
/* loaded from: classes.dex */
public final class C4750r {

    /* renamed from: a */
    public final C4739h f9474a;

    /* renamed from: b */
    public final Uri f9475b;

    public C4750r(C4725a c4725a, Uri uri) {
        C11137a.m34599a(c4725a.f9305i.containsKey("control"));
        this.f9474a = m12203b(c4725a);
        this.f9475b = m12202a(uri, (String) C11172r0.m34928j(c4725a.f9305i.get("control")));
    }

    /* renamed from: a */
    private static Uri m12202a(Uri uri, String str) {
        Uri parse = Uri.parse(str);
        return parse.isAbsolute() ? parse : str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    /* renamed from: b */
    static C4739h m12203b(C4725a c4725a) {
        int i10;
        char c10;
        C11108u1.b bVar = new C11108u1.b();
        int i11 = c4725a.f9301e;
        if (i11 > 0) {
            bVar.m34528I(i11);
        }
        C4725a.c cVar = c4725a.f9306j;
        int i12 = cVar.f9316a;
        String m12053a = C4739h.m12053a(cVar.f9317b);
        bVar.m34552g0(m12053a);
        int i13 = c4725a.f9306j.f9318c;
        if ("audio".equals(c4725a.f9297a)) {
            i10 = m12205d(c4725a.f9306j.f9319d, m12053a);
            bVar.m34553h0(i13).m34529J(i10);
        } else {
            i10 = -1;
        }
        AbstractC5911y<String, String> m11981a = c4725a.m11981a();
        int hashCode = m12053a.hashCode();
        if (hashCode == -53558318) {
            if (m12053a.equals("audio/mp4a-latm")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 187078296) {
            if (hashCode == 1331836730 && m12053a.equals("video/avc")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (m12053a.equals("audio/ac3")) {
                c10 = 2;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            C11137a.m34599a(i10 != -1);
            C11137a.m34599a(!m11981a.isEmpty());
            m12206e(bVar, m11981a, i10, i13);
        } else if (c10 == 1) {
            C11137a.m34599a(!m11981a.isEmpty());
            m12207f(bVar, m11981a);
        }
        C11137a.m34599a(i13 > 0);
        return new C4739h(bVar.m34526G(), i12, i13, m11981a);
    }

    /* renamed from: c */
    private static byte[] m12204c(String str) {
        byte[] decode = Base64.decode(str, 0);
        int length = decode.length;
        byte[] bArr = C11179x.f29069a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(decode, 0, bArr2, bArr.length, decode.length);
        return bArr2;
    }

    /* renamed from: d */
    private static int m12205d(int i10, String str) {
        return i10 != -1 ? i10 : str.equals("audio/ac3") ? 6 : 1;
    }

    /* renamed from: e */
    private static void m12206e(C11108u1.b bVar, AbstractC5911y<String, String> abstractC5911y, int i10, int i11) {
        C11137a.m34599a(abstractC5911y.containsKey("profile-level-id"));
        String valueOf = String.valueOf((String) C11137a.m34603e(abstractC5911y.get("profile-level-id")));
        bVar.m34530K(valueOf.length() != 0 ? "mp4a.40.".concat(valueOf) : new String("mp4a.40."));
        bVar.m34541V(AbstractC5907w.m15082w(C11631a.m36457a(i11, i10)));
    }

    /* renamed from: f */
    private static void m12207f(C11108u1.b bVar, AbstractC5911y<String, String> abstractC5911y) {
        C11137a.m34599a(abstractC5911y.containsKey("sprop-parameter-sets"));
        String[] m34891R0 = C11172r0.m34891R0((String) C11137a.m34603e(abstractC5911y.get("sprop-parameter-sets")), ",");
        C11137a.m34599a(m34891R0.length == 2);
        AbstractC5907w m15083x = AbstractC5907w.m15083x(m12204c(m34891R0[0]), m12204c(m34891R0[1]));
        bVar.m34541V(m15083x);
        byte[] bArr = m15083x.get(0);
        C11179x.c m35025l = C11179x.m35025l(bArr, C11179x.f29069a.length, bArr.length);
        bVar.m34548c0(m35025l.f29096h);
        bVar.m34538S(m35025l.f29095g);
        bVar.m34559n0(m35025l.f29094f);
        String str = abstractC5911y.get("profile-level-id");
        bVar.m34530K(str != null ? str.length() != 0 ? "avc1.".concat(str) : new String("avc1.") : C11145e.m34644a(m35025l.f29089a, m35025l.f29090b, m35025l.f29091c));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4750r.class != obj.getClass()) {
            return false;
        }
        C4750r c4750r = (C4750r) obj;
        return this.f9474a.equals(c4750r.f9474a) && this.f9475b.equals(c4750r.f9475b);
    }

    public int hashCode() {
        return ((217 + this.f9474a.hashCode()) * 31) + this.f9475b.hashCode();
    }
}
