package p162ig;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import p162ig.C7976h;

/* renamed from: ig.h */
/* loaded from: classes2.dex */
public final class C7976h {

    /* renamed from: a */
    private final Context f19380a;

    /* renamed from: e */
    private Runnable f19384e;

    /* renamed from: f */
    private boolean f19385f;

    /* renamed from: c */
    private boolean f19382c = false;

    /* renamed from: b */
    private final BroadcastReceiver f19381b = new b();

    /* renamed from: d */
    private Handler f19383d = new Handler();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ig.h$b */
    /* loaded from: classes2.dex */
    public final class b extends BroadcastReceiver {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m24527b(boolean z10) {
            C7976h.this.m24520f(z10);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z10 = intent.getIntExtra("plugged", -1) <= 0;
                C7976h.this.f19383d.post(new Runnable() { // from class: ig.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7976h.b.this.m24527b(z10);
                    }
                });
            }
        }
    }

    public C7976h(Context context, Runnable runnable) {
        this.f19380a = context;
        this.f19384e = runnable;
    }

    /* renamed from: e */
    private void m24519e() {
        this.f19383d.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m24520f(boolean z10) {
        this.f19385f = z10;
        if (this.f19382c) {
            m24523c();
        }
    }

    /* renamed from: g */
    private void m24521g() {
        if (this.f19382c) {
            return;
        }
        this.f19380a.registerReceiver(this.f19381b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f19382c = true;
    }

    /* renamed from: i */
    private void m24522i() {
        if (this.f19382c) {
            this.f19380a.unregisterReceiver(this.f19381b);
            this.f19382c = false;
        }
    }

    /* renamed from: c */
    public void m24523c() {
        m24519e();
        if (this.f19385f) {
            this.f19383d.postDelayed(this.f19384e, 300000L);
        }
    }

    /* renamed from: d */
    public void m24524d() {
        m24519e();
        m24522i();
    }

    /* renamed from: h */
    public void m24525h() {
        m24521g();
        m24523c();
    }
}
