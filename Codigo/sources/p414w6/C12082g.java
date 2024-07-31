package p414w6;

import java.nio.ByteBuffer;
import p361t6.C11093r1;

/* renamed from: w6.g */
/* loaded from: classes.dex */
public class C12082g extends AbstractC12076a {

    /* renamed from: b */
    public final C12078c f32141b;

    /* renamed from: c */
    public ByteBuffer f32142c;

    /* renamed from: d */
    public boolean f32143d;

    /* renamed from: e */
    public long f32144e;

    /* renamed from: f */
    public ByteBuffer f32145f;

    /* renamed from: r */
    private final int f32146r;

    /* renamed from: s */
    private final int f32147s;

    /* renamed from: w6.g$a */
    /* loaded from: classes.dex */
    public static final class a extends IllegalStateException {

        /* renamed from: a */
        public final int f32148a;

        /* renamed from: b */
        public final int f32149b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f32148a = i10;
            this.f32149b = i11;
        }
    }

    static {
        C11093r1.m34452a("goog.exo.decoder");
    }

    public C12082g(int i10) {
        this(i10, 0);
    }

    public C12082g(int i10, int i11) {
        this.f32141b = new C12078c();
        this.f32146r = i10;
        this.f32147s = i11;
    }

    /* renamed from: B */
    public static C12082g m38807B() {
        return new C12082g(0);
    }

    /* renamed from: x */
    private ByteBuffer m38808x(int i10) {
        int i11 = this.f32146r;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f32142c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    /* renamed from: A */
    public final boolean m38809A() {
        return m38791p(1073741824);
    }

    /* renamed from: C */
    public void m38810C(int i10) {
        ByteBuffer byteBuffer = this.f32145f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f32145f = ByteBuffer.allocate(i10);
        } else {
            this.f32145f.clear();
        }
    }

    @Override // p414w6.AbstractC12076a
    /* renamed from: n */
    public void mo22818n() {
        super.mo22818n();
        ByteBuffer byteBuffer = this.f32142c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f32145f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f32143d = false;
    }

    /* renamed from: y */
    public void m38811y(int i10) {
        int i11 = i10 + this.f32147s;
        ByteBuffer byteBuffer = this.f32142c;
        if (byteBuffer == null) {
            this.f32142c = m38808x(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f32142c = byteBuffer;
            return;
        }
        ByteBuffer m38808x = m38808x(i12);
        m38808x.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m38808x.put(byteBuffer);
        }
        this.f32142c = m38808x;
    }

    /* renamed from: z */
    public final void m38812z() {
        ByteBuffer byteBuffer = this.f32142c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f32145f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
