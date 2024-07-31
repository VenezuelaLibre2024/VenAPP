package p088ek;

import dk.C7028p0;
import dk.C7029q;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: ek.h */
/* loaded from: classes3.dex */
public final class C7205h implements Externalizable {

    /* renamed from: c */
    public static final a f16171c = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private Collection<?> f16172a;

    /* renamed from: b */
    private final int f16173b;

    /* renamed from: ek.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7205h() {
        /*
            r2 = this;
            java.util.List r0 = dk.C7027p.m20546j()
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p088ek.C7205h.<init>():void");
    }

    public C7205h(Collection<?> collection, int i10) {
        C9322n.m27781e(collection, "collection");
        this.f16172a = collection;
        this.f16173b = i10;
    }

    private final Object readResolve() {
        return this.f16172a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        List m20571d;
        Collection<?> m20568a;
        Set m20566c;
        C9322n.m27781e(input, "input");
        byte readByte = input.readByte();
        int i10 = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        int i11 = 0;
        if (i10 == 0) {
            m20571d = C7029q.m20571d(readInt);
            while (i11 < readInt) {
                m20571d.add(input.readObject());
                i11++;
            }
            m20568a = C7029q.m20568a(m20571d);
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i10 + '.');
            }
            m20566c = C7028p0.m20566c(readInt);
            while (i11 < readInt) {
                m20566c.add(input.readObject());
                i11++;
            }
            m20568a = C7028p0.m20564a(m20566c);
        }
        this.f16172a = m20568a;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) {
        C9322n.m27781e(output, "output");
        output.writeByte(this.f16173b);
        output.writeInt(this.f16172a.size());
        Iterator<?> it = this.f16172a.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
