package d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import d.a;

/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final boolean f13675a = false;

    /* renamed from: b, reason: collision with root package name */
    final Handler f13676b = null;

    /* renamed from: c, reason: collision with root package name */
    d.a f13677c;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: d.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class BinderC0203b extends a.AbstractBinderC0201a {
        BinderC0203b() {
        }

        @Override // d.a
        public void q0(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f13676b;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final int f13679a;

        /* renamed from: b, reason: collision with root package name */
        final Bundle f13680b;

        c(int i10, Bundle bundle) {
            this.f13679a = i10;
            this.f13680b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f13679a, this.f13680b);
        }
    }

    b(Parcel parcel) {
        this.f13677c = a.AbstractBinderC0201a.f2(parcel.readStrongBinder());
    }

    protected void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f13677c == null) {
                this.f13677c = new BinderC0203b();
            }
            parcel.writeStrongBinder(this.f13677c.asBinder());
        }
    }
}
