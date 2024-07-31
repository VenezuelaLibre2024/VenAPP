package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzck<MessageType extends zzck<MessageType, BuilderType>, BuilderType extends zzcj<MessageType, BuilderType>> implements zzfo {
    protected int zzb = 0;

    public int zzB(zzgh zzghVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo
    public final zzdb zzC() {
        try {
            int zzE = zzE();
            zzdb zzdbVar = zzdb.zzb;
            byte[] bArr = new byte[zzE];
            zzdj zzA = zzdj.zzA(bArr, 0, zzE);
            zzaa(zzA);
            zzA.zzB();
            return new zzcy(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }
}
