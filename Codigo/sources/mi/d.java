package mi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class d extends BroadcastReceiver implements PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public static final a f21533d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f21534a;

    /* renamed from: b, reason: collision with root package name */
    private MethodChannel.Result f21535b;

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f21536c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public d(Context context) {
        n.e(context, "context");
        this.f21534a = context;
        this.f21536c = new AtomicBoolean(true);
    }

    private final void c(String str) {
        MethodChannel.Result result;
        if (!this.f21536c.compareAndSet(false, true) || (result = this.f21535b) == null) {
            return;
        }
        n.b(result);
        result.success(str);
        this.f21535b = null;
    }

    public final void a() {
        this.f21534a.unregisterReceiver(this);
    }

    public final void b() {
        this.f21534a.registerReceiver(this, new IntentFilter("dev.fluttercommunity.plus/share/success"));
    }

    public final boolean d(MethodChannel.Result callback) {
        n.e(callback, "callback");
        if (!this.f21536c.compareAndSet(true, false)) {
            callback.error("Share callback error", "prior share-sheet did not call back, did you await it? Maybe use non-result variant", null);
            return false;
        }
        this.f21536c.set(false);
        this.f21535b = callback;
        return true;
    }

    public final void e() {
        c("dev.fluttercommunity.plus/share/unavailable");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 17062003) {
            return false;
        }
        c("");
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        n.e(context, "context");
        n.e(intent, "intent");
        c(String.valueOf(intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")));
    }
}
