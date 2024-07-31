package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.internal.client.a0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class zzbxw implements zzbxy {
    public static zzbxy zza;
    static zzbxy zzb;
    static zzbxy zzc;
    private static final Object zzd = new Object();
    private final Context zzf;
    private final ExecutorService zzh;
    private final zzcei zzi;
    private final Object zze = new Object();
    private final WeakHashMap zzg = new WeakHashMap();

    protected zzbxw(Context context, zzcei zzceiVar) {
        zzfts.zza();
        this.zzh = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zzf = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzi = zzceiVar;
    }

    public static zzbxy zza(Context context) {
        synchronized (zzd) {
            if (zza == null) {
                if (((Boolean) zzbij.zze.zze()).booleanValue()) {
                    if (!((Boolean) a0.c().zza(zzbgc.zzhF)).booleanValue()) {
                        zza = new zzbxw(context, zzcei.zza());
                    }
                }
                zza = new zzbxx();
            }
        }
        return zza;
    }

    public static zzbxy zzb(Context context, zzcei zzceiVar) {
        synchronized (zzd) {
            if (zzc == null) {
                if (((Boolean) zzbij.zze.zze()).booleanValue()) {
                    if (!((Boolean) a0.c().zza(zzbgc.zzhF)).booleanValue()) {
                        zzbxw zzbxwVar = new zzbxw(context, zzceiVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbxwVar.zze) {
                                zzbxwVar.zzg.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzbxv(zzbxwVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbxu(zzbxwVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzc = zzbxwVar;
                    }
                }
                zzc = new zzbxx();
            }
        }
        return zzc;
    }

    public static zzbxy zzc(Context context) {
        synchronized (zzd) {
            if (zzb == null) {
                if (((Boolean) a0.c().zza(zzbgc.zzhG)).booleanValue()) {
                    if (!((Boolean) a0.c().zza(zzbgc.zzhF)).booleanValue()) {
                        zzb = new zzbxw(context, zzcei.zza());
                    }
                }
                zzb = new zzbxx();
            }
        }
        return zzb;
    }

    public static String zzd(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zze(Throwable th2) {
        return zzfxt.zzc(zzcdv.zzf(zzd(th2)));
    }

    public final void zzf(Thread thread, Throwable th2) {
        if (th2 != null) {
            boolean z10 = false;
            boolean z11 = false;
            for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
                for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                    z10 |= zzcdv.zzo(stackTraceElement.getClassName());
                    z11 |= zzbxw.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z10 || z11) {
                return;
            }
            zzh(th2, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzg(Throwable th2, String str) {
        zzh(th2, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzh(Throwable th2, String str, float f10) {
        Throwable th3;
        String str2;
        Handler handler = zzcdv.zza;
        boolean z10 = false;
        if (((Boolean) zzbij.zzf.zze()).booleanValue()) {
            th3 = th2;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th4 = th2; th4 != null; th4 = th4.getCause()) {
                linkedList.push(th4);
            }
            th3 = null;
            while (!linkedList.isEmpty()) {
                Throwable th5 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th5.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z11 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzcdv.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z11 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z11) {
                    th3 = th3 == null ? new Throwable(th5.getMessage()) : new Throwable(th5.getMessage(), th3);
                    th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th3 == null) {
            return;
        }
        String name = th2.getClass().getName();
        String zzd2 = zzd(th2);
        String zze = ((Boolean) a0.c().zza(zzbgc.zziI)).booleanValue() ? zze(th2) : "";
        double d10 = f10;
        double random = Math.random();
        int i10 = f10 > 0.0f ? (int) (1.0f / f10) : 1;
        if (random < d10) {
            ArrayList arrayList2 = new ArrayList();
            try {
                z10 = na.e.a(this.zzf).g();
            } catch (Throwable th6) {
                zzcec.zzh("Error fetching instant app info", th6);
            }
            try {
                str2 = this.zzf.getPackageName();
            } catch (Throwable unused) {
                zzcec.zzj("Cannot obtain package name, proceeding.");
                str2 = "unknown";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z10)).appendQueryParameter(FacebookMediationAdapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                str4 = str3 + " " + str4;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzi.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzd2).appendQueryParameter("eids", TextUtils.join(",", a0.a().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "610756093").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(zzbij.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(ca.g.f().a(this.zzf))).appendQueryParameter("lite", true != this.zzi.zze ? "0" : "1");
            if (!TextUtils.isEmpty(zze)) {
                appendQueryParameter2.appendQueryParameter("hash", zze);
            }
            arrayList2.add(appendQueryParameter2.toString());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxt
                    public final /* synthetic */ String zzb;

                    public /* synthetic */ zzbxt(String str5) {
                        r2 = str5;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzceh.this.zza(r2);
                    }
                });
            }
        }
    }
}
