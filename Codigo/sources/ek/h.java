package ek;

import dk.p0;
import dk.q;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class h implements Externalizable {

    /* renamed from: c */
    public static final a f14748c = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private Collection<?> f14749a;

    /* renamed from: b */
    private final int f14750b;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h() {
        /*
            r2 = this;
            java.util.List r0 = dk.p.j()
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.h.<init>():void");
    }

    public h(Collection<?> collection, int i10) {
        n.e(collection, "collection");
        this.f14749a = collection;
        this.f14750b = i10;
    }

    private final Object readResolve() {
        return this.f14749a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        List d10;
        Collection<?> a10;
        Set c10;
        n.e(input, "input");
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
            d10 = q.d(readInt);
            while (i11 < readInt) {
                d10.add(input.readObject());
                i11++;
            }
            a10 = q.a(d10);
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i10 + '.');
            }
            c10 = p0.c(readInt);
            while (i11 < readInt) {
                c10.add(input.readObject());
                i11++;
            }
            a10 = p0.a(c10);
        }
        this.f14749a = a10;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) {
        n.e(output, "output");
        output.writeByte(this.f14750b);
        output.writeInt(this.f14749a.size());
        Iterator<?> it = this.f14749a.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
