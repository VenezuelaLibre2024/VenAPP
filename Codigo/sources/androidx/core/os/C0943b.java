package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import ck.C2028m;
import java.io.Serializable;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.core.os.b */
/* loaded from: classes.dex */
public final class C0943b {
    /* renamed from: a */
    public static final Bundle m4701a(C2028m<String, ? extends Object>... pairs) {
        C9322n.m27781e(pairs, "pairs");
        Bundle bundle = new Bundle(pairs.length);
        int length = pairs.length;
        int i10 = 0;
        while (i10 < length) {
            C2028m<String, ? extends Object> c2028m = pairs[i10];
            i10++;
            String m10335a = c2028m.m10335a();
            Object m10336b = c2028m.m10336b();
            if (m10336b == null) {
                bundle.putString(m10335a, null);
            } else if (m10336b instanceof Boolean) {
                bundle.putBoolean(m10335a, ((Boolean) m10336b).booleanValue());
            } else if (m10336b instanceof Byte) {
                bundle.putByte(m10335a, ((Number) m10336b).byteValue());
            } else if (m10336b instanceof Character) {
                bundle.putChar(m10335a, ((Character) m10336b).charValue());
            } else if (m10336b instanceof Double) {
                bundle.putDouble(m10335a, ((Number) m10336b).doubleValue());
            } else if (m10336b instanceof Float) {
                bundle.putFloat(m10335a, ((Number) m10336b).floatValue());
            } else if (m10336b instanceof Integer) {
                bundle.putInt(m10335a, ((Number) m10336b).intValue());
            } else if (m10336b instanceof Long) {
                bundle.putLong(m10335a, ((Number) m10336b).longValue());
            } else if (m10336b instanceof Short) {
                bundle.putShort(m10335a, ((Number) m10336b).shortValue());
            } else if (m10336b instanceof Bundle) {
                bundle.putBundle(m10335a, (Bundle) m10336b);
            } else if (m10336b instanceof CharSequence) {
                bundle.putCharSequence(m10335a, (CharSequence) m10336b);
            } else if (m10336b instanceof Parcelable) {
                bundle.putParcelable(m10335a, (Parcelable) m10336b);
            } else if (m10336b instanceof boolean[]) {
                bundle.putBooleanArray(m10335a, (boolean[]) m10336b);
            } else if (m10336b instanceof byte[]) {
                bundle.putByteArray(m10335a, (byte[]) m10336b);
            } else if (m10336b instanceof char[]) {
                bundle.putCharArray(m10335a, (char[]) m10336b);
            } else if (m10336b instanceof double[]) {
                bundle.putDoubleArray(m10335a, (double[]) m10336b);
            } else if (m10336b instanceof float[]) {
                bundle.putFloatArray(m10335a, (float[]) m10336b);
            } else if (m10336b instanceof int[]) {
                bundle.putIntArray(m10335a, (int[]) m10336b);
            } else if (m10336b instanceof long[]) {
                bundle.putLongArray(m10335a, (long[]) m10336b);
            } else if (m10336b instanceof short[]) {
                bundle.putShortArray(m10335a, (short[]) m10336b);
            } else if (m10336b instanceof Object[]) {
                Class<?> componentType = m10336b.getClass().getComponentType();
                C9322n.m27778b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(m10335a, (Parcelable[]) m10336b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(m10335a, (String[]) m10336b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(m10335a, (CharSequence[]) m10336b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + ((Object) componentType.getCanonicalName()) + " for key \"" + m10335a + '\"');
                    }
                    bundle.putSerializable(m10335a, (Serializable) m10336b);
                }
            } else if (m10336b instanceof Serializable) {
                bundle.putSerializable(m10335a, (Serializable) m10336b);
            } else if (m10336b instanceof IBinder) {
                bundle.putBinder(m10335a, (IBinder) m10336b);
            } else if (m10336b instanceof Size) {
                bundle.putSize(m10335a, (Size) m10336b);
            } else {
                if (!(m10336b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + ((Object) m10336b.getClass().getCanonicalName()) + " for key \"" + m10335a + '\"');
                }
                bundle.putSizeF(m10335a, (SizeF) m10336b);
            }
        }
        return bundle;
    }
}
