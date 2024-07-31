package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.n;
import androidx.work.impl.background.systemalarm.g;
import f2.j;
import l2.y;

/* loaded from: classes.dex */
public class SystemAlarmService extends n implements g.c {

    /* renamed from: d, reason: collision with root package name */
    private static final String f5740d = j.i("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    private g f5741b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5742c;

    private void e() {
        g gVar = new g(this);
        this.f5741b = gVar;
        gVar.l(this);
    }

    @Override // androidx.work.impl.background.systemalarm.g.c
    public void b() {
        this.f5742c = true;
        j.e().a(f5740d, "All commands completed in dispatcher");
        y.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f5742c = false;
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f5742c = true;
        this.f5741b.j();
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f5742c) {
            j.e().f(f5740d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f5741b.j();
            e();
            this.f5742c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5741b.a(intent, i11);
        return 3;
    }
}
