package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.C1240b;
import com.google.android.gms.common.api.C5101a;
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

/* renamed from: androidx.exifinterface.media.a */
/* loaded from: classes.dex */
public class C1239a {

    /* renamed from: U */
    private static SimpleDateFormat f5159U;

    /* renamed from: V */
    private static SimpleDateFormat f5160V;

    /* renamed from: Z */
    private static final e[] f5164Z;

    /* renamed from: a0 */
    private static final e[] f5165a0;

    /* renamed from: b0 */
    private static final e[] f5166b0;

    /* renamed from: c0 */
    private static final e[] f5167c0;

    /* renamed from: d0 */
    private static final e[] f5168d0;

    /* renamed from: e0 */
    private static final e f5169e0;

    /* renamed from: f0 */
    private static final e[] f5170f0;

    /* renamed from: g0 */
    private static final e[] f5171g0;

    /* renamed from: h0 */
    private static final e[] f5172h0;

    /* renamed from: i0 */
    private static final e[] f5173i0;

    /* renamed from: j0 */
    static final e[][] f5174j0;

    /* renamed from: k0 */
    private static final e[] f5175k0;

    /* renamed from: l0 */
    private static final HashMap<Integer, e>[] f5176l0;

    /* renamed from: m0 */
    private static final HashMap<String, e>[] f5177m0;

    /* renamed from: n0 */
    private static final HashSet<String> f5178n0;

    /* renamed from: o0 */
    private static final HashMap<Integer, Integer> f5179o0;

    /* renamed from: p0 */
    static final Charset f5180p0;

    /* renamed from: q0 */
    static final byte[] f5181q0;

    /* renamed from: r0 */
    private static final byte[] f5182r0;

    /* renamed from: s0 */
    private static final Pattern f5183s0;

    /* renamed from: t0 */
    private static final Pattern f5184t0;

    /* renamed from: u0 */
    private static final Pattern f5185u0;

    /* renamed from: v0 */
    private static final Pattern f5187v0;

    /* renamed from: a */
    private String f5192a;

    /* renamed from: b */
    private FileDescriptor f5193b;

    /* renamed from: c */
    private AssetManager.AssetInputStream f5194c;

    /* renamed from: d */
    private int f5195d;

    /* renamed from: e */
    private boolean f5196e;

    /* renamed from: f */
    private final HashMap<String, d>[] f5197f;

    /* renamed from: g */
    private Set<Integer> f5198g;

    /* renamed from: h */
    private ByteOrder f5199h;

    /* renamed from: i */
    private boolean f5200i;

    /* renamed from: j */
    private boolean f5201j;

    /* renamed from: k */
    private boolean f5202k;

    /* renamed from: l */
    private int f5203l;

    /* renamed from: m */
    private int f5204m;

    /* renamed from: n */
    private byte[] f5205n;

    /* renamed from: o */
    private int f5206o;

    /* renamed from: p */
    private int f5207p;

    /* renamed from: q */
    private int f5208q;

    /* renamed from: r */
    private int f5209r;

    /* renamed from: s */
    private int f5210s;

    /* renamed from: t */
    private boolean f5211t;

    /* renamed from: u */
    private boolean f5212u;

    /* renamed from: v */
    private static final boolean f5186v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w */
    private static final List<Integer> f5188w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x */
    private static final List<Integer> f5189x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y */
    public static final int[] f5190y = {8, 8, 8};

    /* renamed from: z */
    public static final int[] f5191z = {4};

    /* renamed from: A */
    public static final int[] f5139A = {8};

    /* renamed from: B */
    static final byte[] f5140B = {-1, -40, -1};

    /* renamed from: C */
    private static final byte[] f5141C = {102, 116, 121, 112};

    /* renamed from: D */
    private static final byte[] f5142D = {109, 105, 102, 49};

    /* renamed from: E */
    private static final byte[] f5143E = {104, 101, 105, 99};

    /* renamed from: F */
    private static final byte[] f5144F = {79, 76, 89, 77, 80, 0};

    /* renamed from: G */
    private static final byte[] f5145G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: H */
    private static final byte[] f5146H = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: I */
    private static final byte[] f5147I = {101, 88, 73, 102};

    /* renamed from: J */
    private static final byte[] f5148J = {73, 72, 68, 82};

    /* renamed from: K */
    private static final byte[] f5149K = {73, 69, 78, 68};

    /* renamed from: L */
    private static final byte[] f5150L = {82, 73, 70, 70};

    /* renamed from: M */
    private static final byte[] f5151M = {87, 69, 66, 80};

    /* renamed from: N */
    private static final byte[] f5152N = {69, 88, 73, 70};

    /* renamed from: O */
    private static final byte[] f5153O = {-99, 1, 42};

    /* renamed from: P */
    private static final byte[] f5154P = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    private static final byte[] f5155Q = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: R */
    private static final byte[] f5156R = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: S */
    private static final byte[] f5157S = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: T */
    private static final byte[] f5158T = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: W */
    static final String[] f5161W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: X */
    static final int[] f5162X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: Y */
    static final byte[] f5163Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.exifinterface.media.a$a */
    /* loaded from: classes.dex */
    public class a extends MediaDataSource {

        /* renamed from: a */
        long f5213a;

        /* renamed from: b */
        final /* synthetic */ g f5214b;

        a(g gVar) {
            this.f5214b = gVar;
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
                long j11 = this.f5213a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f5214b.available()) {
                        return -1;
                    }
                    this.f5214b.m6816g(j10);
                    this.f5213a = j10;
                }
                if (i11 > this.f5214b.available()) {
                    i11 = this.f5214b.available();
                }
                int read = this.f5214b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f5213a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f5213a = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.a$b */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: e */
        private static final ByteOrder f5216e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f */
        private static final ByteOrder f5217f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a */
        final DataInputStream f5218a;

        /* renamed from: b */
        private ByteOrder f5219b;

        /* renamed from: c */
        int f5220c;

