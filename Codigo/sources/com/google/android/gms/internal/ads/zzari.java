package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzari implements zzarj {
    private static final Logger zzb = Logger.getLogger(zzari.class.getName());
    final ThreadLocal zza = new zzarh(this);

    public abstract zzarm zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzarj
    public final zzarm zzb(zzhgp zzhgpVar, zzarn zzarnVar) {
        int zza;
        long zzc;
        long zzb2 = zzhgpVar.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            zza = zzhgpVar.zza((ByteBuffer) this.zza.get());
            if (zza == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long zze = zzarl.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (zze < 8 && zze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(zze);
                    sb2.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (zze == 1) {
                        ((ByteBuffer) this.zza.get()).limit(16);
                        zzhgpVar.zza((ByteBuffer) this.zza.get());
                        ((ByteBuffer) this.zza.get()).position(8);
                        zzc = zzarl.zzf((ByteBuffer) this.zza.get()) - 16;
                    } else {
                        zzc = zze == 0 ? zzhgpVar.zzc() - zzhgpVar.zzb() : zze - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                        zzhgpVar.zza((ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.zza.get()).position() - 16; position < ((ByteBuffer) this.zza.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(position);
                        }
                        zzc -= 16;
                    }
                    long j10 = zzc;
                    zzarm zza2 = zza(str, bArr, zzarnVar instanceof zzarm ? ((zzarm) zzarnVar).zza() : "");
                    zza2.zzc(zzarnVar);
                    ((ByteBuffer) this.zza.get()).rewind();
                    zza2.zzb(zzhgpVar, (ByteBuffer) this.zza.get(), j10, this);
                    return zza2;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } while (zza >= 0);
        zzhgpVar.zze(zzb2);
        throw new EOFException();
    }
}