package p390v0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v0.a */
/* loaded from: classes.dex */
public abstract class AbstractC11601a implements Parcelable {

    /* renamed from: a */
    private final Parcelable f30178a;

    /* renamed from: b */
    public static final AbstractC11601a f30177b = new a();
    public static final Parcelable.Creator<AbstractC11601a> CREATOR = new b();

    /* renamed from: v0.a$a */
    /* loaded from: classes.dex */
    static class a extends AbstractC11601a {
        a() {
            super((a) null);
        }
    }

    /* renamed from: v0.a$b */
    /* loaded from: classes.dex */
    static class b implements Parcelable.ClassLoaderCreator<AbstractC11601a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC11601a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC11601a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC11601a.f30177b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC11601a[] newArray(int i10) {
            return new AbstractC11601a[i10];
        }
    }

    private AbstractC11601a() {
        this.f30178a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11601a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f30178a = readParcelable == null ? f30177b : readParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11601a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f30178a = parcelable == f30177b ? null : parcelable;
    }

    /* synthetic */ AbstractC11601a(a aVar) {
        this();
    }

    /* renamed from: a */
    public final Parcelable m36371a() {
        return this.f30178a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f30178a, i10);
    }
}
