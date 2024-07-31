package p081ea;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import la.C9458c;

/* renamed from: ea.e */
/* loaded from: classes.dex */
public final class C7142e {
    /* renamed from: a */
    public static <T extends InterfaceC7141d> T m21235a(byte[] bArr, Parcelable.Creator<T> creator) {
        C5276s.m13324j(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    /* renamed from: b */
    public static <T extends InterfaceC7141d> T m21236b(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) m21235a(byteArrayExtra, creator);
    }

    /* renamed from: c */
    public static <T extends InterfaceC7141d> T m21237c(String str, Parcelable.Creator<T> creator) {
        return (T) m21235a(C9458c.m28124a(str), creator);
    }

    /* renamed from: d */
    public static <T extends InterfaceC7141d> byte[] m21238d(T t10) {
        Parcel obtain = Parcel.obtain();
        t10.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: e */
    public static <T extends InterfaceC7141d> void m21239e(T t10, Intent intent, String str) {
        intent.putExtra(str, m21238d(t10));
    }

    /* renamed from: f */
    public static <T extends InterfaceC7141d> String m21240f(T t10) {
        return C9458c.m28127d(m21238d(t10));
    }
}
