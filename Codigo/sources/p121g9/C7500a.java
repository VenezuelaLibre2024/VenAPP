package p121g9;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.util.C5005j2;
import com.google.android.gms.ads.internal.util.C5047u1;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcec;

/* renamed from: g9.a */
/* loaded from: classes.dex */
public final class C7500a {
    /* renamed from: a */
    public static final boolean m22839a(Context context, Intent intent, InterfaceC7502b interfaceC7502b, InterfaceC7511f0 interfaceC7511f0, boolean z10) {
        if (z10) {
            return m22841c(context, intent.getData(), interfaceC7502b, interfaceC7511f0);
        }
        try {
            C5047u1.m12726a("Launching an intent: " + intent.toURI());
            C4965t.m12581r();
            C5005j2.m12680s(context, intent);
            if (interfaceC7502b != null) {
                interfaceC7502b.zzg();
            }
            if (interfaceC7511f0 != null) {
                interfaceC7511f0.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            zzcec.zzj(e10.getMessage());
            if (interfaceC7511f0 != null) {
                interfaceC7511f0.zza(false);
            }
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m22840b(Context context, C7516j c7516j, InterfaceC7502b interfaceC7502b, InterfaceC7511f0 interfaceC7511f0) {
        String concat;
        int i10 = 0;
        if (c7516j != null) {
            zzbgc.zza(context);
            Intent intent = c7516j.f17758s;
            if (intent == null) {
                intent = new Intent();
                if (TextUtils.isEmpty(c7516j.f17752b)) {
                    concat = "Open GMSG did not contain a URL.";
                } else {
                    if (TextUtils.isEmpty(c7516j.f17753c)) {
                        intent.setData(Uri.parse(c7516j.f17752b));
                    } else {
                        String str = c7516j.f17752b;
                        intent.setDataAndType(Uri.parse(str), c7516j.f17753c);
                    }
                    intent.setAction("android.intent.action.VIEW");
                    if (!TextUtils.isEmpty(c7516j.f17754d)) {
                        intent.setPackage(c7516j.f17754d);
                    }
                    if (!TextUtils.isEmpty(c7516j.f17755e)) {
                        String[] split = c7516j.f17755e.split("/", 2);
                        if (split.length < 2) {
                            concat = "Could not parse component name from open GMSG: ".concat(String.valueOf(c7516j.f17755e));
                        } else {
                            intent.setClassName(split[0], split[1]);
                        }
                    }
                    String str2 = c7516j.f17756f;
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            i10 = Integer.parseInt(str2);
                        } catch (NumberFormatException unused) {
                            zzcec.zzj("Could not parse intent flags.");
                        }
                        intent.addFlags(i10);
                    }
                    if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzev)).booleanValue()) {
                        intent.addFlags(268435456);
                        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    } else {
                        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzeu)).booleanValue()) {
                            C4965t.m12581r();
                            C5005j2.m12650Q(context, intent);
                        }
                    }
                }
            }
            return m22839a(context, intent, interfaceC7502b, interfaceC7511f0, c7516j.f17760u);
        }
        concat = "No intent data for launcher overlay.";
        zzcec.zzj(concat);
        return false;
    }

    /* renamed from: c */
    private static final boolean m22841c(Context context, Uri uri, InterfaceC7502b interfaceC7502b, InterfaceC7511f0 interfaceC7511f0) {
        int i10;
        try {
            i10 = C4965t.m12581r().m12697O(context, uri);
            if (interfaceC7502b != null) {
                interfaceC7502b.zzg();
            }
        } catch (ActivityNotFoundException e10) {
            zzcec.zzj(e10.getMessage());
            i10 = 6;
        }
        if (interfaceC7511f0 != null) {
            interfaceC7511f0.zzb(i10);
        }
        return i10 == 5;
    }
}
