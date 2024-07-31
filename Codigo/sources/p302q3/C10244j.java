package p302q3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p036c4.C1870k;
import p193k3.InterfaceC9139b;

/* renamed from: q3.j */
/* loaded from: classes.dex */
public final class C10244j implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f25409a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f25410b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: q3.j$a */
    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a */
        private final ByteBuffer f25411a;

        a(ByteBuffer byteBuffer) {
            this.f25411a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p302q3.C10244j.c
        /* renamed from: a */
        public int mo30649a() {
            return (mo30651c() << 8) | mo30651c();
        }

        @Override // p302q3.C10244j.c
        /* renamed from: b */
        public int mo30650b(byte[] bArr, int i10) {
            int min = Math.min(i10, this.f25411a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f25411a.get(bArr, 0, min);
            return min;
        }

        @Override // p302q3.C10244j.c
        /* renamed from: c */
        public short mo30651c() {
            if (this.f25411a.remaining() >= 1) {
                return (short) (this.f25411a.get() & 255);
            }
            throw new c.a();
        }

        @Override // p302q3.C10244j.c
        public long skip(long j10) {
            int min = (int) Math.min(this.f25411a.remaining(), j10);
            ByteBuffer byteBuffer = this.f25411a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q3.j$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final ByteBuffer f25412a;

        b(byte[] bArr, int i10) {
            this.f25412a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        /* renamed from: c */
        private boolean m30652c(int i10, int i11) {
            return this.f25412a.remaining() - i10 >= i11;
        }

        /* renamed from: a */
        short m30653a(int i10) {
            if (m30652c(i10, 2)) {
                return this.f25412a.getShort(i10);
            }
            return (short) -1;
        }

        /* renamed from: b */
        int m30654b(int i10) {
            if (m30652c(i10, 4)) {
                return this.f25412a.getInt(i10);
            }
            return -1;
        }

        /* renamed from: d */
        int m30655d() {
            return this.f25412a.remaining();
        }

        /* renamed from: e */
        void m30656e(ByteOrder byteOrder) {
            this.f25412a.order(byteOrder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q3.j$c */
    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: q3.j$c$a */
        /* loaded from: classes.dex */
        public static final class a extends IOException {
            private static final long serialVersionUID = 1;

            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo30649a();

        /* renamed from: b */
        int mo30650b(byte[] bArr, int i10);

        /* renamed from: c */
        short mo30651c();

        long skip(long j10);
    }

    /* renamed from: q3.j$d */
    /* loaded from: classes.dex */
    private static final class d implements c {

        /* renamed from: a */
        private final InputStream f25413a;

        d(InputStream inputStream) {
            this.f25413a = inputStream;
        }

        @Override // p302q3.C10244j.c
        /* renamed from: a */
        public int mo30649a() {
            return (mo30651c() << 8) | mo30651c();
        }

        @Override // p302q3.C10244j.c
        /* renamed from: b */
        public int mo30650b(byte[] bArr, int i10) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f25413a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new c.a();
            }
            return i11;
        }

        @Override // p302q3.C10244j.c
        /* renamed from: c */
        public short mo30651c() {
            int read = this.f25413a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // p302q3.C10244j.c
        public long skip(long j10) {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f25413a.skip(j11);
                if (skip <= 0) {
                    if (this.f25413a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    /* renamed from: e */
    private static int m30640e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    /* renamed from: f */
    private int m30641f(c cVar, InterfaceC9139b interfaceC9139b) {
        try {
            int mo30649a = cVar.mo30649a();
            if (!m30643h(mo30649a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + mo30649a);
                }
                return -1;
            }
            int m30645j = m30645j(cVar);
            if (m30645j == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC9139b.mo26943c(m30645j, byte[].class);
            try {
                return m30647l(cVar, bArr, m30645j);
            } finally {
                interfaceC9139b.put(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    /* renamed from: g */
    private ImageHeaderParser.ImageType m30642g(c cVar) {
        try {
            int mo30649a = cVar.mo30649a();
            if (mo30649a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int mo30651c = (mo30649a << 8) | cVar.mo30651c();
            if (mo30651c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int mo30651c2 = (mo30651c << 8) | cVar.mo30651c();
            if (mo30651c2 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.mo30651c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (mo30651c2 != 1380533830) {
                return m30648m(cVar, mo30651c2);
            }
            cVar.skip(4L);
            if (((cVar.mo30649a() << 16) | cVar.mo30649a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int mo30649a2 = (cVar.mo30649a() << 16) | cVar.mo30649a();
            if ((mo30649a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = mo30649a2 & 255;
            if (i10 == 88) {
                cVar.skip(4L);
                short mo30651c3 = cVar.mo30651c();
                return (mo30651c3 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (mo30651c3 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i10 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            cVar.skip(4L);
            return (cVar.mo30651c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: h */
    private static boolean m30643h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    /* renamed from: i */
    private boolean m30644i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f25409a.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f25409a;
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

    /* renamed from: j */
    private int m30645j(c cVar) {
        short mo30651c;
        int mo30649a;
        long j10;
        long skip;
        do {
            short mo30651c2 = cVar.mo30651c();
            if (mo30651c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) mo30651c2));
                }
                return -1;
            }
            mo30651c = cVar.mo30651c();
            if (mo30651c == 218) {
                return -1;
            }
            if (mo30651c == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            mo30649a = cVar.mo30649a() - 2;
            if (mo30651c == 225) {
                return mo30649a;
            }
            j10 = mo30649a;
            skip = cVar.skip(j10);
        } while (skip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) mo30651c) + ", wanted to skip: " + mo30649a + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* renamed from: k */
    private static int m30646k(b bVar) {
        ByteOrder byteOrder;
        StringBuilder sb2;
        String str;
        String sb3;
        short m30653a = bVar.m30653a(6);
        if (m30653a != 18761) {
            if (m30653a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) m30653a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.m30656e(byteOrder);
        int m30654b = bVar.m30654b(10) + 6;
        short m30653a2 = bVar.m30653a(m30654b);
        for (int i10 = 0; i10 < m30653a2; i10++) {
            int m30640e = m30640e(m30654b, i10);
            short m30653a3 = bVar.m30653a(m30640e);
            if (m30653a3 == 274) {
                short m30653a4 = bVar.m30653a(m30640e + 2);
                if (m30653a4 >= 1 && m30653a4 <= 12) {
                    int m30654b2 = bVar.m30654b(m30640e + 4);
                    if (m30654b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i10 + " tagType=" + ((int) m30653a3) + " formatCode=" + ((int) m30653a4) + " componentCount=" + m30654b2);
                        }
                        int i11 = m30654b2 + f25410b[m30653a4];
                        if (i11 <= 4) {
                            int i12 = m30640e + 8;
                            if (i12 >= 0 && i12 <= bVar.m30655d()) {
                                if (i11 >= 0 && i11 + i12 <= bVar.m30655d()) {
                                    return bVar.m30653a(i12);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb2 = new StringBuilder();
                                    sb2.append("Illegal number of bytes for TI tag data tagType=");
                                    sb2.append((int) m30653a3);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                sb3 = "Illegal tagValueOffset=" + i12 + " tagType=" + ((int) m30653a3);
                                Log.d("DfltImageHeaderParser", sb3);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb2 = new StringBuilder();
                            str = "Got byte count > 4, not orientation, continuing, formatCode=";
                            sb2.append(str);
                            sb2.append((int) m30653a4);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        sb3 = "Negative tiff component count";
                        Log.d("DfltImageHeaderParser", sb3);
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    sb2 = new StringBuilder();
                    str = "Got invalid format code = ";
                    sb2.append(str);
                    sb2.append((int) m30653a4);
                }
                sb3 = sb2.toString();
                Log.d("DfltImageHeaderParser", sb3);
            }
        }
        return -1;
    }

    /* renamed from: l */
    private int m30647l(c cVar, byte[] bArr, int i10) {
        int mo30650b = cVar.mo30650b(bArr, i10);
        if (mo30650b == i10) {
            if (m30644i(bArr, i10)) {
                return m30646k(new b(bArr, i10));
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + mo30650b);
        }
        return -1;
    }

    /* renamed from: m */
    private ImageHeaderParser.ImageType m30648m(c cVar, int i10) {
        if (((cVar.mo30649a() << 16) | cVar.mo30649a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int mo30649a = (cVar.mo30649a() << 16) | cVar.mo30649a();
        if (mo30649a == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        boolean z10 = mo30649a == 1635150182;
        cVar.skip(4L);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int mo30649a2 = (cVar.mo30649a() << 16) | cVar.mo30649a();
                if (mo30649a2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (mo30649a2 == 1635150182) {
                    z10 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo10739a(ByteBuffer byteBuffer, InterfaceC9139b interfaceC9139b) {
        return m30641f(new a((ByteBuffer) C1870k.m9950d(byteBuffer)), (InterfaceC9139b) C1870k.m9950d(interfaceC9139b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo10740b(ByteBuffer byteBuffer) {
        return m30642g(new a((ByteBuffer) C1870k.m9950d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo10741c(InputStream inputStream) {
        return m30642g(new d((InputStream) C1870k.m9950d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public int mo10742d(InputStream inputStream, InterfaceC9139b interfaceC9139b) {
        return m30641f(new d((InputStream) C1870k.m9950d(inputStream)), (InterfaceC9139b) C1870k.m9950d(interfaceC9139b));
    }
}
