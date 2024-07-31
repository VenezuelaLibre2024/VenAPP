package com.google.android.gms.internal.mlkit_common;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzo {
    private static final Method zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Field zzd;
    private static final Field zze;
    private static final Field zzf;
    private static final Object zzg;
    private static final Throwable zzh;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    static {
        Throwable th2;
        Object obj;
        Field field;
        Method method;
        Method method2;
        Method method3;
        ?? r72;
        Field field2;
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        try {
            cls = Class.forName("libcore.io.Libcore");
            cls2 = Class.forName("libcore.io.StructStat");
            Class<?> cls4 = Class.forName("libcore.io.OsConstants");
            cls3 = Class.forName("libcore.io.ForwardingOs");
            method = cls4.getDeclaredMethod("S_ISLNK", Integer.TYPE);
        } catch (Throwable th3) {
            th2 = th3;
            obj = null;
            field = null;
            method = null;
            method2 = null;
        }
        try {
            method.setAccessible(true);
            method3 = cls3.getDeclaredMethod("lstat", String.class);
            try {
                method2 = cls3.getDeclaredMethod("fstat", FileDescriptor.class);
                try {
                    Field declaredField = cls.getDeclaredField("os");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(cls);
                } catch (Throwable th4) {
                    th2 = th4;
                    obj = null;
                    field = null;
                }
                try {
                    r72 = cls2.getField("st_dev");
                    try {
                        field2 = cls2.getField("st_ino");
                        try {
                            field = cls2.getField("st_mode");
                        } catch (Throwable th5) {
                            th2 = th5;
                            field = null;
                        }
                        try {
                            r72.setAccessible(true);
                            field2.setAccessible(true);
                            field.setAccessible(true);
                        } catch (Throwable th6) {
                            th2 = th6;
                            try {
                                Log.d("StructStatHelper", "Reflection failed", th2);
                                zza = method;
                                zzb = method3;
                                zzc = method2;
                                zzd = r72;
                                zze = field2;
                                zzf = field;
                                zzg = obj;
                                zzh = th2;
                            } finally {
                                zza = method;
                                zzb = method3;
                                zzc = method2;
                                zzd = r72;
                                zze = field2;
                                zzf = field;
                                zzg = obj;
                                zzh = null;
                            }
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        field = null;
                        field2 = null;
                    }
                } catch (Throwable th8) {
                    th2 = th8;
                    field = null;
                    r72 = field;
                    field2 = r72;
                    Log.d("StructStatHelper", "Reflection failed", th2);
                    zza = method;
                    zzb = method3;
                    zzc = method2;
                    zzd = r72;
                    zze = field2;
                    zzf = field;
                    zzg = obj;
                    zzh = th2;
                }
            } catch (Throwable th9) {
                th2 = th9;
                obj = null;
                field = null;
                method2 = null;
                r72 = 0;
            }
        } catch (Throwable th10) {
            th2 = th10;
            obj = null;
            field = null;
            method2 = null;
            method3 = method2;
            r72 = method3;
            field2 = r72;
            Log.d("StructStatHelper", "Reflection failed", th2);
            zza = method;
            zzb = method3;
            zzc = method2;
            zzd = r72;
            zze = field2;
            zzf = field;
            zzg = obj;
            zzh = th2;
        }
    }

    static zzq zza(final FileDescriptor fileDescriptor) {
        return (zzq) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzq zze2;
                zze2 = zzo.zze(zzo.zzc.invoke(zzo.zzg, fileDescriptor));
                return zze2;
            }
        });
    }

    static zzq zzd(final String str) {
        return (zzq) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzq zze2;
                zze2 = zzo.zze(zzo.zzb.invoke(zzo.zzg, str));
                return zze2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzq zze(Object obj) {
        return new zzq(((Long) zzd.get(obj)).longValue(), ((Long) zze.get(obj)).longValue(), ((Boolean) zza.invoke(null, Integer.valueOf(((Integer) zzf.get(obj)).intValue()))).booleanValue());
    }

    private static Object zzf(Callable callable) {
        try {
            Throwable th2 = zzh;
            if (th2 == null) {
                return callable.call();
            }
            throw new IOException(th2);
        } catch (Throwable th3) {
            throw new IOException(th3);
        }
    }
}
