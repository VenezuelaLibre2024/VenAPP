package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements y1.a<Boolean> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends e.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements e.g {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4335a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends e.h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.h f4336a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f4337b;

            a(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f4336a = hVar;
                this.f4337b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th2) {
                try {
                    this.f4336a.a(th2);
                } finally {
                    this.f4337b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.h
            public void b(m mVar) {
                try {
                    this.f4336a.b(mVar);
                } finally {
                    this.f4337b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f4335a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.g
        public void a(final e.h hVar) {
            final ThreadPoolExecutor b10 = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            b10.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(hVar, b10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                j a10 = androidx.emoji2.text.c.a(this.f4335a);
                if (a10 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a10.c(threadPoolExecutor);
                a10.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th2) {
                hVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.core.os.l.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.h()) {
                    e.b().k();
                }
            } finally {
                androidx.core.os.l.b();
            }
        }
    }

    @Override // y1.a
    public List<Class<? extends y1.a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // y1.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        e.g(new a(context));
        c(context);
        return Boolean.TRUE;
    }

    void c(Context context) {
        final androidx.lifecycle.f lifecycle = ((androidx.lifecycle.k) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(androidx.lifecycle.k kVar) {
                EmojiCompatInitializer.this.d();
                lifecycle.c(this);
            }
        });
    }

    void d() {
        androidx.emoji2.text.b.d().postDelayed(new c(), 500L);
    }
}
