package p017b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.a */
/* loaded from: classes.dex */
public interface InterfaceC1590a extends IInterface {

    /* renamed from: h */
    public static final String f6821h = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* renamed from: b.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC1590a {
        public a() {
            attachInterface(this, InterfaceC1590a.f6821h);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0016. Please report as an issue. */
        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = InterfaceC1590a.f6821h;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    mo2100H1(parcel.readInt(), (Bundle) b.m8831c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    mo2101V(parcel.readString(), (Bundle) b.m8831c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    mo2103X1((Bundle) b.m8831c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    mo2102V1(parcel.readString(), (Bundle) b.m8831c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    mo2104Z1(parcel.readInt(), (Uri) b.m8831c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.m8831c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle mo2099A = mo2099A(parcel.readString(), (Bundle) b.m8831c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.m8832d(parcel2, mo2099A, 1);
                    return true;
                case 8:
                    mo2105r1(parcel.readInt(), parcel.readInt(), (Bundle) b.m8831c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    /* renamed from: b.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static <T> T m8831c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static <T extends Parcelable> void m8832d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    /* renamed from: A */
    Bundle mo2099A(String str, Bundle bundle);

    /* renamed from: H1 */
    void mo2100H1(int i10, Bundle bundle);

    /* renamed from: V */
    void mo2101V(String str, Bundle bundle);

    /* renamed from: V1 */
    void mo2102V1(String str, Bundle bundle);

    /* renamed from: X1 */
    void mo2103X1(Bundle bundle);

    /* renamed from: Z1 */
    void mo2104Z1(int i10, Uri uri, boolean z10, Bundle bundle);

    /* renamed from: r1 */
    void mo2105r1(int i10, int i11, Bundle bundle);
}
