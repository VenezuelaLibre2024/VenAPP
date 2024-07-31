package z2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.o;
import androidx.core.app.t0;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32261a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f32262b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32263c;

    /* renamed from: d, reason: collision with root package name */
    private o.e f32264d;

    public c(Context context, String str, Integer num, e eVar) {
        this.f32261a = context;
        this.f32262b = num;
        this.f32263c = str;
        this.f32264d = new o.e(context, str).B(1);
        e(eVar, false);
    }

    private PendingIntent b() {
        Intent launchIntentForPackage = this.f32261a.getPackageManager().getLaunchIntentForPackage(this.f32261a.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.setFlags(270532608);
        return PendingIntent.getActivity(this.f32261a, 0, launchIntentForPackage, 201326592);
    }

    private int c(String str, String str2) {
        return this.f32261a.getResources().getIdentifier(str, str2, this.f32261a.getPackageName());
    }

    private void e(e eVar, boolean z10) {
        int c10 = c(eVar.b().b(), eVar.b().a());
        if (c10 == 0) {
            c("ic_launcher.png", "mipmap");
        }
        this.f32264d = this.f32264d.n(eVar.d()).F(c10).m(eVar.c()).l(b()).z(eVar.g());
        Integer a10 = eVar.a();
        if (a10 != null) {
            this.f32264d = this.f32264d.j(a10.intValue());
        }
        if (z10) {
            t0.f(this.f32261a).i(this.f32262b.intValue(), this.f32264d.c());
        }
    }

    public Notification a() {
        return this.f32264d.c();
    }

    public void d(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            t0 f10 = t0.f(this.f32261a);
            NotificationChannel notificationChannel = new NotificationChannel(this.f32263c, str, 0);
            notificationChannel.setLockscreenVisibility(0);
            f10.e(notificationChannel);
        }
    }

    public void f(e eVar, boolean z10) {
        e(eVar, z10);
    }
}
