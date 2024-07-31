package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class zzaqw implements zzapk {
    private final zzaqv zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaqw(zzaqv zzaqvVar, int i10) {
        this.zzc = zzaqvVar;
    }

    public zzaqw(File file, int i10) {
        this.zzc = new zzaqs(this, file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(InputStream inputStream) {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzf(InputStream inputStream) {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(zzaqu zzaquVar) {
        return new String(zzm(zzaquVar, zzf(zzaquVar)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i10) {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    static void zzk(OutputStream outputStream, long j10) {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    static void zzl(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzaqu zzaquVar, long j10) {
        long zza = zzaquVar.zza();
        if (j10 >= 0 && j10 <= zza) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(zzaquVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + zza);
    }

    private static int zzn(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaqt zzaqtVar) {
        if (this.zza.containsKey(str)) {
            this.zzb += zzaqtVar.zza - ((zzaqt) this.zza.get(str)).zza;
        } else {
            this.zzb += zzaqtVar.zza;
        }
        this.zza.put(str, zzaqtVar);
    }

    private final void zzp(String str) {
        zzaqt zzaqtVar = (zzaqt) this.zza.remove(str);
        if (zzaqtVar != null) {
            this.zzb -= zzaqtVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzapk
    public final synchronized zzapj zza(String str) {
        zzaqt zzaqtVar = (zzaqt) this.zza.get(str);
        if (zzaqtVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzaqu zzaquVar = new zzaqu(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzaqt zza = zzaqt.zza(zzaquVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzaqm.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzaquVar, zzaquVar.zza());
                zzapj zzapjVar = new zzapj();
                zzapjVar.zza = zzm;
                zzapjVar.zzb = zzaqtVar.zzc;
                zzapjVar.zzc = zzaqtVar.zzd;
                zzapjVar.zzd = zzaqtVar.zze;
                zzapjVar.zze = zzaqtVar.zzf;
                zzapjVar.zzf = zzaqtVar.zzg;
                List<zzaps> list = zzaqtVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzaps zzapsVar : list) {
                    treeMap.put(zzapsVar.zza(), zzapsVar.zzb());
                }
                zzapjVar.zzg = treeMap;
                zzapjVar.zzh = Collections.unmodifiableList(zzaqtVar.zzh);
                return zzapjVar;
            } finally {
                zzaquVar.close();
            }
        } catch (IOException e10) {
            zzaqm.zza("%s: %s", zzg.getAbsolutePath(), e10.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapk
    public final synchronized void zzb() {
        long length;
        zzaqu zzaquVar;
        File zza = this.zzc.zza();
        if (zza.exists()) {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        length = file.length();
                        zzaquVar = new zzaqu(new BufferedInputStream(new FileInputStream(file)), length);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        zzaqt zza2 = zzaqt.zza(zzaquVar);
                        zza2.zza = length;
                        zzo(zza2.zzb, zza2);
                        zzaquVar.close();
                    } catch (Throwable th2) {
                        zzaquVar.close();
                        throw th2;
                        break;
                    }
                }
            }
        } else if (!zza.mkdirs()) {
            zzaqm.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapk
    public final synchronized void zzc(String str, boolean z10) {
        zzapj zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapk
    public final synchronized void zzd(String str, zzapj zzapjVar) {
        long j10 = this.zzb;
        int length = zzapjVar.zza.length;
        long j11 = j10 + length;
        int i10 = this.zzd;
        if (j11 <= i10 || length <= i10 * 0.9f) {
            File zzg = zzg(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
                zzaqt zzaqtVar = new zzaqt(str, zzapjVar);
                try {
                    zzj(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzaqtVar.zzb);
                    String str2 = zzaqtVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzk(bufferedOutputStream, zzaqtVar.zzd);
                    zzk(bufferedOutputStream, zzaqtVar.zze);
                    zzk(bufferedOutputStream, zzaqtVar.zzf);
                    zzk(bufferedOutputStream, zzaqtVar.zzg);
                    List<zzaps> list = zzaqtVar.zzh;
                    if (list != null) {
                        zzj(bufferedOutputStream, list.size());
                        for (zzaps zzapsVar : list) {
                            zzl(bufferedOutputStream, zzapsVar.zza());
                            zzl(bufferedOutputStream, zzapsVar.zzb());
                        }
                    } else {
                        zzj(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzapjVar.zza);
                    bufferedOutputStream.close();
                    zzaqtVar.zza = zzg.length();
                    zzo(str, zzaqtVar);
                    if (this.zzb >= this.zzd) {
                        if (zzaqm.zzb) {
                            zzaqm.zzd("Pruning old cache entries.", new Object[0]);
                        }
                        long j12 = this.zzb;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.zza.entrySet().iterator();
                        int i11 = 0;
                        while (it.hasNext()) {
                            zzaqt zzaqtVar2 = (zzaqt) ((Map.Entry) it.next()).getValue();
                            if (zzg(zzaqtVar2.zzb).delete()) {
                                this.zzb -= zzaqtVar2.zza;
                            } else {
                                String str3 = zzaqtVar2.zzb;
                                zzaqm.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i11++;
                            if (((float) this.zzb) < this.zzd * 0.9f) {
                                break;
                            }
                        }
                        if (zzaqm.zzb) {
                            zzaqm.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.zzb - j12), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        }
                    }
                } catch (IOException e10) {
                    zzaqm.zza("%s", e10.toString());
                    bufferedOutputStream.close();
                    zzaqm.zza("Failed to write header for %s", zzg.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!zzg.delete()) {
                    zzaqm.zza("Could not clean up file %s", zzg.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzaqm.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzb();
                }
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (delete) {
            return;
        }
        zzaqm.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }
}
