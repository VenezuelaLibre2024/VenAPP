package fi;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.C1239a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: fi.f */
/* loaded from: classes3.dex */
public class C7361f {

    /* renamed from: b */
    private static final byte[] f16654b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c */
    private static final int[] f16655c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    private final b f16656a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fi.f$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final ByteBuffer f16657a;

        public a(byte[] bArr, int i10) {
            this.f16657a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        /* renamed from: a */
        public short m22217a(int i10) {
            return this.f16657a.getShort(i10);
        }

        /* renamed from: b */
        public int m22218b(int i10) {
            return this.f16657a.getInt(i10);
        }

        /* renamed from: c */
        public int m22219c() {
            return this.f16657a.remaining();
        }

        /* renamed from: d */
        public void m22220d(ByteOrder byteOrder) {
            this.f16657a.order(byteOrder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fi.f$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        int mo22221a();

        /* renamed from: b */
        int mo22222b(byte[] bArr, int i10);

        /* renamed from: c */
        short mo22223c();

        long skip(long j10);
    }

    /* renamed from: fi.f$c */
    /* loaded from: classes3.dex */
    private static class c implements b {

        /* renamed from: a */
        private final InputStream f16658a;

        public c(InputStream inputStream) {
            this.f16658a = inputStream;
        }

        @Override // fi.C7361f.b
        /* renamed from: a */
        public int mo22221a() {
            return ((this.f16658a.read() << 8) & 65280) | (this.f16658a.read() & 255);
        }

        @Override // fi.C7361f.b
        /* renamed from: b */
        public int mo22222b(byte[] bArr, int i10) {
            int i11 = i10;
            while (i11 > 0) {
                int read = this.f16658a.read(bArr, i10 - i11, i11);
                if (read == -1) {
                    break;
                }
                i11 -= read;
            }
            return i10 - i11;
        }

        @Override // fi.C7361f.b
        /* renamed from: c */
        public short mo22223c() {
            return (short) (this.f16658a.read() & 255);
        }

        @Override // fi.C7361f.b
        public long skip(long j10) {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f16658a.skip(j11);
                if (skip <= 0) {
                    if (this.f16658a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    public C7361f(InputStream inputStream) {
        this.f16656a = new c(inputStream);
    }

    /* renamed from: a */
    private static int m22205a(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0069 -> B:13:0x0070). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m22206b(android.content.Context r4, int r5, int r6, android.net.Uri r7, android.net.Uri r8) {
        /*
            java.lang.String r0 = "ImageHeaderParser"
            if (r4 != 0) goto La
            java.lang.String r4 = "context is null"
            android.util.Log.d(r0, r4)
            return
        La:
            r1 = 0
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            java.io.InputStream r7 = r2.openInputStream(r7)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            androidx.exifinterface.media.a r2 = new androidx.exifinterface.media.a     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            java.lang.String r3 = "rw"
            android.os.ParcelFileDescriptor r1 = r4.openFileDescriptor(r8, r3)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            androidx.exifinterface.media.a r4 = new androidx.exifinterface.media.a     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            java.io.FileDescriptor r8 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            m22210f(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            if (r7 == 0) goto L3c
            r7.close()     // Catch: java.io.IOException -> L34
            goto L3c
        L34:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            android.util.Log.d(r0, r5, r4)
        L3c:
            r1.close()     // Catch: java.io.IOException -> L68
            goto L70
        L40:
            r4 = move-exception
            r5 = r1
            r1 = r7
            goto L72
        L44:
            r4 = move-exception
            r5 = r1
            r1 = r7
            goto L4d
        L48:
            r4 = move-exception
            r5 = r1
            goto L72
        L4b:
            r4 = move-exception
            r5 = r1
        L4d:
            java.lang.String r6 = r4.getMessage()     // Catch: java.lang.Throwable -> L71
            android.util.Log.d(r0, r6, r4)     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L62
            r1.close()     // Catch: java.io.IOException -> L5a
            goto L62
        L5a:
            r4 = move-exception
            java.lang.String r6 = r4.getMessage()
            android.util.Log.d(r0, r6, r4)
        L62:
            if (r5 == 0) goto L70
            r5.close()     // Catch: java.io.IOException -> L68
            goto L70
        L68:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            android.util.Log.d(r0, r5, r4)
        L70:
            return
        L71:
            r4 = move-exception
        L72:
            if (r1 == 0) goto L80
            r1.close()     // Catch: java.io.IOException -> L78
            goto L80
        L78:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            android.util.Log.d(r0, r7, r6)
        L80:
            if (r5 == 0) goto L8e
            r5.close()     // Catch: java.io.IOException -> L86
            goto L8e
        L86:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            android.util.Log.d(r0, r6, r5)
        L8e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.C7361f.m22206b(android.content.Context, int, int, android.net.Uri, android.net.Uri):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0037 -> B:11:0x003e). Please report as a decompilation issue!!! */
    /* renamed from: c */
    public static void m22207c(Context context, int i10, int i11, Uri uri, String str) {
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = context.getContentResolver().openInputStream(uri);
                    m22210f(new C1239a(inputStream), new C1239a(str), i10, i11);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e10) {
                            Log.d("ImageHeaderParser", e10.getMessage(), e10);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                Log.d("ImageHeaderParser", e11.getMessage(), e11);
            }
        } catch (IOException e12) {
            Log.d("ImageHeaderParser", e12.getMessage(), e12);
            if (inputStream == null) {
            } else {
                inputStream.close();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0036 -> B:10:0x003d). Please report as a decompilation issue!!! */
    /* renamed from: d */
    public static void m22208d(Context context, C1239a c1239a, int i10, int i11, Uri uri) {
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                try {
                    parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                    m22210f(c1239a, new C1239a(parcelFileDescriptor.getFileDescriptor()), i10, i11);
                    parcelFileDescriptor.close();
                } catch (Throwable th2) {
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e10) {
                            Log.d("ImageHeaderParser", e10.getMessage(), e10);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                Log.d("ImageHeaderParser", e11.getMessage());
                if (parcelFileDescriptor == null) {
                } else {
                    parcelFileDescriptor.close();
                }
            }
        } catch (IOException e12) {
            Log.d("ImageHeaderParser", e12.getMessage(), e12);
        }
    }

    /* renamed from: e */
    public static void m22209e(C1239a c1239a, int i10, int i11, String str) {
        try {
            m22210f(c1239a, new C1239a(str), i10, i11);
        } catch (IOException e10) {
            Log.d("ImageHeaderParser", e10.getMessage());
        }
    }

    /* renamed from: f */
    private static void m22210f(C1239a c1239a, C1239a c1239a2, int i10, int i11) {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        for (int i12 = 0; i12 < 22; i12++) {
            String str = strArr[i12];
            String m6781f = c1239a.m6781f(str);
            if (!TextUtils.isEmpty(m6781f)) {
                c1239a2.m6779a0(str, m6781f);
            }
        }
        c1239a2.m6779a0("ImageWidth", String.valueOf(i10));
        c1239a2.m6779a0("ImageLength", String.valueOf(i11));
        c1239a2.m6779a0("Orientation", "0");
        c1239a2.m6778W();
    }

    /* renamed from: h */
    private static boolean m22211h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    /* renamed from: i */
    private boolean m22212i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f16654b.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f16654b;
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
    private int m22213j() {
        short mo22223c;
        int mo22221a;
        long j10;
        long skip;
        do {
            short mo22223c2 = this.f16656a.mo22223c();
            if (mo22223c2 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + ((int) mo22223c2));
                }
                return -1;
            }
            mo22223c = this.f16656a.mo22223c();
            if (mo22223c == 218) {
                return -1;
            }
            if (mo22223c == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            mo22221a = this.f16656a.mo22221a() - 2;
            if (mo22223c == 225) {
                return mo22221a;
            }
            j10 = mo22221a;
            skip = this.f16656a.skip(j10);
        } while (skip == j10);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + ((int) mo22223c) + ", wanted to skip: " + mo22221a + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0042  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m22214k(fi.C7361f.a r12) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.C7361f.m22214k(fi.f$a):int");
    }

    /* renamed from: l */
    private int m22215l(byte[] bArr, int i10) {
        int mo22222b = this.f16656a.mo22222b(bArr, i10);
        if (mo22222b == i10) {
            if (m22212i(bArr, i10)) {
                return m22214k(new a(bArr, i10));
            }
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + mo22222b);
        }
        return -1;
    }

    /* renamed from: g */
    public int m22216g() {
        int mo22221a = this.f16656a.mo22221a();
        if (m22211h(mo22221a)) {
            int m22213j = m22213j();
            if (m22213j != -1) {
                return m22215l(new byte[m22213j], m22213j);
            }
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Parser doesn't handle magic number: " + mo22221a);
        }
        return -1;
    }
}
