package p361t6;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.collect.AbstractC5907w;
import java.util.List;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: t6.n */
/* loaded from: classes.dex */
public final class BinderC11071n extends Binder {

    /* renamed from: b */
    private static final int f28553b;

    /* renamed from: a */
    private final AbstractC5907w<Bundle> f28554a;

    static {
        f28553b = C11172r0.f29040a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BinderC11071n(List<Bundle> list) {
        this.f28554a = AbstractC5907w.m15079r(list);
    }

    /* renamed from: a */
    public static AbstractC5907w<Bundle> m34303a(IBinder iBinder) {
        int readInt;
        AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
        int i10 = 0;
        int i11 = 1;
        while (i11 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i10);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            m15077p.mo14724a((Bundle) C11137a.m34603e(obtain2.readBundle()));
                            i10++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i11 = readInt;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                obtain2.recycle();
                obtain.recycle();
                throw th2;
            }
        }
        return m15077p.m15094k();
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f28554a.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < f28553b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f28554a.get(readInt));
            readInt++;
        }
        parcel2.writeInt(readInt < size ? 2 : 0);
        return true;
    }
}
