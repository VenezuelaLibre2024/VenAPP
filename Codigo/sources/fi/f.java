package fi;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f15231b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f15232c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a, reason: collision with root package name */
    private final b f15233a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f15234a;

        public a(byte[] bArr, int i10) {
            this.f15234a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public short a(int i10) {
            return this.f15234a.getShort(i10);
        }

        public int b(int i10) {
            return this.f15234a.getInt(i10);
        }

        public int c() {
            return this.f15234a.remaining();
        }

        public void d(ByteOrder byteOrder) {
            this.f15234a.order(byteOrder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface b {
        int a();

        int b(byte[] bArr, int i10);

        short c();

        long skip(long j10);
    }

    /* loaded from: classes3.dex */
    private static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream f15235a;

        public c(InputStream inputStream) {
            this.f15235a = inputStream;
        }

        @Override // fi.f.b
        public int a() {
            return ((this.f15235a.read() << 8) & 65280) | (this.f15235a.read() & 255);
        }

        @Override // fi.f.b
        public int b(byte[] bArr, int i10) {
            int i11 = i10;
            while (i11 > 0) {
                int read = this.f15235a.read(bArr, i10 - i11, i11);
                if (read == -1) {
                    break;
                }
                i11 -= read;
            }
            return i10 - i11;
        }

        @Override // fi.f.b
        public short c() {
            return (short) (this.f15235a.read() & 255);
        }

        @Override // fi.f.b
        public long skip(long j10) {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f15235a.skip(j11);
                if (skip <= 0) {
                    if (this.f15235a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    public f(InputStream inputStream) {
        this.f15233a = new c(inputStream);
    }

    private static int a(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0069 -> B:13:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r4, int r5, int r6, android.net.Uri r7, android.net.Uri r8) {
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
            f(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
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
        throw new UnsupportedOperationException("Method not decompiled: fi.f.b(android.content.Context, int, int, android.net.Uri, android.net.Uri):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0037 -> B:11:0x003e). Please report as a decompilation issue!!! */
    public static void c(Context context, int i10, int i11, Uri uri, String str) {
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = context.getContentResolver().openInputStream(uri);
                    f(new androidx.exifinterface.media.a(inputStream), new androidx.exifinterface.media.a(str), i10, i11);
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
    public static void d(Context context, androidx.exifinterface.media.a aVar, int i10, int i11, Uri uri) {
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                try {
                    parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                    f(aVar, new androidx.exifinterface.media.a(parcelFileDescriptor.getFileDescriptor()), i10, i11);
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

    public static void e(androidx.exifinterface.media.a aVar, int i10, int i11, String str) {
        try {
            f(aVar, new androidx.exifinterface.media.a(str), i10, i11);
        } catch (IOException e10) {
            Log.d("ImageHeaderParser", e10.getMessage());
        }
    }

    private static void f(androidx.exifinterface.media.a aVar, androidx.exifinterface.media.a aVar2, int i10, int i11) {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        for (int i12 = 0; i12 < 22; i12++) {
            String str = strArr[i12];
            String f10 = aVar.f(str);
            if (!TextUtils.isEmpty(f10)) {
                aVar2.a0(str, f10);
            }
        }
        aVar2.a0("ImageWidth", String.valueOf(i10));
        aVar2.a0("ImageLength", String.valueOf(i11));
        aVar2.a0("Orientation", "0");
        aVar2.W();
    }

    private static boolean h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    private boolean i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f15231b.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f15231b;
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

    private int j() {
        short c10;
        int a10;
        long j10;
        long skip;
        do {
            short c11 = this.f15233a.c();
            if (c11 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + ((int) c11));
                }
                return -1;
            }
            c10 = this.f15233a.c();
            if (c10 == 218) {
                return -1;
            }
            if (c10 == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a10 = this.f15233a.a() - 2;
            if (c10 == 225) {
                return a10;
            }
            j10 = a10;
            skip = this.f15233a.skip(j10);
        } while (skip == j10);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + ((int) c10) + ", wanted to skip: " + a10 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int k(fi.f.a r12) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.f.k(fi.f$a):int");
    }

    private int l(byte[] bArr, int i10) {
        int b10 = this.f15233a.b(bArr, i10);
        if (b10 == i10) {
            if (i(bArr, i10)) {
                return k(new a(bArr, i10));
            }
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + b10);
        }
        return -1;
    }

    public int g() {
        int a10 = this.f15233a.a();
        if (h(a10)) {
            int j10 = j();
            if (j10 != -1) {
                return l(new byte[j10], j10);
            }
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Parser doesn't handle magic number: " + a10);
        }
        return -1;
    }
}
