package i5;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f17154c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Handler f17155d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    private static final ExecutorService f17156e;

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel.Result f17157a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17158b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final ExecutorService a() {
            return g.f17156e;
        }
    }

    static {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(8);
        n.d(newFixedThreadPool, "newFixedThreadPool(...)");
        f17156e = newFixedThreadPool;
    }

    public g(MethodChannel.Result result) {
        this.f17157a = result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MethodChannel.Result result, Object obj) {
        if (result != null) {
            result.success(obj);
        }
    }

    public final void c(final Object obj) {
        if (this.f17158b) {
            return;
        }
        this.f17158b = true;
        final MethodChannel.Result result = this.f17157a;
        this.f17157a = null;
        f17155d.post(new Runnable() { // from class: i5.f
            @Override // java.lang.Runnable
            public final void run() {
                g.d(MethodChannel.Result.this, obj);
            }
        });
    }
}
