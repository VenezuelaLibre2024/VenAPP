package p240mi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: mi.d */
/* loaded from: classes3.dex */
public final class C9590d extends BroadcastReceiver implements PluginRegistry.ActivityResultListener {

    /* renamed from: d */
    public static final a f23387d = new a(null);

    /* renamed from: a */
    private final Context f23388a;

    /* renamed from: b */
    private MethodChannel.Result f23389b;

    /* renamed from: c */
    private AtomicBoolean f23390c;

    /* renamed from: mi.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C9590d(Context context) {
        C9322n.m27781e(context, "context");
        this.f23388a = context;
        this.f23390c = new AtomicBoolean(true);
    }

    /* renamed from: c */
    private final void m28581c(String str) {
        MethodChannel.Result result;
        if (!this.f23390c.compareAndSet(false, true) || (result = this.f23389b) == null) {
            return;
        }
        C9322n.m27778b(result);
        result.success(str);
        this.f23389b = null;
    }

    /* renamed from: a */
    public final void m28582a() {
        this.f23388a.unregisterReceiver(this);
    }

    /* renamed from: b */
    public final void m28583b() {
        this.f23388a.registerReceiver(this, new IntentFilter("dev.fluttercommunity.plus/share/success"));
    }

    /* renamed from: d */
    public final boolean m28584d(MethodChannel.Result callback) {
        C9322n.m27781e(callback, "callback");
        if (!this.f23390c.compareAndSet(true, false)) {
            callback.error("Share callback error", "prior share-sheet did not call back, did you await it? Maybe use non-result variant", null);
            return false;
        }
        this.f23390c.set(false);
        this.f23389b = callback;
        return true;
    }

    /* renamed from: e */
    public final void m28585e() {
        m28581c("dev.fluttercommunity.plus/share/unavailable");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 17062003) {
            return false;
        }
        m28581c("");
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(intent, "intent");
        m28581c(String.valueOf(intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")));
    }
}
