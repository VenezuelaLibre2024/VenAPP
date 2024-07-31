package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.a0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzerh implements zzexq {
    private final zzgey zza;
    private final zzgey zzb;
    private final Context zzc;
    private final zzfhh zzd;
    private final View zze;

    public zzerh(zzgey zzgeyVar, zzgey zzgeyVar2, Context context, zzfhh zzfhhVar, ViewGroup viewGroup) {
        this.zza = zzgeyVar;
        this.zzb = zzgeyVar2;
        this.zzc = context;
        this.zzd = zzfhhVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        zzgey zzgeyVar;
        Callable callable;
        zzbgc.zza(this.zzc);
        if (((Boolean) a0.c().zza(zzbgc.zzkA)).booleanValue()) {
            zzgeyVar = this.zzb;
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzerf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzerh.this.zzc();
                }
            };
        } else {
            zzgeyVar = this.zza;
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzerg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzerh.this.zzd();
                }
            };
        }
        return zzgeyVar.zzb(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeri zzc() {
        return new zzeri(this.zzc, this.zzd.zze, zze());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeri zzd() {
        return new zzeri(this.zzc, this.zzd.zze, zze());
    }
}
