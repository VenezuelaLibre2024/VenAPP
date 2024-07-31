package androidx.camera.core.impl.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: androidx.camera.core.impl.utils.i */
/* loaded from: classes.dex */
final class C0680i {

    /* renamed from: e */
    static final Charset f2957e = StandardCharsets.US_ASCII;

    /* renamed from: f */
    static final String[] f2958f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g */
    static final int[] f2959g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h */
    static final byte[] f2960h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a */
    public final int f2961a;

    /* renamed from: b */
    public final int f2962b;

    /* renamed from: c */
    public final long f2963c;

    /* renamed from: d */
    public final byte[] f2964d;

    C0680i(int i10, int i11, long j10, byte[] bArr) {
        this.f2961a = i10;
        this.f2962b = i11;
        this.f2963c = j10;
        this.f2964d = bArr;
    }

    C0680i(int i10, int i11, byte[] bArr) {
        this(i10, i11, -1L, bArr);
    }

    /* renamed from: a */
    public static C0680i m3296a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new C0680i(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f2957e);
        return new C0680i(1, bytes.length, bytes);
    }

    /* renamed from: b */
    public static C0680i m3297b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2959g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d10 : dArr) {
            wrap.putDouble(d10);
        }
        return new C0680i(12, dArr.length, wrap.array());
    }

    /* renamed from: c */
    public static C0680i m3298c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2959g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putInt(i10);
        }
        return new C0680i(9, iArr.length, wrap.array());
    }

    /* renamed from: d */
    public static C0680i m3299d(C0684m[] c0684mArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2959g[10] * c0684mArr.length]);
        wrap.order(byteOrder);
        for (C0684m c0684m : c0684mArr) {
            wrap.putInt((int) c0684m.m3332b());
            wrap.putInt((int) c0684m.m3331a());
        }
        return new C0680i(10, c0684mArr.length, wrap.array());
    }

    /* renamed from: e */
    public static C0680i m3300e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f2957e);
        return new C0680i(2, bytes.length, bytes);
    }

    /* renamed from: f */
    public static C0680i m3301f(long j10, ByteOrder byteOrder) {
        return m3302g(new long[]{j10}, byteOrder);
    }

    /* renamed from: g */
    public static C0680i m3302g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2959g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j10 : jArr) {
            wrap.putInt((int) j10);
        }
        return new C0680i(4, jArr.length, wrap.array());
    }

    /* renamed from: h */
    public static C0680i m3303h(C0684m[] c0684mArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2959g[5] * c0684mArr.length]);
        wrap.order(byteOrder);
        for (C0684m c0684m : c0684mArr) {
            wrap.putInt((int) c0684m.m3332b());
            wrap.putInt((int) c0684m.m3331a());
        }
        return new C0680i(5, c0684mArr.length, wrap.array());
    }

    /* renamed from: i */
    public static C0680i m3304i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2959g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putShort((short) i10);
        }
        return new C0680i(3, iArr.length, wrap.array());
    }

    /* renamed from: j */
    public int m3305j() {
        return f2959g[this.f2961a] * this.f2962b;
    }

    public String toString() {
        return "(" + f2958f[this.f2961a] + ", data length:" + this.f2964d.length + ")";
    }
}
