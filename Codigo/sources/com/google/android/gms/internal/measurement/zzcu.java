package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.b;
import java.util.Map;

/* loaded from: classes2.dex */
public interface zzcu extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(zzcv zzcvVar);

    void getAppInstanceId(zzcv zzcvVar);

    void getCachedAppInstanceId(zzcv zzcvVar);

    void getConditionalUserProperties(String str, String str2, zzcv zzcvVar);

    void getCurrentScreenClass(zzcv zzcvVar);

    void getCurrentScreenName(zzcv zzcvVar);

    void getGmpAppId(zzcv zzcvVar);

    void getMaxUserProperties(String str, zzcv zzcvVar);

    void getSessionId(zzcv zzcvVar);

    void getTestFlag(zzcv zzcvVar, int i10);

    void getUserProperties(String str, String str2, boolean z10, zzcv zzcvVar);

    void initForTests(Map map);

    void initialize(b bVar, zzdd zzddVar, long j10);

    void isDataCollectionEnabled(zzcv zzcvVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcvVar, long j10);

    void logHealthData(int i10, String str, b bVar, b bVar2, b bVar3);

    void onActivityCreated(b bVar, Bundle bundle, long j10);

    void onActivityDestroyed(b bVar, long j10);

    void onActivityPaused(b bVar, long j10);

    void onActivityResumed(b bVar, long j10);

    void onActivitySaveInstanceState(b bVar, zzcv zzcvVar, long j10);

    void onActivityStarted(b bVar, long j10);

    void onActivityStopped(b bVar, long j10);

    void performAction(Bundle bundle, zzcv zzcvVar, long j10);

    void registerOnMeasurementEventListener(zzda zzdaVar);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(b bVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzda zzdaVar);

    void setInstanceIdProvider(zzdb zzdbVar);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, b bVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(zzda zzdaVar);
}
