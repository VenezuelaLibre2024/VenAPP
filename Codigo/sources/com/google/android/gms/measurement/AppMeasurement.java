package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.w5;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import wa.b0;
import wa.q;

@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f9917b;

    /* renamed from: a, reason: collision with root package name */
    private final a f9918a;

    /* loaded from: classes2.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            s.j(bundle);
            this.mAppId = (String) q.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) q.a(bundle, "origin", String.class, null);
            this.mName = (String) q.a(bundle, "name", String.class, null);
            this.mValue = q.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) q.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) q.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) q.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) q.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) q.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) q.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) q.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) q.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) q.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) q.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) q.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) q.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static abstract class a implements b0 {
        private a() {
        }
    }

    private AppMeasurement(w5 w5Var) {
        this.f9918a = new com.google.android.gms.measurement.a(w5Var);
    }

    private AppMeasurement(b0 b0Var) {
        this.f9918a = new c(b0Var);
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f9917b == null) {
            synchronized (AppMeasurement.class) {
                if (f9917b == null) {
                    b0 b10 = b(context, null);
                    if (b10 != null) {
                        f9917b = new AppMeasurement(b10);
                    } else {
                        f9917b = new AppMeasurement(w5.a(context, new zzdd(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f9917b;
    }

    private static b0 b(Context context, Bundle bundle) {
        return (b0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f9918a.zzb(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f9918a.a(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f9918a.zzc(str);
    }

    @Keep
    public long generateEventId() {
        return this.f9918a.zza();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f9918a.zzf();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> b10 = this.f9918a.b(str, str2);
        ArrayList arrayList = new ArrayList(b10 == null ? 0 : b10.size());
        Iterator<Bundle> it = b10.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f9918a.zzg();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f9918a.zzh();
    }

    @Keep
    public String getGmpAppId() {
        return this.f9918a.zzi();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f9918a.zza(str);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f9918a.d(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f9918a.c(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        s.j(conditionalUserProperty);
        a aVar = this.f9918a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            q.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.zza(bundle);
    }
}
