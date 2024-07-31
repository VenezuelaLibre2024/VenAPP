package g8;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {
    public byte[] a(List<b> list) {
        ArrayList<Bundle> d10 = t8.c.d(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", d10);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
