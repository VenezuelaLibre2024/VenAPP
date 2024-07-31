package p477z2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.C0818o;
import androidx.core.app.C0834t0;

/* renamed from: z2.c */
/* loaded from: classes.dex */
public class C12767c {

    /* renamed from: a */
    private final Context f34812a;

    /* renamed from: b */
    private final Integer f34813b;

    /* renamed from: c */
    private final String f34814c;

    /* renamed from: d */
    private C0818o.e f34815d;

    public C12767c(Context context, String str, Integer num, C12771e c12771e) {
        this.f34812a = context;
        this.f34813b = num;
        this.f34814c = str;
        this.f34815d = new C0818o.e(context, str).m4121B(1);
        m42362e(c12771e, false);
    }

    /* renamed from: b */
    private PendingIntent m42360b() {
        Intent launchIntentForPackage = this.f34812a.getPackageManager().getLaunchIntentForPackage(this.f34812a.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.setFlags(270532608);
        return PendingIntent.getActivity(this.f34812a, 0, launchIntentForPackage, 201326592);
    }

    /* renamed from: c */
    private int m42361c(String str, String str2) {
        return this.f34812a.getResources().getIdentifier(str, str2, this.f34812a.getPackageName());
    }

    /* renamed from: e */
    private void m42362e(C12771e c12771e, boolean z10) {
        int m42361c = m42361c(c12771e.m42373b().m42356b(), c12771e.m42373b().m42355a());
        if (m42361c == 0) {
            m42361c("ic_launcher.png", "mipmap");
        }
        this.f34815d = this.f34815d.m4146n(c12771e.m42375d()).m4125F(m42361c).m4145m(c12771e.m42374c()).m4144l(m42360b()).m4157z(c12771e.m42378g());
        Integer m42372a = c12771e.m42372a();
        if (m42372a != null) {
            this.f34815d = this.f34815d.m4142j(m42372a.intValue());
        }
        if (z10) {
            C0834t0.m4279f(this.f34812a).m4289i(this.f34813b.intValue(), this.f34815d.m4137c());
        }
    }

    /* renamed from: a */
    public Notification m42363a() {
        return this.f34815d.m4137c();
    }

    /* renamed from: d */
    public void m42364d(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0834t0 m4279f = C0834t0.m4279f(this.f34812a);
            NotificationChannel notificationChannel = new NotificationChannel(this.f34814c, str, 0);
            notificationChannel.setLockscreenVisibility(0);
            m4279f.m4287e(notificationChannel);
        }
    }

    /* renamed from: f */
    public void m42365f(C12771e c12771e, boolean z10) {
        m42362e(c12771e, z10);
    }
}
