package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaxk extends zzaxx {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzaxk(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11) {
        super(zzawjVar, "d4INySQwKXrFgcw/Yp0O6t4YGx7HF+F75DncE44LSIy22mr4UP50R657OPRB1jqZ", "AemuwIJaLmYE+nU5fadET3FINkdby4LnWDkawsC9pWk=", zzasgVar, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        this.zze.zzB("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzB(zzi);
        }
    }
}
