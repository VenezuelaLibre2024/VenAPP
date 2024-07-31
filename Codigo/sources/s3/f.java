package s3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import c4.l;
import com.bumptech.glide.load.ImageHeaderParser;
import j3.v;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f25119a;

    /* renamed from: b, reason: collision with root package name */
    private final k3.b f25120b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements v<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final AnimatedImageDrawable f25121a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f25121a = animatedImageDrawable;
        }

        @Override // j3.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f25121a;
        }

        @Override // j3.v
        public int p() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f25121a.getIntrinsicWidth();
            intrinsicHeight = this.f25121a.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * l.i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // j3.v
        public void q() {
            this.f25121a.stop();
            this.f25121a.clearAnimationCallbacks();
        }

        @Override // j3.v
        public Class<Drawable> r() {
            return Drawable.class;
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements h3.j<ByteBuffer, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final f f25122a;

        b(f fVar) {
            this.f25122a = fVar;
        }

        @Override // h3.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public v<Drawable> b(ByteBuffer byteBuffer, int i10, int i11, h3.h hVar) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f25122a.b(createSource, i10, i11, hVar);
        }

        @Override // h3.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ByteBuffer byteBuffer, h3.h hVar) {
            return this.f25122a.d(byteBuffer);
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements h3.j<InputStream, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final f f25123a;

        c(f fVar) {
            this.f25123a = fVar;
        }

        @Override // h3.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public v<Drawable> b(InputStream inputStream, int i10, int i11, h3.h hVar) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(c4.a.b(inputStream));
            return this.f25123a.b(createSource, i10, i11, hVar);
        }

        @Override // h3.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(InputStream inputStream, h3.h hVar) {
            return this.f25123a.c(inputStream);
        }
    }

    private f(List<ImageHeaderParser> list, k3.b bVar) {
        this.f25119a = list;
        this.f25120b = bVar;
    }

    public static h3.j<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, k3.b bVar) {
        return new b(new f(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    public static h3.j<InputStream, Drawable> f(List<ImageHeaderParser> list, k3.b bVar) {
        return new c(new f(list, bVar));
    }

    v<Drawable> b(ImageDecoder.Source source, int i10, int i11, h3.h hVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new p3.l(i10, i11, hVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f25119a, inputStream, this.f25120b));
    }

    boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f25119a, byteBuffer));
    }
}
