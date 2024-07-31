package p316qi;

import android.media.Image;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.C9322n;

/* renamed from: qi.a */
/* loaded from: classes3.dex */
public final class C10493a {

    /* renamed from: a */
    private final int f26071a;

    /* renamed from: b */
    private final ByteBuffer f26072b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qi.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final int f26073a;

        /* renamed from: b */
        private final int f26074b;

        /* renamed from: c */
        private final b f26075c;

        /* renamed from: d */
        private final b f26076d;

        /* renamed from: e */
        private final b f26077e;

        public a(Image image) {
            C9322n.m27781e(image, "image");
            int width = image.getWidth();
            this.f26073a = width;
            int height = image.getHeight();
            this.f26074b = height;
            Image.Plane plane = image.getPlanes()[0];
            C9322n.m27780d(plane, "get(...)");
            b bVar = new b(width, height, plane);
            this.f26075c = bVar;
            Image.Plane plane2 = image.getPlanes()[1];
            C9322n.m27780d(plane2, "get(...)");
            b bVar2 = new b(width / 2, height / 2, plane2);
            this.f26076d = bVar2;
            Image.Plane plane3 = image.getPlanes()[2];
            C9322n.m27780d(plane3, "get(...)");
            b bVar3 = new b(width / 2, height / 2, plane3);
            this.f26077e = bVar3;
            if (!(bVar.m31572c() == 1)) {
                throw new IllegalArgumentException(("Pixel stride for Y plane must be 1 but got " + bVar.m31572c() + " instead.").toString());
            }
            if (bVar2.m31572c() == bVar3.m31572c() && bVar2.m31573d() == bVar3.m31573d()) {
                if (!(bVar2.m31572c() == 1 || bVar2.m31572c() == 2)) {
                    throw new IllegalArgumentException("Supported pixel strides for U and V planes are 1 and 2".toString());
                }
                return;
            }
            throw new IllegalArgumentException(("U and V planes must have the same pixel and row strides but got pixel=" + bVar2.m31572c() + " row=" + bVar2.m31573d() + " for U and pixel=" + bVar3.m31572c() + " and row=" + bVar3.m31573d() + " for V").toString());
        }

        /* renamed from: a */
        public final b m31567a() {
            return this.f26076d;
        }

        /* renamed from: b */
        public final b m31568b() {
            return this.f26077e;
        }

        /* renamed from: c */
        public final b m31569c() {
            return this.f26075c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qi.a$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final int f26078a;

        /* renamed from: b */
        private final int f26079b;

        /* renamed from: c */
        private final ByteBuffer f26080c;

        /* renamed from: d */
        private final int f26081d;

        /* renamed from: e */
        private final int f26082e;

        public b(int i10, int i11, Image.Plane plane) {
            C9322n.m27781e(plane, "plane");
            this.f26078a = i10;
            this.f26079b = i11;
            ByteBuffer buffer = plane.getBuffer();
            C9322n.m27780d(buffer, "getBuffer(...)");
            this.f26080c = buffer;
            this.f26081d = plane.getRowStride();
            this.f26082e = plane.getPixelStride();
        }

        /* renamed from: a */
        public final ByteBuffer m31570a() {
            return this.f26080c;
        }

        /* renamed from: b */
        public final int m31571b() {
            return this.f26079b;
        }

        /* renamed from: c */
        public final int m31572c() {
            return this.f26082e;
        }

        /* renamed from: d */
        public final int m31573d() {
            return this.f26081d;
        }

        /* renamed from: e */
        public final int m31574e() {
            return this.f26078a;
        }
    }

    public C10493a(Image image, ByteBuffer byteBuffer) {
        C9322n.m27781e(image, "image");
        a aVar = new a(image);
        this.f26071a = aVar.m31567a().m31572c() == 1 ? 35 : 17;
        int width = ((image.getWidth() * image.getHeight()) * 3) / 2;
        if (byteBuffer == null || byteBuffer.capacity() < width || byteBuffer.isReadOnly() || !byteBuffer.isDirect()) {
            byteBuffer = ByteBuffer.allocateDirect(width);
            C9322n.m27778b(byteBuffer);
        }
        this.f26072b = byteBuffer;
        byteBuffer.rewind();
        m31562d(aVar);
    }

