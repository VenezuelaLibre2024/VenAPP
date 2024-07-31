package p153i5;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: i5.g */
/* loaded from: classes.dex */
public abstract class AbstractC7848g {

    /* renamed from: c */
    public static final a f18814c = new a(null);

    /* renamed from: d */
    private static final Handler f18815d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private static final ExecutorService f18816e;

    /* renamed from: a */
    private MethodChannel.Result f18817a;

    /* renamed from: b */
    private boolean f18818b;

    /* renamed from: i5.g$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final ExecutorService m24143a() {
            return AbstractC7848g.f18816e;
        }
    }

    static {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(8);
        C9322n.m27780d(newFixedThreadPool, "newFixedThreadPool(...)");
        f18816e = newFixedThreadPool;
    }

    public AbstractC7848g(MethodChannel.Result result) {
        this.f18817a = result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m24141d(MethodChannel.Result result, Object obj) {
        if (result != null) {
            result.success(obj);
        }
    }

    /* renamed from: c */
    public final void m24142c(final Object obj) {
        if (this.f18818b) {
            return;
        }
        this.f18818b = true;
        final MethodChannel.Result result = this.f18817a;
        this.f18817a = null;
        f18815d.post(new Runnable() { // from class: i5.f
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC7848g.m24141d(MethodChannel.Result.this, obj);
            }
        });
    }
}
