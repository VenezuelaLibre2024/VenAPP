package p024b6;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: b6.e */
/* loaded from: classes.dex */
public final class C1666e {

    /* renamed from: d */
    public static final a f7056d = new a(null);

    /* renamed from: e */
    public static final Handler f7057e = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    private MethodChannel.Result f7058a;

    /* renamed from: b */
    private final MethodCall f7059b;

    /* renamed from: c */
    private boolean f7060c;

    /* renamed from: b6.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C1666e(MethodChannel.Result result, MethodCall call) {
        C9322n.m27781e(result, "result");
        C9322n.m27781e(call, "call");
        this.f7058a = result;
        this.f7059b = call;
        f7057e.hasMessages(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m9142f(MethodChannel.Result result) {
        C9322n.m27781e(result, "$result");
        result.notImplemented();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m9143h(MethodChannel.Result result, Object obj) {
        C9322n.m27781e(result, "$result");
        try {
            result.success(obj);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m9144j(C1666e c1666e, String str, String str2, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        c1666e.m9149i(str, str2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m9145k(MethodChannel.Result result, String code, String str, Object obj) {
        C9322n.m27781e(result, "$result");
        C9322n.m27781e(code, "$code");
        result.error(code, str, obj);
    }

    /* renamed from: d */
    public final MethodCall m9146d() {
        return this.f7059b;
    }

    /* renamed from: e */
    public final void m9147e() {
        if (this.f7060c) {
            return;
        }
        this.f7060c = true;
        final MethodChannel.Result result = this.f7058a;
        f7057e.post(new Runnable() { // from class: b6.c
            @Override // java.lang.Runnable
            public final void run() {
                C1666e.m9142f(MethodChannel.Result.this);
            }
        });
    }

    /* renamed from: g */
    public final void m9148g(final Object obj) {
        if (this.f7060c) {
            return;
        }
        this.f7060c = true;
        final MethodChannel.Result result = this.f7058a;
        f7057e.post(new Runnable() { // from class: b6.b
            @Override // java.lang.Runnable
            public final void run() {
                C1666e.m9143h(MethodChannel.Result.this, obj);
            }
        });
    }

    /* renamed from: i */
    public final void m9149i(final String code, final String str, final Object obj) {
        C9322n.m27781e(code, "code");
        if (this.f7060c) {
            return;
        }
        this.f7060c = true;
        final MethodChannel.Result result = this.f7058a;
        f7057e.post(new Runnable() { // from class: b6.d
            @Override // java.lang.Runnable
            public final void run() {
                C1666e.m9145k(MethodChannel.Result.this, code, str, obj);
            }
        });
    }
}
