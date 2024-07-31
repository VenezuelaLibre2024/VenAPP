package p120g8;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p363t8.C11141c;

/* renamed from: g8.d */
/* loaded from: classes.dex */
public final class C7486d {
    /* renamed from: a */
    public byte[] m22784a(List<C7484b> list) {
        ArrayList<Bundle> m34618d = C11141c.m34618d(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", m34618d);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
