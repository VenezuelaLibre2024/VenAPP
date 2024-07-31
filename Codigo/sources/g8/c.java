package g8;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.w;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {
    public w<b> a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return t8.c.b(b.U, (ArrayList) t8.a.e(readBundle.getParcelableArrayList("c")));
    }
}
