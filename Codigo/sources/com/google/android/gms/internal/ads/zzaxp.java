package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaxp extends zzaxx {
    private final StackTraceElement[] zzi;

    public zzaxp(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzawjVar, "kB6Ls9/mn9iw4biP/HsD3FFR9Vy1jOQ1ljTH52MXzz14qrvyk1QMusJQlJpZNqjT", "pY1LPqV65osROa0AkcabhXHjwpz5nP0HOapDW2QtdtU=", zzasgVar, i10, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzawa zzawaVar = new zzawa((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzF(zzawaVar.zza.longValue());
                if (zzawaVar.zzb.booleanValue()) {
                    this.zze.zzac(true != zzawaVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    this.zze.zzac(3);
                }
            }
        }
    }
}
