package q3;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import h3.g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class g0<T> implements h3.j<T, Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    public static final h3.g<Long> f23429d = h3.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final h3.g<Integer> f23430e = h3.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f, reason: collision with root package name */
    private static final f f23431f = new f();

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f23432g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    private final e<T> f23433a;

    /* renamed from: b, reason: collision with root package name */
    private final k3.d f23434b;

    /* renamed from: c, reason: collision with root package name */
    private final f f23435c;

    /* loaded from: classes.dex */
    class a implements g.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f23436a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // h3.g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f23436a) {
                this.f23436a.position(0);
                messageDigest.update(this.f23436a.putLong(l10.longValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements g.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f23437a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // h3.g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f23437a) {
                this.f23437a.position(0);
                messageDigest.update(this.f23437a.putInt(num.intValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // q3.g0.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // q3.g0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* loaded from: classes.dex */
    static final class d implements e<ByteBuffer> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends MediaDataSource {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f23438a;

            a(ByteBuffer byteBuffer) {
                this.f23438a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f23438a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f23438a.limit()) {
                    return -1;
                }
                this.f23438a.position((int) j10);
                int min = Math.min(i11, this.f23438a.remaining());
                this.f23438a.get(bArr, i10, min);
                return min;
            }
        }

        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // q3.g0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // q3.g0.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e<T> {
        void a(MediaExtractor mediaExtractor, T t10);

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    /* loaded from: classes.dex */
    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* loaded from: classes.dex */
    static final class g implements e<ParcelFileDescriptor> {
        g() {
        }

        @Override // q3.g0.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // q3.g0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    g0(k3.d dVar, e<T> eVar) {
        this(dVar, eVar, f23431f);
    }

    g0(k3.d dVar, e<T> eVar, f fVar) {
        this.f23434b = dVar;
        this.f23433a = eVar;
        this.f23435c = fVar;
    }

    public static h3.j<AssetFileDescriptor, Bitmap> c(k3.d dVar) {
        return new g0(dVar, new c(null));
    }

    public static h3.j<ByteBuffer, Bitmap> d(k3.d dVar) {
        return new g0(dVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!j()) {
            return bitmap;
        }
        boolean z10 = false;
        try {
            if (i(mediaMetadataRetriever)) {
                if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    z10 = true;
                }
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
            }
        }
        if (!z10) {
            return bitmap;
        }
        if (Log.isLoggable("VideoDecoder", 3)) {
            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private Bitmap f(T t10, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, k kVar) {
        if (l(t10, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap h10 = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || kVar == k.f23451f) ? null : h(mediaMetadataRetriever, j10, i10, i11, i12, kVar);
        if (h10 == null) {
            h10 = g(mediaMetadataRetriever, j10, i10);
        }
        Bitmap e10 = e(mediaMetadataRetriever, h10);
        if (e10 != null) {
            return e10;
        }
        throw new h();
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, k kVar) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b10 = kVar.b(parseInt, parseInt2, i11, i12);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(parseInt * b10), Math.round(b10 * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable th2) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
            return null;
        }
    }

    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        return (parseInt == 7 || parseInt == 6) && Integer.parseInt(extractMetadata2) == 6;
    }

    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    private static boolean k() {
        Iterator<String> it = f23432g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(T t10, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (!(str != null && str.matches(".+_cheets|cheets_.+"))) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.f23433a.a(mediaExtractor2, t10);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i10 = 0; i10 < trackCount; i10++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i10).getString("mime"))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable th3) {
            th = th3;
            mediaExtractor = mediaExtractor2;
            try {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    public static h3.j<ParcelFileDescriptor, Bitmap> m(k3.d dVar) {
        return new g0(dVar, new g());
    }

    @Override // h3.j
    public boolean a(T t10, h3.h hVar) {
        return true;
    }

    @Override // h3.j
    public j3.v<Bitmap> b(T t10, int i10, int i11, h3.h hVar) {
        long longValue = ((Long) hVar.c(f23429d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) hVar.c(f23430e);
        if (num == null) {
            num = 2;
        }
        k kVar = (k) hVar.c(k.f23453h);
        if (kVar == null) {
            kVar = k.f23452g;
        }
        k kVar2 = kVar;
        MediaMetadataRetriever a10 = this.f23435c.a();
        try {
            this.f23433a.b(a10, t10);
            return q3.f.b(f(t10, a10, longValue, num.intValue(), i10, i11, kVar2), this.f23434b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                a10.close();
            } else {
                a10.release();
            }
        }
    }
}
