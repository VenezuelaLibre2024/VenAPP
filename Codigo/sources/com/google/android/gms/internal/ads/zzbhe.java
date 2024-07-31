package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbhe extends androidx.browser.customtabs.b {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) a0.c().zza(zzbgc.zzjD)).split(","));
    private final zzbhh zzc;
    private final androidx.browser.customtabs.b zzd;

    public zzbhe(zzbhh zzbhhVar, androidx.browser.customtabs.b bVar) {
        this.zzd = bVar;
        this.zzc = zzbhhVar;
    }

    @Override // androidx.browser.customtabs.b
    public final void extraCallback(String str, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            bVar.extraCallback(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            return bVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.b
    public final void onActivityResized(int i10, int i11, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onActivityResized(i10, i11, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onMessageChannelReady(bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onNavigationEvent(int i10, Bundle bundle) {
        List list;
        this.zza.set(false);
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onNavigationEvent(i10, bundle);
        }
        this.zzc.zzi(t.b().a());
        if (this.zzc == null || (list = this.zzb) == null || !list.contains(String.valueOf(i10))) {
            return;
        }
        this.zzc.zzf();
    }

    @Override // androidx.browser.customtabs.b
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                this.zzc.zzh(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e10) {
            u1.b("Message is not in JSON format: ", e10);
        }
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onPostMessage(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onRelationshipValidationResult(i10, uri, z10, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
