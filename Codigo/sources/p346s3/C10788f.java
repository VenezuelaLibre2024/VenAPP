package p346s3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.C2128a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p036c4.C1860a;
import p036c4.C1871l;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p171j3.InterfaceC8975v;
import p193k3.InterfaceC9139b;
import p286p3.C10051l;

/* renamed from: s3.f */
/* loaded from: classes.dex */
public final class C10788f {

    /* renamed from: a */
    private final List<ImageHeaderParser> f27238a;

    /* renamed from: b */
    private final InterfaceC9139b f27239b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s3.f$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC8975v<Drawable> {

        /* renamed from: a */
        private final AnimatedImageDrawable f27240a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f27240a = animatedImageDrawable;
        }

        @Override // p171j3.InterfaceC8975v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f27240a;
        }

        @Override // p171j3.InterfaceC8975v
        /* renamed from: p */
        public int mo26309p() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f27240a.getIntrinsicWidth();
            intrinsicHeight = this.f27240a.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * C1871l.m9960i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // p171j3.InterfaceC8975v
        /* renamed from: q */
        public void mo26310q() {
            this.f27240a.stop();
            this.f27240a.clearAnimationCallbacks();
        }

        @Override // p171j3.InterfaceC8975v
        /* renamed from: r */
        public Class<Drawable> mo26311r() {
            return Drawable.class;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s3.f$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC7626j<ByteBuffer, Drawable> {

        /* renamed from: a */
        private final C10788f f27241a;

        b(C10788f c10788f) {
            this.f27241a = c10788f;
        }

        @Override // p129h3.InterfaceC7626j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC8975v<Drawable> mo23152b(ByteBuffer byteBuffer, int i10, int i11, C7624h c7624h) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f27241a.m32867b(createSource, i10, i11, c7624h);
        }

        @Override // p129h3.InterfaceC7626j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo23151a(ByteBuffer byteBuffer, C7624h c7624h) {
            return this.f27241a.m32869d(byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s3.f$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC7626j<InputStream, Drawable> {

        /* renamed from: a */
        private final C10788f f27242a;

        c(C10788f c10788f) {
            this.f27242a = c10788f;
        }

        @Override // p129h3.InterfaceC7626j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC8975v<Drawable> mo23152b(InputStream inputStream, int i10, int i11, C7624h c7624h) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(C1860a.m9918b(inputStream));
            return this.f27242a.m32867b(createSource, i10, i11, c7624h);
        }

        @Override // p129h3.InterfaceC7626j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo23151a(InputStream inputStream, C7624h c7624h) {
            return this.f27242a.m32868c(inputStream);
        }
    }

    private C10788f(List<ImageHeaderParser> list, InterfaceC9139b interfaceC9139b) {
        this.f27238a = list;
        this.f27239b = interfaceC9139b;
    }

    /* renamed from: a */
    public static InterfaceC7626j<ByteBuffer, Drawable> m32864a(List<ImageHeaderParser> list, InterfaceC9139b interfaceC9139b) {
        return new b(new C10788f(list, interfaceC9139b));
    }

    /* renamed from: e */
    private boolean m32865e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    /* renamed from: f */
    public static InterfaceC7626j<InputStream, Drawable> m32866f(List<ImageHeaderParser> list, InterfaceC9139b interfaceC9139b) {
        return new c(new C10788f(list, interfaceC9139b));
    }

    /* renamed from: b */
    InterfaceC8975v<Drawable> m32867b(ImageDecoder.Source source, int i10, int i11, C7624h c7624h) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new C10051l(i10, i11, c7624h));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    /* renamed from: c */
    boolean m32868c(InputStream inputStream) {
        return m32865e(C2128a.m10748f(this.f27238a, inputStream, this.f27239b));
    }

    /* renamed from: d */
    boolean m32869d(ByteBuffer byteBuffer) {
        return m32865e(C2128a.m10749g(this.f27238a, byteBuffer));
    }
}
