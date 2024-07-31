package p361t6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t6.y3 */
/* loaded from: classes.dex */
public final class C11130y3 {

    /* renamed from: a */
    private final Context f28924a;

    /* renamed from: b */
    private final Handler f28925b;

    /* renamed from: c */
    private final b f28926c;

    /* renamed from: d */
    private final AudioManager f28927d;

    /* renamed from: e */
    private c f28928e;

    /* renamed from: f */
    private int f28929f;

    /* renamed from: g */
    private int f28930g;

    /* renamed from: h */
    private boolean f28931h;

    /* renamed from: t6.y3$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: s */
        void mo33985s(int i10);

        /* renamed from: y */
        void mo33988y(int i10, boolean z10);
    }

    /* renamed from: t6.y3$c */
    /* loaded from: classes.dex */
    private final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = C11130y3.this.f28925b;
            final C11130y3 c11130y3 = C11130y3.this;
            handler.post(new Runnable() { // from class: t6.z3
                @Override // java.lang.Runnable
                public final void run() {
                    C11130y3.m34587b(C11130y3.this);
                }
            });
        }
    }

    public C11130y3(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f28924a = applicationContext;
        this.f28925b = handler;
        this.f28926c = bVar;
        AudioManager audioManager = (AudioManager) C11137a.m34607i((AudioManager) applicationContext.getSystemService("audio"));
        this.f28927d = audioManager;
        this.f28929f = 3;
        this.f28930g = m34589f(audioManager, 3);
        this.f28931h = m34588e(audioManager, this.f28929f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f28928e = cVar;
        } catch (RuntimeException e10) {
            C11173s.m34971j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m34587b(C11130y3 c11130y3) {
        c11130y3.m34590i();
    }

    /* renamed from: e */
    private static boolean m34588e(AudioManager audioManager, int i10) {
        return C11172r0.f29040a >= 23 ? audioManager.isStreamMute(i10) : m34589f(audioManager, i10) == 0;
    }

    /* renamed from: f */
    private static int m34589f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            C11173s.m34971j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m34590i() {
        int m34589f = m34589f(this.f28927d, this.f28929f);
        boolean m34588e = m34588e(this.f28927d, this.f28929f);
        if (this.f28930g == m34589f && this.f28931h == m34588e) {
            return;
        }
        this.f28930g = m34589f;
        this.f28931h = m34588e;
        this.f28926c.mo33988y(m34589f, m34588e);
    }

    /* renamed from: c */
    public int m34591c() {
        return this.f28927d.getStreamMaxVolume(this.f28929f);
    }

    /* renamed from: d */
    public int m34592d() {
        int streamMinVolume;
        if (C11172r0.f29040a < 28) {
            return 0;
        }
        streamMinVolume = this.f28927d.getStreamMinVolume(this.f28929f);
        return streamMinVolume;
    }

    /* renamed from: g */
    public void m34593g() {
        c cVar = this.f28928e;
        if (cVar != null) {
            try {
                this.f28924a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                C11173s.m34971j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f28928e = null;
        }
    }

    /* renamed from: h */
    public void m34594h(int i10) {
        if (this.f28929f == i10) {
            return;
        }
        this.f28929f = i10;
        m34590i();
        this.f28926c.mo33985s(i10);
    }
}
