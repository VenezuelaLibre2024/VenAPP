package ba;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ba.h */
/* loaded from: classes.dex */
public final class C1696h implements Parcelable {
    public static final Parcelable.Creator<C1696h> CREATOR = new C1694f();

    /* renamed from: a */
    Messenger f7258a;

    public C1696h(IBinder iBinder) {
        this.f7258a = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder m9297a() {
        Messenger messenger = this.f7258a;
        messenger.getClass();
        return messenger.getBinder();
    }

    /* renamed from: b */
    public final void m9298b(Message message) {
        Messenger messenger = this.f7258a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m9297a().equals(((C1696h) obj).m9297a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m9297a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f7258a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
