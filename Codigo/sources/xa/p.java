package xa;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: classes2.dex */
public final class p implements Parcelable.Creator<b> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(b bVar, Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, bVar.x1(), false);
        ea.c.E(parcel, 3, bVar.w1(), i10, false);
        ea.c.E(parcel, 4, bVar.u1(), i10, false);
        ea.c.z(parcel, 5, bVar.v1());
        ea.c.l(parcel, 6, bVar.y1(), false);
        ea.c.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int O = ea.b.O(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j10 = 0;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            int w10 = ea.b.w(E);
            if (w10 == 2) {
                str = ea.b.q(parcel, E);
            } else if (w10 == 3) {
                dataHolder = (DataHolder) ea.b.p(parcel, E, DataHolder.CREATOR);
            } else if (w10 == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) ea.b.p(parcel, E, ParcelFileDescriptor.CREATOR);
            } else if (w10 == 5) {
                j10 = ea.b.J(parcel, E);
            } else if (w10 != 6) {
                ea.b.N(parcel, E);
            } else {
                bArr = ea.b.g(parcel, E);
            }
        }
        ea.b.v(parcel, O);
        return new b(str, dataHolder, parcelFileDescriptor, j10, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i10) {
        return new b[i10];
    }
}
