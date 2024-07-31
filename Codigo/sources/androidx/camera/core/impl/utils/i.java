package androidx.camera.core.impl.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
final class i {

    /* renamed from: e, reason: collision with root package name */
    static final Charset f2613e = StandardCharsets.US_ASCII;

    /* renamed from: f, reason: collision with root package name */
    static final String[] f2614f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f2615g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h, reason: collision with root package name */
    static final byte[] f2616h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public final int f2617a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2618b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2619c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2620d;

    i(int i10, int i11, long j10, byte[] bArr) {
        this.f2617a = i10;
        this.f2618b = i11;
        this.f2619c = j10;
        this.f2620d = bArr;
    }

    i(int i10, int i11, byte[] bArr) {
        this(i10, i11, -1L, bArr);
    }

    public static i a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new i(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f2613e);
        return new i(1, bytes.length, bytes);
    }

    public static i b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2615g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d10 : dArr) {
            wrap.putDouble(d10);
        }
        return new i(12, dArr.length, wrap.array());
    }

    public static i c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2615g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putInt(i10);
        }
        return new i(9, iArr.length, wrap.array());
    }

    public static i d(m[] mVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2615g[10] * mVarArr.length]);
        wrap.order(byteOrder);
        for (m mVar : mVarArr) {
            wrap.putInt((int) mVar.b());
            wrap.putInt((int) mVar.a());
        }
        return new i(10, mVarArr.length, wrap.array());
    }

    public static i e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f2613e);
        return new i(2, bytes.length, bytes);
    }

    public static i f(long j10, ByteOrder byteOrder) {
        return g(new long[]{j10}, byteOrder);
    }

    public static i g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2615g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j10 : jArr) {
            wrap.putInt((int) j10);
        }
        return new i(4, jArr.length, wrap.array());
    }

    public static i h(m[] mVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2615g[5] * mVarArr.length]);
        wrap.order(byteOrder);
        for (m mVar : mVarArr) {
            wrap.putInt((int) mVar.b());
            wrap.putInt((int) mVar.a());
        }
        return new i(5, mVarArr.length, wrap.array());
    }

    public static i i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2615g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putShort((short) i10);
        }
        return new i(3, iArr.length, wrap.array());
    }

    public int j() {
        return f2615g[this.f2617a] * this.f2618b;
    }

    public String toString() {
        return "(" + f2614f[this.f2617a] + ", data length:" + this.f2620d.length + ")";
    }
}
