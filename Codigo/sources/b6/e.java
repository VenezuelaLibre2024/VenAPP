package b6;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6161d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final Handler f6162e = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel.Result f6163a;

    /* renamed from: b, reason: collision with root package name */
    private final MethodCall f6164b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6165c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public e(MethodChannel.Result result, MethodCall call) {
        n.e(result, "result");
        n.e(call, "call");
        this.f6163a = result;
        this.f6164b = call;
        f6162e.hasMessages(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MethodChannel.Result result) {
        n.e(result, "$result");
        result.notImplemented();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(MethodChannel.Result result, Object obj) {
        n.e(result, "$result");
        try {
            result.success(obj);
        } catch (IllegalStateException unused) {
        }
    }

    public static /* synthetic */ void j(e eVar, String str, String str2, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        eVar.i(str, str2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(MethodChannel.Result result, String code, String str, Object obj) {
        n.e(result, "$result");
        n.e(code, "$code");
        result.error(code, str, obj);
    }

    public final MethodCall d() {
        return this.f6164b;
    }

    public final void e() {
        if (this.f6165c) {
            return;
        }
        this.f6165c = true;
        final MethodChannel.Result result = this.f6163a;
        f6162e.post(new Runnable() { // from class: b6.c
            @Override // java.lang.Runnable
            public final void run() {
                e.f(MethodChannel.Result.this);
            }
        });
    }

    public final void g(final Object obj) {
        if (this.f6165c) {
            return;
        }
        this.f6165c = true;
        final MethodChannel.Result result = this.f6163a;
        f6162e.post(new Runnable() { // from class: b6.b
            @Override // java.lang.Runnable
            public final void run() {
                e.h(MethodChannel.Result.this, obj);
            }
        });
    }

    public final void i(final String code, final String str, final Object obj) {
        n.e(code, "code");
        if (this.f6165c) {
            return;
        }
        this.f6165c = true;
        final MethodChannel.Result result = this.f6163a;
        f6162e.post(new Runnable() { // from class: b6.d
            @Override // java.lang.Runnable
            public final void run() {
                e.k(MethodChannel.Result.this, code, str, obj);
            }
        });
    }
}
