package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class x {

    /* renamed from: c, reason: collision with root package name */
    private static final re.a f12274c = re.a.e();

    /* renamed from: d, reason: collision with root package name */
    private static x f12275d;

    /* renamed from: a, reason: collision with root package name */
    private volatile SharedPreferences f12276a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f12277b;

    public x(ExecutorService executorService) {
        this.f12277b = executorService;
    }

    private Context e() {
        try {
            zb.g.o();
            return zb.g.o().m();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized x f() {
        x xVar;
        synchronized (x.class) {
            if (f12275d == null) {
                f12275d = new x(Executors.newSingleThreadExecutor());
            }
            xVar = f12275d;
        }
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Context context) {
        if (this.f12276a != null || context == null) {
            return;
        }
        this.f12276a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    public void b(String str) {
        if (str == null) {
            f12274c.a("Key is null. Cannot clear nullable key");
        } else {
            this.f12276a.edit().remove(str).apply();
        }
    }

    public com.google.firebase.perf.util.g<Boolean> c(String str) {
        if (str == null) {
            f12274c.a("Key is null when getting boolean value on device cache.");
        } else {
            if (this.f12276a == null) {
                j(e());
                if (this.f12276a == null) {
                    return com.google.firebase.perf.util.g.a();
                }
            }
            if (!this.f12276a.contains(str)) {
                return com.google.firebase.perf.util.g.a();
            }
            try {
                return com.google.firebase.perf.util.g.e(Boolean.valueOf(this.f12276a.getBoolean(str, false)));
            } catch (ClassCastException e10) {
                f12274c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            }
        }
        return com.google.firebase.perf.util.g.a();
    }

    public com.google.firebase.perf.util.g<Double> d(String str) {
        if (str == null) {
            f12274c.a("Key is null when getting double value on device cache.");
        } else {
            if (this.f12276a == null) {
                j(e());
                if (this.f12276a == null) {
                    return com.google.firebase.perf.util.g.a();
                }
            }
            if (!this.f12276a.contains(str)) {
                return com.google.firebase.perf.util.g.a();
            }
            try {
                try {
                    return com.google.firebase.perf.util.g.e(Double.valueOf(Double.longBitsToDouble(this.f12276a.getLong(str, 0L))));
                } catch (ClassCastException e10) {
                    f12274c.b("Key %s from sharedPreferences has type other than double: %s", str, e10.getMessage());
                }
            } catch (ClassCastException unused) {
                return com.google.firebase.perf.util.g.e(Double.valueOf(Float.valueOf(this.f12276a.getFloat(str, 0.0f)).doubleValue()));
            }
        }
        return com.google.firebase.perf.util.g.a();
    }

    public com.google.firebase.perf.util.g<Long> g(String str) {
        if (str == null) {
            f12274c.a("Key is null when getting long value on device cache.");
        } else {
            if (this.f12276a == null) {
                j(e());
                if (this.f12276a == null) {
                    return com.google.firebase.perf.util.g.a();
                }
            }
            if (!this.f12276a.contains(str)) {
                return com.google.firebase.perf.util.g.a();
            }
            try {
                return com.google.firebase.perf.util.g.e(Long.valueOf(this.f12276a.getLong(str, 0L)));
            } catch (ClassCastException e10) {
                f12274c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            }
        }
        return com.google.firebase.perf.util.g.a();
    }

    public com.google.firebase.perf.util.g<String> h(String str) {
        if (str == null) {
            f12274c.a("Key is null when getting String value on device cache.");
        } else {
            if (this.f12276a == null) {
                j(e());
                if (this.f12276a == null) {
                    return com.google.firebase.perf.util.g.a();
                }
            }
            if (!this.f12276a.contains(str)) {
                return com.google.firebase.perf.util.g.a();
            }
            try {
                return com.google.firebase.perf.util.g.e(this.f12276a.getString(str, ""));
            } catch (ClassCastException e10) {
                f12274c.b("Key %s from sharedPreferences has type other than String: %s", str, e10.getMessage());
            }
        }
        return com.google.firebase.perf.util.g.a();
    }

    public synchronized void j(final Context context) {
        if (this.f12276a == null && context != null) {
            this.f12277b.execute(new Runnable() { // from class: com.google.firebase.perf.config.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.this.i(context);
                }
            });
        }
    }

    public boolean k(String str, double d10) {
        if (str == null) {
            f12274c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f12276a == null) {
            j(e());
            if (this.f12276a == null) {
                return false;
            }
        }
        this.f12276a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
        return true;
    }

    public boolean l(String str, long j10) {
        if (str == null) {
            f12274c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f12276a == null) {
            j(e());
            if (this.f12276a == null) {
                return false;
            }
        }
        this.f12276a.edit().putLong(str, j10).apply();
        return true;
    }

    public boolean m(String str, String str2) {
        if (str == null) {
            f12274c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f12276a == null) {
            j(e());
            if (this.f12276a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f12276a.edit().remove(str).apply();
            return true;
        }
        this.f12276a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean n(String str, boolean z10) {
        if (str == null) {
            f12274c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f12276a == null) {
            j(e());
            if (this.f12276a == null) {
                return false;
            }
        }
        this.f12276a.edit().putBoolean(str, z10).apply();
        return true;
    }
}
