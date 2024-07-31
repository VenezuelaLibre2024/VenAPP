package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.t0;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import g9.u;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* loaded from: classes2.dex */
public final class zzehs extends zzbwl {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdwf zzc;
    private final zzceh zzd;
    private final zzehh zze;
    private final zzflw zzf;
    private String zzg;
    private String zzh;

    public zzehs(Context context, zzehh zzehhVar, zzceh zzcehVar, zzdwf zzdwfVar, zzflw zzflwVar) {
        this.zzb = context;
        this.zzc = zzdwfVar;
        this.zzd = zzcehVar;
        this.zze = zzehhVar;
        this.zzf = zzflwVar;
    }

    public static void zzc(Context context, zzdwf zzdwfVar, zzflw zzflwVar, zzehh zzehhVar, String str, String str2, Map map) {
        String zza;
        String str3 = true != t.q().zzz(context) ? "offline" : androidx.browser.customtabs.b.ONLINE_EXTRAS_KEY;
        if (((Boolean) a0.c().zza(zzbgc.zziz)).booleanValue() || zzdwfVar == null) {
            zzflv zzb = zzflv.zzb(str2);
            zzb.zza("gqi", str);
            zzb.zza("device_connectivity", str3);
            zzb.zza("event_timestamp", String.valueOf(t.b().a()));
            for (Map.Entry entry : map.entrySet()) {
                zzb.zza((String) entry.getKey(), (String) entry.getValue());
            }
            zza = zzflwVar.zza(zzb);
        } else {
            zzdwe zza2 = zzdwfVar.zza();
            zza2.zzb("gqi", str);
            zza2.zzb("action", str2);
            zza2.zzb("device_connectivity", str3);
            zza2.zzb("event_timestamp", String.valueOf(t.b().a()));
            for (Map.Entry entry2 : map.entrySet()) {
                zza2.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            zza = zza2.zzf();
        }
        zzehhVar.zzd(new zzehj(t.b().a(), str, zza, 2));
    }

    public static final PendingIntent zzq(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return zzfuj.zzb(context, 0, intent, zzfuj.zza | 1073741824, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return zzfuj.zza(context, 0, intent, 201326592);
    }

    private static String zzr(int i10, String str) {
        Resources zze = t.q().zze();
        return zze == null ? str : zze.getString(i10);
    }

    private final void zzs(String str, String str2, Map map) {
        zzc(this.zzb, this.zzc, this.zzf, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzt() {
        /*
            r6 = this;
            com.google.android.gms.ads.internal.t.r()     // Catch: android.os.RemoteException -> L40
            android.content.Context r0 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.ads.internal.util.v0 r0 = com.google.android.gms.ads.internal.util.j2.a0(r0)     // Catch: android.os.RemoteException -> L40
            android.content.Context r1 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.d.h2(r1)     // Catch: android.os.RemoteException -> L40
            f9.a r2 = new f9.a     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = r6.zzh     // Catch: android.os.RemoteException -> L40
            java.lang.String r4 = r6.zzg     // Catch: android.os.RemoteException -> L40
            java.util.Map r5 = r6.zza     // Catch: android.os.RemoteException -> L40
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.internal.ads.zzegz r5 = (com.google.android.gms.internal.ads.zzegz) r5     // Catch: android.os.RemoteException -> L40
            if (r5 != 0) goto L22
            java.lang.String r5 = ""
            goto L26
        L22:
            java.lang.String r5 = r5.zzc()     // Catch: android.os.RemoteException -> L40
        L26:
            r2.<init>(r3, r4, r5)     // Catch: android.os.RemoteException -> L40
            boolean r1 = r0.zzg(r1, r2)     // Catch: android.os.RemoteException -> L40
            if (r1 != 0) goto L47
            android.content.Context r2 = r6.zzb     // Catch: android.os.RemoteException -> L3e
            com.google.android.gms.dynamic.b r2 = com.google.android.gms.dynamic.d.h2(r2)     // Catch: android.os.RemoteException -> L3e
            java.lang.String r3 = r6.zzh     // Catch: android.os.RemoteException -> L3e
            java.lang.String r4 = r6.zzg     // Catch: android.os.RemoteException -> L3e
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch: android.os.RemoteException -> L3e
            goto L47
        L3e:
            r0 = move-exception
            goto L42
        L40:
            r0 = move-exception
            r1 = 0
        L42:
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.internal.ads.zzcec.zzh(r2, r0)
        L47:
            if (r1 != 0) goto L5b
            com.google.android.gms.internal.ads.zzehh r0 = r6.zze
            java.lang.String r1 = r6.zzg
            r0.zzc(r1)
            java.lang.String r0 = r6.zzg
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzgad r2 = com.google.android.gms.internal.ads.zzgad.zzd()
            r6.zzs(r0, r1, r2)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehs.zzt():void");
    }

    private final void zzu(Activity activity, u uVar) {
        t.r();
        if (t0.f(activity).a()) {
            zzt();
            zzv(activity, uVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzs(this.zzg, "asnpdi", zzgad.zzd());
                return;
            }
            t.r();
            AlertDialog.Builder j10 = j2.j(activity);
            j10.setTitle(zzr(d9.d.f13862f, "Allow app to send you notifications?")).setPositiveButton(zzr(d9.d.f13860d, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzehl
                public final /* synthetic */ Activity zzb;
                public final /* synthetic */ u zzc;

                public /* synthetic */ zzehl(Activity activity2, u uVar2) {
                    r2 = activity2;
                    r3 = uVar2;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzehs.this.zzd(r2, r3, dialogInterface, i10);
                }
            }).setNegativeButton(zzr(d9.d.f13861e, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzehm
                public final /* synthetic */ u zzb;

                public /* synthetic */ zzehm(u uVar2) {
                    r2 = uVar2;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzehs.this.zzk(r2, dialogInterface, i10);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzehn
                public final /* synthetic */ u zzb;

                public /* synthetic */ zzehn(u uVar2) {
                    r2 = uVar2;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzehs.this.zzl(r2, dialogInterface);
                }
            });
            j10.create().show();
            zzs(this.zzg, "rtsdi", zzgad.zzd());
        }
    }

    private final void zzv(Activity activity, u uVar) {
        AlertDialog create;
        t.r();
        AlertDialog.Builder onCancelListener = j2.j(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzehk
            public /* synthetic */ zzehk() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                u uVar2 = u.this;
                if (uVar2 != null) {
                    uVar2.zzb();
                }
            }
        });
        int i10 = d9.c.f13856a;
        Resources zze = t.q().zze();
        XmlResourceParser layout = zze == null ? null : zze.getLayout(i10);
        if (layout == null) {
            onCancelListener.setMessage(zzr(d9.d.f13863g, "You'll get a notification with the link when you're back online"));
            create = onCancelListener.create();
        } else {
            View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(inflate);
            zzegz zzegzVar = (zzegz) this.zza.get(this.zzg);
            String zzb = zzegzVar == null ? "" : zzegzVar.zzb();
            if (!zzb.isEmpty()) {
                TextView textView = (TextView) inflate.findViewById(d9.b.f13854a);
                textView.setVisibility(0);
                textView.setText(zzb);
            }
            zzegz zzegzVar2 = (zzegz) this.zza.get(this.zzg);
            Drawable zza = zzegzVar2 != null ? zzegzVar2.zza() : null;
            if (zza != null) {
                ((ImageView) inflate.findViewById(d9.b.f13855b)).setImageDrawable(zza);
            }
            create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzehr(this, create, timer, uVar), 3000L);
    }

