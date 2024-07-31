package com.facebook.internal;

import android.content.Intent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;
import p152i4.InterfaceC7814m;

/* renamed from: com.facebook.internal.d */
/* loaded from: classes.dex */
public final class C4613d implements InterfaceC7814m {

    /* renamed from: b */
    public static final b f8700b = new b(null);

    /* renamed from: c */
    private static final Map<Integer, a> f8701c = new HashMap();

    /* renamed from: a */
    private final Map<Integer, a> f8702a = new HashMap();

    /* renamed from: com.facebook.internal.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo11144a(int i10, Intent intent);
    }

    /* renamed from: com.facebook.internal.d$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: b */
        private final synchronized a m11146b(int i10) {
            return (a) C4613d.f8701c.get(Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m11147d(int i10, int i11, Intent intent) {
            a m11146b = m11146b(i10);
            if (m11146b == null) {
                return false;
            }
            return m11146b.mo11144a(i11, intent);
        }

        /* renamed from: c */
        public final synchronized void m11148c(int i10, a callback) {
            C9322n.m27781e(callback, "callback");
            if (C4613d.f8701c.containsKey(Integer.valueOf(i10))) {
                return;
            }
            C4613d.f8701c.put(Integer.valueOf(i10), callback);
        }
    }

    /* renamed from: com.facebook.internal.d$c */
    /* loaded from: classes.dex */
    public enum c {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);

        private final int offset;

        c(int i10) {
            this.offset = i10;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        /* renamed from: h */
        public final int m11150h() {
            return C7799e0.m23865q() + this.offset;
        }
    }

    /* renamed from: b */
    public final void m11143b(int i10, a callback) {
        C9322n.m27781e(callback, "callback");
        this.f8702a.put(Integer.valueOf(i10), callback);
    }

    @Override // p152i4.InterfaceC7814m
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        a aVar = this.f8702a.get(Integer.valueOf(i10));
        return aVar == null ? f8700b.m11147d(i10, i11, intent) : aVar.mo11144a(i11, intent);
    }
}
