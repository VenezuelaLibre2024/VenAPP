package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;
import p488ze.C13016m;
import p488ze.InterfaceC13014k;

/* renamed from: com.google.firebase.remoteconfig.internal.p */
/* loaded from: classes2.dex */
public class C6360p {

    /* renamed from: e */
    static final Date f13734e = new Date(-1);

    /* renamed from: f */
    static final Date f13735f = new Date(-1);

    /* renamed from: a */
    private final SharedPreferences f13736a;

    /* renamed from: b */
    private final Object f13737b = new Object();

    /* renamed from: c */
    private final Object f13738c = new Object();

    /* renamed from: d */
    private final Object f13739d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.remoteconfig.internal.p$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private int f13740a;

        /* renamed from: b */
        private Date f13741b;

        a(int i10, Date date) {
            this.f13740a = i10;
            this.f13741b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public Date m17708a() {
            return this.f13741b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m17709b() {
            return this.f13740a;
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.p$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private int f13742a;

        /* renamed from: b */
        private Date f13743b;

        public b(int i10, Date date) {
            this.f13742a = i10;
            this.f13743b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public Date m17710a() {
            return this.f13743b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m17711b() {
            return this.f13742a;
        }
    }

    public C6360p(SharedPreferences sharedPreferences) {
        this.f13736a = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public a m17691a() {
        a aVar;
        synchronized (this.f13738c) {
            aVar = new a(this.f13736a.getInt("num_failed_fetches", 0), new Date(this.f13736a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    /* renamed from: b */
    public long m17692b() {
        return this.f13736a.getLong("fetch_timeout_in_seconds", 60L);
    }

    /* renamed from: c */
    public InterfaceC13014k m17693c() {
        C6366v m17753a;
        synchronized (this.f13737b) {
            long j10 = this.f13736a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f13736a.getInt("last_fetch_status", 0);
            m17753a = C6366v.m17751b().m17755c(i10).m17756d(j10).m17754b(new C13016m.b().m42988d(this.f13736a.getLong("fetch_timeout_in_seconds", 60L)).m42989e(this.f13736a.getLong("minimum_fetch_interval_in_seconds", C6357m.f13709j)).m42987c()).m17753a();
        }
        return m17753a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m17694d() {
        return this.f13736a.getString("last_fetch_etag", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Date m17695e() {
        return new Date(this.f13736a.getLong("last_fetch_time_in_millis", -1L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public long m17696f() {
        return this.f13736a.getLong("last_template_version", 0L);
    }

    /* renamed from: g */
    public long m17697g() {
        return this.f13736a.getLong("minimum_fetch_interval_in_seconds", C6357m.f13709j);
    }

    /* renamed from: h */
    public b m17698h() {
        b bVar;
        synchronized (this.f13739d) {
            bVar = new b(this.f13736a.getInt("num_failed_realtime_streams", 0), new Date(this.f13736a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m17699i() {
        m17701k(0, f13735f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m17700j() {
        m17704n(0, f13735f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m17701k(int i10, Date date) {
        synchronized (this.f13738c) {
            this.f13736a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m17702l(String str) {
        synchronized (this.f13737b) {
            this.f13736a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m17703m(long j10) {
        synchronized (this.f13737b) {
            this.f13736a.edit().putLong("last_template_version", j10).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m17704n(int i10, Date date) {
        synchronized (this.f13739d) {
            this.f13736a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m17705o() {
        synchronized (this.f13737b) {
            this.f13736a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m17706p(Date date) {
        synchronized (this.f13737b) {
            this.f13736a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m17707q() {
        synchronized (this.f13737b) {
            this.f13736a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
