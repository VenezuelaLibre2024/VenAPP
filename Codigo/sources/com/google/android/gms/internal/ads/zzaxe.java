package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaxe extends zzaxx {
    private final Map zzi;
    private final View zzj;
    private final Context zzk;

    public zzaxe(zzawj zzawjVar, String str, String str2, zzasg zzasgVar, int i10, int i11, Map map, View view, Context context) {
        super(zzawjVar, "DNq6U+mZz2ZReiKgjo/VDFnaMNaZiKgTjVzJ4/NswvXzkfhe/AgU2N86qSmmEbDf", "ZzhYXgKMhken/ic2sDR8A53WLOTMzsBN7DfnMjKoyhk=", zzasgVar, i10, 85);
        this.zzi = map;
        this.zzj = view;
        this.zzk = context;
    }

    private final long zzc(int i10) {
        Map map = this.zzi;
        Integer valueOf = Integer.valueOf(i10);
        if (map.containsKey(valueOf)) {
            return ((Long) this.zzi.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    protected final void zza() {
        long[] jArr = {zzc(1), zzc(2)};
        Context context = this.zzk;
        if (context == null) {
            context = this.zzb.zzb();
        }
        long[] jArr2 = (long[]) this.zzf.invoke(null, jArr, context, this.zzj);
        long j10 = jArr2[0];
        this.zzi.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        this.zzi.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.zze) {
            this.zze.zzv(j10);
            this.zze.zzu(j11);
        }
    }
}