    public final /* synthetic */ void zzd(Activity activity, u uVar, DialogInterface dialogInterface, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzs(this.zzg, "rtsdc", hashMap);
        activity.startActivity(t.s().e(activity));
        zzt();
        if (uVar != null) {
            uVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zzz = t.q().zzz(this.zzb);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == zzz ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zzb.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzs(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (r8 == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    zzehh.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e10) {
                zzcec.zzg("Failed to get writable offline buffering database: ".concat(e10.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzf(String[] strArr, int[] iArr, com.google.android.gms.dynamic.b bVar) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                zzehu zzehuVar = (zzehu) com.google.android.gms.dynamic.d.g2(bVar);
                Activity zza = zzehuVar.zza();
                u zzb = zzehuVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i10] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzt();
                    zzv(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzs(this.zzg, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzg(com.google.android.gms.dynamic.b bVar) {
        zzehu zzehuVar = (zzehu) com.google.android.gms.dynamic.d.g2(bVar);
        Activity zza = zzehuVar.zza();
        u zzb = zzehuVar.zzb();
        this.zzg = zzehuVar.zzc();
        this.zzh = zzehuVar.zzd();
        if (((Boolean) a0.c().zza(zzbgc.zzip)).booleanValue()) {
            zzu(zza, zzb);
            return;
        }
        zzs(this.zzg, "dialog_impression", zzgad.zzd());
        t.r();
        AlertDialog.Builder j10 = j2.j(zza);
        j10.setTitle(zzr(d9.d.f13868l, "Open ad when you're back online.")).setMessage(zzr(d9.d.f13867k, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzr(d9.d.f13865i, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeho
            public final /* synthetic */ Activity zzb;
            public final /* synthetic */ u zzc;

            public /* synthetic */ zzeho(Activity zza2, u zzb2) {
                r2 = zza2;
                r3 = zzb2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                zzehs.this.zzm(r2, r3, dialogInterface, i10);
            }
        }).setNegativeButton(zzr(d9.d.f13866j, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzehp
            public final /* synthetic */ u zzb;

            public /* synthetic */ zzehp(u zzb2) {
                r2 = zzb2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                zzehs.this.zzn(r2, dialogInterface, i10);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzehq
            public final /* synthetic */ u zzb;

            public /* synthetic */ zzehq(u zzb2) {
                r2 = zzb2;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzehs.this.zzo(r2, dialogInterface);
            }
        });
        j10.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzh() {
        this.zze.zze(new zzfkp() { // from class: com.google.android.gms.internal.ads.zzeha
            public /* synthetic */ zzeha() {
            }

            @Override // com.google.android.gms.internal.ads.zzfkp
            public final Object zza(Object obj) {
                zzehh.zzb(zzceh.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzi(com.google.android.gms.dynamic.b bVar, String str, String str2) {
        zzj(bVar, new f9.a(str, str2, ""));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(9:5|6|(2:18|19)|8|9|10|11|12|13)|24|(0)|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c6, code lost:
    
        r8.put("notification_not_shown_reason", r7.getMessage());
        r7 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbwm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(com.google.android.gms.dynamic.b r7, f9.a r8) {
        /*
            r6 = this;
            java.lang.Object r7 = com.google.android.gms.dynamic.d.g2(r7)
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r0 = r8.f15056a
            java.lang.String r1 = r8.f15057b
            java.lang.String r8 = r8.f15058c
            com.google.android.gms.ads.internal.util.c r2 = com.google.android.gms.ads.internal.t.s()
            java.lang.String r3 = "offline_notification_channel"
            java.lang.String r4 = "AdMob Offline Notifications"
            r2.f(r7, r3, r4)
            java.lang.String r2 = "offline_notification_clicked"
            android.app.PendingIntent r2 = zzq(r7, r2, r1, r0)
            java.lang.String r4 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = zzq(r7, r4, r1, r0)
            androidx.core.app.o$e r4 = new androidx.core.app.o$e
            r4.<init>(r7, r3)
            int r3 = d9.d.f13864h
            java.lang.String r5 = "View the ad you saved when you were offline"
            java.lang.String r3 = zzr(r3, r5)
            androidx.core.app.o$e r3 = r4.n(r3)
            r4 = 1
            androidx.core.app.o$e r3 = r3.g(r4)
            androidx.core.app.o$e r0 = r3.p(r0)
            androidx.core.app.o$e r0 = r0.l(r2)
            android.content.pm.ApplicationInfo r2 = r7.getApplicationInfo()
            int r2 = r2.icon
            androidx.core.app.o$e r0 = r0.F(r2)
            com.google.android.gms.internal.ads.zzbfu r2 = com.google.android.gms.internal.ads.zzbgc.zziq
            com.google.android.gms.internal.ads.zzbga r3 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            androidx.core.app.o$e r0 = r0.B(r2)
            android.content.pm.ApplicationInfo r2 = r7.getApplicationInfo()
            int r2 = r2.icon
            androidx.core.app.o$e r0 = r0.F(r2)
            com.google.android.gms.internal.ads.zzbfu r2 = com.google.android.gms.internal.ads.zzbgc.zzis
            com.google.android.gms.internal.ads.zzbga r3 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L94
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L94
            java.net.URL r2 = new java.net.URL     // Catch: java.io.IOException -> L94
            r2.<init>(r8)     // Catch: java.io.IOException -> L94
            java.net.URLConnection r8 = r2.openConnection()     // Catch: java.io.IOException -> L94
            java.io.InputStream r8 = r8.getInputStream()     // Catch: java.io.IOException -> L94
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch: java.io.IOException -> L94
            goto L95
        L94:
            r8 = r3
        L95:
            if (r8 == 0) goto Lab
            androidx.core.app.o$e r2 = r0.v(r8)     // Catch: android.content.res.Resources.NotFoundException -> Lab
            androidx.core.app.o$b r4 = new androidx.core.app.o$b     // Catch: android.content.res.Resources.NotFoundException -> Lab
            r4.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lab
            androidx.core.app.o$b r8 = r4.p(r8)     // Catch: android.content.res.Resources.NotFoundException -> Lab
            androidx.core.app.o$b r8 = r8.o(r3)     // Catch: android.content.res.Resources.NotFoundException -> Lab
            r2.H(r8)     // Catch: android.content.res.Resources.NotFoundException -> Lab
        Lab:
            java.lang.String r8 = "notification"
            java.lang.Object r7 = r7.getSystemService(r8)
            android.app.NotificationManager r7 = (android.app.NotificationManager) r7
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            android.app.Notification r0 = r0.c()     // Catch: java.lang.IllegalArgumentException -> Lc5
            r2 = 54321(0xd431, float:7.612E-41)
            r7.notify(r1, r2, r0)     // Catch: java.lang.IllegalArgumentException -> Lc5
            java.lang.String r7 = "offline_notification_impression"
            goto Ld1
        Lc5:
            r7 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r7 = r7.getMessage()
            r8.put(r0, r7)
            java.lang.String r7 = "offline_notification_failed"
        Ld1:
            r6.zzs(r1, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehs.zzj(com.google.android.gms.dynamic.b, f9.a):void");
    }

    public final /* synthetic */ void zzk(u uVar, DialogInterface dialogInterface, int i10) {
        this.zze.zzc(this.zzg);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzs(this.zzg, "rtsdc", hashMap);
        if (uVar != null) {
            uVar.zzb();
        }
    }

    public final /* synthetic */ void zzl(u uVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzg);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzs(this.zzg, "rtsdc", hashMap);
        if (uVar != null) {
            uVar.zzb();
        }
    }

    public final /* synthetic */ void zzm(Activity activity, u uVar, DialogInterface dialogInterface, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzs(this.zzg, "dialog_click", hashMap);
        zzu(activity, uVar);
    }

    public final /* synthetic */ void zzn(u uVar, DialogInterface dialogInterface, int i10) {
        this.zze.zzc(this.zzg);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzs(this.zzg, "dialog_click", hashMap);
        if (uVar != null) {
            uVar.zzb();
        }
    }

    public final /* synthetic */ void zzo(u uVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzg);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzs(this.zzg, "dialog_click", hashMap);
        if (uVar != null) {
            uVar.zzb();
        }
    }

    public final void zzp(String str, zzdna zzdnaVar) {
        String str2 = "";
        String zzx = !TextUtils.isEmpty(zzdnaVar.zzx()) ? zzdnaVar.zzx() : zzdnaVar.zzB() != null ? zzdnaVar.zzB() : "";
        zzbjm zzm = zzdnaVar.zzm();
        if (zzm != null) {
            try {
                str2 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbjm zzn = zzdnaVar.zzn();
        Drawable drawable = null;
        if (zzn != null) {
            try {
                com.google.android.gms.dynamic.b zzf = zzn.zzf();
                if (zzf != null) {
                    drawable = (Drawable) com.google.android.gms.dynamic.d.g2(zzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzegv(zzx, str2, drawable));
    }
}
