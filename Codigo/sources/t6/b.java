package t6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25855a;

    /* renamed from: b, reason: collision with root package name */
    private final a f25856b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25857c;

    /* loaded from: classes.dex */
    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0436b f25858a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f25859b;

        public a(Handler handler, InterfaceC0436b interfaceC0436b) {
            this.f25859b = handler;
            this.f25858a = interfaceC0436b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f25859b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f25857c) {
                this.f25858a.u();
            }
        }
    }

    /* renamed from: t6.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0436b {
        void u();
    }

    public b(Context context, Handler handler, InterfaceC0436b interfaceC0436b) {
        this.f25855a = context.getApplicationContext();
        this.f25856b = new a(handler, interfaceC0436b);
    }

    public void b(boolean z10) {
        boolean z11;
        if (z10 && !this.f25857c) {
            this.f25855a.registerReceiver(this.f25856b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z11 = true;
        } else {
            if (z10 || !this.f25857c) {
                return;
            }
            this.f25855a.unregisterReceiver(this.f25856b);
            z11 = false;
        }
        this.f25857c = z11;
    }
}
