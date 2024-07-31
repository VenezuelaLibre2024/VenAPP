package t6;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.collect.w;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends Binder {

    /* renamed from: b */
    private static final int f26326b;

    /* renamed from: a */
    private final com.google.common.collect.w<Bundle> f26327a;

    static {
        f26326b = t8.r0.f26744a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public n(List<Bundle> list) {
        this.f26327a = com.google.common.collect.w.r(list);
    }

    public static com.google.common.collect.w<Bundle> a(IBinder iBinder) {
        int readInt;
        w.a p10 = com.google.common.collect.w.p();
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
                            p10.a((Bundle) t8.a.e(obtain2.readBundle()));
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
        return p10.k();
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f26327a.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < f26326b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f26327a.get(readInt));
            readInt++;
        }
        parcel2.writeInt(readInt < size ? 2 : 0);
        return true;
    }
}
