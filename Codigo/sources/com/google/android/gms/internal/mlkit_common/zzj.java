package com.google.android.gms.internal.mlkit_common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import androidx.core.content.a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzj {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] zzc;
    private static final String[] zzd;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        String str = Build.HARDWARE;
        strArr[1] = true != (str.equals("goldfish") || str.equals("ranchu")) ? "" : "androidx.test.services.storage.runfiles";
        zzc = strArr;
        String[] strArr2 = new String[3];
        int i10 = Build.VERSION.SDK_INT;
        strArr2[0] = i10 <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : "";
        strArr2[1] = i10 <= 25 ? "com.google.android.inputmethod.latin.dev.inputcontent" : "";
        strArr2[2] = "com.google.android.apps.docs.storage.legacy";
        zzd = strArr2;
    }

    public static AssetFileDescriptor zza(Context context, Uri uri, String str) {
        zzi zziVar = zzi.zza;
        ContentResolver contentResolver = context.getContentResolver();
        Uri zzc2 = zzc(uri);
        String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(zzc2, "r");
        }
        if ("content".equals(scheme)) {
            if (!zzi(context, zzc2, 1, zziVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(zzc2, "r");
            zzd(openAssetFileDescriptor);
            return openAssetFileDescriptor;
        }
        if (!Constants.FILE.equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(zzc2, "r");
        zzd(openAssetFileDescriptor2);
        try {
            zzh(context, openAssetFileDescriptor2.getParcelFileDescriptor(), zzc2, zziVar);
            return openAssetFileDescriptor2;
        } catch (FileNotFoundException e10) {
            zzf(openAssetFileDescriptor2, e10);
            throw e10;
        } catch (IOException e11) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e11);
            zzf(openAssetFileDescriptor2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    public static InputStream zzb(Context context, Uri uri, zzi zziVar) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri zzc2 = zzc(uri);
        String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(zzc2);
        }
        if ("content".equals(scheme)) {
            if (!zzi(context, zzc2, 1, zziVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            InputStream openInputStream = contentResolver.openInputStream(zzc2);
            zzd(openInputStream);
            return openInputStream;
        }
        if (!Constants.FILE.equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        try {
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(zzc2.getPath()).getCanonicalFile()), "r");
            try {
                zzh(context, openFileDescriptor, zzc2, zziVar);
                return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
            } catch (FileNotFoundException e10) {
                zzg(openFileDescriptor, e10);
                throw e10;
            } catch (IOException e11) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e11);
                zzg(openFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        } catch (IOException e12) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e12);
            throw fileNotFoundException2;
        }
    }

    private static Uri zzc(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    private static Object zzd(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }

    private static String zze(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    private static void zzf(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e10) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(fileNotFoundException, e10);
        }
    }

    private static void zzg(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e10) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(fileNotFoundException, e10);
        }
    }

    private static void zzh(final Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, zzi zziVar) {
        boolean z10;
        File dataDir;
        String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        zzq zza2 = zzq.zza(parcelFileDescriptor.getFileDescriptor());
        zzq zzb2 = zzq.zzb(canonicalPath);
        if (zzb2.zzc) {
            throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
        }
        if (zza2.zza != zzb2.zza || zza2.zzb != zzb2.zzb) {
            throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
        }
        if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
            zzi.zza(zziVar);
            File dataDir2 = a.getDataDir(context);
            boolean z11 = true;
            if (dataDir2 == null ? !canonicalPath.startsWith(zze(Environment.getDataDirectory())) : !canonicalPath.startsWith(zze(dataDir2))) {
                Context createDeviceProtectedStorageContext = a.createDeviceProtectedStorageContext(context);
                if (createDeviceProtectedStorageContext == null || (dataDir = a.getDataDir(createDeviceProtectedStorageContext)) == null || !canonicalPath.startsWith(zze(dataDir))) {
                    File[] zzj = zzj(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzc
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context context2 = context;
                            int i10 = zzj.zza;
                            return a.getExternalFilesDirs(context2, null);
                        }
                    });
                    int length = zzj.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            File file = zzj[i10];
                            if (file != null && canonicalPath.startsWith(zze(file))) {
                                break;
                            } else {
                                i10++;
                            }
                        } else {
                            File[] zzj2 = zzj(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzd
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Context context2 = context;
                                    int i11 = zzj.zza;
                                    return a.getExternalCacheDirs(context2);
                                }
                            });
                            int length2 = zzj2.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 < length2) {
                                    File file2 = zzj2[i11];
                                    if (file2 != null && canonicalPath.startsWith(zze(file2))) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                } else {
                                    z11 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            z10 = zziVar.zzd;
            if (z11 == z10) {
                return;
            }
        }
        throw new FileNotFoundException("Can't open file: ".concat(canonicalPath));
    }

    private static boolean zzi(Context context, Uri uri, int i10, zzi zziVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        String authority = uri.getAuthority();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                z12 = zziVar.zzd;
                return !z12;
            }
        }
        if (zzi.zzc(zziVar, context, new zzr(uri, resolveContentProvider, authority)) - 1 == 1) {
            return false;
        }
        if (context.getPackageName().equals(resolveContentProvider.packageName)) {
            z11 = zziVar.zzd;
            return z11;
        }
        z10 = zziVar.zzd;
        if (z10) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && resolveContentProvider.exported) {
            String[] strArr = zzc;
            int length = strArr.length;
            for (int i11 = 0; i11 < 2; i11++) {
                if (strArr[i11].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = zzd;
            int length2 = strArr2.length;
            for (int i12 = 0; i12 < 3; i12++) {
                if (strArr2[i12].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = zzb;
            for (int i13 = 0; i13 < 6; i13++) {
                String str = strArr3[i13];
                if (str.charAt(str.length() - 1) == '.') {
                    if (resolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (resolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static File[] zzj(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
