package p365ta;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

/* renamed from: ta.y */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC11232y extends zzb implements InterfaceC11233z {
    public AbstractBinderC11232y() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Bitmap bitmap = (Bitmap) zzc.zza(parcel, Bitmap.CREATOR);
            zzc.zzc(parcel);
            mo33188Q0(bitmap);
        } else {
            if (i10 != 2) {
                return false;
            }
            InterfaceC5312b m13410f2 = InterfaceC5312b.a.m13410f2(parcel.readStrongBinder());
            zzc.zzc(parcel);
            zzc(m13410f2);
        }
        parcel2.writeNoException();
        return true;
    }
}
