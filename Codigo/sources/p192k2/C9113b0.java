package p192k2;

import android.net.Uri;
import android.os.Build;
import ck.C2027l;
import ck.C2037v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C9322n;
import mk.C9602b;
import p094f2.C7269b;
import p094f2.C7286s;
import p094f2.EnumC7268a;
import p094f2.EnumC7278k;
import p094f2.EnumC7281n;

/* renamed from: k2.b0 */
/* loaded from: classes.dex */
public final class C9113b0 {

    /* renamed from: a */
    public static final C9113b0 f21963a = new C9113b0();

    /* renamed from: k2.b0$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21964a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f21965b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f21966c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f21967d;

        static {
            int[] iArr = new int[C7286s.a.values().length];
            try {
                iArr[C7286s.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C7286s.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C7286s.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C7286s.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C7286s.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C7286s.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f21964a = iArr;
            int[] iArr2 = new int[EnumC7268a.values().length];
            try {
                iArr2[EnumC7268a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC7268a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f21965b = iArr2;
            int[] iArr3 = new int[EnumC7278k.values().length];
            try {
                iArr3[EnumC7278k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC7278k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC7278k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC7278k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[EnumC7278k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f21966c = iArr3;
            int[] iArr4 = new int[EnumC7281n.values().length];
            try {
                iArr4[EnumC7281n.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[EnumC7281n.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f21967d = iArr4;
        }
    }

    private C9113b0() {
    }

    /* renamed from: a */
    public static final int m26843a(EnumC7268a backoffPolicy) {
        C9322n.m27781e(backoffPolicy, "backoffPolicy");
        int i10 = a.f21965b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new C2027l();
    }

    /* renamed from: b */
    public static final Set<C7269b.c> m26844b(byte[] bytes) {
        ObjectInputStream objectInputStream;
        C9322n.m27781e(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            try {
                int readInt = objectInputStream.readInt();
                for (int i10 = 0; i10 < readInt; i10++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean readBoolean = objectInputStream.readBoolean();
                    C9322n.m27780d(uri, "uri");
                    linkedHashSet.add(new C7269b.c(uri, readBoolean));
                }
                C2037v c2037v = C2037v.f8089a;
                C9602b.m28593a(objectInputStream, null);
                C2037v c2037v2 = C2037v.f8089a;
                C9602b.m28593a(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C9602b.m28593a(byteArrayInputStream, th2);
                throw th3;
            }
        }
    }

    /* renamed from: c */
    public static final EnumC7268a m26845c(int i10) {
        if (i10 == 0) {
            return EnumC7268a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return EnumC7268a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    /* renamed from: d */
    public static final EnumC7278k m26846d(int i10) {
        if (i10 == 0) {
            return EnumC7278k.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return EnumC7278k.CONNECTED;
        }
        if (i10 == 2) {
            return EnumC7278k.UNMETERED;
        }
        if (i10 == 3) {
            return EnumC7278k.NOT_ROAMING;
        }
        if (i10 == 4) {
            return EnumC7278k.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return EnumC7278k.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    /* renamed from: e */
    public static final EnumC7281n m26847e(int i10) {
        if (i10 == 0) {
            return EnumC7281n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return EnumC7281n.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    /* renamed from: f */
    public static final C7286s.a m26848f(int i10) {
        if (i10 == 0) {
            return C7286s.a.ENQUEUED;
        }
        if (i10 == 1) {
            return C7286s.a.RUNNING;
        }
        if (i10 == 2) {
            return C7286s.a.SUCCEEDED;
        }
        if (i10 == 3) {
            return C7286s.a.FAILED;
        }
        if (i10 == 4) {
            return C7286s.a.BLOCKED;
        }
        if (i10 == 5) {
            return C7286s.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    /* renamed from: g */
    public static final int m26849g(EnumC7278k networkType) {
        C9322n.m27781e(networkType, "networkType");
        int i10 = a.f21966c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            i11 = 4;
            if (i10 == 4) {
                return 3;
            }
            if (i10 != 5) {
                if (Build.VERSION.SDK_INT >= 30 && networkType == EnumC7278k.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + networkType + " to int");
            }
        }
        return i11;
    }

    /* renamed from: h */
    public static final int m26850h(EnumC7281n policy) {
        C9322n.m27781e(policy, "policy");
        int i10 = a.f21967d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new C2027l();
    }

    /* renamed from: i */
    public static final byte[] m26851i(Set<C7269b.c> triggers) {
        C9322n.m27781e(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (C7269b.c cVar : triggers) {
                    objectOutputStream.writeUTF(cVar.m21753a().toString());
                    objectOutputStream.writeBoolean(cVar.m21754b());
                }
                C2037v c2037v = C2037v.f8089a;
                C9602b.m28593a(objectOutputStream, null);
                C9602b.m28593a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C9322n.m27780d(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: j */
    public static final int m26852j(C7286s.a state) {
        C9322n.m27781e(state, "state");
        switch (a.f21964a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new C2027l();
        }
    }
}
