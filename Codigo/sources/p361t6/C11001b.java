package p361t6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: t6.b */
/* loaded from: classes.dex */
final class C11001b {

    /* renamed from: a */
    private final Context f27999a;

    /* renamed from: b */
    private final a f28000b;

    /* renamed from: c */
    private boolean f28001c;

    /* renamed from: t6.b$a */
    /* loaded from: classes.dex */
    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a */
        private final b f28002a;

        /* renamed from: b */
        private final Handler f28003b;

        public a(Handler handler, b bVar) {
            this.f28003b = handler;
            this.f28002a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f28003b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C11001b.this.f28001c) {
                this.f28002a.mo33714u();
            }
        }
    }

    /* renamed from: t6.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: u */
        void mo33714u();
    }

    public C11001b(Context context, Handler handler, b bVar) {
        this.f27999a = context.getApplicationContext();
        this.f28000b = new a(handler, bVar);
    }

    /* renamed from: b */
    public void m33713b(boolean z10) {
        boolean z11;
        if (z10 && !this.f28001c) {
            this.f27999a.registerReceiver(this.f28000b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z11 = true;
        } else {
            if (z10 || !this.f28001c) {
                return;
            }
            this.f27999a.unregisterReceiver(this.f28000b);
            z11 = false;
        }
        this.f28001c = z11;
    }
}
