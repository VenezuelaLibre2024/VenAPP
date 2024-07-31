package p050d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import p050d.InterfaceC6804a;

/* renamed from: d.b */
/* loaded from: classes.dex */
public class C6805b implements Parcelable {
    public static final Parcelable.Creator<C6805b> CREATOR = new a();

    /* renamed from: a */
    final boolean f15029a = false;

    /* renamed from: b */
    final Handler f15030b = null;

    /* renamed from: c */
    InterfaceC6804a f15031c;

    /* renamed from: d.b$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<C6805b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6805b createFromParcel(Parcel parcel) {
            return new C6805b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6805b[] newArray(int i10) {
            return new C6805b[i10];
        }
    }

    /* renamed from: d.b$b */
    /* loaded from: classes.dex */
    class b extends InterfaceC6804a.a {
        b() {
        }

        @Override // p050d.InterfaceC6804a
        /* renamed from: q0 */
        public void mo19684q0(int i10, Bundle bundle) {
            C6805b c6805b = C6805b.this;
            Handler handler = c6805b.f15030b;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                c6805b.mo664a(i10, bundle);
            }
        }
    }

    /* renamed from: d.b$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a */
        final int f15033a;

        /* renamed from: b */
        final Bundle f15034b;

        c(int i10, Bundle bundle) {
            this.f15033a = i10;
            this.f15034b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6805b.this.mo664a(this.f15033a, this.f15034b);
        }
    }

    C6805b(Parcel parcel) {
        this.f15031c = InterfaceC6804a.a.m19685f2(parcel.readStrongBinder());
    }

    /* renamed from: a */
    protected void mo664a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f15031c == null) {
                this.f15031c = new b();
            }
            parcel.writeStrongBinder(this.f15031c.asBinder());
        }
    }
}
