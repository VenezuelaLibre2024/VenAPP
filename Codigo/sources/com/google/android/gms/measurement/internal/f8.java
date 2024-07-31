package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f8 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b7 f10182a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f8(b7 b7Var) {
        this.f10182a = b7Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5 A[Catch: RuntimeException -> 0x01d2, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x01d2, blocks: (B:3:0x000b, B:5:0x0018, B:8:0x0029, B:10:0x002f, B:13:0x0040, B:19:0x00c5, B:21:0x00d1, B:24:0x00e2, B:26:0x00e8, B:29:0x00fd, B:31:0x0103, B:34:0x0110, B:36:0x0116, B:37:0x012e, B:38:0x013d, B:42:0x0144, B:46:0x0167, B:47:0x0183, B:49:0x0174, B:50:0x018a, B:52:0x0190, B:54:0x0196, B:56:0x019c, B:58:0x01a2, B:60:0x01aa, B:64:0x01b8, B:66:0x01c6, B:68:0x01cc, B:76:0x0054, B:79:0x005c, B:81:0x0064, B:83:0x006a, B:85:0x0070, B:87:0x0076, B:89:0x007e, B:91:0x0086, B:94:0x0090, B:96:0x0098, B:97:0x00a4, B:99:0x00bc), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0144 A[Catch: RuntimeException -> 0x01d2, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x01d2, blocks: (B:3:0x000b, B:5:0x0018, B:8:0x0029, B:10:0x002f, B:13:0x0040, B:19:0x00c5, B:21:0x00d1, B:24:0x00e2, B:26:0x00e8, B:29:0x00fd, B:31:0x0103, B:34:0x0110, B:36:0x0116, B:37:0x012e, B:38:0x013d, B:42:0x0144, B:46:0x0167, B:47:0x0183, B:49:0x0174, B:50:0x018a, B:52:0x0190, B:54:0x0196, B:56:0x019c, B:58:0x01a2, B:60:0x01aa, B:64:0x01b8, B:66:0x01c6, B:68:0x01cc, B:76:0x0054, B:79:0x005c, B:81:0x0064, B:83:0x006a, B:85:0x0070, B:87:0x0076, B:89:0x007e, B:91:0x0086, B:94:0x0090, B:96:0x0098, B:97:0x00a4, B:99:0x00bc), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.google.android.gms.measurement.internal.f8 r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f8.a(com.google.android.gms.measurement.internal.f8, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            try {
                this.f10182a.zzj().F().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                            }
                        }
                        data = null;
                    }
                    Uri uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        this.f10182a.f();
                        this.f10182a.zzl().y(new i8(this, bundle == null, uri, ib.Z(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                    }
                }
            } catch (RuntimeException e10) {
                this.f10182a.zzj().B().b("Throwable caught in onActivityCreated", e10);
            }
        } finally {
            this.f10182a.n().A(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f10182a.n().z(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f10182a.n().L(activity);
        da p10 = this.f10182a.p();
        p10.zzl().y(new ea(p10, p10.zzb().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        da p10 = this.f10182a.p();
        p10.zzl().y(new ga(p10, p10.zzb().b()));
        this.f10182a.n().N(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f10182a.n().M(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
