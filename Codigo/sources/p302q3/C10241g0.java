package p302q3;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p129h3.C7623g;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p171j3.InterfaceC8975v;
import p193k3.InterfaceC9141d;

/* renamed from: q3.g0 */
/* loaded from: classes.dex */
public class C10241g0<T> implements InterfaceC7626j<T, Bitmap> {

    /* renamed from: d */
    public static final C7623g<Long> f25397d = C7623g.m23138a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e */
    public static final C7623g<Integer> f25398e = C7623g.m23138a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f */
    private static final f f25399f = new f();

    /* renamed from: g */
    private static final List<String> f25400g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a */
    private final e<T> f25401a;

    /* renamed from: b */
    private final InterfaceC9141d f25402b;

    /* renamed from: c */
    private final f f25403c;

    /* renamed from: q3.g0$a */
    /* loaded from: classes.dex */
    class a implements C7623g.b<Long> {

        /* renamed from: a */
        private final ByteBuffer f25404a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // p129h3.C7623g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo23145a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f25404a) {
                this.f25404a.position(0);
                messageDigest.update(this.f25404a.putLong(l10.longValue()).array());
            }
        }
    }

    /* renamed from: q3.g0$b */
    /* loaded from: classes.dex */
    class b implements C7623g.b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f25405a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // p129h3.C7623g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo23145a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f25405a) {
                this.f25405a.position(0);
                messageDigest.update(this.f25405a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: q3.g0$c */
    /* loaded from: classes.dex */
    private static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // p302q3.C10241g0.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo30627a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // p302q3.C10241g0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo30628b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: q3.g0$d */
    /* loaded from: classes.dex */
    static final class d implements e<ByteBuffer> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q3.g0$d$a */
        /* loaded from: classes.dex */
        public class a extends MediaDataSource {

            /* renamed from: a */
            final /* synthetic */ ByteBuffer f25406a;

            a(ByteBuffer byteBuffer) {
                this.f25406a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f25406a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f25406a.limit()) {
                    return -1;
                }
                this.f25406a.position((int) j10);
                int min = Math.min(i11, this.f25406a.remaining());
                this.f25406a.get(bArr, i10, min);
                return min;
            }
        }

        d() {
        }

        /* renamed from: c */
        private MediaDataSource m30631c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // p302q3.C10241g0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo30627a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) {
            mediaExtractor.setDataSource(m30631c(byteBuffer));
        }

        @Override // p302q3.C10241g0.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo30628b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(m30631c(byteBuffer));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q3.g0$e */
    /* loaded from: classes.dex */
    public interface e<T> {
        /* renamed from: a */
        void mo30627a(MediaExtractor mediaExtractor, T t10);

        /* renamed from: b */
        void mo30628b(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    /* renamed from: q3.g0$f */
    /* loaded from: classes.dex */
    static class f {
        f() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever m30634a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: q3.g0$g */
    /* loaded from: classes.dex */
    static final class g implements e<ParcelFileDescriptor> {
        g() {
        }

        @Override // p302q3.C10241g0.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo30627a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // p302q3.C10241g0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo30628b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q3.g0$h */
    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    C10241g0(InterfaceC9141d interfaceC9141d, e<T> eVar) {
        this(interfaceC9141d, eVar, f25399f);
    }

    C10241g0(InterfaceC9141d interfaceC9141d, e<T> eVar, f fVar) {
        this.f25402b = interfaceC9141d;
        this.f25401a = eVar;
        this.f25403c = fVar;
    }

    /* renamed from: c */
    public static InterfaceC7626j<AssetFileDescriptor, Bitmap> m30614c(InterfaceC9141d interfaceC9141d) {
        return new C10241g0(interfaceC9141d, new c(null));
    }

    /* renamed from: d */
    public static InterfaceC7626j<ByteBuffer, Bitmap> m30615d(InterfaceC9141d interfaceC9141d) {
        return new C10241g0(interfaceC9141d, new d());
    }

    /* renamed from: e */
    private static Bitmap m30616e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!m30621j()) {
            return bitmap;
        }
        boolean z10 = false;
        try {
            if (m30620i(mediaMetadataRetriever)) {
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

    /* renamed from: f */
    private Bitmap m30617f(T t10, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, AbstractC10245k abstractC10245k) {
        if (m30623l(t10, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap m30619h = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || abstractC10245k == AbstractC10245k.f25419f) ? null : m30619h(mediaMetadataRetriever, j10, i10, i11, i12, abstractC10245k);
        if (m30619h == null) {
            m30619h = m30618g(mediaMetadataRetriever, j10, i10);
        }
        Bitmap m30616e = m30616e(mediaMetadataRetriever, m30619h);
        if (m30616e != null) {
            return m30616e;
        }
        throw new h();
    }

    /* renamed from: g */
    private static Bitmap m30618g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    /* renamed from: h */
    private static Bitmap m30619h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, AbstractC10245k abstractC10245k) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float mo30658b = abstractC10245k.mo30658b(parseInt, parseInt2, i11, i12);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(parseInt * mo30658b), Math.round(mo30658b * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable th2) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
            return null;
        }
    }

    /* renamed from: i */
    private static boolean m30620i(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        return (parseInt == 7 || parseInt == 6) && Integer.parseInt(extractMetadata2) == 6;
    }

    /* renamed from: j */
    static boolean m30621j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return m30622k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    /* renamed from: k */
    private static boolean m30622k() {
        Iterator<String> it = f25400g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    private boolean m30623l(T t10, MediaMetadataRetriever mediaMetadataRetriever) {
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
            this.f25401a.mo30627a(mediaExtractor2, t10);
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

    /* renamed from: m */
    public static InterfaceC7626j<ParcelFileDescriptor, Bitmap> m30624m(InterfaceC9141d interfaceC9141d) {
        return new C10241g0(interfaceC9141d, new g());
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: a */
    public boolean mo23151a(T t10, C7624h c7624h) {
        return true;
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: b */
    public InterfaceC8975v<Bitmap> mo23152b(T t10, int i10, int i11, C7624h c7624h) {
        long longValue = ((Long) c7624h.m23147c(f25397d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) c7624h.m23147c(f25398e);
        if (num == null) {
            num = 2;
        }
        AbstractC10245k abstractC10245k = (AbstractC10245k) c7624h.m23147c(AbstractC10245k.f25421h);
        if (abstractC10245k == null) {
            abstractC10245k = AbstractC10245k.f25420g;
        }
        AbstractC10245k abstractC10245k2 = abstractC10245k;
        MediaMetadataRetriever m30634a = this.f25403c.m30634a();
        try {
            this.f25401a.mo30628b(m30634a, t10);
            return C10238f.m30609b(m30617f(t10, m30634a, longValue, num.intValue(), i10, i11, abstractC10245k2), this.f25402b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                m30634a.close();
            } else {
                m30634a.release();
            }
        }
    }
}
