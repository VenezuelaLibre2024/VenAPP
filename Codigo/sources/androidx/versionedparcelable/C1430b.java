package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.C0731a;
import java.lang.reflect.Method;

/* renamed from: androidx.versionedparcelable.b */
/* loaded from: classes.dex */
class C1430b extends AbstractC1429a {

    /* renamed from: d */
    private final SparseIntArray f6364d;

    /* renamed from: e */
    private final Parcel f6365e;

    /* renamed from: f */
    private final int f6366f;

    /* renamed from: g */
    private final int f6367g;

    /* renamed from: h */
    private final String f6368h;

    /* renamed from: i */
    private int f6369i;

    /* renamed from: j */
    private int f6370j;

    /* renamed from: k */
    private int f6371k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1430b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0731a(), new C0731a(), new C0731a());
    }

    private C1430b(Parcel parcel, int i10, int i11, String str, C0731a<String, Method> c0731a, C0731a<String, Method> c0731a2, C0731a<String, Class> c0731a3) {
        super(c0731a, c0731a2, c0731a3);
        this.f6364d = new SparseIntArray();
        this.f6369i = -1;
        this.f6371k = -1;
        this.f6365e = parcel;
        this.f6366f = i10;
        this.f6367g = i11;
        this.f6370j = i10;
        this.f6368h = str;
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: A */
    public void mo8216A(byte[] bArr) {
        if (bArr == null) {
            this.f6365e.writeInt(-1);
        } else {
            this.f6365e.writeInt(bArr.length);
            this.f6365e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: C */
    protected void mo8218C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f6365e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: E */
    public void mo8220E(int i10) {
        this.f6365e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: G */
    public void mo8222G(Parcelable parcelable) {
        this.f6365e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: I */
    public void mo8224I(String str) {
        this.f6365e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: a */
    public void mo8229a() {
        int i10 = this.f6369i;
        if (i10 >= 0) {
            int i11 = this.f6364d.get(i10);
            int dataPosition = this.f6365e.dataPosition();
            this.f6365e.setDataPosition(i11);
            this.f6365e.writeInt(dataPosition - i11);
            this.f6365e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: b */
    protected AbstractC1429a mo8230b() {
        Parcel parcel = this.f6365e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f6370j;
        if (i10 == this.f6366f) {
            i10 = this.f6367g;
        }
        return new C1430b(parcel, dataPosition, i10, this.f6368h + "  ", this.f6361a, this.f6362b, this.f6363c);
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: g */
    public boolean mo8232g() {
        return this.f6365e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: i */
    public byte[] mo8234i() {
        int readInt = this.f6365e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f6365e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: k */
    protected CharSequence mo8236k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f6365e);
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: m */
    public boolean mo8238m(int i10) {
        while (this.f6370j < this.f6367g) {
            int i11 = this.f6371k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f6365e.setDataPosition(this.f6370j);
            int readInt = this.f6365e.readInt();
            this.f6371k = this.f6365e.readInt();
            this.f6370j += readInt;
        }
        return this.f6371k == i10;
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: o */
    public int mo8240o() {
        return this.f6365e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: q */
    public <T extends Parcelable> T mo8242q() {
        return (T) this.f6365e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: s */
    public String mo8244s() {
        return this.f6365e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: w */
    public void mo8248w(int i10) {
        mo8229a();
        this.f6369i = i10;
        this.f6364d.put(i10, this.f6365e.dataPosition());
        mo8220E(0);
        mo8220E(i10);
    }

    @Override // androidx.versionedparcelable.AbstractC1429a
    /* renamed from: y */
    public void mo8250y(boolean z10) {
        this.f6365e.writeInt(z10 ? 1 : 0);
    }
}
