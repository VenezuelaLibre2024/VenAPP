package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p152i4.C7799e0;

/* renamed from: com.facebook.appevents.c */
/* loaded from: classes.dex */
public final class C4567c {

    /* renamed from: a */
    public static final C4567c f8571a = new C4567c();

    /* renamed from: b */
    private static final String f8572b = C4567c.class.getSimpleName();

    /* renamed from: c */
    private static final ReentrantReadWriteLock f8573c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static String f8574d;

    /* renamed from: e */
    private static volatile boolean f8575e;

    private C4567c() {
    }

    /* renamed from: b */
    public static final String m10937b() {
        if (!f8575e) {
            Log.w(f8572b, "initStore should have been called before calling setUserID");
            f8571a.m10938c();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f8573c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = f8574d;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th2) {
            f8573c.readLock().unlock();
            throw th2;
        }
    }

    /* renamed from: c */
    private final void m10938c() {
        if (f8575e) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f8573c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f8575e) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            f8574d = PreferenceManager.getDefaultSharedPreferences(C7799e0.m23860l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f8575e = true;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f8573c.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: d */
    public static final void m10939d() {
        if (f8575e) {
            return;
        }
        C4578h0.f8597b.m11004b().execute(new Runnable() { // from class: com.facebook.appevents.b
            @Override // java.lang.Runnable
            public final void run() {
                C4567c.m10940e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m10940e() {
        f8571a.m10938c();
    }
}
