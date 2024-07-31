package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.b;
import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.embedding.android.KeyboardMap;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public class a {
    private static SimpleDateFormat U;
    private static SimpleDateFormat V;
    private static final e[] Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final e[] f4428a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final e[] f4429b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final e[] f4430c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final e[] f4431d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final e f4432e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final e[] f4433f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final e[] f4434g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final e[] f4435h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final e[] f4436i0;

    /* renamed from: j0, reason: collision with root package name */
    static final e[][] f4437j0;

    /* renamed from: k0, reason: collision with root package name */
    private static final e[] f4438k0;

    /* renamed from: l0, reason: collision with root package name */
    private static final HashMap<Integer, e>[] f4439l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final HashMap<String, e>[] f4440m0;

    /* renamed from: n0, reason: collision with root package name */
    private static final HashSet<String> f4441n0;

    /* renamed from: o0, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f4442o0;

    /* renamed from: p0, reason: collision with root package name */
    static final Charset f4443p0;

    /* renamed from: q0, reason: collision with root package name */
    static final byte[] f4444q0;

    /* renamed from: r0, reason: collision with root package name */
    private static final byte[] f4445r0;

    /* renamed from: s0, reason: collision with root package name */
    private static final Pattern f4446s0;

    /* renamed from: t0, reason: collision with root package name */
    private static final Pattern f4447t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final Pattern f4448u0;

    /* renamed from: v0, reason: collision with root package name */
    private static final Pattern f4450v0;

    /* renamed from: a, reason: collision with root package name */
    private String f4455a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f4456b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f4457c;

    /* renamed from: d, reason: collision with root package name */
    private int f4458d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4459e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, d>[] f4460f;

    /* renamed from: g, reason: collision with root package name */
    private Set<Integer> f4461g;

    /* renamed from: h, reason: collision with root package name */
    private ByteOrder f4462h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4463i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4464j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4465k;

    /* renamed from: l, reason: collision with root package name */
    private int f4466l;

    /* renamed from: m, reason: collision with root package name */
    private int f4467m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f4468n;

    /* renamed from: o, reason: collision with root package name */
    private int f4469o;

    /* renamed from: p, reason: collision with root package name */
    private int f4470p;

    /* renamed from: q, reason: collision with root package name */
    private int f4471q;

    /* renamed from: r, reason: collision with root package name */
    private int f4472r;

    /* renamed from: s, reason: collision with root package name */
    private int f4473s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4474t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f4475u;

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f4449v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w, reason: collision with root package name */
    private static final List<Integer> f4451w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x, reason: collision with root package name */
    private static final List<Integer> f4452x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4453y = {8, 8, 8};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4454z = {4};
    public static final int[] A = {8};
    static final byte[] B = {-1, -40, -1};
    private static final byte[] C = {102, 116, 121, 112};
    private static final byte[] D = {109, 105, 102, 49};
    private static final byte[] E = {104, 101, 105, 99};
    private static final byte[] F = {79, 76, 89, 77, 80, 0};
    private static final byte[] G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] H = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] I = {101, 88, 73, 102};
    private static final byte[] J = {73, 72, 68, 82};
    private static final byte[] K = {73, 69, 78, 68};
    private static final byte[] L = {82, 73, 70, 70};
    private static final byte[] M = {87, 69, 66, 80};
    private static final byte[] N = {69, 88, 73, 70};
    private static final byte[] O = {-99, 1, 42};
    private static final byte[] P = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] R = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] S = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] T = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0063a extends MediaDataSource {

        /* renamed from: a, reason: collision with root package name */
        long f4476a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f4477b;

        C0063a(g gVar) {
            this.f4477b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f4476a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f4477b.available()) {
                        return -1;
                    }
                    this.f4477b.g(j10);
                    this.f4476a = j10;
                }
                if (i11 > this.f4477b.available()) {
                    i11 = this.f4477b.available();
                }
                int read = this.f4477b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f4476a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f4476a = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: e, reason: collision with root package name */
        private static final ByteOrder f4479e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f, reason: collision with root package name */
        private static final ByteOrder f4480f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a, reason: collision with root package name */
        final DataInputStream f4481a;

        /* renamed from: b, reason: collision with root package name */
        private ByteOrder f4482b;

        /* renamed from: c, reason: collision with root package name */
        int f4483c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f4484d;

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f4482b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f4481a = dataInputStream;
            dataInputStream.mark(0);
            this.f4483c = 0;
            this.f4482b = byteOrder;
        }

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f4483c;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f4481a.available();
        }

        public long b() {
            return readInt() & KeyboardMap.kValueMask;
        }

        public void e(ByteOrder byteOrder) {
            this.f4482b = byteOrder;
        }

        public void f(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f4481a.skip(i12);
                if (skip <= 0) {
                    if (this.f4484d == null) {
                        this.f4484d = new byte[8192];
                    }
                    skip = this.f4481a.read(this.f4484d, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.f4483c += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f4483c++;
            return this.f4481a.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f4481a.read(bArr, i10, i11);
            this.f4483c += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f4483c++;
            return this.f4481a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f4483c++;
            int read = this.f4481a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f4483c += 2;
            return this.f4481a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f4483c += bArr.length;
            this.f4481a.readFully(bArr);
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) {
            this.f4483c += i11;
            this.f4481a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f4483c += 4;
            int read = this.f4481a.read();
            int read2 = this.f4481a.read();
            int read3 = this.f4481a.read();
            int read4 = this.f4481a.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4482b;
            if (byteOrder == f4479e) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f4480f) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f4482b);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f4483c += 8;
            int read = this.f4481a.read();
            int read2 = this.f4481a.read();
            int read3 = this.f4481a.read();
            int read4 = this.f4481a.read();
            int read5 = this.f4481a.read();
            int read6 = this.f4481a.read();
            int read7 = this.f4481a.read();
            int read8 = this.f4481a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4482b;
            if (byteOrder == f4479e) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f4480f) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f4482b);
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f4483c += 2;
            int read = this.f4481a.read();
            int read2 = this.f4481a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4482b;
            if (byteOrder == f4479e) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f4480f) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f4482b);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f4483c += 2;
            return this.f4481a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f4483c++;
            return this.f4481a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f4483c += 2;
            int read = this.f4481a.read();
            int read2 = this.f4481a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4482b;
            if (byteOrder == f4479e) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f4480f) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f4482b);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        final OutputStream f4485a;

        /* renamed from: b, reason: collision with root package name */
        private ByteOrder f4486b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f4485a = outputStream;
            this.f4486b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f4486b = byteOrder;
        }

        public void b(int i10) {
            this.f4485a.write(i10);
        }

        public void e(int i10) {
            OutputStream outputStream;
            int i11;
            ByteOrder byteOrder = this.f4486b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f4485a.write((i10 >>> 0) & 255);
                this.f4485a.write((i10 >>> 8) & 255);
                this.f4485a.write((i10 >>> 16) & 255);
                outputStream = this.f4485a;
                i11 = i10 >>> 24;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.f4485a.write((i10 >>> 24) & 255);
                this.f4485a.write((i10 >>> 16) & 255);
                this.f4485a.write((i10 >>> 8) & 255);
                outputStream = this.f4485a;
                i11 = i10 >>> 0;
            }
            outputStream.write(i11 & 255);
        }

        public void f(short s10) {
            OutputStream outputStream;
            int i10;
            ByteOrder byteOrder = this.f4486b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f4485a.write((s10 >>> 0) & 255);
                outputStream = this.f4485a;
                i10 = s10 >>> 8;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.f4485a.write((s10 >>> 8) & 255);
                outputStream = this.f4485a;
                i10 = s10 >>> 0;
            }
            outputStream.write(i10 & 255);
        }

        public void g(long j10) {
            e((int) j10);
        }

        public void i(int i10) {
            f((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f4485a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            this.f4485a.write(bArr, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f4487a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4488b;

        /* renamed from: c, reason: collision with root package name */
        public final long f4489c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f4490d;

        d(int i10, int i11, long j10, byte[] bArr) {
            this.f4487a = i10;
            this.f4488b = i11;
            this.f4489c = j10;
            this.f4490d = bArr;
        }

        d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f4443p0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d10 : dArr) {
                wrap.putDouble(d10);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putInt(i10);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f4495a);
                wrap.putInt((int) fVar.f4496b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f4443p0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f4495a);
                wrap.putInt((int) fVar.f4496b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (o10 instanceof String) {
                return Double.parseDouble((String) o10);
            }
            if (o10 instanceof long[]) {
                if (((long[]) o10).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o10 instanceof int[]) {
                if (((int[]) o10).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o10 instanceof double[]) {
                double[] dArr = (double[]) o10;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o10 instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) o10;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (o10 instanceof String) {
                return Integer.parseInt((String) o10);
            }
            if (o10 instanceof long[]) {
                long[] jArr = (long[]) o10;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o10 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) o10;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                return null;
            }
            if (o10 instanceof String) {
                return (String) o10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (o10 instanceof long[]) {
                long[] jArr = (long[]) o10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (o10 instanceof int[]) {
                int[] iArr = (int[]) o10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (o10 instanceof double[]) {
                double[] dArr = (double[]) o10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(o10 instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) o10;
            while (i10 < fVarArr.length) {
                sb2.append(fVarArr[i10].f4495a);
                sb2.append('/');
                sb2.append(fVarArr[i10].f4496b);
                i10++;
                if (i10 != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:168:0x0198 */
        /* JADX WARN: Removed duplicated region for block: B:171:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object o(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 448
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.X[this.f4487a] * this.f4488b;
        }

        public String toString() {
            return "(" + a.W[this.f4487a] + ", data length:" + this.f4490d.length + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f4491a;

        /* renamed from: b, reason: collision with root package name */
        public final String f4492b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4493c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4494d;

        e(String str, int i10, int i11) {
            this.f4492b = str;
            this.f4491a = i10;
            this.f4493c = i11;
            this.f4494d = -1;
        }

        e(String str, int i10, int i11, int i12) {
            this.f4492b = str;
            this.f4491a = i10;
            this.f4493c = i11;
            this.f4494d = i12;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f4493c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f4494d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f4495a;

        /* renamed from: b, reason: collision with root package name */
        public final long f4496b;

        f(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        f(long j10, long j11) {
            if (j11 == 0) {
                this.f4495a = 0L;
                this.f4496b = 1L;
            } else {
                this.f4495a = j10;
                this.f4496b = j11;
            }
        }

        public double a() {
            return this.f4495a / this.f4496b;
        }

        public String toString() {
            return this.f4495a + "/" + this.f4496b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends b {
        g(InputStream inputStream) {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.f4481a.mark(a.e.API_PRIORITY_OTHER);
        }

        g(byte[] bArr) {
            super(bArr);
            this.f4481a.mark(a.e.API_PRIORITY_OTHER);
        }

        public void g(long j10) {
            int i10 = this.f4483c;
            if (i10 > j10) {
                this.f4483c = 0;
                this.f4481a.reset();
            } else {
                j10 -= i10;
            }
            f((int) j10);
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", RecognitionOptions.QR_CODE, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f4428a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f4429b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f4430c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", RecognitionOptions.QR_CODE, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f4431d0 = eVarArr5;
        f4432e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", RecognitionOptions.QR_CODE, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f4433f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f4434g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f4435h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f4436i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f4437j0 = eVarArr10;
        f4438k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f4439l0 = new HashMap[eVarArr10.length];
        f4440m0 = new HashMap[eVarArr10.length];
        f4441n0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f4442o0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f4443p0 = forName;
        f4444q0 = "Exif\u0000\u0000".getBytes(forName);
        f4445r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f4437j0;
            if (i10 >= eVarArr11.length) {
                HashMap<Integer, Integer> hashMap = f4442o0;
                e[] eVarArr12 = f4438k0;
                hashMap.put(Integer.valueOf(eVarArr12[0].f4491a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f4491a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f4491a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f4491a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f4491a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f4491a), 8);
                f4446s0 = Pattern.compile(".*[1-9].*");
                f4447t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f4448u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f4450v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f4439l0[i10] = new HashMap<>();
            f4440m0[i10] = new HashMap<>();
            for (e eVar : eVarArr11[i10]) {
                f4439l0[i10].put(Integer.valueOf(eVar.f4491a), eVar);
                f4440m0[i10].put(eVar.f4492b, eVar);
            }
            i10++;
        }
    }

    public a(FileDescriptor fileDescriptor) {
        boolean z10;
        FileInputStream fileInputStream;
        Throwable th2;
        e[][] eVarArr = f4437j0;
        this.f4460f = new HashMap[eVarArr.length];
        this.f4461g = new HashSet(eVarArr.length);
        this.f4462h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor == null) {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
        this.f4457c = null;
        this.f4455a = null;
        if (I(fileDescriptor)) {
            this.f4456b = fileDescriptor;
            try {
                fileDescriptor = b.a.b(fileDescriptor);
                z10 = true;
            } catch (Exception e10) {
                throw new IOException("Failed to duplicate file descriptor", e10);
            }
        } else {
            this.f4456b = null;
            z10 = false;
        }
        try {
            fileInputStream = new FileInputStream(fileDescriptor);
        } catch (Throwable th3) {
            fileInputStream = null;
            th2 = th3;
        }
        try {
            N(fileInputStream);
            androidx.exifinterface.media.b.c(fileInputStream);
            if (z10) {
                androidx.exifinterface.media.b.b(fileDescriptor);
            }
        } catch (Throwable th4) {
            th2 = th4;
            androidx.exifinterface.media.b.c(fileInputStream);
            if (z10) {
                androidx.exifinterface.media.b.b(fileDescriptor);
            }
            throw th2;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i10) {
        e[][] eVarArr = f4437j0;
        this.f4460f = new HashMap[eVarArr.length];
        this.f4461g = new HashSet(eVarArr.length);
        this.f4462h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.f4455a = null;
        if (i10 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f4444q0.length);
            if (!B(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f4459e = true;
            this.f4457c = null;
            this.f4456b = null;
            inputStream = bufferedInputStream;
        } else {
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f4457c = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (I(fileInputStream.getFD())) {
                        this.f4457c = null;
                        this.f4456b = fileInputStream.getFD();
                    }
                }
                this.f4457c = null;
            }
            this.f4456b = null;
        }
        N(inputStream);
    }

    public a(String str) {
        e[][] eVarArr = f4437j0;
        this.f4460f = new HashMap[eVarArr.length];
        this.f4461g = new HashSet(eVarArr.length);
        this.f4462h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        A(str);
    }

    private void A(String str) {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f4457c = null;
        this.f4455a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (I(fileInputStream.getFD())) {
                this.f4456b = fileInputStream.getFD();
            } else {
                this.f4456b = null;
            }
            N(fileInputStream);
            androidx.exifinterface.media.b.c(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            androidx.exifinterface.media.b.c(fileInputStream2);
            throw th;
        }
    }

    private static boolean B(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f4444q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f4444q0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean C(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j10;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    readInt = bVar.readInt();
                    bArr2 = new byte[4];
                    bVar.read(bArr2);
                } catch (Exception e10) {
                    e = e10;
                    bVar2 = bVar;
                    if (f4449v) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
        if (!Arrays.equals(bArr2, C)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j10 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j12 != 1) {
                if (Arrays.equals(bArr3, D)) {
                    z10 = true;
                } else if (Arrays.equals(bArr3, E)) {
                    z11 = true;
                }
                if (z10 && z11) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean D(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = B;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean E(byte[] bArr) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder Q2 = Q(bVar);
            this.f4462h = Q2;
            bVar.e(Q2);
            short readShort = bVar.readShort();
            boolean z10 = readShort == 20306 || readShort == 21330;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private boolean F(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = H;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean G(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean H(byte[] bArr) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder Q2 = Q(bVar);
            this.f4462h = Q2;
            bVar.e(Q2);
            boolean z10 = bVar.readShort() == 85;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private static boolean I(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f4449v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean J(HashMap hashMap) {
        d dVar;
        int m10;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f4462h);
            int[] iArr2 = f4453y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f4458d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m10 = dVar.m(this.f4462h)) == 1 && Arrays.equals(iArr, A)) || (m10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f4449v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private static boolean K(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    private boolean L(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f4462h) <= 512 && dVar2.m(this.f4462h) <= 512;
    }

    private boolean M(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = L;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = M;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[L.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    private void N(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i10 = 0; i10 < f4437j0.length; i10++) {
            try {
                try {
                    this.f4460f[i10] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException e10) {
                    boolean z10 = f4449v;
                    if (z10) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    a();
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                a();
                if (f4449v) {
                    P();
                }
            }
        }
        if (!this.f4459e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f4458d = m(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (c0(this.f4458d)) {
            g gVar = new g(inputStream);
            if (this.f4459e) {
                t(gVar);
            } else {
                int i11 = this.f4458d;
                if (i11 == 12) {
                    j(gVar);
                } else if (i11 == 7) {
                    n(gVar);
                } else if (i11 == 10) {
                    s(gVar);
                } else {
                    q(gVar);
                }
            }
            gVar.g(this.f4470p);
            b0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f4458d;
            if (i12 == 4) {
                k(bVar, 0, 0);
            } else if (i12 == 13) {
                o(bVar);
            } else if (i12 == 9) {
                p(bVar);
            } else if (i12 == 14) {
                w(bVar);
            }
        }
    }

    private void O(b bVar) {
        ByteOrder Q2 = Q(bVar);
        this.f4462h = Q2;
        bVar.e(Q2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f4458d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i11 = readInt - 8;
        if (i11 > 0) {
            bVar.f(i11);
        }
    }

    private void P() {
        for (int i10 = 0; i10 < this.f4460f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f4460f[i10].size());
            for (Map.Entry<String, d> entry : this.f4460f[i10].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.n(this.f4462h) + "'");
            }
        }
    }

    private ByteOrder Q(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f4449v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f4449v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void R(byte[] bArr, int i10) {
        g gVar = new g(bArr);
        O(gVar);
        S(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void S(androidx.exifinterface.media.a.g r30, int r31) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.S(androidx.exifinterface.media.a$g, int):void");
    }

    private void T(String str) {
        for (int i10 = 0; i10 < f4437j0.length; i10++) {
            this.f4460f[i10].remove(str);
        }
    }

    private void U(int i10, String str, String str2) {
        if (this.f4460f[i10].isEmpty() || this.f4460f[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> hashMap = this.f4460f[i10];
        hashMap.put(str2, hashMap.get(str));
        this.f4460f[i10].remove(str);
    }

    private void V(g gVar, int i10) {
        d dVar = this.f4460f[i10].get("ImageLength");
        d dVar2 = this.f4460f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f4460f[i10].get("JPEGInterchangeFormat");
            d dVar4 = this.f4460f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int m10 = dVar3.m(this.f4462h);
            int m11 = dVar3.m(this.f4462h);
            gVar.g(m10);
            byte[] bArr = new byte[m11];
            gVar.read(bArr);
            k(new b(bArr), m10, i10);
        }
    }

    private void X(InputStream inputStream, OutputStream outputStream) {
        if (f4449v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        d remove = (f("Xmp") == null || !this.f4475u) ? null : this.f4460f[0].remove("Xmp");
        cVar.b(-1);
        cVar.b(-31);
        g0(cVar);
        if (remove != null) {
            this.f4460f[0].put("Xmp", remove);
        }
        byte[] bArr = new byte[RecognitionOptions.AZTEC];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.b(-1);
                cVar.b(readByte);
                androidx.exifinterface.media.b.e(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.b(-1);
                cVar.b(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.i(readUnsignedShort);
                int i10 = readUnsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int read = bVar.read(bArr, 0, Math.min(i10, RecognitionOptions.AZTEC));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i10 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                if (readUnsignedShort2 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (readUnsignedShort2 >= 6) {
                    if (bVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f4444q0)) {
                        bVar.f(readUnsignedShort2 - 6);
                    }
                }
                cVar.b(-1);
                cVar.b(readByte);
                cVar.i(readUnsignedShort2 + 2);
                if (readUnsignedShort2 >= 6) {
                    readUnsignedShort2 -= 6;
                    cVar.write(bArr2);
                }
                while (readUnsignedShort2 > 0) {
                    int read2 = bVar.read(bArr, 0, Math.min(readUnsignedShort2, RecognitionOptions.AZTEC));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        readUnsignedShort2 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void Y(InputStream inputStream, OutputStream outputStream) {
        if (f4449v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = H;
        androidx.exifinterface.media.b.f(bVar, cVar, bArr.length);
        int i10 = this.f4470p;
        if (i10 == 0) {
            int readInt = bVar.readInt();
            cVar.e(readInt);
            androidx.exifinterface.media.b.f(bVar, cVar, readInt + 4 + 4);
        } else {
            androidx.exifinterface.media.b.f(bVar, cVar, ((i10 - bArr.length) - 4) - 4);
            bVar.f(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                g0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f4485a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.e((int) crc32.getValue());
                androidx.exifinterface.media.b.c(byteArrayOutputStream2);
                androidx.exifinterface.media.b.e(bVar, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                androidx.exifinterface.media.b.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void Z(InputStream inputStream, OutputStream outputStream) {
        int i10;
        int i11;
        int i12;
        if (f4449v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = L;
        androidx.exifinterface.media.b.f(bVar, cVar, bArr.length);
        byte[] bArr2 = M;
        bVar.f(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i13 = this.f4470p;
                    if (i13 != 0) {
                        androidx.exifinterface.media.b.f(bVar, cVar2, ((i13 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                        bVar.f(4);
                        int readInt = bVar.readInt();
                        if (readInt % 2 != 0) {
                            readInt++;
                        }
                        bVar.f(readInt);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (bVar.read(bArr3) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr4 = P;
                        boolean z10 = true;
                        if (!Arrays.equals(bArr3, bArr4)) {
                            byte[] bArr5 = R;
                            if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, Q)) {
                                int readInt2 = bVar.readInt();
                                int i14 = readInt2 % 2 == 1 ? readInt2 + 1 : readInt2;
                                byte[] bArr6 = new byte[3];
                                if (Arrays.equals(bArr3, bArr5)) {
                                    bVar.read(bArr6);
                                    byte[] bArr7 = new byte[3];
                                    if (bVar.read(bArr7) != 3 || !Arrays.equals(O, bArr7)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i10 = bVar.readInt();
                                    i14 -= 10;
                                    i12 = (i10 << 2) >> 18;
                                    i11 = (i10 << 18) >> 18;
                                    z10 = false;
                                } else if (!Arrays.equals(bArr3, Q)) {
                                    i10 = 0;
                                    z10 = false;
                                    i11 = 0;
                                    i12 = 0;
                                } else {
                                    if (bVar.readByte() != 47) {
                                        throw new IOException("Encountered error while checking VP8L signature");
                                    }
                                    i10 = bVar.readInt();
                                    i11 = (i10 & 16383) + 1;
                                    i12 = ((i10 & 268419072) >>> 14) + 1;
                                    if ((i10 & 268435456) == 0) {
                                        z10 = false;
                                    }
                                    i14 -= 5;
                                }
                                cVar2.write(bArr4);
                                cVar2.e(10);
                                byte[] bArr8 = new byte[10];
                                if (z10) {
                                    bArr8[0] = (byte) (bArr8[0] | 16);
                                }
                                bArr8[0] = (byte) (bArr8[0] | 8);
                                int i15 = i11 - 1;
                                int i16 = i12 - 1;
                                bArr8[4] = (byte) i15;
                                bArr8[5] = (byte) (i15 >> 8);
                                bArr8[6] = (byte) (i15 >> 16);
                                bArr8[7] = (byte) i16;
                                bArr8[8] = (byte) (i16 >> 8);
                                bArr8[9] = (byte) (i16 >> 16);
                                cVar2.write(bArr8);
                                cVar2.write(bArr3);
                                cVar2.e(readInt2);
                                if (Arrays.equals(bArr3, bArr5)) {
                                    cVar2.write(bArr6);
                                    cVar2.write(O);
                                } else {
                                    if (Arrays.equals(bArr3, Q)) {
                                        cVar2.write(47);
                                    }
                                    androidx.exifinterface.media.b.f(bVar, cVar2, i14);
                                }
                                cVar2.e(i10);
                                androidx.exifinterface.media.b.f(bVar, cVar2, i14);
                            }
                            androidx.exifinterface.media.b.e(bVar, cVar2);
                            int size = byteArrayOutputStream2.size();
                            byte[] bArr9 = M;
                            cVar.e(size + bArr9.length);
                            cVar.write(bArr9);
                            byteArrayOutputStream2.writeTo(cVar);
                            androidx.exifinterface.media.b.c(byteArrayOutputStream2);
                        }
                        int readInt3 = bVar.readInt();
                        byte[] bArr10 = new byte[readInt3 % 2 == 1 ? readInt3 + 1 : readInt3];
                        bVar.read(bArr10);
                        byte b10 = (byte) (8 | bArr10[0]);
                        bArr10[0] = b10;
                        boolean z11 = ((b10 >> 1) & 1) == 1;
                        cVar2.write(bArr4);
                        cVar2.e(readInt3);
                        cVar2.write(bArr10);
                        if (z11) {
                            c(bVar, cVar2, S, null);
                            while (true) {
                                byte[] bArr11 = new byte[4];
                                inputStream.read(bArr11);
                                if (!Arrays.equals(bArr11, T)) {
                                    break;
                                } else {
                                    d(bVar, cVar2, bArr11);
                                }
                            }
                        } else {
                            c(bVar, cVar2, R, Q);
                        }
                    }
                    g0(cVar2);
                    androidx.exifinterface.media.b.e(bVar, cVar2);
                    int size2 = byteArrayOutputStream2.size();
                    byte[] bArr92 = M;
                    cVar.e(size2 + bArr92.length);
                    cVar.write(bArr92);
                    byteArrayOutputStream2.writeTo(cVar);
                    androidx.exifinterface.media.b.c(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    androidx.exifinterface.media.b.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void a() {
        String f10 = f("DateTimeOriginal");
        if (f10 != null && f("DateTime") == null) {
            this.f4460f[0].put("DateTime", d.e(f10));
        }
        if (f("ImageWidth") == null) {
            this.f4460f[0].put("ImageWidth", d.f(0L, this.f4462h));
        }
        if (f("ImageLength") == null) {
            this.f4460f[0].put("ImageLength", d.f(0L, this.f4462h));
        }
        if (f("Orientation") == null) {
            this.f4460f[0].put("Orientation", d.f(0L, this.f4462h));
        }
        if (f("LightSource") == null) {
            this.f4460f[1].put("LightSource", d.f(0L, this.f4462h));
        }
    }

    private static double b(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private void b0(b bVar) {
        HashMap<String, d> hashMap = this.f4460f[4];
        d dVar = hashMap.get("Compression");
        if (dVar != null) {
            int m10 = dVar.m(this.f4462h);
            this.f4469o = m10;
            if (m10 != 1) {
                if (m10 != 6) {
                    if (m10 != 7) {
                        return;
                    }
                }
            }
            if (J(hashMap)) {
                z(bVar, hashMap);
                return;
            }
            return;
        }
        this.f4469o = 6;
        y(bVar, hashMap);
    }

    private void c(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f4443p0;
                sb2.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
            d(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private static boolean c0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void d(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.e(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        androidx.exifinterface.media.b.f(bVar, cVar, readInt);
    }

    private void d0(int i10, int i11) {
        String str;
        if (this.f4460f[i10].isEmpty() || this.f4460f[i11].isEmpty()) {
            if (f4449v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f4460f[i10].get("ImageLength");
        d dVar2 = this.f4460f[i10].get("ImageWidth");
        d dVar3 = this.f4460f[i11].get("ImageLength");
        d dVar4 = this.f4460f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (!f4449v) {
                return;
            } else {
                str = "First image does not contain valid size information";
            }
        } else {
            if (dVar3 != null && dVar4 != null) {
                int m10 = dVar.m(this.f4462h);
                int m11 = dVar2.m(this.f4462h);
                int m12 = dVar3.m(this.f4462h);
                int m13 = dVar4.m(this.f4462h);
                if (m10 >= m12 || m11 >= m13) {
                    return;
                }
                HashMap<String, d>[] hashMapArr = this.f4460f;
                HashMap<String, d> hashMap = hashMapArr[i10];
                hashMapArr[i10] = hashMapArr[i11];
                hashMapArr[i11] = hashMap;
                return;
            }
            if (!f4449v) {
                return;
            } else {
                str = "Second image does not contain valid size information";
            }
        }
        Log.d("ExifInterface", str);
    }

    private void e0(g gVar, int i10) {
        StringBuilder sb2;
        String arrays;
        d j10;
        d j11;
        d dVar = this.f4460f[i10].get("DefaultCropSize");
        d dVar2 = this.f4460f[i10].get("SensorTopBorder");
        d dVar3 = this.f4460f[i10].get("SensorLeftBorder");
        d dVar4 = this.f4460f[i10].get("SensorBottomBorder");
        d dVar5 = this.f4460f[i10].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                V(gVar, i10);
                return;
            }
            int m10 = dVar2.m(this.f4462h);
            int m11 = dVar4.m(this.f4462h);
            int m12 = dVar5.m(this.f4462h);
            int m13 = dVar3.m(this.f4462h);
            if (m11 <= m10 || m12 <= m13) {
                return;
            }
            d j12 = d.j(m11 - m10, this.f4462h);
            d j13 = d.j(m12 - m13, this.f4462h);
            this.f4460f[i10].put("ImageLength", j12);
            this.f4460f[i10].put("ImageWidth", j13);
            return;
        }
        if (dVar.f4487a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f4462h);
            if (fVarArr != null && fVarArr.length == 2) {
                j10 = d.h(fVarArr[0], this.f4462h);
                j11 = d.h(fVarArr[1], this.f4462h);
                this.f4460f[i10].put("ImageWidth", j10);
                this.f4460f[i10].put("ImageLength", j11);
                return;
            }
            sb2 = new StringBuilder();
            sb2.append("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(fVarArr);
            sb2.append(arrays);
            Log.w("ExifInterface", sb2.toString());
        }
        int[] iArr = (int[]) dVar.o(this.f4462h);
        if (iArr != null && iArr.length == 2) {
            j10 = d.j(iArr[0], this.f4462h);
            j11 = d.j(iArr[1], this.f4462h);
            this.f4460f[i10].put("ImageWidth", j10);
            this.f4460f[i10].put("ImageLength", j11);
            return;
        }
        sb2 = new StringBuilder();
        sb2.append("Invalid crop size values. cropSize=");
        arrays = Arrays.toString(iArr);
        sb2.append(arrays);
        Log.w("ExifInterface", sb2.toString());
    }

    private void f0() {
        d0(0, 5);
        d0(0, 4);
        d0(5, 4);
        d dVar = this.f4460f[1].get("PixelXDimension");
        d dVar2 = this.f4460f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f4460f[0].put("ImageWidth", dVar);
            this.f4460f[0].put("ImageLength", dVar2);
        }
        if (this.f4460f[4].isEmpty() && L(this.f4460f[5])) {
            HashMap<String, d>[] hashMapArr = this.f4460f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!L(this.f4460f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        U(0, "ThumbnailOrientation", "Orientation");
        U(0, "ThumbnailImageLength", "ImageLength");
        U(0, "ThumbnailImageWidth", "ImageWidth");
        U(5, "ThumbnailOrientation", "Orientation");
        U(5, "ThumbnailImageLength", "ImageLength");
        U(5, "ThumbnailImageWidth", "ImageWidth");
        U(4, "Orientation", "ThumbnailOrientation");
        U(4, "ImageLength", "ThumbnailImageLength");
        U(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private int g0(c cVar) {
        e[][] eVarArr = f4437j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f4438k0) {
            T(eVar.f4492b);
        }
        if (this.f4463i) {
            if (this.f4464j) {
                T("StripOffsets");
                T("StripByteCounts");
            } else {
                T("JPEGInterchangeFormat");
                T("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f4437j0.length; i10++) {
            for (Object obj : this.f4460f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f4460f[i10].remove(entry.getKey());
                }
            }
        }
        if (!this.f4460f[1].isEmpty()) {
            this.f4460f[0].put(f4438k0[1].f4492b, d.f(0L, this.f4462h));
        }
        if (!this.f4460f[2].isEmpty()) {
            this.f4460f[0].put(f4438k0[2].f4492b, d.f(0L, this.f4462h));
        }
        if (!this.f4460f[3].isEmpty()) {
            this.f4460f[1].put(f4438k0[3].f4492b, d.f(0L, this.f4462h));
        }
        if (this.f4463i) {
            if (this.f4464j) {
                this.f4460f[4].put("StripOffsets", d.j(0, this.f4462h));
                this.f4460f[4].put("StripByteCounts", d.j(this.f4467m, this.f4462h));
            } else {
                this.f4460f[4].put("JPEGInterchangeFormat", d.f(0L, this.f4462h));
                this.f4460f[4].put("JPEGInterchangeFormatLength", d.f(this.f4467m, this.f4462h));
            }
        }
        for (int i11 = 0; i11 < f4437j0.length; i11++) {
            Iterator<Map.Entry<String, d>> it = this.f4460f[i11].entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int p10 = it.next().getValue().p();
                if (p10 > 4) {
                    i12 += p10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < f4437j0.length; i14++) {
            if (!this.f4460f[i14].isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f4460f[i14].size() * 12) + 2 + 4 + iArr2[i14];
            }
        }
        if (this.f4463i) {
            if (this.f4464j) {
                this.f4460f[4].put("StripOffsets", d.j(i13, this.f4462h));
            } else {
                this.f4460f[4].put("JPEGInterchangeFormat", d.f(i13, this.f4462h));
            }
            this.f4466l = i13;
            i13 += this.f4467m;
        }
        if (this.f4458d == 4) {
            i13 += 8;
        }
        if (f4449v) {
            for (int i15 = 0; i15 < f4437j0.length; i15++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.f4460f[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(i13)));
            }
        }
        if (!this.f4460f[1].isEmpty()) {
            this.f4460f[0].put(f4438k0[1].f4492b, d.f(iArr[1], this.f4462h));
        }
        if (!this.f4460f[2].isEmpty()) {
            this.f4460f[0].put(f4438k0[2].f4492b, d.f(iArr[2], this.f4462h));
        }
        if (!this.f4460f[3].isEmpty()) {
            this.f4460f[1].put(f4438k0[3].f4492b, d.f(iArr[3], this.f4462h));
        }
        int i16 = this.f4458d;
        if (i16 == 4) {
            cVar.i(i13);
            cVar.write(f4444q0);
        } else if (i16 == 13) {
            cVar.e(i13);
            cVar.write(I);
        } else if (i16 == 14) {
            cVar.write(N);
            cVar.e(i13);
        }
        cVar.f(this.f4462h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.a(this.f4462h);
        cVar.i(42);
        cVar.g(8L);
        for (int i17 = 0; i17 < f4437j0.length; i17++) {
            if (!this.f4460f[i17].isEmpty()) {
                cVar.i(this.f4460f[i17].size());
                int size = iArr[i17] + 2 + (this.f4460f[i17].size() * 12) + 4;
                for (Map.Entry<String, d> entry2 : this.f4460f[i17].entrySet()) {
                    int i18 = f4440m0[i17].get(entry2.getKey()).f4491a;
                    d value = entry2.getValue();
                    int p11 = value.p();
                    cVar.i(i18);
                    cVar.i(value.f4487a);
                    cVar.e(value.f4488b);
                    if (p11 > 4) {
                        cVar.g(size);
                        size += p11;
                    } else {
                        cVar.write(value.f4490d);
                        if (p11 < 4) {
                            while (p11 < 4) {
                                cVar.b(0);
                                p11++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.f4460f[4].isEmpty()) {
                    cVar.g(0L);
                } else {
                    cVar.g(iArr[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = this.f4460f[i17].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f4490d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f4463i) {
            cVar.write(v());
        }
        if (this.f4458d == 14 && i13 % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return i13;
    }

    private d i(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f4449v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f4437j0.length; i10++) {
            d dVar = this.f4460f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void j(g gVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0064b.a(mediaMetadataRetriever, new C0063a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f4460f[0].put("ImageWidth", d.j(Integer.parseInt(str), this.f4462h));
                }
                if (str2 != null) {
                    this.f4460f[0].put("ImageLength", d.j(Integer.parseInt(str2), this.f4462h));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    this.f4460f[0].put("Orientation", d.j(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f4462h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.g(parseInt2);
                    byte[] bArr = new byte[6];
                    if (gVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i10 = parseInt2 + 6;
                    int i11 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f4444q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i11];
                    if (gVar.read(bArr2) != i11) {
                        throw new IOException("Can't read exif");
                    }
                    this.f4470p = i10;
                    R(bArr2, 0);
                }
                if (f4449v) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x019a, code lost:
    
        r22.e(r21.f4462h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0184 A[LOOP:0: B:9:0x0038->B:33:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void k(androidx.exifinterface.media.a.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.k(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int m(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (D(bArr)) {
            return 4;
        }
        if (G(bArr)) {
            return 9;
        }
        if (C(bArr)) {
            return 12;
        }
        if (E(bArr)) {
            return 7;
        }
        if (H(bArr)) {
            return 10;
        }
        if (F(bArr)) {
            return 13;
        }
        return M(bArr) ? 14 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n(androidx.exifinterface.media.a.g r6) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.n(androidx.exifinterface.media.a$g):void");
    }

    private void o(b bVar) {
        if (f4449v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.e(ByteOrder.BIG_ENDIAN);
        byte[] bArr = H;
        bVar.f(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = i10 + 4;
                if (i11 == 16 && !Arrays.equals(bArr2, J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, K)) {
                    return;
                }
                if (Arrays.equals(bArr2, I)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f4470p = i11;
                        R(bArr3, 0);
                        f0();
                        b0(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i12 = readInt + 4;
                bVar.f(i12);
                length = i11 + i12;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void p(b bVar) {
        boolean z10 = f4449v;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.f(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.f(i10 - bVar.a());
        bVar.read(bArr4);
        k(new b(bArr4), i10, 5);
        bVar.f(i12 - bVar.a());
        bVar.e(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f4432e0.f4491a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j10 = d.j(readShort, this.f4462h);
                d j11 = d.j(readShort2, this.f4462h);
                this.f4460f[0].put("ImageLength", j10);
                this.f4460f[0].put("ImageWidth", j11);
                if (f4449v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.f(readUnsignedShort2);
        }
    }

    private void q(g gVar) {
        d dVar;
        O(gVar);
        S(gVar, 0);
        e0(gVar, 0);
        e0(gVar, 5);
        e0(gVar, 4);
        f0();
        if (this.f4458d != 8 || (dVar = this.f4460f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f4490d);
        gVar2.e(this.f4462h);
        gVar2.f(6);
        S(gVar2, 9);
        d dVar2 = this.f4460f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f4460f[1].put("ColorSpace", dVar2);
        }
    }

    private void s(g gVar) {
        if (f4449v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        q(gVar);
        d dVar = this.f4460f[0].get("JpgFromRaw");
        if (dVar != null) {
            k(new b(dVar.f4490d), (int) dVar.f4489c, 5);
        }
        d dVar2 = this.f4460f[0].get("ISO");
        d dVar3 = this.f4460f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f4460f[1].put("PhotographicSensitivity", dVar2);
    }

    private void t(g gVar) {
        byte[] bArr = f4444q0;
        gVar.f(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f4470p = bArr.length;
        R(bArr2, 0);
    }

    private void w(b bVar) {
        if (f4449v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.e(ByteOrder.LITTLE_ENDIAN);
        bVar.f(L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = M;
        bVar.f(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i10 = length + 4 + 4;
                if (Arrays.equals(N, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.f4470p = i10;
                        R(bArr3, 0);
                        b0(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i10 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.f(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> x(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> x10 = x(split[0]);
            if (((Integer) x10.first).intValue() == 2) {
                return x10;
            }
            for (int i10 = 1; i10 < split.length; i10++) {
                Pair<Integer, Integer> x11 = x(split[i10]);
                int intValue = (((Integer) x11.first).equals(x10.first) || ((Integer) x11.second).equals(x10.first)) ? ((Integer) x10.first).intValue() : -1;
                int intValue2 = (((Integer) x10.second).intValue() == -1 || !(((Integer) x11.first).equals(x10.second) || ((Integer) x11.second).equals(x10.second))) ? -1 : ((Integer) x10.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    x10 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    x10 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return x10;
        }
        if (!str.contains("/")) {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    return (valueOf.longValue() < 0 || valueOf.longValue() > 65535) ? valueOf.longValue() < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair<>(2, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void y(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int m10 = dVar.m(this.f4462h);
        int m11 = dVar2.m(this.f4462h);
        if (this.f4458d == 7) {
            m10 += this.f4471q;
        }
        if (m10 > 0 && m11 > 0) {
            this.f4463i = true;
            if (this.f4455a == null && this.f4457c == null && this.f4456b == null) {
                byte[] bArr = new byte[m11];
                bVar.skip(m10);
                bVar.read(bArr);
                this.f4468n = bArr;
            }
            this.f4466l = m10;
            this.f4467m = m11;
        }
        if (f4449v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m10 + ", length: " + m11);
        }
    }

    private void z(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] d10 = androidx.exifinterface.media.b.d(dVar.o(this.f4462h));
        long[] d11 = androidx.exifinterface.media.b.d(dVar2.o(this.f4462h));
        if (d10 == null || d10.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (d11 == null || d11.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (d10.length != d11.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : d11) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        this.f4465k = true;
        this.f4464j = true;
        this.f4463i = true;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < d10.length; i13++) {
            int i14 = (int) d10[i13];
            int i15 = (int) d11[i13];
            if (i13 < d10.length - 1 && i14 + i15 != d10[i13 + 1]) {
                this.f4465k = false;
            }
            int i16 = i14 - i11;
            if (i16 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j12 = i16;
            if (bVar.skip(j12) != j12) {
                Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                return;
            }
            int i17 = i11 + i16;
            byte[] bArr2 = new byte[i15];
            if (bVar.read(bArr2) != i15) {
                Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                return;
            }
            i11 = i17 + i15;
            System.arraycopy(bArr2, 0, bArr, i12, i15);
            i12 += i15;
        }
        this.f4468n = bArr;
        if (this.f4465k) {
            this.f4466l = (int) d10[0];
            this.f4467m = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:57:0x00e0, B:59:0x00e4, B:60:0x00fa, B:64:0x00f3), top: B:56:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:57:0x00e0, B:59:0x00e4, B:60:0x00fa, B:64:0x00f3), top: B:56:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void W() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.W():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x01f1. Please report as an issue. */
    public void a0(String str, String str2) {
        StringBuilder sb2;
        e eVar;
        int i10;
        int i11;
        HashMap<String, d> hashMap;
        d a10;
        HashMap<String, d> hashMap2;
        d c10;
        String str3 = str;
        String str4 = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = f4448u0.matcher(str4).find();
            boolean find2 = f4450v0.matcher(str4).find();
            if (str2.length() != 19 || (!find && !find2)) {
                sb2 = new StringBuilder();
                sb2.append("Invalid value for ");
                sb2.append(str3);
                sb2.append(" : ");
                sb2.append(str4);
                Log.w("ExifInterface", sb2.toString());
                return;
            }
            if (find2) {
                str4 = str4.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (f4449v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i12 = 2;
        int i13 = 1;
        if (str4 != null && f4441n0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f4447t0.matcher(str4);
                if (!matcher.find()) {
                    sb2 = new StringBuilder();
                    sb2.append("Invalid value for ");
                    sb2.append(str3);
                    sb2.append(" : ");
                    sb2.append(str4);
                    Log.w("ExifInterface", sb2.toString());
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new f(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    sb2 = new StringBuilder();
                }
            }
        }
        int i14 = 0;
        int i15 = 0;
        while (i15 < f4437j0.length) {
            if ((i15 != 4 || this.f4463i) && (eVar = f4440m0[i15].get(str3)) != null) {
                if (str4 == null) {
                    this.f4460f[i15].remove(str3);
                } else {
                    Pair<Integer, Integer> x10 = x(str4);
                    int i16 = -1;
                    if (eVar.f4493c == ((Integer) x10.first).intValue() || eVar.f4493c == ((Integer) x10.second).intValue()) {
                        i10 = eVar.f4493c;
                    } else {
                        int i17 = eVar.f4494d;
                        if (i17 == -1 || !(i17 == ((Integer) x10.first).intValue() || eVar.f4494d == ((Integer) x10.second).intValue())) {
                            int i18 = eVar.f4493c;
                            if (i18 == i13 || i18 == 7 || i18 == i12) {
                                i10 = i18;
                            } else if (f4449v) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Given tag (");
                                sb3.append(str3);
                                sb3.append(") value didn't match with one of expected formats: ");
                                String[] strArr = W;
                                sb3.append(strArr[eVar.f4493c]);
                                sb3.append(eVar.f4494d == -1 ? "" : ", " + strArr[eVar.f4494d]);
                                sb3.append(" (guess: ");
                                sb3.append(strArr[((Integer) x10.first).intValue()]);
                                sb3.append(((Integer) x10.second).intValue() != -1 ? ", " + strArr[((Integer) x10.second).intValue()] : "");
                                sb3.append(")");
                                Log.d("ExifInterface", sb3.toString());
                            }
                        } else {
                            i10 = eVar.f4494d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            i11 = i13;
                            hashMap = this.f4460f[i15];
                            a10 = d.a(str4);
                            hashMap.put(str3, a10);
                            break;
                        case 2:
                        case 7:
                            i11 = i13;
                            hashMap = this.f4460f[i15];
                            a10 = d.e(str4);
                            hashMap.put(str3, a10);
                            break;
                        case 3:
                            i11 = i13;
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i19 = 0; i19 < split.length; i19++) {
                                iArr[i19] = Integer.parseInt(split[i19]);
                            }
                            hashMap = this.f4460f[i15];
                            a10 = d.k(iArr, this.f4462h);
                            hashMap.put(str3, a10);
                            break;
                        case 4:
                            i11 = i13;
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i20 = 0; i20 < split2.length; i20++) {
                                jArr[i20] = Long.parseLong(split2[i20]);
                            }
                            hashMap = this.f4460f[i15];
                            a10 = d.g(jArr, this.f4462h);
                            hashMap.put(str3, a10);
                            break;
                        case 5:
                            String[] split3 = str4.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            int i21 = 0;
                            while (i21 < split3.length) {
                                String[] split4 = split3[i21].split("/", i16);
                                fVarArr[i21] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i21++;
                                i16 = -1;
                            }
                            i11 = 1;
                            hashMap = this.f4460f[i15];
                            a10 = d.i(fVarArr, this.f4462h);
                            hashMap.put(str3, a10);
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            i11 = i13;
                            if (f4449v) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i10);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i22 = 0; i22 < split5.length; i22++) {
                                iArr2[i22] = Integer.parseInt(split5[i22]);
                            }
                            hashMap2 = this.f4460f[i15];
                            c10 = d.c(iArr2, this.f4462h);
                            hashMap2.put(str3, c10);
                            i11 = 1;
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i23 = i14;
                            while (i23 < split6.length) {
                                String[] split7 = split6[i23].split("/", -1);
                                fVarArr2[i23] = new f((long) Double.parseDouble(split7[i14]), (long) Double.parseDouble(split7[i13]));
                                i23++;
                                split6 = split6;
                                i14 = 0;
                                i13 = 1;
                            }
                            hashMap2 = this.f4460f[i15];
                            c10 = d.d(fVarArr2, this.f4462h);
                            hashMap2.put(str3, c10);
                            i11 = 1;
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i24 = i14; i24 < split8.length; i24++) {
                                dArr[i24] = Double.parseDouble(split8[i24]);
                            }
                            this.f4460f[i15].put(str3, d.b(dArr, this.f4462h));
                            break;
                    }
                    i15++;
                    i13 = i11;
                    i12 = 2;
                    i14 = 0;
                }
            }
            i11 = i13;
            i15++;
            i13 = i11;
            i12 = 2;
            i14 = 0;
        }
    }

    public double e(double d10) {
        double g10 = g("GPSAltitude", -1.0d);
        int h10 = h("GPSAltitudeRef", -1);
        if (g10 < 0.0d || h10 < 0) {
            return d10;
        }
        return g10 * (h10 != 1 ? 1 : -1);
    }

    public String f(String str) {
        String str2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d i10 = i(str);
        if (i10 != null) {
            if (!f4441n0.contains(str)) {
                return i10.n(this.f4462h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i11 = i10.f4487a;
                if (i11 == 5 || i11 == 10) {
                    f[] fVarArr = (f[]) i10.o(this.f4462h);
                    if (fVarArr != null && fVarArr.length == 3) {
                        f fVar = fVarArr[0];
                        f fVar2 = fVarArr[1];
                        f fVar3 = fVarArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) fVar.f4495a) / ((float) fVar.f4496b))), Integer.valueOf((int) (((float) fVar2.f4495a) / ((float) fVar2.f4496b))), Integer.valueOf((int) (((float) fVar3.f4495a) / ((float) fVar3.f4496b))));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr);
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + i10.f4487a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(i10.l(this.f4462h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public double g(String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d i10 = i(str);
        if (i10 == null) {
            return d10;
        }
        try {
            return i10.l(this.f4462h);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public int h(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d i11 = i(str);
        if (i11 == null) {
            return i10;
        }
        try {
            return i11.m(this.f4462h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public double[] l() {
        String f10 = f("GPSLatitude");
        String f11 = f("GPSLatitudeRef");
        String f12 = f("GPSLongitude");
        String f13 = f("GPSLongitudeRef");
        if (f10 == null || f11 == null || f12 == null || f13 == null) {
            return null;
        }
        try {
            return new double[]{b(f10, f11), b(f12, f13)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", f10, f11, f12, f13));
            return null;
        }
    }

    public int r() {
        switch (h("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] u() {
        int i10 = this.f4469o;
        if (i10 == 6 || i10 == 7) {
            return v();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[Catch: Exception -> 0x0088, all -> 0x00a7, TRY_ENTER, TryCatch #3 {all -> 0x00a7, blocks: (B:17:0x004f, B:20:0x0065, B:22:0x0071, B:27:0x007c, B:28:0x0081, B:29:0x0082, B:30:0x0087, B:32:0x0099), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[Catch: Exception -> 0x0088, all -> 0x00a7, TryCatch #3 {all -> 0x00a7, blocks: (B:17:0x004f, B:20:0x0065, B:22:0x0071, B:27:0x007c, B:28:0x0081, B:29:0x0082, B:30:0x0087, B:32:0x0099), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] v() {
        /*
            r9 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r9.f4463i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r9.f4468n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r9.f4457c     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r1 == 0) goto L2e
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            if (r3 == 0) goto L1c
            r1.reset()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
        L1a:
            r3 = r2
            goto L4f
        L1c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            androidx.exifinterface.media.b.c(r1)
            return r2
        L25:
            r0 = move-exception
            r3 = r2
            goto La8
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L99
        L2e:
            java.lang.String r1 = r9.f4455a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r1 == 0) goto L3a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r3 = r9.f4455a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            goto L1a
        L3a:
            java.io.FileDescriptor r1 = r9.f4456b     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.io.FileDescriptor r1 = androidx.exifinterface.media.b.a.b(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r4 = 0
            androidx.exifinterface.media.b.a.c(r1, r4, r3)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r8 = r3
            r3 = r1
            r1 = r8
        L4f:
            int r4 = r9.f4466l     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r5 = r9.f4470p     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            long r4 = r1.skip(r4)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r9.f4466l     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r7 = r9.f4470p     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r6 + r7
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r5 = "Corrupted image"
            if (r4 != 0) goto L82
            int r4 = r9.f4467m     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r1.read(r4)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r7 = r9.f4467m     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            if (r6 != r7) goto L7c
            r9.f4468n = r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            androidx.exifinterface.media.b.c(r1)
            if (r3 == 0) goto L7b
            androidx.exifinterface.media.b.b(r3)
        L7b:
            return r4
        L7c:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            r4.<init>(r5)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            throw r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
        L82:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            r4.<init>(r5)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            throw r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
        L88:
            r4 = move-exception
            goto L99
        L8a:
            r0 = move-exception
            r3 = r1
            goto La9
        L8d:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L99
        L92:
            r0 = move-exception
            r3 = r2
            goto La9
        L95:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        L99:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> La7
            androidx.exifinterface.media.b.c(r1)
            if (r3 == 0) goto La6
            androidx.exifinterface.media.b.b(r3)
        La6:
            return r2
        La7:
            r0 = move-exception
        La8:
            r2 = r1
        La9:
            androidx.exifinterface.media.b.c(r2)
            if (r3 == 0) goto Lb1
            androidx.exifinterface.media.b.b(r3)
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.v():byte[]");
    }
}
