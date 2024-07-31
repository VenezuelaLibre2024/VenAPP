package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: d */
    private final SparseIntArray f5539d;

    /* renamed from: e */
    private final Parcel f5540e;

    /* renamed from: f */
    private final int f5541f;

    /* renamed from: g */
    private final int f5542g;

    /* renamed from: h */
    private final String f5543h;

    /* renamed from: i */
    private int f5544i;

    /* renamed from: j */
    private int f5545j;

    /* renamed from: k */
    private int f5546k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    private b(Parcel parcel, int i10, int i11, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f5539d = new SparseIntArray();
        this.f5544i = -1;
        this.f5546k = -1;
        this.f5540e = parcel;
        this.f5541f = i10;
        this.f5542g = i11;
        this.f5545j = i10;
        this.f5543h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f5540e.writeInt(-1);
        } else {
            this.f5540e.writeInt(bArr.length);
            this.f5540e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f5540e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f5540e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f5540e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f5540e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f5544i;
        if (i10 >= 0) {
            int i11 = this.f5539d.get(i10);
            int dataPosition = this.f5540e.dataPosition();
            this.f5540e.setDataPosition(i11);
            this.f5540e.writeInt(dataPosition - i11);
            this.f5540e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f5540e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f5545j;
        if (i10 == this.f5541f) {
            i10 = this.f5542g;
        }
        return new b(parcel, dataPosition, i10, this.f5543h + "  ", this.f5536a, this.f5537b, this.f5538c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f5540e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f5540e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f5540e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f5540e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f5545j < this.f5542g) {
            int i11 = this.f5546k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f5540e.setDataPosition(this.f5545j);
            int readInt = this.f5540e.readInt();
            this.f5546k = this.f5540e.readInt();
            this.f5545j += readInt;
        }
        return this.f5546k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f5540e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f5540e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f5540e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f5544i = i10;
        this.f5539d.put(i10, this.f5540e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z10) {
        this.f5540e.writeInt(z10 ? 1 : 0);
    }
}
