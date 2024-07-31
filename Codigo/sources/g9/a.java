package g9;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcec;

/* loaded from: classes.dex */
public final class a {
    public static final boolean a(Context context, Intent intent, b bVar, f0 f0Var, boolean z10) {
        if (z10) {
            return c(context, intent.getData(), bVar, f0Var);
        }
        try {
            u1.a("Launching an intent: " + intent.toURI());
            com.google.android.gms.ads.internal.t.r();
            j2.s(context, intent);
            if (bVar != null) {
                bVar.zzg();
            }
            if (f0Var != null) {
                f0Var.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            zzcec.zzj(e10.getMessage());
            if (f0Var != null) {
                f0Var.zza(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, j jVar, b bVar, f0 f0Var) {
        String concat;
        int i10 = 0;
        if (jVar != null) {
            zzbgc.zza(context);
            Intent intent = jVar.f16129s;
            if (intent == null) {
                intent = new Intent();
                if (TextUtils.isEmpty(jVar.f16123b)) {
                    concat = "Open GMSG did not contain a URL.";
                } else {
                    if (TextUtils.isEmpty(jVar.f16124c)) {
                        intent.setData(Uri.parse(jVar.f16123b));
                    } else {
                        String str = jVar.f16123b;
                        intent.setDataAndType(Uri.parse(str), jVar.f16124c);
                    }
                    intent.setAction("android.intent.action.VIEW");
                    if (!TextUtils.isEmpty(jVar.f16125d)) {
                        intent.setPackage(jVar.f16125d);
                    }
                    if (!TextUtils.isEmpty(jVar.f16126e)) {
                        String[] split = jVar.f16126e.split("/", 2);
                        if (split.length < 2) {
                            concat = "Could not parse component name from open GMSG: ".concat(String.valueOf(jVar.f16126e));
                        } else {
                            intent.setClassName(split[0], split[1]);
                        }
                    }
                    String str2 = jVar.f16127f;
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            i10 = Integer.parseInt(str2);
                        } catch (NumberFormatException unused) {
                            zzcec.zzj("Could not parse intent flags.");
                        }
                        intent.addFlags(i10);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzev)).booleanValue()) {
                        intent.addFlags(268435456);
                        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeu)).booleanValue()) {
                            com.google.android.gms.ads.internal.t.r();
                            j2.Q(context, intent);
                        }
                    }
                }
            }
            return a(context, intent, bVar, f0Var, jVar.f16131u);
        }
        concat = "No intent data for launcher overlay.";
        zzcec.zzj(concat);
        return false;
    }

    private static final boolean c(Context context, Uri uri, b bVar, f0 f0Var) {
        int i10;
        try {
            i10 = com.google.android.gms.ads.internal.t.r().O(context, uri);
            if (bVar != null) {
                bVar.zzg();
            }
        } catch (ActivityNotFoundException e10) {
            zzcec.zzj(e10.getMessage());
            i10 = 6;
        }
        if (f0Var != null) {
            f0Var.zzb(i10);
        }
        return i10 == 5;
    }
}
