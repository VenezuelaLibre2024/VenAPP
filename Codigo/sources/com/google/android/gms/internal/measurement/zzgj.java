package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.h;
import eb.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgj {

    /* loaded from: classes2.dex */
    public static class zza {
        private static volatile l<zzgh> zza;

        private zza() {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: all -> 0x0056, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0018, B:12:0x0036, B:14:0x0052, B:15:0x003c, B:17:0x0042, B:20:0x0049, B:21:0x004d, B:22:0x0020, B:24:0x0028, B:28:0x0054), top: B:3:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[Catch: all -> 0x0056, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0018, B:12:0x0036, B:14:0x0052, B:15:0x003c, B:17:0x0042, B:20:0x0049, B:21:0x004d, B:22:0x0020, B:24:0x0028, B:28:0x0054), top: B:3:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static eb.l<com.google.android.gms.internal.measurement.zzgh> zza(android.content.Context r4) {
            /*
                java.lang.Class<com.google.android.gms.internal.measurement.zzgj$zza> r0 = com.google.android.gms.internal.measurement.zzgj.zza.class
                monitor-enter(r0)
                eb.l<com.google.android.gms.internal.measurement.zzgh> r1 = com.google.android.gms.internal.measurement.zzgj.zza.zza     // Catch: java.lang.Throwable -> L56
                if (r1 != 0) goto L54
                com.google.android.gms.internal.measurement.zzgj r1 = new com.google.android.gms.internal.measurement.zzgj     // Catch: java.lang.Throwable -> L56
                r1.<init>()     // Catch: java.lang.Throwable -> L56
                java.lang.String r1 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> L56
                java.lang.String r2 = android.os.Build.TAGS     // Catch: java.lang.Throwable -> L56
                java.lang.String r3 = "eng"
                boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L56
                if (r3 != 0) goto L20
                java.lang.String r3 = "userdebug"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L56
                if (r1 == 0) goto L31
            L20:
                java.lang.String r1 = "dev-keys"
                boolean r1 = r2.contains(r1)     // Catch: java.lang.Throwable -> L56
                if (r1 != 0) goto L33
                java.lang.String r1 = "test-keys"
                boolean r1 = r2.contains(r1)     // Catch: java.lang.Throwable -> L56
                if (r1 == 0) goto L31
                goto L33
            L31:
                r1 = 0
                goto L34
            L33:
                r1 = 1
            L34:
                if (r1 != 0) goto L3c
                eb.l r4 = eb.l.a()     // Catch: java.lang.Throwable -> L56
            L3a:
                r1 = r4
                goto L52
            L3c:
                boolean r1 = com.google.android.gms.internal.measurement.zzfw.zza()     // Catch: java.lang.Throwable -> L56
                if (r1 == 0) goto L4d
                boolean r1 = r4.isDeviceProtectedStorage()     // Catch: java.lang.Throwable -> L56
                if (r1 == 0) goto L49
                goto L4d
            L49:
                android.content.Context r4 = r4.createDeviceProtectedStorageContext()     // Catch: java.lang.Throwable -> L56
            L4d:
                eb.l r4 = com.google.android.gms.internal.measurement.zzgj.zza(r4)     // Catch: java.lang.Throwable -> L56
                goto L3a
            L52:
                com.google.android.gms.internal.measurement.zzgj.zza.zza = r1     // Catch: java.lang.Throwable -> L56
            L54:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
                return r1
            L56:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgj.zza.zza(android.content.Context):eb.l");
        }
    }

    private static zzgh zza(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                h hVar = new h();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        zzgc zzgcVar = new zzgc(hVar);
                        bufferedReader.close();
                        return zzgcVar;
                    }
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String zza2 = zza(split[0]);
                        String decode = Uri.decode(zza(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String zza3 = zza(split[2]);
                            str = Uri.decode(zza3);
                            if (str.length() < 1024 || str == zza3) {
                                hashMap.put(zza3, str);
                            }
                        }
                        if (!hVar.containsKey(zza2)) {
                            hVar.put(zza2, new h());
                        }
                        ((h) hVar.get(zza2)).put(decode, str);
                    }
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    static l<zzgh> zza(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            l<File> zzb = zzb(context);
            return zzb.c() ? l.d(zza(context, zzb.b())) : l.a();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }

    private static l<File> zzb(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? l.d(file) : l.a();
        } catch (RuntimeException e10) {
            Log.e("HermeticFileOverrides", "no data dir", e10);
            return l.a();
        }
    }
}
