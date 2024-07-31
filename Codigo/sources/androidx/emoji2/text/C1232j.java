package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.graphics.C0903h0;
import androidx.core.os.C0953l;
import androidx.core.provider.C0959e;
import androidx.core.provider.C0961g;
import androidx.core.util.C0984h;
import androidx.emoji2.text.C1227e;
import androidx.emoji2.text.C1232j;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.j */
/* loaded from: classes.dex */
public class C1232j extends C1227e.c {

    /* renamed from: j */
    private static final a f5111j = new a();

    /* renamed from: androidx.emoji2.text.j$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public Typeface m6683a(Context context, C0961g.b bVar) {
            return C0961g.m4769a(context, null, new C0961g.b[]{bVar});
        }

        /* renamed from: b */
        public C0961g.a m6684b(Context context, C0959e c0959e) {
            return C0961g.m4770b(context, null, c0959e);
        }

        /* renamed from: c */
        public void m6685c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.j$b */
    /* loaded from: classes.dex */
    public static class b implements C1227e.g {

        /* renamed from: a */
        private final Context f5112a;

        /* renamed from: b */
        private final C0959e f5113b;

        /* renamed from: c */
        private final a f5114c;

        /* renamed from: d */
        private final Object f5115d = new Object();

        /* renamed from: e */
        private Handler f5116e;

        /* renamed from: f */
        private Executor f5117f;

        /* renamed from: g */
        private ThreadPoolExecutor f5118g;

        /* renamed from: h */
        C1227e.h f5119h;

        /* renamed from: i */
        private ContentObserver f5120i;

        /* renamed from: j */
        private Runnable f5121j;

        b(Context context, C0959e c0959e, a aVar) {
            C0984h.m4834l(context, "Context cannot be null");
            C0984h.m4834l(c0959e, "FontRequest cannot be null");
            this.f5112a = context.getApplicationContext();
            this.f5113b = c0959e;
            this.f5114c = aVar;
        }

        /* renamed from: b */
        private void m6686b() {
            synchronized (this.f5115d) {
                this.f5119h = null;
                ContentObserver contentObserver = this.f5120i;
                if (contentObserver != null) {
                    this.f5114c.m6685c(this.f5112a, contentObserver);
                    this.f5120i = null;
                }
                Handler handler = this.f5116e;
                if (handler != null) {
                    handler.removeCallbacks(this.f5121j);
                }
                this.f5116e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f5118g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f5117f = null;
                this.f5118g = null;
            }
        }

        /* renamed from: e */
        private C0961g.b m6687e() {
            try {
                C0961g.a m6684b = this.f5114c.m6684b(this.f5112a, this.f5113b);
                if (m6684b.m4774c() == 0) {
                    C0961g.b[] m4773b = m6684b.m4773b();
                    if (m4773b == null || m4773b.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return m4773b[0];
                }
                throw new RuntimeException("fetchFonts failed (" + m6684b.m4774c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.C1227e.g
        /* renamed from: a */
        public void mo6598a(C1227e.h hVar) {
            C0984h.m4834l(hVar, "LoaderCallback cannot be null");
            synchronized (this.f5115d) {
                this.f5119h = hVar;
            }
            m6689d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void m6688c() {
            synchronized (this.f5115d) {
                if (this.f5119h == null) {
                    return;
                }
                try {
                    C0961g.b m6687e = m6687e();
                    int m4776b = m6687e.m4776b();
                    if (m4776b == 2) {
                        synchronized (this.f5115d) {
                        }
                    }
                    if (m4776b != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + m4776b + ")");
                    }
                    try {
                        C0953l.m4733a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface m6683a = this.f5114c.m6683a(this.f5112a, m6687e);
                        ByteBuffer m4599f = C0903h0.m4599f(this.f5112a, null, m6687e.m4778d());
                        if (m4599f == null || m6683a == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        C1235m m6700b = C1235m.m6700b(m6683a, m4599f);
                        C0953l.m4734b();
                        synchronized (this.f5115d) {
                            C1227e.h hVar = this.f5119h;
                            if (hVar != null) {
                                hVar.mo6601b(m6700b);
                            }
                        }
                        m6686b();
                    } catch (Throwable th2) {
                        C0953l.m4734b();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    synchronized (this.f5115d) {
                        C1227e.h hVar2 = this.f5119h;
                        if (hVar2 != null) {
                            hVar2.mo6600a(th3);
                        }
                        m6686b();
                    }
                }
            }
        }

        /* renamed from: d */
        void m6689d() {
            synchronized (this.f5115d) {
                if (this.f5119h == null) {
                    return;
                }
                if (this.f5117f == null) {
                    ThreadPoolExecutor m6603b = C1224b.m6603b("emojiCompat");
                    this.f5118g = m6603b;
                    this.f5117f = m6603b;
                }
                this.f5117f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1232j.b.this.m6688c();
                    }
                });
            }
        }

        /* renamed from: f */
        public void m6690f(Executor executor) {
            synchronized (this.f5115d) {
                this.f5117f = executor;
            }
        }
    }

    public C1232j(Context context, C0959e c0959e) {
        super(new b(context, c0959e, f5111j));
    }

    /* renamed from: c */
    public C1232j m6682c(Executor executor) {
        ((b) m6646a()).m6690f(executor);
        return this;
    }
}
