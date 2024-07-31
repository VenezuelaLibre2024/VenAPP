package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.t;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzeri implements zzexp {
    public final Context zza;
    public final z4 zzb;
    public final List zzc;

    public zzeri(Context context, z4 z4Var, List list) {
        this.zza = context;
        this.zzb = z4Var;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        ComponentName componentName2;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzbie.zza.zze()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            t.r();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null) {
                    componentName = runningTaskInfo.topActivity;
                    if (componentName != null) {
                        componentName2 = runningTaskInfo.topActivity;
                        str = componentName2.getClassName();
                    }
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", str);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.zzb.f8835e);
            bundle3.putInt("height", this.zzb.f8832b);
            bundle2.putBundle("size", bundle3);
            if (!this.zzc.isEmpty()) {
                List list = this.zzc;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
