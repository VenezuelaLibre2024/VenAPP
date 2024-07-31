package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f12207a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12208b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12209c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f12211e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque<String> f12210d = new ArrayDeque<>();

    /* renamed from: f, reason: collision with root package name */
    private boolean f12212f = false;

    private y0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f12207a = sharedPreferences;
        this.f12208b = str;
        this.f12209c = str2;
        this.f12211e = executor;
    }

    private boolean c(boolean z10) {
        if (z10 && !this.f12212f) {
            j();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        y0 y0Var = new y0(sharedPreferences, str, str2, executor);
        y0Var.e();
        return y0Var;
    }

    private void e() {
        synchronized (this.f12210d) {
            this.f12210d.clear();
            String string = this.f12207a.getString(this.f12208b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f12209c)) {
                String[] split = string.split(this.f12209c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f12210d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (this.f12210d) {
            this.f12207a.edit().putString(this.f12208b, h()).commit();
        }
    }

    private void j() {
        this.f12211e.execute(new Runnable() { // from class: com.google.firebase.messaging.x0
            @Override // java.lang.Runnable
            public final void run() {
                y0.this.i();
            }
        });
    }

    public boolean b(String str) {
        boolean c10;
        if (TextUtils.isEmpty(str) || str.contains(this.f12209c)) {
            return false;
        }
        synchronized (this.f12210d) {
            c10 = c(this.f12210d.add(str));
        }
        return c10;
    }

    public String f() {
        String peek;
        synchronized (this.f12210d) {
            peek = this.f12210d.peek();
        }
        return peek;
    }

    public boolean g(Object obj) {
        boolean c10;
        synchronized (this.f12210d) {
            c10 = c(this.f12210d.remove(obj));
        }
        return c10;
    }

    public String h() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f12210d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f12209c);
        }
        return sb2.toString();
    }
}
