package p120g8;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import p363t8.C11137a;
import p363t8.C11141c;

/* renamed from: g8.c */
/* loaded from: classes.dex */
public final class C7485c {
    /* renamed from: a */
    public AbstractC5907w<C7484b> m22783a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return C11141c.m34616b(C7484b.f17653U, (ArrayList) C11137a.m34603e(readBundle.getParcelableArrayList("c")));
    }
}
