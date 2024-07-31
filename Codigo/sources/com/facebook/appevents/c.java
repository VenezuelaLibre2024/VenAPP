package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f7596a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final String f7597b = c.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f7598c = new ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    private static String f7599d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f7600e;

    private c() {
    }

    public static final String b() {
        if (!f7600e) {
            Log.w(f7597b, "initStore should have been called before calling setUserID");
            f7596a.c();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f7598c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = f7599d;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th2) {
            f7598c.readLock().unlock();
            throw th2;
        }
    }

    private final void c() {
        if (f7600e) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f7598c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f7600e) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            f7599d = PreferenceManager.getDefaultSharedPreferences(i4.e0.l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f7600e = true;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f7598c.writeLock().unlock();
            throw th2;
        }
    }

    public static final void d() {
        if (f7600e) {
            return;
        }
        h0.f7622b.b().execute(new Runnable() { // from class: com.facebook.appevents.b
            @Override // java.lang.Runnable
            public final void run() {
                c.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        f7596a.c();
    }
}
