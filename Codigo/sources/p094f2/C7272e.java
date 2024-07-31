package p094f2;

import android.app.Notification;

/* renamed from: f2.e */
/* loaded from: classes.dex */
public final class C7272e {

    /* renamed from: a */
    private final int f16302a;

    /* renamed from: b */
    private final int f16303b;

    /* renamed from: c */
    private final Notification f16304c;

    public C7272e(int i10, Notification notification, int i11) {
        this.f16302a = i10;
        this.f16304c = notification;
        this.f16303b = i11;
    }

    /* renamed from: a */
    public int m21756a() {
        return this.f16303b;
    }

    /* renamed from: b */
    public Notification m21757b() {
        return this.f16304c;
    }

    /* renamed from: c */
    public int m21758c() {
        return this.f16302a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7272e.class != obj.getClass()) {
            return false;
        }
        C7272e c7272e = (C7272e) obj;
        if (this.f16302a == c7272e.f16302a && this.f16303b == c7272e.f16303b) {
            return this.f16304c.equals(c7272e.f16304c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f16302a * 31) + this.f16303b) * 31) + this.f16304c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f16302a + ", mForegroundServiceType=" + this.f16303b + ", mNotification=" + this.f16304c + '}';
    }
}
