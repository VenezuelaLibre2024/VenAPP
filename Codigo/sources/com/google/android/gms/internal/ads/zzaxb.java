package com.google.android.gms.internal.ads;

import c9.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzaxb extends zzaxx {
    public zzaxb(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11) {
        super(zzawjVar, "8UEA9TmdE+sqV3zcsNgnFI5Sf8uIsQHU61W37Ddl8zaNqY23x/FpuoK+mm9MWruA", "qlbJd0rViXaFpU2SvrkcezPlE/VtgXulMFWFUXmIBBg=", zzasgVar, i10, 24);
    }

    private final void zzc() {
        c9.a zzh = this.zzb.zzh();
        if (zzh != null) {
            try {
                a.C0117a b10 = zzh.b();
                String a10 = b10.a();
                int i10 = zzawm.zza;
                if (a10 != null && a10.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                    UUID fromString = UUID.fromString(a10);
                    byte[] bArr = new byte[16];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.putLong(fromString.getMostSignificantBits());
                    wrap.putLong(fromString.getLeastSignificantBits());
                    a10 = zzatt.zza(bArr, true);
                }
                if (a10 != null) {
                    synchronized (this.zze) {
                        this.zze.zzs(a10);
                        this.zze.zzr(b10.b());
                        this.zze.zzab(6);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxx, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzm();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        if (this.zzb.zzq()) {
            zzc();
            return;
        }
        synchronized (this.zze) {
            this.zze.zzs((String) this.zzf.invoke(null, this.zzb.zzb()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final Void zzm() {
        if (this.zzb.zzr()) {
            super.zzm();
            return null;
        }
        if (this.zzb.zzq()) {
            zzc();
        }
        return null;
    }
}
