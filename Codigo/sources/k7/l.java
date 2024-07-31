package k7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import t6.u1;

/* loaded from: classes.dex */
public interface l {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final p f20451a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f20452b;

        /* renamed from: c, reason: collision with root package name */
        public final u1 f20453c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f20454d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f20455e;

        /* renamed from: f, reason: collision with root package name */
        public final int f20456f;

        private a(p pVar, MediaFormat mediaFormat, u1 u1Var, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f20451a = pVar;
            this.f20452b = mediaFormat;
            this.f20453c = u1Var;
            this.f20454d = surface;
            this.f20455e = mediaCrypto;
            this.f20456f = i10;
        }

        public static a a(p pVar, MediaFormat mediaFormat, u1 u1Var, MediaCrypto mediaCrypto) {
            return new a(pVar, mediaFormat, u1Var, null, mediaCrypto, 0);
        }

        public static a b(p pVar, MediaFormat mediaFormat, u1 u1Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(pVar, mediaFormat, u1Var, surface, mediaCrypto, 0);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        l a(a aVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(l lVar, long j10, long j11);
    }

    MediaFormat a();

    void b(int i10);

    ByteBuffer c(int i10);

    void d(Surface surface);

    void e(int i10, int i11, int i12, long j10, int i13);

    void f(int i10, int i11, w6.c cVar, long j10, int i12);

    void flush();

    boolean g();

    void h(c cVar, Handler handler);

    void i(Bundle bundle);

    void j(int i10, long j10);

    int k();

    int l(MediaCodec.BufferInfo bufferInfo);

    void m(int i10, boolean z10);

    ByteBuffer n(int i10);

    void release();
}
