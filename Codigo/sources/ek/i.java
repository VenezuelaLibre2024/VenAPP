package ek;

import dk.j0;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
final class i implements Externalizable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f14751b = new a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private Map<?, ?> f14752a;

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
    public i() {
        /*
            r1 = this;
            java.util.Map r0 = dk.h0.h()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.i.<init>():void");
    }

    public i(Map<?, ?> map) {
        n.e(map, "map");
        this.f14752a = map;
    }

    private final Object readResolve() {
        return this.f14752a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        Map d10;
        Map<?, ?> b10;
        n.e(input, "input");
        byte readByte = input.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        d10 = j0.d(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            d10.put(input.readObject(), input.readObject());
        }
        b10 = j0.b(d10);
        this.f14752a = b10;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) {
        n.e(output, "output");
        output.writeByte(0);
        output.writeInt(this.f14752a.size());
        for (Map.Entry<?, ?> entry : this.f14752a.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
