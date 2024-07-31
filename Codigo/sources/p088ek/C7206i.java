package p088ek;

import dk.C7016j0;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: ek.i */
/* loaded from: classes3.dex */
final class C7206i implements Externalizable {

    /* renamed from: b */
    public static final a f16174b = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private Map<?, ?> f16175a;

    /* renamed from: ek.i$a */
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
    public C7206i() {
        /*
            r1 = this;
            java.util.Map r0 = dk.C7012h0.m20364h()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p088ek.C7206i.<init>():void");
    }

    public C7206i(Map<?, ?> map) {
        C9322n.m27781e(map, "map");
        this.f16175a = map;
    }

    private final Object readResolve() {
        return this.f16175a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        Map m20417d;
        Map<?, ?> m20415b;
        C9322n.m27781e(input, "input");
        byte readByte = input.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        m20417d = C7016j0.m20417d(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            m20417d.put(input.readObject(), input.readObject());
        }
        m20415b = C7016j0.m20415b(m20417d);
        this.f16175a = m20415b;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) {
        C9322n.m27781e(output, "output");
        output.writeByte(0);
        output.writeInt(this.f16175a.size());
        for (Map.Entry<?, ?> entry : this.f16175a.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
