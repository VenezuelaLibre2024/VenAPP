package p009a7;

import com.google.common.collect.AbstractC5907w;
import p361t6.C11108u1;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: a7.g */
/* loaded from: classes.dex */
final class C0041g implements InterfaceC0035a {

    /* renamed from: a */
    public final C11108u1 f112a;

    public C0041g(C11108u1 c11108u1) {
        this.f112a = c11108u1;
    }

    /* renamed from: a */
    private static String m153a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    /* renamed from: b */
    private static String m154b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    /* renamed from: c */
    private static InterfaceC0035a m155c(C11146e0 c11146e0) {
        c11146e0.m34678V(4);
        int m34696u = c11146e0.m34696u();
        int m34696u2 = c11146e0.m34696u();
        c11146e0.m34678V(4);
        int m34696u3 = c11146e0.m34696u();
        String m153a = m153a(m34696u3);
        if (m153a != null) {
            C11108u1.b bVar = new C11108u1.b();
            bVar.m34559n0(m34696u).m34538S(m34696u2).m34552g0(m153a);
            return new C0041g(bVar.m34526G());
        }
        C11173s.m34970i("StreamFormatChunk", "Ignoring track with unsupported compression " + m34696u3);
        return null;
    }

    /* renamed from: d */
    public static InterfaceC0035a m156d(int i10, C11146e0 c11146e0) {
        if (i10 == 2) {
            return m155c(c11146e0);
        }
        if (i10 == 1) {
            return m157e(c11146e0);
        }
        C11173s.m34970i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + C11172r0.m34933l0(i10));
        return null;
    }

    /* renamed from: e */
    private static InterfaceC0035a m157e(C11146e0 c11146e0) {
        int m34701z = c11146e0.m34701z();
        String m154b = m154b(m34701z);
        if (m154b == null) {
            C11173s.m34970i("StreamFormatChunk", "Ignoring track with unsupported format tag " + m34701z);
            return null;
        }
        int m34701z2 = c11146e0.m34701z();
        int m34696u = c11146e0.m34696u();
        c11146e0.m34678V(6);
        int m34915c0 = C11172r0.m34915c0(c11146e0.m34670N());
        int m34701z3 = c11146e0.m34701z();
        byte[] bArr = new byte[m34701z3];
        c11146e0.m34688l(bArr, 0, m34701z3);
        C11108u1.b bVar = new C11108u1.b();
        bVar.m34552g0(m154b).m34529J(m34701z2).m34553h0(m34696u);
        if ("audio/raw".equals(m154b) && m34915c0 != 0) {
            bVar.m34546a0(m34915c0);
        }
        if ("audio/mp4a-latm".equals(m154b) && m34701z3 > 0) {
            bVar.m34541V(AbstractC5907w.m15082w(bArr));
        }
        return new C0041g(bVar.m34526G());
    }

    @Override // p009a7.InterfaceC0035a
    public int getType() {
        return 1718776947;
    }
}
