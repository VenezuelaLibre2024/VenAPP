package p017b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.c */
/* loaded from: classes.dex */
public interface InterfaceC1592c extends IInterface {

    /* renamed from: j */
    public static final String f6824j = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    /* renamed from: b.c$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC1592c {
        public a() {
            attachInterface(this, InterfaceC1592c.f6824j);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = InterfaceC1592c.f6824j;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 2) {
                onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) b.m8850b(parcel, Bundle.CREATOR));
            } else if (i10 == 3) {
                onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) b.m8850b(parcel, Bundle.CREATOR));
            } else {
                if (i10 != 4) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                onSessionEnded(parcel.readInt() != 0, (Bundle) b.m8850b(parcel, Bundle.CREATOR));
            }
            return true;
        }
    }

    /* renamed from: b.c$b */
    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static <T> T m8850b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void onGreatestScrollPercentageIncreased(int i10, Bundle bundle);

    void onSessionEnded(boolean z10, Bundle bundle);

    void onVerticalScrollEvent(boolean z10, Bundle bundle);
}
