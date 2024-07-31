package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.source.rtsp.a;
import t6.u1;
import t8.r0;
import t8.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final h f8419a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f8420b;

    public r(a aVar, Uri uri) {
        t8.a.a(aVar.f8261i.containsKey("control"));
        this.f8419a = b(aVar);
        this.f8420b = a(uri, (String) r0.j(aVar.f8261i.get("control")));
    }

    private static Uri a(Uri uri, String str) {
        Uri parse = Uri.parse(str);
        return parse.isAbsolute() ? parse : str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    static h b(a aVar) {
        int i10;
        char c10;
        u1.b bVar = new u1.b();
        int i11 = aVar.f8257e;
        if (i11 > 0) {
            bVar.I(i11);
        }
        a.c cVar = aVar.f8262j;
        int i12 = cVar.f8272a;
        String a10 = h.a(cVar.f8273b);
        bVar.g0(a10);
        int i13 = aVar.f8262j.f8274c;
        if ("audio".equals(aVar.f8253a)) {
            i10 = d(aVar.f8262j.f8275d, a10);
            bVar.h0(i13).J(i10);
        } else {
            i10 = -1;
        }
        com.google.common.collect.y<String, String> a11 = aVar.a();
        int hashCode = a10.hashCode();
        if (hashCode == -53558318) {
            if (a10.equals("audio/mp4a-latm")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 187078296) {
            if (hashCode == 1331836730 && a10.equals("video/avc")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (a10.equals("audio/ac3")) {
                c10 = 2;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            t8.a.a(i10 != -1);
            t8.a.a(!a11.isEmpty());
            e(bVar, a11, i10, i13);
        } else if (c10 == 1) {
            t8.a.a(!a11.isEmpty());
            f(bVar, a11);
        }
        t8.a.a(i13 > 0);
        return new h(bVar.G(), i12, i13, a11);
    }

    private static byte[] c(String str) {
        byte[] decode = Base64.decode(str, 0);
        int length = decode.length;
        byte[] bArr = t8.x.f26773a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(decode, 0, bArr2, bArr.length, decode.length);
        return bArr2;
    }

    private static int d(int i10, String str) {
        return i10 != -1 ? i10 : str.equals("audio/ac3") ? 6 : 1;
    }

    private static void e(u1.b bVar, com.google.common.collect.y<String, String> yVar, int i10, int i11) {
        t8.a.a(yVar.containsKey("profile-level-id"));
        String valueOf = String.valueOf((String) t8.a.e(yVar.get("profile-level-id")));
        bVar.K(valueOf.length() != 0 ? "mp4a.40.".concat(valueOf) : new String("mp4a.40."));
        bVar.V(com.google.common.collect.w.w(v6.a.a(i11, i10)));
    }

    private static void f(u1.b bVar, com.google.common.collect.y<String, String> yVar) {
        t8.a.a(yVar.containsKey("sprop-parameter-sets"));
        String[] R0 = r0.R0((String) t8.a.e(yVar.get("sprop-parameter-sets")), ",");
        t8.a.a(R0.length == 2);
        com.google.common.collect.w x10 = com.google.common.collect.w.x(c(R0[0]), c(R0[1]));
        bVar.V(x10);
        byte[] bArr = x10.get(0);
        x.c l10 = t8.x.l(bArr, t8.x.f26773a.length, bArr.length);
        bVar.c0(l10.f26800h);
        bVar.S(l10.f26799g);
        bVar.n0(l10.f26798f);
        String str = yVar.get("profile-level-id");
        bVar.K(str != null ? str.length() != 0 ? "avc1.".concat(str) : new String("avc1.") : t8.e.a(l10.f26793a, l10.f26794b, l10.f26795c));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f8419a.equals(rVar.f8419a) && this.f8420b.equals(rVar.f8420b);
    }

    public int hashCode() {
        return ((217 + this.f8419a.hashCode()) * 31) + this.f8420b.hashCode();
    }
}
