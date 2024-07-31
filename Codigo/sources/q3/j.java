package q3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class j implements ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f23441a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f23442b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f23443a;

        a(ByteBuffer byteBuffer) {
            this.f23443a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // q3.j.c
        public int a() {
            return (c() << 8) | c();
        }

        @Override // q3.j.c
        public int b(byte[] bArr, int i10) {
            int min = Math.min(i10, this.f23443a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f23443a.get(bArr, 0, min);
            return min;
        }

        @Override // q3.j.c
        public short c() {
            if (this.f23443a.remaining() >= 1) {
                return (short) (this.f23443a.get() & 255);
            }
            throw new c.a();
        }

        @Override // q3.j.c
        public long skip(long j10) {
            int min = (int) Math.min(this.f23443a.remaining(), j10);
            ByteBuffer byteBuffer = this.f23443a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f23444a;

        b(byte[] bArr, int i10) {
            this.f23444a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        private boolean c(int i10, int i11) {
            return this.f23444a.remaining() - i10 >= i11;
        }

        short a(int i10) {
            if (c(i10, 2)) {
                return this.f23444a.getShort(i10);
            }
            return (short) -1;
        }

        int b(int i10) {
            if (c(i10, 4)) {
                return this.f23444a.getInt(i10);
            }
            return -1;
        }

        int d() {
            return this.f23444a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f23444a.order(byteOrder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {

        /* loaded from: classes.dex */
        public static final class a extends IOException {
            private static final long serialVersionUID = 1;

            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i10);

        short c();

        long skip(long j10);
    }

    /* loaded from: classes.dex */
    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream f23445a;

        d(InputStream inputStream) {
            this.f23445a = inputStream;
        }

        @Override // q3.j.c
        public int a() {
            return (c() << 8) | c();
        }

        @Override // q3.j.c
        public int b(byte[] bArr, int i10) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f23445a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new c.a();
            }
            return i11;
        }

        @Override // q3.j.c
        public short c() {
            int read = this.f23445a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // q3.j.c
        public long skip(long j10) {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f23445a.skip(j11);
                if (skip <= 0) {
                    if (this.f23445a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    private static int e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    private int f(c cVar, k3.b bVar) {
        try {
            int a10 = cVar.a();
            if (!h(a10)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a10);
                }
                return -1;
            }
            int j10 = j(cVar);
            if (j10 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(j10, byte[].class);
            try {
                return l(cVar, bArr, j10);
            } finally {
                bVar.put(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    private ImageHeaderParser.ImageType g(c cVar) {
        try {
            int a10 = cVar.a();
            if (a10 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c10 = (a10 << 8) | cVar.c();
            if (c10 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c11 = (c10 << 8) | cVar.c();
            if (c11 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (c11 != 1380533830) {
                return m(cVar, c11);
            }
            cVar.skip(4L);
            if (((cVar.a() << 16) | cVar.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a11 = (cVar.a() << 16) | cVar.a();
            if ((a11 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = a11 & 255;
            if (i10 == 88) {
                cVar.skip(4L);
                short c12 = cVar.c();
                return (c12 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (c12 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i10 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            cVar.skip(4L);
            return (cVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    private boolean i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f23441a.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f23441a;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
        return z10;
    }

    private int j(c cVar) {
        short c10;
        int a10;
        long j10;
        long skip;
        do {
            short c11 = cVar.c();
            if (c11 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) c11));
                }
                return -1;
            }
            c10 = cVar.c();
            if (c10 == 218) {
                return -1;
            }
            if (c10 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a10 = cVar.a() - 2;
            if (c10 == 225) {
                return a10;
            }
            j10 = a10;
            skip = cVar.skip(j10);
        } while (skip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) c10) + ", wanted to skip: " + a10 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    private static int k(b bVar) {
        ByteOrder byteOrder;
        StringBuilder sb2;
        String str;
        String sb3;
        short a10 = bVar.a(6);
        if (a10 != 18761) {
            if (a10 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a10));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int b10 = bVar.b(10) + 6;
        short a11 = bVar.a(b10);
        for (int i10 = 0; i10 < a11; i10++) {
            int e10 = e(b10, i10);
            short a12 = bVar.a(e10);
            if (a12 == 274) {
                short a13 = bVar.a(e10 + 2);
                if (a13 >= 1 && a13 <= 12) {
                    int b11 = bVar.b(e10 + 4);
                    if (b11 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i10 + " tagType=" + ((int) a12) + " formatCode=" + ((int) a13) + " componentCount=" + b11);
                        }
                        int i11 = b11 + f23442b[a13];
                        if (i11 <= 4) {
                            int i12 = e10 + 8;
                            if (i12 >= 0 && i12 <= bVar.d()) {
                                if (i11 >= 0 && i11 + i12 <= bVar.d()) {
                                    return bVar.a(i12);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb2 = new StringBuilder();
                                    sb2.append("Illegal number of bytes for TI tag data tagType=");
                                    sb2.append((int) a12);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                sb3 = "Illegal tagValueOffset=" + i12 + " tagType=" + ((int) a12);
                                Log.d("DfltImageHeaderParser", sb3);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb2 = new StringBuilder();
                            str = "Got byte count > 4, not orientation, continuing, formatCode=";
                            sb2.append(str);
                            sb2.append((int) a13);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        sb3 = "Negative tiff component count";
                        Log.d("DfltImageHeaderParser", sb3);
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    sb2 = new StringBuilder();
                    str = "Got invalid format code = ";
                    sb2.append(str);
                    sb2.append((int) a13);
                }
                sb3 = sb2.toString();
                Log.d("DfltImageHeaderParser", sb3);
            }
        }
        return -1;
    }

    private int l(c cVar, byte[] bArr, int i10) {
        int b10 = cVar.b(bArr, i10);
        if (b10 == i10) {
            if (i(bArr, i10)) {
                return k(new b(bArr, i10));
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + b10);
        }
        return -1;
    }

    private ImageHeaderParser.ImageType m(c cVar, int i10) {
        if (((cVar.a() << 16) | cVar.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int a10 = (cVar.a() << 16) | cVar.a();
        if (a10 == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        boolean z10 = a10 == 1635150182;
        cVar.skip(4L);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int a11 = (cVar.a() << 16) | cVar.a();
                if (a11 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (a11 == 1635150182) {
                    z10 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(ByteBuffer byteBuffer, k3.b bVar) {
        return f(new a((ByteBuffer) c4.k.d(byteBuffer)), (k3.b) c4.k.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) {
        return g(new a((ByteBuffer) c4.k.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return g(new d((InputStream) c4.k.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(InputStream inputStream, k3.b bVar) {
        return f(new d((InputStream) c4.k.d(inputStream)), (k3.b) c4.k.d(bVar));
    }
}
