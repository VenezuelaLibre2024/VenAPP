package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class zzhgo implements Iterator, Closeable, zzarn {
    private static final zzarm zza = new zzhgn("eof ");
    private static final zzhgv zzb = zzhgv.zzb(zzhgo.class);
    protected zzarj zzc;
    protected zzhgp zzd;
    zzarm zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzarm zzarmVar = this.zze;
        if (zzarmVar == zza) {
            return false;
        }
        if (zzarmVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.zzh.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((zzarm) this.zzh.get(i10)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzd */
    public final zzarm next() {
        zzarm zzb2;
        zzarm zzarmVar = this.zze;
        if (zzarmVar != null && zzarmVar != zza) {
            this.zze = null;
            return zzarmVar;
        }
        zzhgp zzhgpVar = this.zzd;
        if (zzhgpVar == null || this.zzf >= this.zzg) {
            this.zze = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzhgpVar) {
                this.zzd.zze(this.zzf);
                zzb2 = this.zzc.zzb(this.zzd, this);
                this.zzf = this.zzd.zzb();
            }
            return zzb2;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzhgu(this.zzh, this);
    }

    public final void zzf(zzhgp zzhgpVar, long j10, zzarj zzarjVar) {
        this.zzd = zzhgpVar;
        this.zzf = zzhgpVar.zzb();
        zzhgpVar.zze(zzhgpVar.zzb() + j10);
        this.zzg = zzhgpVar.zzb();
        this.zzc = zzarjVar;
    }
}
