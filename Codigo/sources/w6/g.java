package w6;

import java.nio.ByteBuffer;
import t6.r1;

/* loaded from: classes.dex */
public class g extends w6.a {

    /* renamed from: b, reason: collision with root package name */
    public final c f29678b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f29679c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29680d;

    /* renamed from: e, reason: collision with root package name */
    public long f29681e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f29682f;

    /* renamed from: r, reason: collision with root package name */
    private final int f29683r;

    /* renamed from: s, reason: collision with root package name */
    private final int f29684s;

    /* loaded from: classes.dex */
    public static final class a extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        public final int f29685a;

        /* renamed from: b, reason: collision with root package name */
        public final int f29686b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f29685a = i10;
            this.f29686b = i11;
        }
    }

    static {
        r1.a("goog.exo.decoder");
    }

    public g(int i10) {
        this(i10, 0);
    }

    public g(int i10, int i11) {
        this.f29678b = new c();
        this.f29683r = i10;
        this.f29684s = i11;
    }

    public static g B() {
        return new g(0);
    }

    private ByteBuffer x(int i10) {
        int i11 = this.f29683r;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f29679c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public final boolean A() {
        return p(1073741824);
    }

    public void C(int i10) {
        ByteBuffer byteBuffer = this.f29682f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f29682f = ByteBuffer.allocate(i10);
        } else {
            this.f29682f.clear();
        }
    }

    @Override // w6.a
    public void n() {
        super.n();
        ByteBuffer byteBuffer = this.f29679c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f29682f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f29680d = false;
    }

    public void y(int i10) {
        int i11 = i10 + this.f29684s;
        ByteBuffer byteBuffer = this.f29679c;
        if (byteBuffer == null) {
            this.f29679c = x(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f29679c = byteBuffer;
            return;
        }
        ByteBuffer x10 = x(i12);
        x10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            x10.put(byteBuffer);
        }
        this.f29679c = x10;
    }

    public final void z() {
        ByteBuffer byteBuffer = this.f29679c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f29682f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
