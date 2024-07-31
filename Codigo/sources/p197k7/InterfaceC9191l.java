package p197k7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p361t6.C11108u1;
import p414w6.C12078c;

/* renamed from: k7.l */
/* loaded from: classes.dex */
public interface InterfaceC9191l {

    /* renamed from: k7.l$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C9195p f22233a;

        /* renamed from: b */
        public final MediaFormat f22234b;

        /* renamed from: c */
        public final C11108u1 f22235c;

        /* renamed from: d */
        public final Surface f22236d;

        /* renamed from: e */
        public final MediaCrypto f22237e;

        /* renamed from: f */
        public final int f22238f;

        private a(C9195p c9195p, MediaFormat mediaFormat, C11108u1 c11108u1, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f22233a = c9195p;
            this.f22234b = mediaFormat;
            this.f22235c = c11108u1;
            this.f22236d = surface;
            this.f22237e = mediaCrypto;
            this.f22238f = i10;
        }

        /* renamed from: a */
        public static a m27258a(C9195p c9195p, MediaFormat mediaFormat, C11108u1 c11108u1, MediaCrypto mediaCrypto) {
            return new a(c9195p, mediaFormat, c11108u1, null, mediaCrypto, 0);
        }

        /* renamed from: b */
        public static a m27259b(C9195p c9195p, MediaFormat mediaFormat, C11108u1 c11108u1, Surface surface, MediaCrypto mediaCrypto) {
            return new a(c9195p, mediaFormat, c11108u1, surface, mediaCrypto, 0);
        }
    }

    /* renamed from: k7.l$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        InterfaceC9191l mo27153a(a aVar);
    }

    /* renamed from: k7.l$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo27260a(InterfaceC9191l interfaceC9191l, long j10, long j11);
    }

    /* renamed from: a */
    MediaFormat mo27135a();

    /* renamed from: b */
    void mo27136b(int i10);

    /* renamed from: c */
    ByteBuffer mo27137c(int i10);

    /* renamed from: d */
    void mo27138d(Surface surface);

    /* renamed from: e */
    void mo27139e(int i10, int i11, int i12, long j10, int i13);

    /* renamed from: f */
    void mo27140f(int i10, int i11, C12078c c12078c, long j10, int i12);

    void flush();

    /* renamed from: g */
    boolean mo27141g();

    /* renamed from: h */
    void mo27142h(c cVar, Handler handler);

    /* renamed from: i */
    void mo27143i(Bundle bundle);

    /* renamed from: j */
    void mo27144j(int i10, long j10);

    /* renamed from: k */
    int mo27145k();

    /* renamed from: l */
    int mo27146l(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: m */
    void mo27147m(int i10, boolean z10);

    /* renamed from: n */
    ByteBuffer mo27148n(int i10);

    void release();
}
