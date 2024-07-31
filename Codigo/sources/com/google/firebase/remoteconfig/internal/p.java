package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;
import ze.m;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: e, reason: collision with root package name */
    static final Date f12502e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    static final Date f12503f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f12504a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f12505b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Object f12506c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Object f12507d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f12508a;

        /* renamed from: b, reason: collision with root package name */
        private Date f12509b;

        a(int i10, Date date) {
            this.f12508a = i10;
            this.f12509b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Date a() {
            return this.f12509b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f12508a;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f12510a;

        /* renamed from: b, reason: collision with root package name */
        private Date f12511b;

        public b(int i10, Date date) {
            this.f12510a = i10;
            this.f12511b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Date a() {
            return this.f12511b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f12510a;
        }
    }

    public p(SharedPreferences sharedPreferences) {
        this.f12504a = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a() {
        a aVar;
        synchronized (this.f12506c) {
            aVar = new a(this.f12504a.getInt("num_failed_fetches", 0), new Date(this.f12504a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.f12504a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public ze.k c() {
        v a10;
        synchronized (this.f12505b) {
            long j10 = this.f12504a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f12504a.getInt("last_fetch_status", 0);
            a10 = v.b().c(i10).d(j10).b(new m.b().d(this.f12504a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f12504a.getLong("minimum_fetch_interval_in_seconds", m.f12477j)).c()).a();
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f12504a.getString("last_fetch_etag", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Date e() {
        return new Date(this.f12504a.getLong("last_fetch_time_in_millis", -1L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long f() {
        return this.f12504a.getLong("last_template_version", 0L);
    }

    public long g() {
        return this.f12504a.getLong("minimum_fetch_interval_in_seconds", m.f12477j);
    }

    public b h() {
        b bVar;
        synchronized (this.f12507d) {
            bVar = new b(this.f12504a.getInt("num_failed_realtime_streams", 0), new Date(this.f12504a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        k(0, f12503f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        n(0, f12503f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i10, Date date) {
        synchronized (this.f12506c) {
            this.f12504a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(String str) {
        synchronized (this.f12505b) {
            this.f12504a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(long j10) {
        synchronized (this.f12505b) {
            this.f12504a.edit().putLong("last_template_version", j10).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i10, Date date) {
        synchronized (this.f12507d) {
            this.f12504a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        synchronized (this.f12505b) {
            this.f12504a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Date date) {
        synchronized (this.f12505b) {
            this.f12504a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        synchronized (this.f12505b) {
            this.f12504a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
