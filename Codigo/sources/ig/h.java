package ig;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import ig.h;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17717a;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f17721e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17722f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17719c = false;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f17718b = new b();

    /* renamed from: d, reason: collision with root package name */
    private Handler f17720d = new Handler();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class b extends BroadcastReceiver {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(boolean z10) {
            h.this.f(z10);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z10 = intent.getIntExtra("plugged", -1) <= 0;
                h.this.f17720d.post(new Runnable() { // from class: ig.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b.this.b(z10);
                    }
                });
            }
        }
    }

    public h(Context context, Runnable runnable) {
        this.f17717a = context;
        this.f17721e = runnable;
    }

    private void e() {
        this.f17720d.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(boolean z10) {
        this.f17722f = z10;
        if (this.f17719c) {
            c();
        }
    }

    private void g() {
        if (this.f17719c) {
            return;
        }
        this.f17717a.registerReceiver(this.f17718b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f17719c = true;
    }

    private void i() {
        if (this.f17719c) {
            this.f17717a.unregisterReceiver(this.f17718b);
            this.f17719c = false;
        }
    }

    public void c() {
        e();
        if (this.f17722f) {
            this.f17720d.postDelayed(this.f17721e, 300000L);
        }
    }

    public void d() {
        e();
        i();
    }

    public void h() {
        g();
        c();
    }
}
