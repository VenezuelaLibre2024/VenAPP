package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.google.gson.internal.b */
/* loaded from: classes2.dex */
public final class C6429b {

    /* renamed from: a */
    static final Type[] f14056a = new Type[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.gson.internal.b$a */
    /* loaded from: classes2.dex */
    public static final class a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f14057a;

        public a(Type type) {
            this.f14057a = C6429b.m18077b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C6429b.m18081f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f14057a;
        }

        public int hashCode() {
            return this.f14057a.hashCode();
        }

        public String toString() {
            return C6429b.m18096u(this.f14057a) + "[]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.gson.internal.b$b */
    /* loaded from: classes2.dex */
    public static final class b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f14058a;

        /* renamed from: b */
        private final Type f14059b;

        /* renamed from: c */
        private final Type[] f14060c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z10 = true;
                boolean z11 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z11) {
                    z10 = false;
                }
                C6428a.m18074a(z10);
            }
            this.f14058a = type == null ? null : C6429b.m18077b(type);
            this.f14059b = C6429b.m18077b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f14060c = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                C6428a.m18075b(this.f14060c[i10]);
                C6429b.m18078c(this.f14060c[i10]);
                Type[] typeArr3 = this.f14060c;
                typeArr3[i10] = C6429b.m18077b(typeArr3[i10]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C6429b.m18081f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f14060c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f14058a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f14059b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f14060c) ^ this.f14059b.hashCode()) ^ C6429b.m18088m(this.f14058a);
        }

        public String toString() {
            int length = this.f14060c.length;
            if (length == 0) {
                return C6429b.m18096u(this.f14059b);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(C6429b.m18096u(this.f14059b));
            sb2.append("<");
            sb2.append(C6429b.m18096u(this.f14060c[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(C6429b.m18096u(this.f14060c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.gson.internal.b$c */
    /* loaded from: classes2.dex */
    public static final class c implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f14061a;

        /* renamed from: b */
        private final Type f14062b;

        public c(Type[] typeArr, Type[] typeArr2) {
            C6428a.m18074a(typeArr2.length <= 1);
            C6428a.m18074a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                C6428a.m18075b(typeArr[0]);
                C6429b.m18078c(typeArr[0]);
                this.f14062b = null;
                this.f14061a = C6429b.m18077b(typeArr[0]);
                return;
            }
            C6428a.m18075b(typeArr2[0]);
            C6429b.m18078c(typeArr2[0]);
            C6428a.m18074a(typeArr[0] == Object.class);
            this.f14062b = C6429b.m18077b(typeArr2[0]);
            this.f14061a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C6429b.m18081f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f14062b;
            return type != null ? new Type[]{type} : C6429b.f14056a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f14061a};
        }

        public int hashCode() {
            Type type = this.f14062b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f14061a.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb2;
            Type type;
            if (this.f14062b != null) {
                sb2 = new StringBuilder();
                sb2.append("? super ");
                type = this.f14062b;
            } else {
                if (this.f14061a == Object.class) {
                    return "?";
                }
                sb2 = new StringBuilder();
                sb2.append("? extends ");
                type = this.f14061a;
            }
            sb2.append(C6429b.m18096u(type));
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static GenericArrayType m18076a(Type type) {
        return new a(type);
    }

    /* renamed from: b */
    public static Type m18077b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(m18077b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* renamed from: c */
    static void m18078c(Type type) {
        C6428a.m18074a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: d */
    private static Class<?> m18079d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    static boolean m18080e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static boolean m18081f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m18080e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m18081f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* renamed from: g */
    public static Type m18082g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m18083h(Type type, Class<?> cls) {
        Type m18087l = m18087l(type, cls, Collection.class);
        if (m18087l instanceof WildcardType) {
            m18087l = ((WildcardType) m18087l).getUpperBounds()[0];
        }
        return m18087l instanceof ParameterizedType ? ((ParameterizedType) m18087l).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: i */
    static Type m18084i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m18084i(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m18084i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m18085j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type m18087l = m18087l(type, cls, Map.class);
        return m18087l instanceof ParameterizedType ? ((ParameterizedType) m18087l).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* renamed from: k */
    public static Class<?> m18086k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C6428a.m18074a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m18086k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m18086k(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: l */
    static Type m18087l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C6428a.m18074a(cls2.isAssignableFrom(cls));
        return m18091p(type, cls, m18084i(type, cls, cls2));
    }

    /* renamed from: m */
    static int m18088m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: n */
    private static int m18089n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: o */
    public static ParameterizedType m18090o(Type type, Type type2, Type... typeArr) {
        return new b(type, type2, typeArr);
    }

    /* renamed from: p */
    public static Type m18091p(Type type, Class<?> cls, Type type2) {
        return m18092q(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d7, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d9, code lost:
    
        r12.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00dc, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (m18080e(r1, r9) != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>, java.util.Map] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type m18092q(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            r0 = 0
        L1:
            boolean r1 = r11 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L27
            r1 = r11
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r12.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r2 == 0) goto L17
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r2 != r9) goto L15
            goto L16
        L15:
            r11 = r2
        L16:
            return r11
        L17:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r1, r11)
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            java.lang.reflect.Type r11 = m18093r(r9, r10, r1)
            if (r11 != r1) goto L1
            goto Ld7
        L27:
            boolean r1 = r11 instanceof java.lang.Class
            if (r1 == 0) goto L4c
            r1 = r11
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L4c
            java.lang.Class r11 = r1.getComponentType()
            java.lang.reflect.Type r9 = m18092q(r9, r10, r11, r12)
            boolean r10 = m18080e(r11, r9)
            if (r10 == 0) goto L45
            r11 = r1
            goto Ld7
        L45:
            java.lang.reflect.GenericArrayType r9 = m18076a(r9)
        L49:
            r11 = r9
            goto Ld7
        L4c:
            boolean r1 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L62
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r1 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = m18092q(r9, r10, r1, r12)
            boolean r10 = m18080e(r1, r9)
            if (r10 == 0) goto L45
            goto Ld7
        L62:
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            r3 = 1
            if (r1 == 0) goto La6
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r1 = r11.getOwnerType()
            java.lang.reflect.Type r4 = m18092q(r9, r10, r1, r12)
            boolean r1 = m18080e(r4, r1)
            r1 = r1 ^ r3
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L7c:
            if (r2 >= r6) goto L9b
            r7 = r5[r2]
            java.lang.reflect.Type r7 = m18092q(r9, r10, r7, r12)
            r8 = r5[r2]
            boolean r8 = m18080e(r7, r8)
            if (r8 != 0) goto L98
            if (r1 != 0) goto L96
            java.lang.Object r1 = r5.clone()
            r5 = r1
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r1 = r3
        L96:
            r5[r2] = r7
        L98:
            int r2 = r2 + 1
            goto L7c
        L9b:
            if (r1 == 0) goto Ld7
            java.lang.reflect.Type r9 = r11.getRawType()
            java.lang.reflect.ParameterizedType r9 = m18090o(r4, r9, r5)
            goto L49
        La6:
            boolean r1 = r11 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto Ld7
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r1 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r1.length
            if (r5 != r3) goto Lc6
            r3 = r1[r2]
            java.lang.reflect.Type r9 = m18092q(r9, r10, r3, r12)
            r10 = r1[r2]
            if (r9 == r10) goto Ld7
            java.lang.reflect.WildcardType r11 = m18095t(r9)
            goto Ld7
        Lc6:
            int r1 = r4.length
            if (r1 != r3) goto Ld7
            r1 = r4[r2]
            java.lang.reflect.Type r9 = m18092q(r9, r10, r1, r12)
            r10 = r4[r2]
            if (r9 == r10) goto Ld7
            java.lang.reflect.WildcardType r11 = m18094s(r9)
        Ld7:
            if (r0 == 0) goto Ldc
            r12.put(r0, r11)
        Ldc:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C6429b.m18092q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    /* renamed from: r */
    static Type m18093r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> m18079d = m18079d(typeVariable);
        if (m18079d == null) {
            return typeVariable;
        }
        Type m18084i = m18084i(type, cls, m18079d);
        if (!(m18084i instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) m18084i).getActualTypeArguments()[m18089n(m18079d.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static WildcardType m18094s(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f14056a);
    }

    /* renamed from: t */
    public static WildcardType m18095t(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* renamed from: u */
    public static String m18096u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
