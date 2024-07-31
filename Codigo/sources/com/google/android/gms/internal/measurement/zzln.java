package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzln implements Comparable, Map.Entry {
    private final Comparable zza;
    private Object zzb;
    private final /* synthetic */ zzlg zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzln(zzlg zzlgVar, Comparable comparable, Object obj) {
        this.zzc = zzlgVar;
        this.zza = comparable;
        this.zzb = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzln(zzlg zzlgVar, Map.Entry entry) {
        this(zzlgVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzln) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zza(this.zza, entry.getKey()) && zza(this.zzb, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zza;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.zzb;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zzc.zzg();
        Object obj2 = this.zzb;
        this.zzb = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.zza) + "=" + String.valueOf(this.zzb);
    }
}