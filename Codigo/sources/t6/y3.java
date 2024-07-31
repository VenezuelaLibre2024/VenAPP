package t6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26628a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f26629b;

    /* renamed from: c, reason: collision with root package name */
    private final b f26630c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioManager f26631d;

    /* renamed from: e, reason: collision with root package name */
    private c f26632e;

    /* renamed from: f, reason: collision with root package name */
    private int f26633f;

    /* renamed from: g, reason: collision with root package name */
    private int f26634g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26635h;

    /* loaded from: classes.dex */
    public interface b {
        void s(int i10);

        void y(int i10, boolean z10);
    }

    /* loaded from: classes.dex */
    private final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = y3.this.f26629b;
            final y3 y3Var = y3.this;
            handler.post(new Runnable() { // from class: t6.z3
                @Override // java.lang.Runnable
                public final void run() {
                    y3.b(y3.this);
                }
            });
        }
    }

    public y3(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f26628a = applicationContext;
        this.f26629b = handler;
        this.f26630c = bVar;
        AudioManager audioManager = (AudioManager) t8.a.i((AudioManager) applicationContext.getSystemService("audio"));
        this.f26631d = audioManager;
        this.f26633f = 3;
        this.f26634g = f(audioManager, 3);
        this.f26635h = e(audioManager, this.f26633f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f26632e = cVar;
        } catch (RuntimeException e10) {
            t8.s.j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(y3 y3Var) {
        y3Var.i();
    }

    private static boolean e(AudioManager audioManager, int i10) {
        return t8.r0.f26744a >= 23 ? audioManager.isStreamMute(i10) : f(audioManager, i10) == 0;
    }

    private static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            t8.s.j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int f10 = f(this.f26631d, this.f26633f);
        boolean e10 = e(this.f26631d, this.f26633f);
        if (this.f26634g == f10 && this.f26635h == e10) {
            return;
        }
        this.f26634g = f10;
        this.f26635h = e10;
        this.f26630c.y(f10, e10);
    }

    public int c() {
        return this.f26631d.getStreamMaxVolume(this.f26633f);
    }

    public int d() {
        int streamMinVolume;
        if (t8.r0.f26744a < 28) {
            return 0;
        }
        streamMinVolume = this.f26631d.getStreamMinVolume(this.f26633f);
        return streamMinVolume;
    }

    public void g() {
        c cVar = this.f26632e;
        if (cVar != null) {
            try {
                this.f26628a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                t8.s.j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f26632e = null;
        }
    }

    public void h(int i10) {
        if (this.f26633f == i10) {
            return;
        }
        this.f26633f = i10;
        i();
        this.f26630c.s(i10);
    }
}