        /* renamed from: d */
        private byte[] f5221d;

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f5219b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f5218a = dataInputStream;
            dataInputStream.mark(0);
            this.f5220c = 0;
            this.f5219b = byteOrder;
        }

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int m6788a() {
            return this.f5220c;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f5218a.available();
        }

        /* renamed from: b */
        public long m6789b() {
            return readInt() & KeyboardMap.kValueMask;
        }

        /* renamed from: e */
        public void m6790e(ByteOrder byteOrder) {
            this.f5219b = byteOrder;
        }

        /* renamed from: f */
        public void m6791f(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f5218a.skip(i12);
                if (skip <= 0) {
                    if (this.f5221d == null) {
                        this.f5221d = new byte[8192];
                    }
                    skip = this.f5218a.read(this.f5221d, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.f5220c += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f5220c++;
            return this.f5218a.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f5218a.read(bArr, i10, i11);
            this.f5220c += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f5220c++;
            return this.f5218a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f5220c++;
            int read = this.f5218a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f5220c += 2;
            return this.f5218a.readChar();
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
            this.f5220c += bArr.length;
            this.f5218a.readFully(bArr);
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) {
            this.f5220c += i11;
            this.f5218a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f5220c += 4;
            int read = this.f5218a.read();
            int read2 = this.f5218a.read();
            int read3 = this.f5218a.read();
            int read4 = this.f5218a.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f5219b;
            if (byteOrder == f5216e) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f5217f) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f5219b);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f5220c += 8;
            int read = this.f5218a.read();
            int read2 = this.f5218a.read();
            int read3 = this.f5218a.read();
            int read4 = this.f5218a.read();
            int read5 = this.f5218a.read();
            int read6 = this.f5218a.read();
            int read7 = this.f5218a.read();
            int read8 = this.f5218a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f5219b;
            if (byteOrder == f5216e) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f5217f) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f5219b);
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f5220c += 2;
            int read = this.f5218a.read();
            int read2 = this.f5218a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f5219b;
            if (byteOrder == f5216e) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f5217f) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f5219b);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f5220c += 2;
            return this.f5218a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f5220c++;
            return this.f5218a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f5220c += 2;
            int read = this.f5218a.read();
            int read2 = this.f5218a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f5219b;
            if (byteOrder == f5216e) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f5217f) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f5219b);
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
    /* renamed from: androidx.exifinterface.media.a$c */
    /* loaded from: classes.dex */
    public static class c extends FilterOutputStream {

        /* renamed from: a */
        final OutputStream f5222a;

        /* renamed from: b */
        private ByteOrder f5223b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f5222a = outputStream;
            this.f5223b = byteOrder;
        }

        /* renamed from: a */
        public void m6792a(ByteOrder byteOrder) {
            this.f5223b = byteOrder;
        }

        /* renamed from: b */
        public void m6793b(int i10) {
            this.f5222a.write(i10);
        }

        /* renamed from: e */
        public void m6794e(int i10) {
            OutputStream outputStream;
            int i11;
            ByteOrder byteOrder = this.f5223b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f5222a.write((i10 >>> 0) & 255);
                this.f5222a.write((i10 >>> 8) & 255);
                this.f5222a.write((i10 >>> 16) & 255);
                outputStream = this.f5222a;
                i11 = i10 >>> 24;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.f5222a.write((i10 >>> 24) & 255);
                this.f5222a.write((i10 >>> 16) & 255);
                this.f5222a.write((i10 >>> 8) & 255);
                outputStream = this.f5222a;
                i11 = i10 >>> 0;
            }
            outputStream.write(i11 & 255);
        }

        /* renamed from: f */
        public void m6795f(short s10) {
            OutputStream outputStream;
            int i10;
            ByteOrder byteOrder = this.f5223b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f5222a.write((s10 >>> 0) & 255);
                outputStream = this.f5222a;
                i10 = s10 >>> 8;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.f5222a.write((s10 >>> 8) & 255);
                outputStream = this.f5222a;
                i10 = s10 >>> 0;
            }
            outputStream.write(i10 & 255);
        }

        /* renamed from: g */
        public void m6796g(long j10) {
            m6794e((int) j10);
        }

        /* renamed from: i */
        public void m6797i(int i10) {
            m6795f((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f5222a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            this.f5222a.write(bArr, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.a$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final int f5224a;

        /* renamed from: b */
        public final int f5225b;

        /* renamed from: c */
        public final long f5226c;

        /* renamed from: d */
        public final byte[] f5227d;

        d(int i10, int i11, long j10, byte[] bArr) {
            this.f5224a = i10;
            this.f5225b = i11;
            this.f5226c = j10;
            this.f5227d = bArr;
        }

        d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        /* renamed from: a */
        public static d m6798a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C1239a.f5180p0);
            return new d(1, bytes.length, bytes);
        }

        /* renamed from: b */
        public static d m6799b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C1239a.f5162X[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d10 : dArr) {
                wrap.putDouble(d10);
            }
            return new d(12, dArr.length, wrap.array());
        }

        /* renamed from: c */
        public static d m6800c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C1239a.f5162X[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putInt(i10);
            }
            return new d(9, iArr.length, wrap.array());
        }

        /* renamed from: d */
        public static d m6801d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C1239a.f5162X[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f5232a);
                wrap.putInt((int) fVar.f5233b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        /* renamed from: e */
        public static d m6802e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C1239a.f5180p0);
            return new d(2, bytes.length, bytes);
        }

        /* renamed from: f */
        public static d m6803f(long j10, ByteOrder byteOrder) {
            return m6804g(new long[]{j10}, byteOrder);
        }

        /* renamed from: g */
        public static d m6804g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C1239a.f5162X[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        /* renamed from: h */
        public static d m6805h(f fVar, ByteOrder byteOrder) {
            return m6806i(new f[]{fVar}, byteOrder);
        }

        /* renamed from: i */
        public static d m6806i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C1239a.f5162X[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f5232a);
                wrap.putInt((int) fVar.f5233b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        /* renamed from: j */
        public static d m6807j(int i10, ByteOrder byteOrder) {
            return m6808k(new int[]{i10}, byteOrder);
        }

        /* renamed from: k */
        public static d m6808k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C1239a.f5162X[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(3, iArr.length, wrap.array());
        }

        /* renamed from: l */
        public double m6809l(ByteOrder byteOrder) {
            Object m6812o = m6812o(byteOrder);
            if (m6812o == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (m6812o instanceof String) {
                return Double.parseDouble((String) m6812o);
            }
            if (m6812o instanceof long[]) {
                if (((long[]) m6812o).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (m6812o instanceof int[]) {
                if (((int[]) m6812o).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (m6812o instanceof double[]) {
                double[] dArr = (double[]) m6812o;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(m6812o instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) m6812o;
            if (fVarArr.length == 1) {
                return fVarArr[0].m6815a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: m */
        public int m6810m(ByteOrder byteOrder) {
            Object m6812o = m6812o(byteOrder);
            if (m6812o == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (m6812o instanceof String) {
                return Integer.parseInt((String) m6812o);
            }
            if (m6812o instanceof long[]) {
                long[] jArr = (long[]) m6812o;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(m6812o instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) m6812o;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: n */
        public String m6811n(ByteOrder byteOrder) {
            Object m6812o = m6812o(byteOrder);
            if (m6812o == null) {
                return null;
            }
            if (m6812o instanceof String) {
                return (String) m6812o;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (m6812o instanceof long[]) {
                long[] jArr = (long[]) m6812o;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (m6812o instanceof int[]) {
                int[] iArr = (int[]) m6812o;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (m6812o instanceof double[]) {
                double[] dArr = (double[]) m6812o;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(m6812o instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) m6812o;
            while (i10 < fVarArr.length) {
                sb2.append(fVarArr[i10].f5232a);
                sb2.append('/');
                sb2.append(fVarArr[i10].f5233b);
                i10++;
                if (i10 != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:168:0x0198 */
        /* JADX WARN: Removed duplicated region for block: B:171:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object m6812o(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 448
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1239a.d.m6812o(java.nio.ByteOrder):java.lang.Object");
        }

        /* renamed from: p */
        public int m6813p() {
            return C1239a.f5162X[this.f5224a] * this.f5225b;
        }

        public String toString() {
            return "(" + C1239a.f5161W[this.f5224a] + ", data length:" + this.f5227d.length + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.exifinterface.media.a$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public final int f5228a;

        /* renamed from: b */
        public final String f5229b;

        /* renamed from: c */
        public final int f5230c;

        /* renamed from: d */
        public final int f5231d;

        e(String str, int i10, int i11) {
            this.f5229b = str;
            this.f5228a = i10;
            this.f5230c = i11;
            this.f5231d = -1;
        }

        e(String str, int i10, int i11, int i12) {
            this.f5229b = str;
            this.f5228a = i10;
            this.f5230c = i11;
            this.f5231d = i12;
        }

        /* renamed from: a */
        boolean m6814a(int i10) {
            int i11;
            int i12 = this.f5230c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f5231d) == i10) {
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
    /* renamed from: androidx.exifinterface.media.a$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        public final long f5232a;

        /* renamed from: b */
        public final long f5233b;

        f(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        f(long j10, long j11) {
            if (j11 == 0) {
                this.f5232a = 0L;
                this.f5233b = 1L;
            } else {
                this.f5232a = j10;
                this.f5233b = j11;
            }
        }

        /* renamed from: a */
        public double m6815a() {
            return this.f5232a / this.f5233b;
        }

        public String toString() {
            return this.f5232a + "/" + this.f5233b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.a$g */
    /* loaded from: classes.dex */
    public static class g extends b {
        g(InputStream inputStream) {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.f5218a.mark(C5101a.e.API_PRIORITY_OTHER);
        }

        g(byte[] bArr) {
            super(bArr);
            this.f5218a.mark(C5101a.e.API_PRIORITY_OTHER);
        }

        /* renamed from: g */
        public void m6816g(long j10) {
            int i10 = this.f5220c;
            if (i10 > j10) {
                this.f5220c = 0;
                this.f5218a.reset();
            } else {
                j10 -= i10;
            }
            m6791f((int) j10);
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", RecognitionOptions.QR_CODE, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f5164Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f5165a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f5166b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f5167c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", RecognitionOptions.QR_CODE, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f5168d0 = eVarArr5;
        f5169e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", RecognitionOptions.QR_CODE, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f5170f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f5171g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f5172h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f5173i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f5174j0 = eVarArr10;
        f5175k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f5176l0 = new HashMap[eVarArr10.length];
        f5177m0 = new HashMap[eVarArr10.length];
        f5178n0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f5179o0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f5180p0 = forName;
        f5181q0 = "Exif\u0000\u0000".getBytes(forName);
        f5182r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f5159U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f5160V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f5174j0;
            if (i10 >= eVarArr11.length) {
                HashMap<Integer, Integer> hashMap = f5179o0;
                e[] eVarArr12 = f5175k0;
                hashMap.put(Integer.valueOf(eVarArr12[0].f5228a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f5228a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f5228a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f5228a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f5228a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f5228a), 8);
                f5183s0 = Pattern.compile(".*[1-9].*");
                f5184t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f5185u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f5187v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f5176l0[i10] = new HashMap<>();
            f5177m0[i10] = new HashMap<>();
            for (e eVar : eVarArr11[i10]) {
                f5176l0[i10].put(Integer.valueOf(eVar.f5228a), eVar);
                f5177m0[i10].put(eVar.f5229b, eVar);
            }
            i10++;
        }
    }

    public C1239a(FileDescriptor fileDescriptor) {
        boolean z10;
        FileInputStream fileInputStream;
        Throwable th2;
        e[][] eVarArr = f5174j0;
        this.f5197f = new HashMap[eVarArr.length];
        this.f5198g = new HashSet(eVarArr.length);
        this.f5199h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor == null) {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
        this.f5194c = null;
        this.f5192a = null;
        if (m6737I(fileDescriptor)) {
            this.f5193b = fileDescriptor;
            try {
                fileDescriptor = C1240b.a.m6825b(fileDescriptor);
                z10 = true;
            } catch (Exception e10) {
                throw new IOException("Failed to duplicate file descriptor", e10);
            }
        } else {
            this.f5193b = null;
            z10 = false;
        }
        try {
            fileInputStream = new FileInputStream(fileDescriptor);
        } catch (Throwable th3) {
            fileInputStream = null;
            th2 = th3;
        }
        try {
            m6742N(fileInputStream);
            C1240b.m6819c(fileInputStream);
            if (z10) {
                C1240b.m6818b(fileDescriptor);
            }
        } catch (Throwable th4) {
            th2 = th4;
            C1240b.m6819c(fileInputStream);
            if (z10) {
                C1240b.m6818b(fileDescriptor);
            }
            throw th2;
        }
    }

    public C1239a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public C1239a(InputStream inputStream, int i10) {
        e[][] eVarArr = f5174j0;
        this.f5197f = new HashMap[eVarArr.length];
        this.f5198g = new HashSet(eVarArr.length);
        this.f5199h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.f5192a = null;
        if (i10 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f5181q0.length);
            if (!m6730B(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f5196e = true;
            this.f5194c = null;
            this.f5193b = null;
            inputStream = bufferedInputStream;
        } else {
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f5194c = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m6737I(fileInputStream.getFD())) {
                        this.f5194c = null;
                        this.f5193b = fileInputStream.getFD();
                    }
                }
                this.f5194c = null;
            }
            this.f5193b = null;
        }
        m6742N(inputStream);
    }

    public C1239a(String str) {
        e[][] eVarArr = f5174j0;
        this.f5197f = new HashMap[eVarArr.length];
        this.f5198g = new HashSet(eVarArr.length);
        this.f5199h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        m6729A(str);
    }

    /* renamed from: A */
    private void m6729A(String str) {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f5194c = null;
        this.f5192a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (m6737I(fileInputStream.getFD())) {
                this.f5193b = fileInputStream.getFD();
            } else {
                this.f5193b = null;
            }
            m6742N(fileInputStream);
            C1240b.m6819c(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            C1240b.m6819c(fileInputStream2);
            throw th;
        }
    }

    /* renamed from: B */
    private static boolean m6730B(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f5181q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f5181q0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* renamed from: C */
    private boolean m6731C(byte[] bArr) {
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
                    if (f5186v) {
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
        if (!Arrays.equals(bArr2, f5141C)) {
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
                if (Arrays.equals(bArr3, f5142D)) {
                    z10 = true;
                } else if (Arrays.equals(bArr3, f5143E)) {
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

    /* renamed from: D */
    private static boolean m6732D(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f5140B;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* renamed from: E */
    private boolean m6733E(byte[] bArr) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder m6745Q = m6745Q(bVar);
            this.f5199h = m6745Q;
            bVar.m6790e(m6745Q);
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

    /* renamed from: F */
    private boolean m6734F(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f5146H;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* renamed from: G */
    private boolean m6735G(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    private boolean m6736H(byte[] bArr) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder m6745Q = m6745Q(bVar);
            this.f5199h = m6745Q;
            bVar.m6790e(m6745Q);
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

    /* renamed from: I */
    private static boolean m6737I(FileDescriptor fileDescriptor) {
        try {
            C1240b.a.m6826c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f5186v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    /* renamed from: J */
    private boolean m6738J(HashMap hashMap) {
        d dVar;
        int m6810m;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.m6812o(this.f5199h);
            int[] iArr2 = f5190y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f5195d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m6810m = dVar.m6810m(this.f5199h)) == 1 && Arrays.equals(iArr, f5139A)) || (m6810m == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f5186v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    /* renamed from: K */
    private static boolean m6739K(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    /* renamed from: L */
    private boolean m6740L(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m6810m(this.f5199h) <= 512 && dVar2.m6810m(this.f5199h) <= 512;
    }

    /* renamed from: M */
    private boolean m6741M(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f5150L;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f5151M;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f5150L.length + i11 + 4] != bArr3[i11]) {
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

    /* renamed from: N */
    private void m6742N(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i10 = 0; i10 < f5174j0.length; i10++) {
            try {
                try {
                    this.f5197f[i10] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException e10) {
                    boolean z10 = f5186v;
                    if (z10) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    m6754a();
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                m6754a();
                if (f5186v) {
                    m6744P();
                }
            }
        }
        if (!this.f5196e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f5195d = m6767m(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (m6758c0(this.f5195d)) {
            g gVar = new g(inputStream);
            if (this.f5196e) {
                m6773t(gVar);
            } else {
                int i11 = this.f5195d;
                if (i11 == 12) {
                    m6765j(gVar);
                } else if (i11 == 7) {
                    m6768n(gVar);
                } else if (i11 == 10) {
                    m6772s(gVar);
                } else {
                    m6771q(gVar);
                }
            }
            gVar.m6816g(this.f5207p);
            m6756b0(gVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f5195d;
            if (i12 == 4) {
                m6766k(bVar, 0, 0);
            } else if (i12 == 13) {
                m6769o(bVar);
            } else if (i12 == 9) {
                m6770p(bVar);
            } else if (i12 == 14) {
                m6774w(bVar);
            }
        }
    }

    /* renamed from: O */
    private void m6743O(b bVar) {
        ByteOrder m6745Q = m6745Q(bVar);
        this.f5199h = m6745Q;
        bVar.m6790e(m6745Q);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f5195d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i11 = readInt - 8;
        if (i11 > 0) {
            bVar.m6791f(i11);
        }
    }

    /* renamed from: P */
    private void m6744P() {
        for (int i10 = 0; i10 < this.f5197f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f5197f[i10].size());
            for (Map.Entry<String, d> entry : this.f5197f[i10].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m6811n(this.f5199h) + "'");
            }
        }
    }

    /* renamed from: Q */
    private ByteOrder m6745Q(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f5186v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f5186v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: R */
    private void m6746R(byte[] bArr, int i10) {
        g gVar = new g(bArr);
        m6743O(gVar);
        m6747S(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0278  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6747S(androidx.exifinterface.media.C1239a.g r30, int r31) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1239a.m6747S(androidx.exifinterface.media.a$g, int):void");
    }

    /* renamed from: T */
    private void m6748T(String str) {
        for (int i10 = 0; i10 < f5174j0.length; i10++) {
            this.f5197f[i10].remove(str);
        }
    }

    /* renamed from: U */
    private void m6749U(int i10, String str, String str2) {
        if (this.f5197f[i10].isEmpty() || this.f5197f[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> hashMap = this.f5197f[i10];
        hashMap.put(str2, hashMap.get(str));
        this.f5197f[i10].remove(str);
    }

    /* renamed from: V */
    private void m6750V(g gVar, int i10) {
        d dVar = this.f5197f[i10].get("ImageLength");
        d dVar2 = this.f5197f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f5197f[i10].get("JPEGInterchangeFormat");
            d dVar4 = this.f5197f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int m6810m = dVar3.m6810m(this.f5199h);
            int m6810m2 = dVar3.m6810m(this.f5199h);
            gVar.m6816g(m6810m);
            byte[] bArr = new byte[m6810m2];
            gVar.read(bArr);
            m6766k(new b(bArr), m6810m, i10);
        }
    }

    /* renamed from: X */
    private void m6751X(InputStream inputStream, OutputStream outputStream) {
        if (f5186v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.m6793b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.m6793b(-40);
        d remove = (m6781f("Xmp") == null || !this.f5212u) ? null : this.f5197f[0].remove("Xmp");
        cVar.m6793b(-1);
        cVar.m6793b(-31);
        m6763g0(cVar);
        if (remove != null) {
            this.f5197f[0].put("Xmp", remove);
        }
        byte[] bArr = new byte[RecognitionOptions.AZTEC];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.m6793b(-1);
                cVar.m6793b(readByte);
                C1240b.m6821e(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.m6793b(-1);
                cVar.m6793b(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.m6797i(readUnsignedShort);
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
                    if (Arrays.equals(bArr2, f5181q0)) {
                        bVar.m6791f(readUnsignedShort2 - 6);
                    }
                }
                cVar.m6793b(-1);
                cVar.m6793b(readByte);
                cVar.m6797i(readUnsignedShort2 + 2);
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

    /* renamed from: Y */
    private void m6752Y(InputStream inputStream, OutputStream outputStream) {
        if (f5186v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f5146H;
        C1240b.m6822f(bVar, cVar, bArr.length);
        int i10 = this.f5207p;
        if (i10 == 0) {
            int readInt = bVar.readInt();
            cVar.m6794e(readInt);
            C1240b.m6822f(bVar, cVar, readInt + 4 + 4);
        } else {
            C1240b.m6822f(bVar, cVar, ((i10 - bArr.length) - 4) - 4);
            bVar.m6791f(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                m6763g0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f5222a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.m6794e((int) crc32.getValue());
                C1240b.m6819c(byteArrayOutputStream2);
                C1240b.m6821e(bVar, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                C1240b.m6819c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: Z */
    private void m6753Z(InputStream inputStream, OutputStream outputStream) {
        int i10;
        int i11;
        int i12;
        if (f5186v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f5150L;
        C1240b.m6822f(bVar, cVar, bArr.length);
        byte[] bArr2 = f5151M;
        bVar.m6791f(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i13 = this.f5207p;
                    if (i13 != 0) {
                        C1240b.m6822f(bVar, cVar2, ((i13 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                        bVar.m6791f(4);
                        int readInt = bVar.readInt();
                        if (readInt % 2 != 0) {
                            readInt++;
                        }
                        bVar.m6791f(readInt);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (bVar.read(bArr3) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr4 = f5154P;
                        boolean z10 = true;
                        if (!Arrays.equals(bArr3, bArr4)) {
                            byte[] bArr5 = f5156R;
                            if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, f5155Q)) {
                                int readInt2 = bVar.readInt();
                                int i14 = readInt2 % 2 == 1 ? readInt2 + 1 : readInt2;
                                byte[] bArr6 = new byte[3];
                                if (Arrays.equals(bArr3, bArr5)) {
                                    bVar.read(bArr6);
                                    byte[] bArr7 = new byte[3];
                                    if (bVar.read(bArr7) != 3 || !Arrays.equals(f5153O, bArr7)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i10 = bVar.readInt();
                                    i14 -= 10;
                                    i12 = (i10 << 2) >> 18;
                                    i11 = (i10 << 18) >> 18;
                                    z10 = false;
                                } else if (!Arrays.equals(bArr3, f5155Q)) {
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
                                cVar2.m6794e(10);
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
                                cVar2.m6794e(readInt2);
                                if (Arrays.equals(bArr3, bArr5)) {
                                    cVar2.write(bArr6);
                                    cVar2.write(f5153O);
                                } else {
                                    if (Arrays.equals(bArr3, f5155Q)) {
                                        cVar2.write(47);
                                    }
                                    C1240b.m6822f(bVar, cVar2, i14);
                                }
                                cVar2.m6794e(i10);
                                C1240b.m6822f(bVar, cVar2, i14);
                            }
                            C1240b.m6821e(bVar, cVar2);
                            int size = byteArrayOutputStream2.size();
                            byte[] bArr9 = f5151M;
                            cVar.m6794e(size + bArr9.length);
                            cVar.write(bArr9);
                            byteArrayOutputStream2.writeTo(cVar);
                            C1240b.m6819c(byteArrayOutputStream2);
                        }
                        int readInt3 = bVar.readInt();
                        byte[] bArr10 = new byte[readInt3 % 2 == 1 ? readInt3 + 1 : readInt3];
                        bVar.read(bArr10);
                        byte b10 = (byte) (8 | bArr10[0]);
                        bArr10[0] = b10;
                        boolean z11 = ((b10 >> 1) & 1) == 1;
                        cVar2.write(bArr4);
                        cVar2.m6794e(readInt3);
                        cVar2.write(bArr10);
                        if (z11) {
                            m6757c(bVar, cVar2, f5157S, null);
                            while (true) {
                                byte[] bArr11 = new byte[4];
                                inputStream.read(bArr11);
                                if (!Arrays.equals(bArr11, f5158T)) {
                                    break;
                                } else {
                                    m6759d(bVar, cVar2, bArr11);
                                }
                            }
                        } else {
                            m6757c(bVar, cVar2, f5156R, f5155Q);
                        }
                    }
                    m6763g0(cVar2);
                    C1240b.m6821e(bVar, cVar2);
                    int size2 = byteArrayOutputStream2.size();
                    byte[] bArr92 = f5151M;
                    cVar.m6794e(size2 + bArr92.length);
                    cVar.write(bArr92);
                    byteArrayOutputStream2.writeTo(cVar);
                    C1240b.m6819c(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    C1240b.m6819c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a */
    private void m6754a() {
        String m6781f = m6781f("DateTimeOriginal");
        if (m6781f != null && m6781f("DateTime") == null) {
            this.f5197f[0].put("DateTime", d.m6802e(m6781f));
        }
        if (m6781f("ImageWidth") == null) {
            this.f5197f[0].put("ImageWidth", d.m6803f(0L, this.f5199h));
        }
        if (m6781f("ImageLength") == null) {
            this.f5197f[0].put("ImageLength", d.m6803f(0L, this.f5199h));
        }
        if (m6781f("Orientation") == null) {
            this.f5197f[0].put("Orientation", d.m6803f(0L, this.f5199h));
        }
        if (m6781f("LightSource") == null) {
            this.f5197f[1].put("LightSource", d.m6803f(0L, this.f5199h));
        }
    }

    /* renamed from: b */
    private static double m6755b(String str, String str2) {
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

    /* renamed from: b0 */
    private void m6756b0(b bVar) {
        HashMap<String, d> hashMap = this.f5197f[4];
        d dVar = hashMap.get("Compression");
        if (dVar != null) {
            int m6810m = dVar.m6810m(this.f5199h);
            this.f5206o = m6810m;
            if (m6810m != 1) {
                if (m6810m != 6) {
                    if (m6810m != 7) {
                        return;
                    }
                }
            }
            if (m6738J(hashMap)) {
                m6777z(bVar, hashMap);
                return;
            }
            return;
        }
        this.f5206o = 6;
        m6776y(bVar, hashMap);
    }

    /* renamed from: c */
    private void m6757c(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f5180p0;
                sb2.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
            m6759d(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* renamed from: c0 */
    private static boolean m6758c0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    /* renamed from: d */
    private void m6759d(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.m6794e(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        C1240b.m6822f(bVar, cVar, readInt);
    }

    /* renamed from: d0 */
    private void m6760d0(int i10, int i11) {
        String str;
        if (this.f5197f[i10].isEmpty() || this.f5197f[i11].isEmpty()) {
            if (f5186v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f5197f[i10].get("ImageLength");
        d dVar2 = this.f5197f[i10].get("ImageWidth");
        d dVar3 = this.f5197f[i11].get("ImageLength");
        d dVar4 = this.f5197f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (!f5186v) {
                return;
            } else {
                str = "First image does not contain valid size information";
            }
        } else {
            if (dVar3 != null && dVar4 != null) {
                int m6810m = dVar.m6810m(this.f5199h);
                int m6810m2 = dVar2.m6810m(this.f5199h);
                int m6810m3 = dVar3.m6810m(this.f5199h);
                int m6810m4 = dVar4.m6810m(this.f5199h);
                if (m6810m >= m6810m3 || m6810m2 >= m6810m4) {
                    return;
                }
                HashMap<String, d>[] hashMapArr = this.f5197f;
                HashMap<String, d> hashMap = hashMapArr[i10];
                hashMapArr[i10] = hashMapArr[i11];
                hashMapArr[i11] = hashMap;
                return;
            }
            if (!f5186v) {
                return;
            } else {
                str = "Second image does not contain valid size information";
            }
        }
        Log.d("ExifInterface", str);
    }

    /* renamed from: e0 */
    private void m6761e0(g gVar, int i10) {
        StringBuilder sb2;
        String arrays;
        d m6807j;
        d m6807j2;
        d dVar = this.f5197f[i10].get("DefaultCropSize");
        d dVar2 = this.f5197f[i10].get("SensorTopBorder");
        d dVar3 = this.f5197f[i10].get("SensorLeftBorder");
        d dVar4 = this.f5197f[i10].get("SensorBottomBorder");
        d dVar5 = this.f5197f[i10].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                m6750V(gVar, i10);
                return;
            }
            int m6810m = dVar2.m6810m(this.f5199h);
            int m6810m2 = dVar4.m6810m(this.f5199h);
            int m6810m3 = dVar5.m6810m(this.f5199h);
            int m6810m4 = dVar3.m6810m(this.f5199h);
            if (m6810m2 <= m6810m || m6810m3 <= m6810m4) {
                return;
            }
            d m6807j3 = d.m6807j(m6810m2 - m6810m, this.f5199h);
            d m6807j4 = d.m6807j(m6810m3 - m6810m4, this.f5199h);
            this.f5197f[i10].put("ImageLength", m6807j3);
            this.f5197f[i10].put("ImageWidth", m6807j4);
            return;
        }
        if (dVar.f5224a == 5) {
            f[] fVarArr = (f[]) dVar.m6812o(this.f5199h);
            if (fVarArr != null && fVarArr.length == 2) {
                m6807j = d.m6805h(fVarArr[0], this.f5199h);
                m6807j2 = d.m6805h(fVarArr[1], this.f5199h);
                this.f5197f[i10].put("ImageWidth", m6807j);
                this.f5197f[i10].put("ImageLength", m6807j2);
                return;
            }
            sb2 = new StringBuilder();
            sb2.append("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(fVarArr);
            sb2.append(arrays);
            Log.w("ExifInterface", sb2.toString());
        }
        int[] iArr = (int[]) dVar.m6812o(this.f5199h);
        if (iArr != null && iArr.length == 2) {
            m6807j = d.m6807j(iArr[0], this.f5199h);
            m6807j2 = d.m6807j(iArr[1], this.f5199h);
            this.f5197f[i10].put("ImageWidth", m6807j);
            this.f5197f[i10].put("ImageLength", m6807j2);
            return;
        }
        sb2 = new StringBuilder();
        sb2.append("Invalid crop size values. cropSize=");
        arrays = Arrays.toString(iArr);
        sb2.append(arrays);
        Log.w("ExifInterface", sb2.toString());
    }

    /* renamed from: f0 */
    private void m6762f0() {
        m6760d0(0, 5);
        m6760d0(0, 4);
        m6760d0(5, 4);
        d dVar = this.f5197f[1].get("PixelXDimension");
        d dVar2 = this.f5197f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f5197f[0].put("ImageWidth", dVar);
            this.f5197f[0].put("ImageLength", dVar2);
        }
        if (this.f5197f[4].isEmpty() && m6740L(this.f5197f[5])) {
            HashMap<String, d>[] hashMapArr = this.f5197f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m6740L(this.f5197f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m6749U(0, "ThumbnailOrientation", "Orientation");
        m6749U(0, "ThumbnailImageLength", "ImageLength");
        m6749U(0, "ThumbnailImageWidth", "ImageWidth");
        m6749U(5, "ThumbnailOrientation", "Orientation");
        m6749U(5, "ThumbnailImageLength", "ImageLength");
        m6749U(5, "ThumbnailImageWidth", "ImageWidth");
        m6749U(4, "Orientation", "ThumbnailOrientation");
        m6749U(4, "ImageLength", "ThumbnailImageLength");
        m6749U(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: g0 */
    private int m6763g0(c cVar) {
        e[][] eVarArr = f5174j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f5175k0) {
            m6748T(eVar.f5229b);
        }
        if (this.f5200i) {
            if (this.f5201j) {
                m6748T("StripOffsets");
                m6748T("StripByteCounts");
            } else {
                m6748T("JPEGInterchangeFormat");
                m6748T("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f5174j0.length; i10++) {
            for (Object obj : this.f5197f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f5197f[i10].remove(entry.getKey());
                }
            }
        }
        if (!this.f5197f[1].isEmpty()) {
            this.f5197f[0].put(f5175k0[1].f5229b, d.m6803f(0L, this.f5199h));
        }
        if (!this.f5197f[2].isEmpty()) {
            this.f5197f[0].put(f5175k0[2].f5229b, d.m6803f(0L, this.f5199h));
        }
        if (!this.f5197f[3].isEmpty()) {
            this.f5197f[1].put(f5175k0[3].f5229b, d.m6803f(0L, this.f5199h));
        }
        if (this.f5200i) {
            if (this.f5201j) {
                this.f5197f[4].put("StripOffsets", d.m6807j(0, this.f5199h));
                this.f5197f[4].put("StripByteCounts", d.m6807j(this.f5204m, this.f5199h));
            } else {
                this.f5197f[4].put("JPEGInterchangeFormat", d.m6803f(0L, this.f5199h));
                this.f5197f[4].put("JPEGInterchangeFormatLength", d.m6803f(this.f5204m, this.f5199h));
            }
        }
        for (int i11 = 0; i11 < f5174j0.length; i11++) {
            Iterator<Map.Entry<String, d>> it = this.f5197f[i11].entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int m6813p = it.next().getValue().m6813p();
                if (m6813p > 4) {
                    i12 += m6813p;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < f5174j0.length; i14++) {
            if (!this.f5197f[i14].isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f5197f[i14].size() * 12) + 2 + 4 + iArr2[i14];
            }
        }
        if (this.f5200i) {
            if (this.f5201j) {
                this.f5197f[4].put("StripOffsets", d.m6807j(i13, this.f5199h));
            } else {
                this.f5197f[4].put("JPEGInterchangeFormat", d.m6803f(i13, this.f5199h));
            }
            this.f5203l = i13;
            i13 += this.f5204m;
        }
        if (this.f5195d == 4) {
            i13 += 8;
        }
        if (f5186v) {
            for (int i15 = 0; i15 < f5174j0.length; i15++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.f5197f[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(i13)));
            }
        }
        if (!this.f5197f[1].isEmpty()) {
            this.f5197f[0].put(f5175k0[1].f5229b, d.m6803f(iArr[1], this.f5199h));
        }
        if (!this.f5197f[2].isEmpty()) {
            this.f5197f[0].put(f5175k0[2].f5229b, d.m6803f(iArr[2], this.f5199h));
        }
        if (!this.f5197f[3].isEmpty()) {
            this.f5197f[1].put(f5175k0[3].f5229b, d.m6803f(iArr[3], this.f5199h));
        }
        int i16 = this.f5195d;
        if (i16 == 4) {
            cVar.m6797i(i13);
            cVar.write(f5181q0);
        } else if (i16 == 13) {
            cVar.m6794e(i13);
            cVar.write(f5147I);
        } else if (i16 == 14) {
            cVar.write(f5152N);
            cVar.m6794e(i13);
        }
        cVar.m6795f(this.f5199h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.m6792a(this.f5199h);
        cVar.m6797i(42);
        cVar.m6796g(8L);
        for (int i17 = 0; i17 < f5174j0.length; i17++) {
            if (!this.f5197f[i17].isEmpty()) {
                cVar.m6797i(this.f5197f[i17].size());
                int size = iArr[i17] + 2 + (this.f5197f[i17].size() * 12) + 4;
                for (Map.Entry<String, d> entry2 : this.f5197f[i17].entrySet()) {
                    int i18 = f5177m0[i17].get(entry2.getKey()).f5228a;
                    d value = entry2.getValue();
                    int m6813p2 = value.m6813p();
                    cVar.m6797i(i18);
                    cVar.m6797i(value.f5224a);
                    cVar.m6794e(value.f5225b);
                    if (m6813p2 > 4) {
                        cVar.m6796g(size);
                        size += m6813p2;
                    } else {
                        cVar.write(value.f5227d);
                        if (m6813p2 < 4) {
                            while (m6813p2 < 4) {
                                cVar.m6793b(0);
                                m6813p2++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.f5197f[4].isEmpty()) {
                    cVar.m6796g(0L);
                } else {
                    cVar.m6796g(iArr[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = this.f5197f[i17].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f5227d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f5200i) {
            cVar.write(m6787v());
        }
        if (this.f5195d == 14 && i13 % 2 == 1) {
            cVar.m6793b(0);
        }
        cVar.m6792a(ByteOrder.BIG_ENDIAN);
        return i13;
    }

    /* renamed from: i */
    private d m6764i(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f5186v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f5174j0.length; i10++) {
            d dVar = this.f5197f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    private void m6765j(g gVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                C1240b.b.m6827a(mediaMetadataRetriever, new a(gVar));
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
                    this.f5197f[0].put("ImageWidth", d.m6807j(Integer.parseInt(str), this.f5199h));
                }
                if (str2 != null) {
                    this.f5197f[0].put("ImageLength", d.m6807j(Integer.parseInt(str2), this.f5199h));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    this.f5197f[0].put("Orientation", d.m6807j(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f5199h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.m6816g(parseInt2);
                    byte[] bArr = new byte[6];
                    if (gVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i10 = parseInt2 + 6;
                    int i11 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f5181q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i11];
                    if (gVar.read(bArr2) != i11) {
                        throw new IOException("Can't read exif");
                    }
                    this.f5207p = i10;
                    m6746R(bArr2, 0);
                }
                if (f5186v) {
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
    
        r22.m6790e(r21.f5199h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0184 A[LOOP:0: B:9:0x0038->B:33:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018e A[SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6766k(androidx.exifinterface.media.C1239a.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1239a.m6766k(androidx.exifinterface.media.a$b, int, int):void");
    }

    /* renamed from: m */
    private int m6767m(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m6732D(bArr)) {
            return 4;
        }
        if (m6735G(bArr)) {
            return 9;
        }
        if (m6731C(bArr)) {
            return 12;
        }
        if (m6733E(bArr)) {
            return 7;
        }
        if (m6736H(bArr)) {
            return 10;
        }
        if (m6734F(bArr)) {
            return 13;
        }
        return m6741M(bArr) ? 14 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6768n(androidx.exifinterface.media.C1239a.g r6) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1239a.m6768n(androidx.exifinterface.media.a$g):void");
    }

    /* renamed from: o */
    private void m6769o(b bVar) {
        if (f5186v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.m6790e(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f5146H;
        bVar.m6791f(bArr.length);
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
                if (i11 == 16 && !Arrays.equals(bArr2, f5148J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f5149K)) {
                    return;
                }
                if (Arrays.equals(bArr2, f5147I)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C1240b.m6817a(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f5207p = i11;
                        m6746R(bArr3, 0);
                        m6762f0();
                        m6756b0(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i12 = readInt + 4;
                bVar.m6791f(i12);
                length = i11 + i12;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: p */
    private void m6770p(b bVar) {
        boolean z10 = f5186v;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.m6791f(84);
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
        bVar.m6791f(i10 - bVar.m6788a());
        bVar.read(bArr4);
        m6766k(new b(bArr4), i10, 5);
        bVar.m6791f(i12 - bVar.m6788a());
        bVar.m6790e(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f5169e0.f5228a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d m6807j = d.m6807j(readShort, this.f5199h);
                d m6807j2 = d.m6807j(readShort2, this.f5199h);
                this.f5197f[0].put("ImageLength", m6807j);
                this.f5197f[0].put("ImageWidth", m6807j2);
                if (f5186v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.m6791f(readUnsignedShort2);
        }
    }

    /* renamed from: q */
    private void m6771q(g gVar) {
        d dVar;
        m6743O(gVar);
        m6747S(gVar, 0);
        m6761e0(gVar, 0);
        m6761e0(gVar, 5);
        m6761e0(gVar, 4);
        m6762f0();
        if (this.f5195d != 8 || (dVar = this.f5197f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f5227d);
        gVar2.m6790e(this.f5199h);
        gVar2.m6791f(6);
        m6747S(gVar2, 9);
        d dVar2 = this.f5197f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f5197f[1].put("ColorSpace", dVar2);
        }
    }

    /* renamed from: s */
    private void m6772s(g gVar) {
        if (f5186v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m6771q(gVar);
        d dVar = this.f5197f[0].get("JpgFromRaw");
        if (dVar != null) {
            m6766k(new b(dVar.f5227d), (int) dVar.f5226c, 5);
        }
        d dVar2 = this.f5197f[0].get("ISO");
        d dVar3 = this.f5197f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f5197f[1].put("PhotographicSensitivity", dVar2);
    }

    /* renamed from: t */
    private void m6773t(g gVar) {
        byte[] bArr = f5181q0;
        gVar.m6791f(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f5207p = bArr.length;
        m6746R(bArr2, 0);
    }

    /* renamed from: w */
    private void m6774w(b bVar) {
        if (f5186v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.m6790e(ByteOrder.LITTLE_ENDIAN);
        bVar.m6791f(f5150L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f5151M;
        bVar.m6791f(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i10 = length + 4 + 4;
                if (Arrays.equals(f5152N, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.f5207p = i10;
                        m6746R(bArr3, 0);
                        m6756b0(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C1240b.m6817a(bArr2));
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
                bVar.m6791f(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: x */
    private static Pair<Integer, Integer> m6775x(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> m6775x = m6775x(split[0]);
            if (((Integer) m6775x.first).intValue() == 2) {
                return m6775x;
            }
            for (int i10 = 1; i10 < split.length; i10++) {
                Pair<Integer, Integer> m6775x2 = m6775x(split[i10]);
                int intValue = (((Integer) m6775x2.first).equals(m6775x.first) || ((Integer) m6775x2.second).equals(m6775x.first)) ? ((Integer) m6775x.first).intValue() : -1;
                int intValue2 = (((Integer) m6775x.second).intValue() == -1 || !(((Integer) m6775x2.first).equals(m6775x.second) || ((Integer) m6775x2.second).equals(m6775x.second))) ? -1 : ((Integer) m6775x.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    m6775x = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    m6775x = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return m6775x;
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

    /* renamed from: y */
    private void m6776y(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int m6810m = dVar.m6810m(this.f5199h);
        int m6810m2 = dVar2.m6810m(this.f5199h);
        if (this.f5195d == 7) {
            m6810m += this.f5208q;
        }
        if (m6810m > 0 && m6810m2 > 0) {
            this.f5200i = true;
            if (this.f5192a == null && this.f5194c == null && this.f5193b == null) {
                byte[] bArr = new byte[m6810m2];
                bVar.skip(m6810m);
                bVar.read(bArr);
                this.f5205n = bArr;
            }
            this.f5203l = m6810m;
            this.f5204m = m6810m2;
        }
        if (f5186v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m6810m + ", length: " + m6810m2);
        }
    }

    /* renamed from: z */
    private void m6777z(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] m6820d = C1240b.m6820d(dVar.m6812o(this.f5199h));
        long[] m6820d2 = C1240b.m6820d(dVar2.m6812o(this.f5199h));
        if (m6820d == null || m6820d.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (m6820d2 == null || m6820d2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (m6820d.length != m6820d2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : m6820d2) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        this.f5202k = true;
        this.f5201j = true;
        this.f5200i = true;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < m6820d.length; i13++) {
            int i14 = (int) m6820d[i13];
            int i15 = (int) m6820d2[i13];
            if (i13 < m6820d.length - 1 && i14 + i15 != m6820d[i13 + 1]) {
                this.f5202k = false;
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
        this.f5205n = bArr;
        if (this.f5202k) {
            this.f5203l = (int) m6820d[0];
            this.f5204m = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:57:0x00e0, B:59:0x00e4, B:60:0x00fa, B:64:0x00f3), top: B:56:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:57:0x00e0, B:59:0x00e4, B:60:0x00fa, B:64:0x00f3), top: B:56:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m6778W() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1239a.m6778W():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x01f1. Please report as an issue. */
    /* renamed from: a0 */
    public void m6779a0(String str, String str2) {
        StringBuilder sb2;
        e eVar;
        int i10;
        int i11;
        HashMap<String, d> hashMap;
        d m6798a;
        HashMap<String, d> hashMap2;
        d m6800c;
        String str3 = str;
        String str4 = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = f5185u0.matcher(str4).find();
            boolean find2 = f5187v0.matcher(str4).find();
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
            if (f5186v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i12 = 2;
        int i13 = 1;
        if (str4 != null && f5178n0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f5184t0.matcher(str4);
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
        while (i15 < f5174j0.length) {
            if ((i15 != 4 || this.f5200i) && (eVar = f5177m0[i15].get(str3)) != null) {
                if (str4 == null) {
                    this.f5197f[i15].remove(str3);
                } else {
                    Pair<Integer, Integer> m6775x = m6775x(str4);
                    int i16 = -1;
                    if (eVar.f5230c == ((Integer) m6775x.first).intValue() || eVar.f5230c == ((Integer) m6775x.second).intValue()) {
                        i10 = eVar.f5230c;
                    } else {
                        int i17 = eVar.f5231d;
                        if (i17 == -1 || !(i17 == ((Integer) m6775x.first).intValue() || eVar.f5231d == ((Integer) m6775x.second).intValue())) {
                            int i18 = eVar.f5230c;
                            if (i18 == i13 || i18 == 7 || i18 == i12) {
                                i10 = i18;
                            } else if (f5186v) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Given tag (");
                                sb3.append(str3);
                                sb3.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f5161W;
                                sb3.append(strArr[eVar.f5230c]);
                                sb3.append(eVar.f5231d == -1 ? "" : ", " + strArr[eVar.f5231d]);
                                sb3.append(" (guess: ");
                                sb3.append(strArr[((Integer) m6775x.first).intValue()]);
                                sb3.append(((Integer) m6775x.second).intValue() != -1 ? ", " + strArr[((Integer) m6775x.second).intValue()] : "");
                                sb3.append(")");
                                Log.d("ExifInterface", sb3.toString());
                            }
                        } else {
                            i10 = eVar.f5231d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            i11 = i13;
                            hashMap = this.f5197f[i15];
                            m6798a = d.m6798a(str4);
                            hashMap.put(str3, m6798a);
                            break;
                        case 2:
                        case 7:
                            i11 = i13;
                            hashMap = this.f5197f[i15];
                            m6798a = d.m6802e(str4);
                            hashMap.put(str3, m6798a);
                            break;
                        case 3:
                            i11 = i13;
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i19 = 0; i19 < split.length; i19++) {
                                iArr[i19] = Integer.parseInt(split[i19]);
                            }
                            hashMap = this.f5197f[i15];
                            m6798a = d.m6808k(iArr, this.f5199h);
                            hashMap.put(str3, m6798a);
                            break;
                        case 4:
                            i11 = i13;
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i20 = 0; i20 < split2.length; i20++) {
                                jArr[i20] = Long.parseLong(split2[i20]);
                            }
                            hashMap = this.f5197f[i15];
                            m6798a = d.m6804g(jArr, this.f5199h);
                            hashMap.put(str3, m6798a);
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
                            hashMap = this.f5197f[i15];
                            m6798a = d.m6806i(fVarArr, this.f5199h);
                            hashMap.put(str3, m6798a);
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            i11 = i13;
                            if (f5186v) {
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
                            hashMap2 = this.f5197f[i15];
                            m6800c = d.m6800c(iArr2, this.f5199h);
                            hashMap2.put(str3, m6800c);
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
                            hashMap2 = this.f5197f[i15];
                            m6800c = d.m6801d(fVarArr2, this.f5199h);
                            hashMap2.put(str3, m6800c);
                            i11 = 1;
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i24 = i14; i24 < split8.length; i24++) {
                                dArr[i24] = Double.parseDouble(split8[i24]);
                            }
                            this.f5197f[i15].put(str3, d.m6799b(dArr, this.f5199h));
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

    /* renamed from: e */
    public double m6780e(double d10) {
        double m6782g = m6782g("GPSAltitude", -1.0d);
        int m6783h = m6783h("GPSAltitudeRef", -1);
        if (m6782g < 0.0d || m6783h < 0) {
            return d10;
        }
        return m6782g * (m6783h != 1 ? 1 : -1);
    }

    /* renamed from: f */
    public String m6781f(String str) {
        String str2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d m6764i = m6764i(str);
        if (m6764i != null) {
            if (!f5178n0.contains(str)) {
                return m6764i.m6811n(this.f5199h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = m6764i.f5224a;
                if (i10 == 5 || i10 == 10) {
                    f[] fVarArr = (f[]) m6764i.m6812o(this.f5199h);
                    if (fVarArr != null && fVarArr.length == 3) {
                        f fVar = fVarArr[0];
                        f fVar2 = fVarArr[1];
                        f fVar3 = fVarArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) fVar.f5232a) / ((float) fVar.f5233b))), Integer.valueOf((int) (((float) fVar2.f5232a) / ((float) fVar2.f5233b))), Integer.valueOf((int) (((float) fVar3.f5232a) / ((float) fVar3.f5233b))));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr);
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + m6764i.f5224a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(m6764i.m6809l(this.f5199h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: g */
    public double m6782g(String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d m6764i = m6764i(str);
        if (m6764i == null) {
            return d10;
        }
        try {
            return m6764i.m6809l(this.f5199h);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    /* renamed from: h */
    public int m6783h(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d m6764i = m6764i(str);
        if (m6764i == null) {
            return i10;
        }
        try {
            return m6764i.m6810m(this.f5199h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* renamed from: l */
    public double[] m6784l() {
        String m6781f = m6781f("GPSLatitude");
        String m6781f2 = m6781f("GPSLatitudeRef");
        String m6781f3 = m6781f("GPSLongitude");
        String m6781f4 = m6781f("GPSLongitudeRef");
        if (m6781f == null || m6781f2 == null || m6781f3 == null || m6781f4 == null) {
            return null;
        }
        try {
            return new double[]{m6755b(m6781f, m6781f2), m6755b(m6781f3, m6781f4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", m6781f, m6781f2, m6781f3, m6781f4));
            return null;
        }
    }

    /* renamed from: r */
    public int m6785r() {
        switch (m6783h("Orientation", 1)) {
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

    /* renamed from: u */
    public byte[] m6786u() {
        int i10 = this.f5206o;
        if (i10 == 6 || i10 == 7) {
            return m6787v();
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
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] m6787v() {
        /*
            r9 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r9.f5200i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r9.f5205n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r9.f5194c     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
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
            androidx.exifinterface.media.C1240b.m6819c(r1)
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
            java.lang.String r1 = r9.f5192a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r1 == 0) goto L3a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r3 = r9.f5192a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            goto L1a
        L3a:
            java.io.FileDescriptor r1 = r9.f5193b     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.io.FileDescriptor r1 = androidx.exifinterface.media.C1240b.a.m6825b(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r4 = 0
            androidx.exifinterface.media.C1240b.a.m6826c(r1, r4, r3)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r8 = r3
            r3 = r1
            r1 = r8
        L4f:
            int r4 = r9.f5203l     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r5 = r9.f5207p     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            long r4 = r1.skip(r4)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r9.f5203l     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r7 = r9.f5207p     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r6 + r7
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r5 = "Corrupted image"
            if (r4 != 0) goto L82
            int r4 = r9.f5204m     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r1.read(r4)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r7 = r9.f5204m     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            if (r6 != r7) goto L7c
            r9.f5205n = r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            androidx.exifinterface.media.C1240b.m6819c(r1)
            if (r3 == 0) goto L7b
            androidx.exifinterface.media.C1240b.m6818b(r3)
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
            androidx.exifinterface.media.C1240b.m6819c(r1)
            if (r3 == 0) goto La6
            androidx.exifinterface.media.C1240b.m6818b(r3)
        La6:
            return r2
        La7:
            r0 = move-exception
        La8:
            r2 = r1
        La9:
            androidx.exifinterface.media.C1240b.m6819c(r2)
            if (r3 == 0) goto Lb1
            androidx.exifinterface.media.C1240b.m6818b(r3)
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1239a.m6787v():byte[]");
    }
}
