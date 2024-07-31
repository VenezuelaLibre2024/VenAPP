package a7;

import com.google.common.collect.w;
import t6.u1;
import t8.e0;
import t8.r0;
import t8.s;

/* loaded from: classes.dex */
final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f112a;

    public g(u1 u1Var) {
        this.f112a = u1Var;
    }

    private static String a(int i10) {
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

    private static String b(int i10) {
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

    private static a c(e0 e0Var) {
        e0Var.V(4);
        int u10 = e0Var.u();
        int u11 = e0Var.u();
        e0Var.V(4);
        int u12 = e0Var.u();
        String a10 = a(u12);
        if (a10 != null) {
            u1.b bVar = new u1.b();
            bVar.n0(u10).S(u11).g0(a10);
            return new g(bVar.G());
        }
        s.i("StreamFormatChunk", "Ignoring track with unsupported compression " + u12);
        return null;
    }

    public static a d(int i10, e0 e0Var) {
        if (i10 == 2) {
            return c(e0Var);
        }
        if (i10 == 1) {
            return e(e0Var);
        }
        s.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + r0.l0(i10));
        return null;
    }

    private static a e(e0 e0Var) {
        int z10 = e0Var.z();
        String b10 = b(z10);
        if (b10 == null) {
            s.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + z10);
            return null;
        }
        int z11 = e0Var.z();
        int u10 = e0Var.u();
        e0Var.V(6);
        int c02 = r0.c0(e0Var.N());
        int z12 = e0Var.z();
        byte[] bArr = new byte[z12];
        e0Var.l(bArr, 0, z12);
        u1.b bVar = new u1.b();
        bVar.g0(b10).J(z11).h0(u10);
        if ("audio/raw".equals(b10) && c02 != 0) {
            bVar.a0(c02);
        }
        if ("audio/mp4a-latm".equals(b10) && z12 > 0) {
            bVar.V(w.w(bArr));
        }
        return new g(bVar.G());
    }

    @Override // a7.a
    public int getType() {
        return 1718776947;
    }
}
