package ja;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* loaded from: classes.dex */
public final class b extends ea.a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    final int f19825a;

    /* renamed from: b, reason: collision with root package name */
    private final a f19826b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10, a aVar) {
        this.f19825a = i10;
        this.f19826b = aVar;
    }

    private b(a aVar) {
        this.f19825a = 1;
        this.f19826b = aVar;
    }

    public static b u1(a.b bVar) {
        if (bVar instanceof a) {
            return new b((a) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final a.b v1() {
        a aVar = this.f19826b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f19825a);
        ea.c.E(parcel, 2, this.f19826b, i10, false);
        ea.c.b(parcel, a10);
    }
}
