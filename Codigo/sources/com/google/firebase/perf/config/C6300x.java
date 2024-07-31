package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.perf.util.C6333g;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p485zb.C12867g;
import re.C10696a;

/* renamed from: com.google.firebase.perf.config.x */
/* loaded from: classes.dex */
public class C6300x {

    /* renamed from: c */
    private static final C10696a f13493c = C10696a.m32565e();

    /* renamed from: d */
    private static C6300x f13494d;

    /* renamed from: a */
    private volatile SharedPreferences f13495a;

    /* renamed from: b */
    private final ExecutorService f13496b;

    public C6300x(ExecutorService executorService) {
        this.f13496b = executorService;
    }

    /* renamed from: e */
    private Context m17348e() {
        try {
            C12867g.m42617o();
            return C12867g.m42617o().m42630m();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static synchronized C6300x m17349f() {
        C6300x c6300x;
        synchronized (C6300x.class) {
            if (f13494d == null) {
                f13494d = new C6300x(Executors.newSingleThreadExecutor());
            }
            c6300x = f13494d;
        }
        return c6300x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m17350i(Context context) {
        if (this.f13495a != null || context == null) {
            return;
        }
        this.f13495a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    /* renamed from: b */
    public void m17351b(String str) {
        if (str == null) {
            f13493c.m32566a("Key is null. Cannot clear nullable key");
        } else {
            this.f13495a.edit().remove(str).apply();
        }
    }

    /* renamed from: c */
    public C6333g<Boolean> m17352c(String str) {
        if (str == null) {
            f13493c.m32566a("Key is null when getting boolean value on device cache.");
        } else {
            if (this.f13495a == null) {
                m17356j(m17348e());
                if (this.f13495a == null) {
                    return C6333g.m17519a();
                }
            }
            if (!this.f13495a.contains(str)) {
                return C6333g.m17519a();
            }
            try {
                return C6333g.m17521e(Boolean.valueOf(this.f13495a.getBoolean(str, false)));
            } catch (ClassCastException e10) {
                f13493c.m32567b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            }
        }
        return C6333g.m17519a();
    }

    /* renamed from: d */
    public C6333g<Double> m17353d(String str) {
        if (str == null) {
            f13493c.m32566a("Key is null when getting double value on device cache.");
        } else {
            if (this.f13495a == null) {
                m17356j(m17348e());
                if (this.f13495a == null) {
                    return C6333g.m17519a();
                }
            }
            if (!this.f13495a.contains(str)) {
                return C6333g.m17519a();
            }
            try {
                try {
                    return C6333g.m17521e(Double.valueOf(Double.longBitsToDouble(this.f13495a.getLong(str, 0L))));
                } catch (ClassCastException e10) {
                    f13493c.m32567b("Key %s from sharedPreferences has type other than double: %s", str, e10.getMessage());
                }
            } catch (ClassCastException unused) {
                return C6333g.m17521e(Double.valueOf(Float.valueOf(this.f13495a.getFloat(str, 0.0f)).doubleValue()));
            }
        }
        return C6333g.m17519a();
    }

    /* renamed from: g */
    public C6333g<Long> m17354g(String str) {
        if (str == null) {
            f13493c.m32566a("Key is null when getting long value on device cache.");
        } else {
            if (this.f13495a == null) {
                m17356j(m17348e());
                if (this.f13495a == null) {
                    return C6333g.m17519a();
                }
            }
            if (!this.f13495a.contains(str)) {
                return C6333g.m17519a();
            }
            try {
                return C6333g.m17521e(Long.valueOf(this.f13495a.getLong(str, 0L)));
            } catch (ClassCastException e10) {
                f13493c.m32567b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            }
        }
        return C6333g.m17519a();
    }

    /* renamed from: h */
    public C6333g<String> m17355h(String str) {
        if (str == null) {
            f13493c.m32566a("Key is null when getting String value on device cache.");
        } else {
            if (this.f13495a == null) {
                m17356j(m17348e());
                if (this.f13495a == null) {
                    return C6333g.m17519a();
                }
            }
            if (!this.f13495a.contains(str)) {
                return C6333g.m17519a();
            }
            try {
                return C6333g.m17521e(this.f13495a.getString(str, ""));
            } catch (ClassCastException e10) {
                f13493c.m32567b("Key %s from sharedPreferences has type other than String: %s", str, e10.getMessage());
            }
        }
        return C6333g.m17519a();
    }

    /* renamed from: j */
    public synchronized void m17356j(final Context context) {
        if (this.f13495a == null && context != null) {
            this.f13496b.execute(new Runnable() { // from class: com.google.firebase.perf.config.w
                @Override // java.lang.Runnable
                public final void run() {
                    C6300x.this.m17350i(context);
                }
            });
        }
    }

    /* renamed from: k */
    public boolean m17357k(String str, double d10) {
        if (str == null) {
            f13493c.m32566a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f13495a == null) {
            m17356j(m17348e());
            if (this.f13495a == null) {
                return false;
            }
        }
        this.f13495a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
        return true;
    }

    /* renamed from: l */
    public boolean m17358l(String str, long j10) {
        if (str == null) {
            f13493c.m32566a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f13495a == null) {
            m17356j(m17348e());
            if (this.f13495a == null) {
                return false;
            }
        }
        this.f13495a.edit().putLong(str, j10).apply();
        return true;
    }

    /* renamed from: m */
    public boolean m17359m(String str, String str2) {
        if (str == null) {
            f13493c.m32566a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f13495a == null) {
            m17356j(m17348e());
            if (this.f13495a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f13495a.edit().remove(str).apply();
            return true;
        }
        this.f13495a.edit().putString(str, str2).apply();
        return true;
    }

    /* renamed from: n */
    public boolean m17360n(String str, boolean z10) {
        if (str == null) {
            f13493c.m32566a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f13495a == null) {
            m17356j(m17348e());
            if (this.f13495a == null) {
                return false;
            }
        }
        this.f13495a.edit().putBoolean(str, z10).apply();
        return true;
    }
}
