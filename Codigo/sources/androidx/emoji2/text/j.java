package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.graphics.h0;
import androidx.core.provider.g;
import androidx.emoji2.text.e;
import androidx.emoji2.text.j;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class j extends e.c {

    /* renamed from: j, reason: collision with root package name */
    private static final a f4400j = new a();

    /* loaded from: classes.dex */
    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return androidx.core.provider.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, androidx.core.provider.e eVar) {
            return androidx.core.provider.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements e.g {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4401a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.provider.e f4402b;

        /* renamed from: c, reason: collision with root package name */
        private final a f4403c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f4404d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private Handler f4405e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f4406f;

        /* renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f4407g;

        /* renamed from: h, reason: collision with root package name */
        e.h f4408h;

        /* renamed from: i, reason: collision with root package name */
        private ContentObserver f4409i;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f4410j;

        b(Context context, androidx.core.provider.e eVar, a aVar) {
            androidx.core.util.h.l(context, "Context cannot be null");
            androidx.core.util.h.l(eVar, "FontRequest cannot be null");
            this.f4401a = context.getApplicationContext();
            this.f4402b = eVar;
            this.f4403c = aVar;
        }

        private void b() {
            synchronized (this.f4404d) {
                this.f4408h = null;
                ContentObserver contentObserver = this.f4409i;
                if (contentObserver != null) {
                    this.f4403c.c(this.f4401a, contentObserver);
                    this.f4409i = null;
                }
                Handler handler = this.f4405e;
                if (handler != null) {
                    handler.removeCallbacks(this.f4410j);
                }
                this.f4405e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4407g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4406f = null;
                this.f4407g = null;
            }
        }

        private g.b e() {
            try {
                g.a b10 = this.f4403c.b(this.f4401a, this.f4402b);
                if (b10.c() == 0) {
                    g.b[] b11 = b10.b();
                    if (b11 == null || b11.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return b11[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b10.c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.e.g
        public void a(e.h hVar) {
            androidx.core.util.h.l(hVar, "LoaderCallback cannot be null");
            synchronized (this.f4404d) {
                this.f4408h = hVar;
            }
            d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            synchronized (this.f4404d) {
                if (this.f4408h == null) {
                    return;
                }
                try {
                    g.b e10 = e();
                    int b10 = e10.b();
                    if (b10 == 2) {
                        synchronized (this.f4404d) {
                        }
                    }
                    if (b10 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + b10 + ")");
                    }
                    try {
                        androidx.core.os.l.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface a10 = this.f4403c.a(this.f4401a, e10);
                        ByteBuffer f10 = h0.f(this.f4401a, null, e10.d());
                        if (f10 == null || a10 == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        m b11 = m.b(a10, f10);
                        androidx.core.os.l.b();
                        synchronized (this.f4404d) {
                            e.h hVar = this.f4408h;
                            if (hVar != null) {
                                hVar.b(b11);
                            }
                        }
                        b();
                    } catch (Throwable th2) {
                        androidx.core.os.l.b();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    synchronized (this.f4404d) {
                        e.h hVar2 = this.f4408h;
                        if (hVar2 != null) {
                            hVar2.a(th3);
                        }
                        b();
                    }
                }
            }
        }

        void d() {
            synchronized (this.f4404d) {
                if (this.f4408h == null) {
                    return;
                }
                if (this.f4406f == null) {
                    ThreadPoolExecutor b10 = androidx.emoji2.text.b.b("emojiCompat");
                    this.f4407g = b10;
                    this.f4406f = b10;
                }
                this.f4406f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.b.this.c();
                    }
                });
            }
        }

        public void f(Executor executor) {
            synchronized (this.f4404d) {
                this.f4406f = executor;
            }
        }
    }

    public j(Context context, androidx.core.provider.e eVar) {
        super(new b(context, eVar, f4400j));
    }

    public j c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
