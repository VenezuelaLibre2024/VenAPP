package p373u3;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C2128a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p036c4.C1866g;
import p036c4.C1871l;
import p115g3.C7444c;
import p115g3.C7445d;
import p115g3.C7446e;
import p115g3.InterfaceC7442a;
import p129h3.C7624h;
import p129h3.EnumC7618b;
import p129h3.InterfaceC7626j;
import p193k3.InterfaceC9139b;
import p193k3.InterfaceC9141d;
import p286p3.C10053n;

/* renamed from: u3.a */
/* loaded from: classes.dex */
public class C11306a implements InterfaceC7626j<ByteBuffer, C11308c> {

    /* renamed from: f */
    private static final a f29323f = new a();

    /* renamed from: g */
    private static final b f29324g = new b();

    /* renamed from: a */
    private final Context f29325a;

    /* renamed from: b */
    private final List<ImageHeaderParser> f29326b;

    /* renamed from: c */
    private final b f29327c;

    /* renamed from: d */
    private final a f29328d;

    /* renamed from: e */
    private final C11307b f29329e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u3.a$a */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }

        /* renamed from: a */
        InterfaceC7442a m35312a(InterfaceC7442a.a aVar, C7444c c7444c, ByteBuffer byteBuffer, int i10) {
            return new C7446e(aVar, c7444c, byteBuffer, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u3.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Queue<C7445d> f29330a = C1871l.m9957f(0);

        b() {
        }

        /* renamed from: a */
        synchronized C7445d m35313a(ByteBuffer byteBuffer) {
            C7445d poll;
            poll = this.f29330a.poll();
            if (poll == null) {
                poll = new C7445d();
            }
            return poll.m22481p(byteBuffer);
        }

        /* renamed from: b */
        synchronized void m35314b(C7445d c7445d) {
            c7445d.m22479a();
            this.f29330a.offer(c7445d);
        }
    }

    public C11306a(Context context, List<ImageHeaderParser> list, InterfaceC9141d interfaceC9141d, InterfaceC9139b interfaceC9139b) {
        this(context, list, interfaceC9141d, interfaceC9139b, f29324g, f29323f);
    }

    C11306a(Context context, List<ImageHeaderParser> list, InterfaceC9141d interfaceC9141d, InterfaceC9139b interfaceC9139b, b bVar, a aVar) {
        this.f29325a = context.getApplicationContext();
        this.f29326b = list;
        this.f29328d = aVar;
        this.f29329e = new C11307b(interfaceC9141d, interfaceC9139b);
        this.f29327c = bVar;
    }

    /* renamed from: c */
    private C11310e m35308c(ByteBuffer byteBuffer, int i10, int i11, C7445d c7445d, C7624h c7624h) {
        long m9934b = C1866g.m9934b();
        try {
            C7444c m22480c = c7445d.m22480c();
            if (m22480c.m22461b() > 0 && m22480c.m22462c() == 0) {
                Bitmap.Config config = c7624h.m23147c(C11314i.f29370a) == EnumC7618b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC7442a m35312a = this.f29328d.m35312a(this.f29329e, m22480c, byteBuffer, m35309e(m22480c, i10, i11));
                m35312a.mo22449d(config);
                m35312a.mo22447b();
                Bitmap mo22446a = m35312a.mo22446a();
                if (mo22446a == null) {
                    return null;
                }
                C11310e c11310e = new C11310e(new C11308c(this.f29325a, m35312a, C10053n.m29972c(), i10, i11, mo22446a));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C1866g.m9933a(m9934b));
                }
                return c11310e;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C1866g.m9933a(m9934b));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C1866g.m9933a(m9934b));
            }
        }
    }

    /* renamed from: e */
    private static int m35309e(C7444c c7444c, int i10, int i11) {
        int min = Math.min(c7444c.m22460a() / i11, c7444c.m22463d() / i10);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + c7444c.m22463d() + "x" + c7444c.m22460a() + "]");
        }
        return max;
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C11310e mo23152b(ByteBuffer byteBuffer, int i10, int i11, C7624h c7624h) {
        C7445d m35313a = this.f29327c.m35313a(byteBuffer);
        try {
            return m35308c(byteBuffer, i10, i11, m35313a, c7624h);
        } finally {
            this.f29327c.m35314b(m35313a);
        }
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo23151a(ByteBuffer byteBuffer, C7624h c7624h) {
        return !((Boolean) c7624h.m23147c(C11314i.f29371b)).booleanValue() && C2128a.m10749g(this.f29326b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
