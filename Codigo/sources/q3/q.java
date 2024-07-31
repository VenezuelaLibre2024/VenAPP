package q3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import q3.k;
import q3.v;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: f, reason: collision with root package name */
    public static final h3.g<h3.b> f23455f = h3.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", h3.b.DEFAULT);

    /* renamed from: g, reason: collision with root package name */
    public static final h3.g<h3.i> f23456g = h3.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final h3.g<k> f23457h = k.f23453h;

    /* renamed from: i, reason: collision with root package name */
    public static final h3.g<Boolean> f23458i;

    /* renamed from: j, reason: collision with root package name */
    public static final h3.g<Boolean> f23459j;

    /* renamed from: k, reason: collision with root package name */
    private static final Set<String> f23460k;

    /* renamed from: l, reason: collision with root package name */
    private static final b f23461l;

    /* renamed from: m, reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f23462m;

    /* renamed from: n, reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f23463n;

    /* renamed from: a, reason: collision with root package name */
    private final k3.d f23464a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f23465b;

    /* renamed from: c, reason: collision with root package name */
    private final k3.b f23466c;

    /* renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f23467d;

    /* renamed from: e, reason: collision with root package name */
    private final u f23468e = u.b();

    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // q3.q.b
        public void a(k3.d dVar, Bitmap bitmap) {
        }

        @Override // q3.q.b
        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(k3.d dVar, Bitmap bitmap);

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f23458i = h3.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f23459j = h3.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f23460k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f23461l = new a();
        f23462m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f23463n = c4.l.f(0);
    }

    public q(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, k3.d dVar, k3.b bVar) {
        this.f23467d = list;
        this.f23465b = (DisplayMetrics) c4.k.d(displayMetrics);
        this.f23464a = (k3.d) c4.k.d(dVar);
        this.f23466c = (k3.b) c4.k.d(bVar);
    }

    private static int a(double d10) {
        return x((d10 / (r1 / r0)) * x(l(d10) * d10));
    }

    private void b(v vVar, h3.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean z12;
        if (this.f23468e.i(i10, i11, options, z10, z11)) {
            return;
        }
        if (bVar == h3.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            z12 = vVar.d().hasAlpha();
        } catch (IOException e10) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
            }
            z12 = false;
        }
        Bitmap.Config config = z12 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, v vVar, b bVar, k3.d dVar, k kVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int floor;
        int floor2;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + "]");
                return;
            }
            return;
        }
        if (r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float b10 = kVar.b(i15, i16, i13, i14);
        if (b10 <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + b10 + " from: " + kVar + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        k.g a10 = kVar.a(i15, i16, i13, i14);
        if (a10 == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int x10 = i15 / x(b10 * f10);
        int x11 = i16 / x(b10 * f11);
        k.g gVar = k.g.MEMORY;
        int max = Math.max(1, Integer.highestOneBit(a10 == gVar ? Math.max(x10, x11) : Math.min(x10, x11)));
        if (a10 == gVar && max < 1.0f / b10) {
            max <<= 1;
        }
        options.inSampleSize = max;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(max, 8);
            floor = (int) Math.ceil(f10 / min);
            floor2 = (int) Math.ceil(f11 / min);
            int i17 = max / 8;
            if (i17 > 0) {
                floor /= i17;
                floor2 /= i17;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f12 = max;
            floor = (int) Math.floor(f10 / f12);
            floor2 = (int) Math.floor(f11 / f12);
        } else if (imageType.isWebp()) {
            float f13 = max;
            floor = Math.round(f10 / f13);
            floor2 = Math.round(f11 / f13);
        } else if (i15 % max == 0 && i16 % max == 0) {
            floor = i15 / max;
            floor2 = i16 / max;
        } else {
            int[] m10 = m(vVar, options, bVar, dVar);
            floor = m10[0];
            floor2 = m10[1];
        }
        double b11 = kVar.b(floor, floor2, i13, i14);
        options.inTargetDensity = a(b11);
        options.inDensity = l(b11);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + floor + "x" + floor2 + "], exact scale factor: " + b10 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b11 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private j3.v<Bitmap> g(v vVar, int i10, int i11, h3.h hVar, b bVar) {
        byte[] bArr = (byte[]) this.f23466c.c(65536, byte[].class);
        BitmapFactory.Options k10 = k();
        k10.inTempStorage = bArr;
        h3.b bVar2 = (h3.b) hVar.c(f23455f);
        h3.i iVar = (h3.i) hVar.c(f23456g);
        k kVar = (k) hVar.c(k.f23453h);
        boolean booleanValue = ((Boolean) hVar.c(f23458i)).booleanValue();
        h3.g<Boolean> gVar = f23459j;
        try {
            return f.b(h(vVar, k10, kVar, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i10, i11, booleanValue, bVar), this.f23464a);
        } finally {
            v(k10);
            this.f23466c.put(bArr);
        }
    }

    private Bitmap h(v vVar, BitmapFactory.Options options, k kVar, h3.b bVar, h3.i iVar, boolean z10, int i10, int i11, boolean z11, b bVar2) {
        int i12;
        int i13;
        String str;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        int round;
        int round2;
        long b10 = c4.g.b();
        int[] m10 = m(vVar, options, bVar2, this.f23464a);
        boolean z12 = false;
        int i14 = m10[0];
        int i15 = m10[1];
        String str2 = options.outMimeType;
        boolean z13 = (i14 == -1 || i15 == -1) ? false : z10;
        int c10 = vVar.c();
        int d10 = c0.d(c10);
        boolean g10 = c0.g(c10);
        if (i10 == Integer.MIN_VALUE) {
            i12 = i11;
            i13 = r(d10) ? i15 : i14;
        } else {
            i12 = i11;
            i13 = i10;
        }
        int i16 = i12 == Integer.MIN_VALUE ? r(d10) ? i14 : i15 : i12;
        ImageHeaderParser.ImageType d11 = vVar.d();
        c(d11, vVar, bVar2, this.f23464a, kVar, d10, i14, i15, i13, i16, options);
        b(vVar, bVar, z13, g10, options, i13, i16);
        int i17 = Build.VERSION.SDK_INT;
        int i18 = options.inSampleSize;
        if (z(d11)) {
            if (i14 < 0 || i15 < 0 || !z11) {
                float f10 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i19 = options.inSampleSize;
                float f11 = i19;
                int ceil = (int) Math.ceil(i14 / f11);
                int ceil2 = (int) Math.ceil(i15 / f11);
                round = Math.round(ceil * f10);
                round2 = Math.round(ceil2 * f10);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + round + "x" + round2 + "] for source [" + i14 + "x" + i15 + "], sampleSize: " + i19 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f10);
                }
            } else {
                str = "Downsampler";
                round = i13;
                round2 = i16;
            }
            if (round > 0 && round2 > 0) {
                y(options, this.f23464a, round, round2);
            }
        } else {
            str = "Downsampler";
        }
        if (iVar != null) {
            if (i17 >= 28) {
                if (iVar == h3.i.DISPLAY_P3) {
                    colorSpace3 = options.outColorSpace;
                    if (colorSpace3 != null) {
                        colorSpace4 = options.outColorSpace;
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            z12 = true;
                        }
                    }
                }
                colorSpace2 = ColorSpace.get(z12 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                options.inPreferredColorSpace = colorSpace2;
            } else if (i17 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                options.inPreferredColorSpace = colorSpace;
            }
        }
        Bitmap i20 = i(vVar, options, bVar2, this.f23464a);
        bVar2.a(this.f23464a, i20);
        if (Log.isLoggable(str, 2)) {
            t(i14, i15, str2, options, i20, i10, i11, b10);
        }
        if (i20 == null) {
            return null;
        }
        i20.setDensity(this.f23465b.densityDpi);
        Bitmap h10 = c0.h(this.f23464a, i20, c10);
        if (i20.equals(h10)) {
            return h10;
        }
        this.f23464a.c(i20);
        return h10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap i(q3.v r5, android.graphics.BitmapFactory.Options r6, q3.q.b r7, k3.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.b()
            r5.b()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = q3.c0.c()
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = q3.c0.c()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.c(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = q3.c0.c()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = q3.c0.c()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.q.i(q3.v, android.graphics.BitmapFactory$Options, q3.q$b, k3.d):android.graphics.Bitmap");
    }

    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options poll;
        synchronized (q.class) {
            Queue<BitmapFactory.Options> queue = f23463n;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                w(poll);
            }
        }
        return poll;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(v vVar, BitmapFactory.Options options, b bVar, k3.d dVar) {
        options.inJustDecodeBounds = true;
        i(vVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + c4.g.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f23463n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    private static void y(BitmapFactory.Options options, k3.d dVar, int i10, int i11) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = options.inPreferredConfig;
            config2 = Bitmap.Config.HARDWARE;
            if (config3 == config2) {
                return;
            } else {
                config = options.outConfig;
            }
        } else {
            config = null;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.e(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public j3.v<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, h3.h hVar) {
        return g(new v.c(parcelFileDescriptor, this.f23467d, this.f23466c), i10, i11, hVar, f23461l);
    }

    public j3.v<Bitmap> e(InputStream inputStream, int i10, int i11, h3.h hVar, b bVar) {
        return g(new v.b(inputStream, this.f23467d, this.f23466c), i10, i11, hVar, bVar);
    }

    public j3.v<Bitmap> f(ByteBuffer byteBuffer, int i10, int i11, h3.h hVar) {
        return g(new v.a(byteBuffer, this.f23467d, this.f23466c), i10, i11, hVar, f23461l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
