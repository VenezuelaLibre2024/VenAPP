package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzeh;
import com.google.android.recaptcha.internal.zzei;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzei<MessageType extends zzei<MessageType, BuilderType>, BuilderType extends zzeh<MessageType, BuilderType>> implements zzhy {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static void zzc(Iterable iterable, List list) {
        byte[] bArr = zzgw.zzd;
        iterable.getClass();
        if (iterable instanceof zzhg) {
            List zzh = ((zzhg) iterable).zzh();
            zzhg zzhgVar = (zzhg) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String str = "Element at index " + (zzhgVar.size() - size) + " is null.";
                    int size2 = zzhgVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            zzhgVar.remove(size2);
                        }
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof zzez) {
                    zzhgVar.zzi((zzez) obj);
                } else {
                    zzhgVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzig) {
            list.addAll(iterable);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        break;
                    } else {
                        list.remove(size4);
                    }
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zza(zzil zzilVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzhy
    public final zzez zzb() {
        try {
            int zzn = zzn();
            zzez zzezVar = zzez.zzb;
            byte[] bArr = new byte[zzn];
            zzfk zzA = zzfk.zzA(bArr, 0, zzn);
            zze(zzA);
            zzA.zzB();
            return new zzew(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] zzd() {
        try {
            int zzn = zzn();
            byte[] bArr = new byte[zzn];
            zzfk zzA = zzfk.zzA(bArr, 0, zzn);
            zze(zzA);
            zzA.zzB();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
