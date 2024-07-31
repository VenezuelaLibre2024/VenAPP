package qi;

import android.media.Image;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f24029a;

    /* renamed from: b, reason: collision with root package name */
    private final ByteBuffer f24030b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qi.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0395a {

        /* renamed from: a, reason: collision with root package name */
        private final int f24031a;

        /* renamed from: b, reason: collision with root package name */
        private final int f24032b;

        /* renamed from: c, reason: collision with root package name */
        private final b f24033c;

        /* renamed from: d, reason: collision with root package name */
        private final b f24034d;

        /* renamed from: e, reason: collision with root package name */
        private final b f24035e;

        public C0395a(Image image) {
            n.e(image, "image");
            int width = image.getWidth();
            this.f24031a = width;
            int height = image.getHeight();
            this.f24032b = height;
            Image.Plane plane = image.getPlanes()[0];
            n.d(plane, "get(...)");
            b bVar = new b(width, height, plane);
            this.f24033c = bVar;
            Image.Plane plane2 = image.getPlanes()[1];
            n.d(plane2, "get(...)");
            b bVar2 = new b(width / 2, height / 2, plane2);
            this.f24034d = bVar2;
            Image.Plane plane3 = image.getPlanes()[2];
            n.d(plane3, "get(...)");
            b bVar3 = new b(width / 2, height / 2, plane3);
            this.f24035e = bVar3;
            if (!(bVar.c() == 1)) {
                throw new IllegalArgumentException(("Pixel stride for Y plane must be 1 but got " + bVar.c() + " instead.").toString());
            }
            if (bVar2.c() == bVar3.c() && bVar2.d() == bVar3.d()) {
                if (!(bVar2.c() == 1 || bVar2.c() == 2)) {
                    throw new IllegalArgumentException("Supported pixel strides for U and V planes are 1 and 2".toString());
                }
                return;
            }
            throw new IllegalArgumentException(("U and V planes must have the same pixel and row strides but got pixel=" + bVar2.c() + " row=" + bVar2.d() + " for U and pixel=" + bVar3.c() + " and row=" + bVar3.d() + " for V").toString());
        }

        public final b a() {
            return this.f24034d;
        }

        public final b b() {
            return this.f24035e;
        }

        public final b c() {
            return this.f24033c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f24036a;

        /* renamed from: b, reason: collision with root package name */
        private final int f24037b;

        /* renamed from: c, reason: collision with root package name */
        private final ByteBuffer f24038c;

        /* renamed from: d, reason: collision with root package name */
        private final int f24039d;

        /* renamed from: e, reason: collision with root package name */
        private final int f24040e;

        public b(int i10, int i11, Image.Plane plane) {
            n.e(plane, "plane");
            this.f24036a = i10;
            this.f24037b = i11;
            ByteBuffer buffer = plane.getBuffer();
            n.d(buffer, "getBuffer(...)");
            this.f24038c = buffer;
            this.f24039d = plane.getRowStride();
            this.f24040e = plane.getPixelStride();
        }

        public final ByteBuffer a() {
            return this.f24038c;
        }

        public final int b() {
            return this.f24037b;
        }

        public final int c() {
            return this.f24040e;
        }

        public final int d() {
            return this.f24039d;
        }

        public final int e() {
            return this.f24036a;
        }
    }

    public a(Image image, ByteBuffer byteBuffer) {
        n.e(image, "image");
        C0395a c0395a = new C0395a(image);
        this.f24029a = c0395a.a().c() == 1 ? 35 : 17;
        int width = ((image.getWidth() * image.getHeight()) * 3) / 2;
        if (byteBuffer == null || byteBuffer.capacity() < width || byteBuffer.isReadOnly() || !byteBuffer.isDirect()) {
            byteBuffer = ByteBuffer.allocateDirect(width);
            n.b(byteBuffer);
        }
        this.f24030b = byteBuffer;
        byteBuffer.rewind();
        d(c0395a);
    }

    private final ByteBuffer a(ByteBuffer byteBuffer, int i10, int i11) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i10);
        duplicate.limit(i10 + i11);
        ByteBuffer slice = duplicate.slice();
        n.d(slice, "slice(...)");
        return slice;
    }

    private final void d(C0395a c0395a) {
        int e10 = c0395a.c().e() * c0395a.c().b();
        int e11 = c0395a.a().e() * c0395a.a().b();
        if (c0395a.c().d() > c0395a.c().e()) {
            e(c0395a.c(), this.f24030b, 0);
        } else {
            this.f24030b.position(0);
            this.f24030b.put(c0395a.c().a());
        }
        if (this.f24029a == 35) {
            if (c0395a.a().d() > c0395a.a().e()) {
                e(c0395a.a(), this.f24030b, e10);
                e(c0395a.b(), this.f24030b, e10 + e11);
            } else {
                this.f24030b.position(e10);
                this.f24030b.put(c0395a.a().a());
                this.f24030b.position(e10 + e11);
                this.f24030b.put(c0395a.b().a());
            }
        } else if (c0395a.a().d() > c0395a.a().e() * 2) {
            f(c0395a, this.f24030b, e10);
        } else {
            this.f24030b.position(e10);
            ByteBuffer a10 = c0395a.b().a();
            int b10 = (c0395a.b().b() * c0395a.b().d()) - 1;
            if (a10.capacity() > b10) {
                a10 = a(c0395a.b().a(), 0, b10);
            }
            this.f24030b.put(a10);
            byte b11 = c0395a.a().a().get(c0395a.a().a().capacity() - 1);
            this.f24030b.put(r0.capacity() - 1, b11);
        }
        this.f24030b.rewind();
    }

    private final void e(b bVar, ByteBuffer byteBuffer, int i10) {
        if (!(bVar.c() == 1)) {
            throw new IllegalArgumentException("use removePaddingCompact with pixelStride == 1".toString());
        }
        ByteBuffer a10 = bVar.a();
        int d10 = bVar.d();
        byteBuffer.position(i10);
        int b10 = bVar.b();
        for (int i11 = 0; i11 < b10; i11++) {
            byteBuffer.put(a(a10, i11 * d10, bVar.e()));
        }
    }

    private final void f(C0395a c0395a, ByteBuffer byteBuffer, int i10) {
        if (!(c0395a.a().c() == 2)) {
            throw new IllegalArgumentException("use removePaddingNotCompact pixelStride == 2".toString());
        }
        int e10 = c0395a.a().e();
        int b10 = c0395a.a().b();
        int d10 = c0395a.a().d();
        byteBuffer.position(i10);
        int i11 = b10 - 1;
        for (int i12 = 0; i12 < i11; i12++) {
            byteBuffer.put(a(c0395a.b().a(), i12 * d10, e10 * 2));
        }
        byteBuffer.put(a(c0395a.a().a(), (i11 * d10) - 1, e10 * 2));
    }

    public final ByteBuffer b() {
        return this.f24030b;
    }

    public final int c() {
        return this.f24029a;
    }
}
