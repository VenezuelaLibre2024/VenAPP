package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class zzcja extends zzgq implements zzht {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhs zzf;
    private zzhb zzg;
    private HttpURLConnection zzh;
    private final Queue zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcja(String str, zzhy zzhyVar, int i10, int i11, long j10, long j11) {
        super(true);
        zzek.zzc(str);
        this.zze = str;
        this.zzf = new zzhs();
        this.zzc = i10;
        this.zzd = i11;
        this.zzi = new ArrayDeque();
        this.zzr = j10;
        this.zzs = j11;
        if (zzhyVar != null) {
            zzf(zzhyVar);
        }
    }

    private final void zzl() {
        while (!this.zzi.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzi.remove()).disconnect();
            } catch (Exception e10) {
                zzcec.zzh("Unexpected error while disconnecting", e10);
            }
        }
        this.zzh = null;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzm;
            long j11 = this.zzn;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.zzo + j11;
            long j13 = i11;
            long j14 = j12 + j13 + this.zzs;
            long j15 = this.zzq;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.zzp;
                if (j15 < j17) {
                    long min = Math.min(j17, Math.max(((this.zzr + j16) - r3) - 1, (-1) + j16 + j13));
                    zzk(j16, min, 2);
                    this.zzq = min;
                    j15 = min;
                }
            }
            int read = this.zzj.read(bArr, i10, (int) Math.min(j13, ((j15 + 1) - this.zzo) - this.zzn));
            if (read == -1) {
                throw new EOFException();
            }
            this.zzn += read;
            zzg(read);
            return read;
        } catch (IOException e10) {
            throw new zzhp(e10, this.zzg, AdError.SERVER_ERROR_CODE, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final long zzb(zzhb zzhbVar) {
        long j10;
        this.zzg = zzhbVar;
        this.zzn = 0L;
        long j11 = zzhbVar.zzf;
        long j12 = zzhbVar.zzg;
        long min = j12 == -1 ? this.zzr : Math.min(this.zzr, j12);
        this.zzo = j11;
        HttpURLConnection zzk = zzk(j11, (min + j11) - 1, 1);
        this.zzh = zzk;
        String headerField = zzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j13 = zzhbVar.zzg;
                    if (j13 != -1) {
                        this.zzm = j13;
                        j10 = Math.max(parseLong, (this.zzo + j13) - 1);
                    } else {
                        this.zzm = parseLong2 - this.zzo;
                        j10 = parseLong2 - 1;
                    }
                    this.zzp = j10;
                    this.zzq = parseLong;
                    this.zzk = true;
                    zzj(zzhbVar);
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zzcec.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzciy(headerField, zzhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzhp(e10, this.zzg, AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzl();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgw
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final HttpURLConnection zzk(long j10, long j11, int i10) {
        String uri = this.zzg.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j10 + "-" + j11);
            httpURLConnection.setRequestProperty("User-Agent", this.zze);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzi.add(httpURLConnection);
            String uri2 = this.zzg.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzl = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzciz(this.zzl, headerFields, this.zzg, i10);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzj != null) {
                        inputStream = new SequenceInputStream(this.zzj, inputStream);
                    }
                    this.zzj = inputStream;
                    return httpURLConnection;
                } catch (IOException e10) {
                    zzl();
                    throw new zzhp(e10, this.zzg, AdError.SERVER_ERROR_CODE, i10);
                }
            } catch (IOException e11) {
                zzl();
                throw new zzhp("Unable to connect to ".concat(String.valueOf(uri2)), e11, this.zzg, AdError.SERVER_ERROR_CODE, i10);
            }
        } catch (IOException e12) {
            throw new zzhp("Unable to connect to ".concat(String.valueOf(uri)), e12, this.zzg, AdError.SERVER_ERROR_CODE, i10);
        }
    }
}