    /* renamed from: a */
    private final ByteBuffer m31561a(ByteBuffer byteBuffer, int i10, int i11) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i10);
        duplicate.limit(i10 + i11);
        ByteBuffer slice = duplicate.slice();
        C9322n.m27780d(slice, "slice(...)");
        return slice;
    }

    /* renamed from: d */
    private final void m31562d(a aVar) {
        int m31574e = aVar.m31569c().m31574e() * aVar.m31569c().m31571b();
        int m31574e2 = aVar.m31567a().m31574e() * aVar.m31567a().m31571b();
        if (aVar.m31569c().m31573d() > aVar.m31569c().m31574e()) {
            m31563e(aVar.m31569c(), this.f26072b, 0);
        } else {
            this.f26072b.position(0);
            this.f26072b.put(aVar.m31569c().m31570a());
        }
        if (this.f26071a == 35) {
            if (aVar.m31567a().m31573d() > aVar.m31567a().m31574e()) {
                m31563e(aVar.m31567a(), this.f26072b, m31574e);
                m31563e(aVar.m31568b(), this.f26072b, m31574e + m31574e2);
            } else {
                this.f26072b.position(m31574e);
                this.f26072b.put(aVar.m31567a().m31570a());
                this.f26072b.position(m31574e + m31574e2);
                this.f26072b.put(aVar.m31568b().m31570a());
            }
        } else if (aVar.m31567a().m31573d() > aVar.m31567a().m31574e() * 2) {
            m31564f(aVar, this.f26072b, m31574e);
        } else {
            this.f26072b.position(m31574e);
            ByteBuffer m31570a = aVar.m31568b().m31570a();
            int m31571b = (aVar.m31568b().m31571b() * aVar.m31568b().m31573d()) - 1;
            if (m31570a.capacity() > m31571b) {
                m31570a = m31561a(aVar.m31568b().m31570a(), 0, m31571b);
            }
            this.f26072b.put(m31570a);
            byte b10 = aVar.m31567a().m31570a().get(aVar.m31567a().m31570a().capacity() - 1);
            this.f26072b.put(r0.capacity() - 1, b10);
        }
        this.f26072b.rewind();
    }

    /* renamed from: e */
    private final void m31563e(b bVar, ByteBuffer byteBuffer, int i10) {
        if (!(bVar.m31572c() == 1)) {
            throw new IllegalArgumentException("use removePaddingCompact with pixelStride == 1".toString());
        }
        ByteBuffer m31570a = bVar.m31570a();
        int m31573d = bVar.m31573d();
        byteBuffer.position(i10);
        int m31571b = bVar.m31571b();
        for (int i11 = 0; i11 < m31571b; i11++) {
            byteBuffer.put(m31561a(m31570a, i11 * m31573d, bVar.m31574e()));
        }
    }

    /* renamed from: f */
    private final void m31564f(a aVar, ByteBuffer byteBuffer, int i10) {
        if (!(aVar.m31567a().m31572c() == 2)) {
            throw new IllegalArgumentException("use removePaddingNotCompact pixelStride == 2".toString());
        }
        int m31574e = aVar.m31567a().m31574e();
        int m31571b = aVar.m31567a().m31571b();
        int m31573d = aVar.m31567a().m31573d();
        byteBuffer.position(i10);
        int i11 = m31571b - 1;
        for (int i12 = 0; i12 < i11; i12++) {
            byteBuffer.put(m31561a(aVar.m31568b().m31570a(), i12 * m31573d, m31574e * 2));
        }
        byteBuffer.put(m31561a(aVar.m31567a().m31570a(), (i11 * m31573d) - 1, m31574e * 2));
    }

    /* renamed from: b */
    public final ByteBuffer m31565b() {
        return this.f26072b;
    }

    /* renamed from: c */
    public final int m31566c() {
        return this.f26071a;
    }
}
