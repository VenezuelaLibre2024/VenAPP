package u3;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import c4.l;
import com.bumptech.glide.load.ImageHeaderParser;
import g3.a;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p3.n;

/* loaded from: classes.dex */
public class a implements h3.j<ByteBuffer, c> {

    /* renamed from: f, reason: collision with root package name */
    private static final C0444a f27021f = new C0444a();

    /* renamed from: g, reason: collision with root package name */
    private static final b f27022g = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Context f27023a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ImageHeaderParser> f27024b;

    /* renamed from: c, reason: collision with root package name */
    private final b f27025c;

    /* renamed from: d, reason: collision with root package name */
    private final C0444a f27026d;

    /* renamed from: e, reason: collision with root package name */
    private final u3.b f27027e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0444a {
        C0444a() {
        }

        g3.a a(a.InterfaceC0256a interfaceC0256a, g3.c cVar, ByteBuffer byteBuffer, int i10) {
            return new g3.e(interfaceC0256a, cVar, byteBuffer, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue<g3.d> f27028a = l.f(0);

        b() {
        }

        synchronized g3.d a(ByteBuffer byteBuffer) {
            g3.d poll;
            poll = this.f27028a.poll();
            if (poll == null) {
                poll = new g3.d();
            }
            return poll.p(byteBuffer);
        }

        synchronized void b(g3.d dVar) {
            dVar.a();
            this.f27028a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, k3.d dVar, k3.b bVar) {
        this(context, list, dVar, bVar, f27022g, f27021f);
    }

    a(Context context, List<ImageHeaderParser> list, k3.d dVar, k3.b bVar, b bVar2, C0444a c0444a) {
        this.f27023a = context.getApplicationContext();
        this.f27024b = list;
        this.f27026d = c0444a;
        this.f27027e = new u3.b(dVar, bVar);
        this.f27025c = bVar2;
    }

    private e c(ByteBuffer byteBuffer, int i10, int i11, g3.d dVar, h3.h hVar) {
        long b10 = c4.g.b();
        try {
            g3.c c10 = dVar.c();
            if (c10.b() > 0 && c10.c() == 0) {
                Bitmap.Config config = hVar.c(i.f27068a) == h3.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                g3.a a10 = this.f27026d.a(this.f27027e, c10, byteBuffer, e(c10, i10, i11));
                a10.d(config);
                a10.b();
                Bitmap a11 = a10.a();
                if (a11 == null) {
                    return null;
                }
                e eVar = new e(new c(this.f27023a, a10, n.c(), i10, i11, a11));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + c4.g.a(b10));
                }
                return eVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + c4.g.a(b10));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + c4.g.a(b10));
            }
        }
    }

    private static int e(g3.c cVar, int i10, int i11) {
        int min = Math.min(cVar.a() / i11, cVar.d() / i10);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return max;
    }

    @Override // h3.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(ByteBuffer byteBuffer, int i10, int i11, h3.h hVar) {
        g3.d a10 = this.f27025c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, a10, hVar);
        } finally {
            this.f27025c.b(a10);
        }
    }

    @Override // h3.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, h3.h hVar) {
        return !((Boolean) hVar.c(i.f27069b)).booleanValue() && com.bumptech.glide.load.a.g(this.f27024b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
