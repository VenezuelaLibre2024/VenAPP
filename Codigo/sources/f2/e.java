package f2;

import android.app.Notification;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f14879a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14880b;

    /* renamed from: c, reason: collision with root package name */
    private final Notification f14881c;

    public e(int i10, Notification notification, int i11) {
        this.f14879a = i10;
        this.f14881c = notification;
        this.f14880b = i11;
    }

    public int a() {
        return this.f14880b;
    }

    public Notification b() {
        return this.f14881c;
    }

    public int c() {
        return this.f14879a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f14879a == eVar.f14879a && this.f14880b == eVar.f14880b) {
            return this.f14881c.equals(eVar.f14881c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f14879a * 31) + this.f14880b) * 31) + this.f14881c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f14879a + ", mForegroundServiceType=" + this.f14880b + ", mNotification=" + this.f14881c + '}';
    }
}
