package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.y0 */
/* loaded from: classes.dex */
public final class C6270y0 {

    /* renamed from: a */
    private final SharedPreferences f13422a;

    /* renamed from: b */
    private final String f13423b;

    /* renamed from: c */
    private final String f13424c;

    /* renamed from: e */
    private final Executor f13426e;

    /* renamed from: d */
    final ArrayDeque<String> f13425d = new ArrayDeque<>();

    /* renamed from: f */
    private boolean f13427f = false;

    private C6270y0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f13422a = sharedPreferences;
        this.f13423b = str;
        this.f13424c = str2;
        this.f13426e = executor;
    }

    /* renamed from: c */
    private boolean m17205c(boolean z10) {
        if (z10 && !this.f13427f) {
            m17209j();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C6270y0 m17206d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C6270y0 c6270y0 = new C6270y0(sharedPreferences, str, str2, executor);
        c6270y0.m17207e();
        return c6270y0;
    }

    /* renamed from: e */
    private void m17207e() {
        synchronized (this.f13425d) {
            this.f13425d.clear();
            String string = this.f13422a.getString(this.f13423b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f13424c)) {
                String[] split = string.split(this.f13424c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f13425d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m17208i() {
        synchronized (this.f13425d) {
            this.f13422a.edit().putString(this.f13423b, m17213h()).commit();
        }
    }

    /* renamed from: j */
    private void m17209j() {
        this.f13426e.execute(new Runnable() { // from class: com.google.firebase.messaging.x0
            @Override // java.lang.Runnable
            public final void run() {
                C6270y0.this.m17208i();
            }
        });
    }

    /* renamed from: b */
    public boolean m17210b(String str) {
        boolean m17205c;
        if (TextUtils.isEmpty(str) || str.contains(this.f13424c)) {
            return false;
        }
        synchronized (this.f13425d) {
            m17205c = m17205c(this.f13425d.add(str));
        }
        return m17205c;
    }

    /* renamed from: f */
    public String m17211f() {
        String peek;
        synchronized (this.f13425d) {
            peek = this.f13425d.peek();
        }
        return peek;
    }

    /* renamed from: g */
    public boolean m17212g(Object obj) {
        boolean m17205c;
        synchronized (this.f13425d) {
            m17205c = m17205c(this.f13425d.remove(obj));
        }
        return m17205c;
    }

    /* renamed from: h */
    public String m17213h() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f13425d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f13424c);
        }
        return sb2.toString();
    }
}
