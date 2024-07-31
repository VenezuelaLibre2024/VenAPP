package p302q3;

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
import p036c4.C1866g;
import p036c4.C1870k;
import p036c4.C1871l;
import p129h3.C7623g;
import p129h3.C7624h;
import p129h3.EnumC7618b;
import p129h3.EnumC7625i;
import p171j3.InterfaceC8975v;
import p193k3.InterfaceC9139b;
import p193k3.InterfaceC9141d;
import p302q3.AbstractC10245k;
import p302q3.InterfaceC10256v;

/* renamed from: q3.q */
/* loaded from: classes.dex */
public final class C10251q {

    /* renamed from: f */
    public static final C7623g<EnumC7618b> f25423f = C7623g.m23142f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC7618b.DEFAULT);

    /* renamed from: g */
    public static final C7623g<EnumC7625i> f25424g = C7623g.m23141e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h */
    @Deprecated
    public static final C7623g<AbstractC10245k> f25425h = AbstractC10245k.f25421h;

    /* renamed from: i */
    public static final C7623g<Boolean> f25426i;

    /* renamed from: j */
    public static final C7623g<Boolean> f25427j;

    /* renamed from: k */
    private static final Set<String> f25428k;

    /* renamed from: l */
    private static final b f25429l;

    /* renamed from: m */
    private static final Set<ImageHeaderParser.ImageType> f25430m;

    /* renamed from: n */
    private static final Queue<BitmapFactory.Options> f25431n;

    /* renamed from: a */
    private final InterfaceC9141d f25432a;

    /* renamed from: b */
    private final DisplayMetrics f25433b;

    /* renamed from: c */
    private final InterfaceC9139b f25434c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f25435d;

    /* renamed from: e */
    private final C10255u f25436e = C10255u.m30695b();

    /* renamed from: q3.q$a */
    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // p302q3.C10251q.b
        /* renamed from: a */
        public void mo30590a(InterfaceC9141d interfaceC9141d, Bitmap bitmap) {
        }

        @Override // p302q3.C10251q.b
        /* renamed from: b */
        public void mo30591b() {
        }
    }

    /* renamed from: q3.q$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo30590a(InterfaceC9141d interfaceC9141d, Bitmap bitmap);

        /* renamed from: b */
        void mo30591b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f25426i = C7623g.m23142f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f25427j = C7623g.m23142f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f25428k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f25429l = new a();
        f25430m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f25431n = C1871l.m9957f(0);
    }

    public C10251q(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, InterfaceC9141d interfaceC9141d, InterfaceC9139b interfaceC9139b) {
        this.f25435d = list;
        this.f25433b = (DisplayMetrics) C1870k.m9950d(displayMetrics);
        this.f25432a = (InterfaceC9141d) C1870k.m9950d(interfaceC9141d);
        this.f25434c = (InterfaceC9139b) C1870k.m9950d(interfaceC9139b);
    }

    /* renamed from: a */
    private static int m30664a(double d10) {
        return m30681x((d10 / (r1 / r0)) * m30681x(m30672l(d10) * d10));
    }

    /* renamed from: b */
    private void m30665b(InterfaceC10256v interfaceC10256v, EnumC7618b enumC7618b, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean z12;
        if (this.f25436e.m30702i(i10, i11, options, z10, z11)) {
            return;
        }
        if (enumC7618b == EnumC7618b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            z12 = interfaceC10256v.mo30706d().hasAlpha();
        } catch (IOException e10) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC7618b, e10);
            }
            z12 = false;
        }
        Bitmap.Config config = z12 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    /* renamed from: c */
    private static void m30666c(ImageHeaderParser.ImageType imageType, InterfaceC10256v interfaceC10256v, b bVar, InterfaceC9141d interfaceC9141d, AbstractC10245k abstractC10245k, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
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
        if (m30675r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float mo30658b = abstractC10245k.mo30658b(i15, i16, i13, i14);
        if (mo30658b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + mo30658b + " from: " + abstractC10245k + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        AbstractC10245k.g mo30657a = abstractC10245k.mo30657a(i15, i16, i13, i14);
        if (mo30657a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int m30681x = i15 / m30681x(mo30658b * f10);
        int m30681x2 = i16 / m30681x(mo30658b * f11);
        AbstractC10245k.g gVar = AbstractC10245k.g.MEMORY;
        int max = Math.max(1, Integer.highestOneBit(mo30657a == gVar ? Math.max(m30681x, m30681x2) : Math.min(m30681x, m30681x2)));
        if (mo30657a == gVar && max < 1.0f / mo30658b) {
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
            int[] m30673m = m30673m(interfaceC10256v, options, bVar, interfaceC9141d);
            floor = m30673m[0];
            floor2 = m30673m[1];
        }
        double mo30658b2 = abstractC10245k.mo30658b(floor, floor2, i13, i14);
        options.inTargetDensity = m30664a(mo30658b2);
        options.inDensity = m30672l(mo30658b2);
        if (m30676s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + floor + "x" + floor2 + "], exact scale factor: " + mo30658b + ", power of 2 sample size: " + max + ", adjusted scale factor: " + mo30658b2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    /* renamed from: g */
    private InterfaceC8975v<Bitmap> m30667g(InterfaceC10256v interfaceC10256v, int i10, int i11, C7624h c7624h, b bVar) {
        byte[] bArr = (byte[]) this.f25434c.mo26943c(65536, byte[].class);
        BitmapFactory.Options m30671k = m30671k();
        m30671k.inTempStorage = bArr;
        EnumC7618b enumC7618b = (EnumC7618b) c7624h.m23147c(f25423f);
        EnumC7625i enumC7625i = (EnumC7625i) c7624h.m23147c(f25424g);
        AbstractC10245k abstractC10245k = (AbstractC10245k) c7624h.m23147c(AbstractC10245k.f25421h);
        boolean booleanValue = ((Boolean) c7624h.m23147c(f25426i)).booleanValue();
        C7623g<Boolean> c7623g = f25427j;
        try {
            return C10238f.m30609b(m30668h(interfaceC10256v, m30671k, abstractC10245k, enumC7618b, enumC7625i, c7624h.m23147c(c7623g) != null && ((Boolean) c7624h.m23147c(c7623g)).booleanValue(), i10, i11, booleanValue, bVar), this.f25432a);
        } finally {
            m30679v(m30671k);
            this.f25434c.put(bArr);
        }
    }

    /* renamed from: h */
    private Bitmap m30668h(InterfaceC10256v interfaceC10256v, BitmapFactory.Options options, AbstractC10245k abstractC10245k, EnumC7618b enumC7618b, EnumC7625i enumC7625i, boolean z10, int i10, int i11, boolean z11, b bVar) {
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
        long m9934b = C1866g.m9934b();
        int[] m30673m = m30673m(interfaceC10256v, options, bVar, this.f25432a);
        boolean z12 = false;
        int i14 = m30673m[0];
        int i15 = m30673m[1];
        String str2 = options.outMimeType;
        boolean z13 = (i14 == -1 || i15 == -1) ? false : z10;
        int mo30705c = interfaceC10256v.mo30705c();
        int m30597d = C10233c0.m30597d(mo30705c);
        boolean m30600g = C10233c0.m30600g(mo30705c);
        if (i10 == Integer.MIN_VALUE) {
            i12 = i11;
            i13 = m30675r(m30597d) ? i15 : i14;
        } else {
            i12 = i11;
            i13 = i10;
        }
        int i16 = i12 == Integer.MIN_VALUE ? m30675r(m30597d) ? i14 : i15 : i12;
        ImageHeaderParser.ImageType mo30706d = interfaceC10256v.mo30706d();
        m30666c(mo30706d, interfaceC10256v, bVar, this.f25432a, abstractC10245k, m30597d, i14, i15, i13, i16, options);
        m30665b(interfaceC10256v, enumC7618b, z13, m30600g, options, i13, i16);
        int i17 = Build.VERSION.SDK_INT;
        int i18 = options.inSampleSize;
        if (m30683z(mo30706d)) {
            if (i14 < 0 || i15 < 0 || !z11) {
                float f10 = m30676s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
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
                m30682y(options, this.f25432a, round, round2);
            }
        } else {
            str = "Downsampler";
        }
        if (enumC7625i != null) {
            if (i17 >= 28) {
                if (enumC7625i == EnumC7625i.DISPLAY_P3) {
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
        Bitmap m30669i = m30669i(interfaceC10256v, options, bVar, this.f25432a);
        bVar.mo30590a(this.f25432a, m30669i);
        if (Log.isLoggable(str, 2)) {
            m30677t(i14, i15, str2, options, m30669i, i10, i11, m9934b);
        }
        if (m30669i == null) {
            return null;
        }
        m30669i.setDensity(this.f25433b.densityDpi);
        Bitmap m30601h = C10233c0.m30601h(this.f25432a, m30669i, mo30705c);
        if (m30669i.equals(m30601h)) {
            return m30601h;
        }
        this.f25432a.mo26950c(m30669i);
        return m30601h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap m30669i(p302q3.InterfaceC10256v r5, android.graphics.BitmapFactory.Options r6, p302q3.C10251q.b r7, p193k3.InterfaceC9141d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.mo30591b()
            r5.mo30704b()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = p302q3.C10233c0.m30596c()
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo30703a(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = p302q3.C10233c0.m30596c()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = m30678u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.mo26950c(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = m30669i(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = p302q3.C10233c0.m30596c()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = p302q3.C10233c0.m30596c()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p302q3.C10251q.m30669i(q3.v, android.graphics.BitmapFactory$Options, q3.q$b, k3.d):android.graphics.Bitmap");
    }

    /* renamed from: j */
    private static String m30670j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: k */
    private static synchronized BitmapFactory.Options m30671k() {
        BitmapFactory.Options poll;
        synchronized (C10251q.class) {
            Queue<BitmapFactory.Options> queue = f25431n;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m30680w(poll);
            }
        }
        return poll;
    }

    /* renamed from: l */
    private static int m30672l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    /* renamed from: m */
    private static int[] m30673m(InterfaceC10256v interfaceC10256v, BitmapFactory.Options options, b bVar, InterfaceC9141d interfaceC9141d) {
        options.inJustDecodeBounds = true;
        m30669i(interfaceC10256v, options, bVar, interfaceC9141d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    private static String m30674n(BitmapFactory.Options options) {
        return m30670j(options.inBitmap);
    }

    /* renamed from: r */
    private static boolean m30675r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    /* renamed from: s */
    private static boolean m30676s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    /* renamed from: t */
    private static void m30677t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + m30670j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + m30674n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C1866g.m9933a(j10));
    }

    /* renamed from: u */
    private static IOException m30678u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + m30674n(options), illegalArgumentException);
    }

    /* renamed from: v */
    private static void m30679v(BitmapFactory.Options options) {
        m30680w(options);
        Queue<BitmapFactory.Options> queue = f25431n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    private static void m30680w(BitmapFactory.Options options) {
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

    /* renamed from: x */
    private static int m30681x(double d10) {
        return (int) (d10 + 0.5d);
    }

    /* renamed from: y */
    private static void m30682y(BitmapFactory.Options options, InterfaceC9141d interfaceC9141d, int i10, int i11) {
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
        options.inBitmap = interfaceC9141d.mo26952e(i10, i11, config);
    }

    /* renamed from: z */
    private boolean m30683z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* renamed from: d */
    public InterfaceC8975v<Bitmap> m30684d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C7624h c7624h) {
        return m30667g(new InterfaceC10256v.c(parcelFileDescriptor, this.f25435d, this.f25434c), i10, i11, c7624h, f25429l);
    }

    /* renamed from: e */
    public InterfaceC8975v<Bitmap> m30685e(InputStream inputStream, int i10, int i11, C7624h c7624h, b bVar) {
        return m30667g(new InterfaceC10256v.b(inputStream, this.f25435d, this.f25434c), i10, i11, c7624h, bVar);
    }

    /* renamed from: f */
    public InterfaceC8975v<Bitmap> m30686f(ByteBuffer byteBuffer, int i10, int i11, C7624h c7624h) {
        return m30667g(new InterfaceC10256v.a(byteBuffer, this.f25435d, this.f25434c), i10, i11, c7624h, f25429l);
    }

    /* renamed from: o */
    public boolean m30687o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m10753c();
    }

    /* renamed from: p */
    public boolean m30688p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean m30689q(ByteBuffer byteBuffer) {
        return true;
    }
}
