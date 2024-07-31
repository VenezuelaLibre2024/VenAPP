package k2;

import android.net.Uri;
import android.os.Build;
import f2.b;
import f2.s;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f20181a = new b0();

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20182a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f20183b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f20184c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f20185d;

        static {
            int[] iArr = new int[s.a.values().length];
            try {
                iArr[s.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f20182a = iArr;
            int[] iArr2 = new int[f2.a.values().length];
            try {
                iArr2[f2.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f2.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f20183b = iArr2;
            int[] iArr3 = new int[f2.k.values().length];
            try {
                iArr3[f2.k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[f2.k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[f2.k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[f2.k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[f2.k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f20184c = iArr3;
            int[] iArr4 = new int[f2.n.values().length];
            try {
                iArr4[f2.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[f2.n.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f20185d = iArr4;
        }
    }

    private b0() {
    }

    public static final int a(f2.a backoffPolicy) {
        kotlin.jvm.internal.n.e(backoffPolicy, "backoffPolicy");
        int i10 = a.f20183b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new ck.l();
    }

    public static final Set<b.c> b(byte[] bytes) {
        ObjectInputStream objectInputStream;
        kotlin.jvm.internal.n.e(bytes, "bytes");
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
                    kotlin.jvm.internal.n.d(uri, "uri");
                    linkedHashSet.add(new b.c(uri, readBoolean));
                }
                ck.v vVar = ck.v.f7137a;
                mk.b.a(objectInputStream, null);
                ck.v vVar2 = ck.v.f7137a;
                mk.b.a(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                mk.b.a(byteArrayInputStream, th2);
                throw th3;
            }
        }
    }

    public static final f2.a c(int i10) {
        if (i10 == 0) {
            return f2.a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return f2.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static final f2.k d(int i10) {
        if (i10 == 0) {
            return f2.k.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return f2.k.CONNECTED;
        }
        if (i10 == 2) {
            return f2.k.UNMETERED;
        }
        if (i10 == 3) {
            return f2.k.NOT_ROAMING;
        }
        if (i10 == 4) {
            return f2.k.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return f2.k.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static final f2.n e(int i10) {
        if (i10 == 0) {
            return f2.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return f2.n.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static final s.a f(int i10) {
        if (i10 == 0) {
            return s.a.ENQUEUED;
        }
        if (i10 == 1) {
            return s.a.RUNNING;
        }
        if (i10 == 2) {
            return s.a.SUCCEEDED;
        }
        if (i10 == 3) {
            return s.a.FAILED;
        }
        if (i10 == 4) {
            return s.a.BLOCKED;
        }
        if (i10 == 5) {
            return s.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static final int g(f2.k networkType) {
        kotlin.jvm.internal.n.e(networkType, "networkType");
        int i10 = a.f20184c[networkType.ordinal()];
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
                if (Build.VERSION.SDK_INT >= 30 && networkType == f2.k.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + networkType + " to int");
            }
        }
        return i11;
    }

    public static final int h(f2.n policy) {
        kotlin.jvm.internal.n.e(policy, "policy");
        int i10 = a.f20185d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new ck.l();
    }

    public static final byte[] i(Set<b.c> triggers) {
        kotlin.jvm.internal.n.e(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (b.c cVar : triggers) {
                    objectOutputStream.writeUTF(cVar.a().toString());
                    objectOutputStream.writeBoolean(cVar.b());
                }
                ck.v vVar = ck.v.f7137a;
                mk.b.a(objectOutputStream, null);
                mk.b.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.n.d(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int j(s.a state) {
        kotlin.jvm.internal.n.e(state, "state");
        switch (a.f20182a[state.ordinal()]) {
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
                throw new ck.l();
        }
    }
}
