package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import wa.b0;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: c */
    private static volatile FirebaseAnalytics f11583c;

    /* renamed from: a */
    private final zzdf f11584a;

    /* renamed from: b */
    private ExecutorService f11585b;

    /* loaded from: classes.dex */
    public enum a {
        GRANTED,
        DENIED
    }

    /* loaded from: classes.dex */
    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    private FirebaseAnalytics(zzdf zzdfVar) {
        s.j(zzdfVar);
        this.f11584a = zzdfVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f11583c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f11583c == null) {
                    f11583c = new FirebaseAnalytics(zzdf.zza(context));
                }
            }
        }
        return f11583c;
    }

    @Keep
    public static b0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzdf zza = zzdf.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zza == null) {
            return null;
        }
        return new c(zza);
    }

    private final ExecutorService l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.f11585b == null) {
                this.f11585b = new com.google.firebase.analytics.b(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f11585b;
        }
        return executorService;
    }

    public final Task<String> a() {
        try {
            return Tasks.call(l(), new com.google.firebase.analytics.a(this));
        } catch (RuntimeException e10) {
            this.f11584a.zza(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            return Tasks.forException(e10);
        }
    }

    public final Task<Long> b() {
        try {
            return Tasks.call(l(), new d(this));
        } catch (RuntimeException e10) {
            this.f11584a.zza(5, "Failed to schedule task for getSessionId", (Object) null, (Object) null, (Object) null);
            return Tasks.forException(e10);
        }
    }

    public final void c(String str, Bundle bundle) {
        this.f11584a.zza(str, bundle);
    }

    public final void d() {
        this.f11584a.zzj();
    }

    public final void e(boolean z10) {
        this.f11584a.zza(Boolean.valueOf(z10));
    }

    public final void f(Map<b, a> map) {
        Bundle bundle = new Bundle();
        a aVar = map.get(b.AD_STORAGE);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int ordinal3 = aVar3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int ordinal4 = aVar4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f11584a.zzc(bundle);
    }

    public final void g(Bundle bundle) {
        this.f11584a.zzd(bundle);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(com.google.firebase.installations.c.s().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public final void h(long j10) {
        this.f11584a.zza(j10);
    }

    public final void i(String str) {
        this.f11584a.zzd(str);
    }

    public final void j(String str, String str2) {
        this.f11584a.zzb(str, str2);
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f11584a.zza(activity, str, str2);
    }
}
