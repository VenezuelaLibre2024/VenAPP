.class final Lcom/google/crypto/tink/shaded/protobuf/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/google/crypto/tink/shaded/protobuf/n1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "**>;"
        }
    .end annotation
.end field

.field private static final c:Lcom/google/crypto/tink/shaded/protobuf/n1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "**>;"
        }
    .end annotation
.end field

.field private static final d:Lcom/google/crypto/tink/shaded/protobuf/n1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/i1;->B()Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/i1;->a:Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/i1;->C(Z)Lcom/google/crypto/tink/shaded/protobuf/n1;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/i1;->b:Lcom/google/crypto/tink/shaded/protobuf/n1;

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/i1;->C(Z)Lcom/google/crypto/tink/shaded/protobuf/n1;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/i1;->c:Lcom/google/crypto/tink/shaded/protobuf/n1;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/p1;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/p1;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/i1;->d:Lcom/google/crypto/tink/shaded/protobuf/n1;

    return-void
.end method

.method static A(Ljava/lang/Object;ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/a0$e;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/n1;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$e;",
            "TUB;",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "TUT;TUB;>;)TUB;"
        }
    .end annotation

    if-nez p3, :cond_0

    return-object p4

    :cond_0
    instance-of v0, p2, Ljava/util/RandomAccess;

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {p3, v3}, Lcom/google/crypto/tink/shaded/protobuf/a0$e;->a(I)Z

    move-result v4

    if-eqz v4, :cond_2

    if-eq v1, v2, :cond_1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p2, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-static {p0, p1, v3, p4, p5}, Lcom/google/crypto/tink/shaded/protobuf/i1;->L(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/n1;)Ljava/lang/Object;

    move-result-object p4

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    if-eq v2, v0, :cond_6

    invoke-interface {p2, v2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->clear()V

    goto :goto_3

    :cond_4
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p3, v0}, Lcom/google/crypto/tink/shaded/protobuf/a0$e;->a(I)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {p0, p1, v0, p4, p5}, Lcom/google/crypto/tink/shaded/protobuf/i1;->L(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/n1;)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    :cond_6
    :goto_3
    return-object p4
.end method

.method private static B()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    :try_start_0
    const-string v0, "com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static C(Z)Lcom/google/crypto/tink/shaded/protobuf/n1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "**>;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/i1;->D()Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    aput-object p0, v2, v5

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/n1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    return-object v0
.end method

.method private static D()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    :try_start_0
    const-string v0, "com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method static E(Lcom/google/crypto/tink/shaded/protobuf/q;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "FT::",
            "Lcom/google/crypto/tink/shaded/protobuf/u$b<",
            "TFT;>;>(",
            "Lcom/google/crypto/tink/shaded/protobuf/q<",
            "TFT;>;TT;TT;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/u;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/u;->m()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/q;->d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/u;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/u;->u(Lcom/google/crypto/tink/shaded/protobuf/u;)V

    :cond_0
    return-void
.end method

.method static F(Lcom/google/crypto/tink/shaded/protobuf/m0;Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/shaded/protobuf/m0;",
            "TT;TT;J)V"
        }
    .end annotation

    invoke-static {p1, p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/r1;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/r1;->C(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/m0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p1, p3, p4, p0}, Lcom/google/crypto/tink/shaded/protobuf/r1;->R(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method static G(Lcom/google/crypto/tink/shaded/protobuf/n1;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "TUT;TUB;>;TT;TT;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/n1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/n1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/n1;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/n1;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static H()Lcom/google/crypto/tink/shaded/protobuf/n1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "**>;"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/i1;->b:Lcom/google/crypto/tink/shaded/protobuf/n1;

    return-object v0
.end method

.method public static I()Lcom/google/crypto/tink/shaded/protobuf/n1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "**>;"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/i1;->c:Lcom/google/crypto/tink/shaded/protobuf/n1;

    return-object v0
.end method

.method public static J(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const-class v0, Lcom/google/crypto/tink/shaded/protobuf/y;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/i1;->a:Ljava/lang/Class;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method static K(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method static L(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/n1;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "IITUB;",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "TUT;TUB;>;)TUB;"
        }
    .end annotation

    if-nez p3, :cond_0

    invoke-virtual {p4, p0}, Lcom/google/crypto/tink/shaded/protobuf/n1;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    :cond_0
    int-to-long v0, p2

    invoke-virtual {p4, p3, p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/n1;->e(Ljava/lang/Object;IJ)V

    return-object p3
.end method

.method public static M()Lcom/google/crypto/tink/shaded/protobuf/n1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "**>;"
        }
    .end annotation

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/i1;->d:Lcom/google/crypto/tink/shaded/protobuf/n1;

    return-object v0
.end method

.method public static N(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->A(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static O(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/google/crypto/tink/shaded/protobuf/h;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u1;->I(ILjava/util/List;)V

    :cond_0
    return-void
.end method

.method public static P(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->G(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static Q(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->n(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static R(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->j(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static S(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->y(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static T(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->a(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static U(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Lcom/google/crypto/tink/shaded/protobuf/g1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Lcom/google/crypto/tink/shaded/protobuf/g1;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->O(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/g1;)V

    :cond_0
    return-void
.end method

.method public static V(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->g(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static W(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->F(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static X(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Lcom/google/crypto/tink/shaded/protobuf/g1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Lcom/google/crypto/tink/shaded/protobuf/g1;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->L(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/g1;)V

    :cond_0
    return-void
.end method

.method public static Y(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->z(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static Z(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->q(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method static a(ILjava/util/List;Z)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;Z)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->C(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0

    :cond_1
    const/4 p2, 0x1

    invoke-static {p0, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->d(IZ)I

    move-result p0

    mul-int/2addr p1, p0

    return p1
.end method

.method public static a0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->D(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method static b(Ljava/util/List;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public static b0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->l(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method static c(ILjava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/google/crypto/tink/shaded/protobuf/h;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    mul-int/2addr v0, p0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p0

    if-ge v1, p0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->h(Lcom/google/crypto/tink/shaded/protobuf/h;)I

    move-result p0

    add-int/2addr v0, p0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static c0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/u1;->d(ILjava/util/List;)V

    :cond_0
    return-void
.end method

.method static d(ILjava/util/List;Z)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i1;->e(Ljava/util/List;)I

    move-result p1

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    if-eqz p2, :cond_1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->C(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0

    :cond_1
    mul-int/2addr v0, p0

    add-int/2addr p1, v0

    return p1
.end method

.method public static d0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->k(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method static e(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    if-eqz v2, :cond_1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->getInt(I)I

    move-result v3

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->l(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->l(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return v2
.end method

.method public static e0(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/u1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/u1;",
            "Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/u1;->r(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method static f(ILjava/util/List;Z)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;Z)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-eqz p2, :cond_1

    mul-int/lit8 p1, p1, 0x4

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->C(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0

    :cond_1
    invoke-static {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/k;->m(II)I

    move-result p0

    mul-int/2addr p1, p0

    return p1
.end method

.method static g(Ljava/util/List;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    mul-int/lit8 p0, p0, 0x4

    return p0
.end method

.method static h(ILjava/util/List;Z)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;Z)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-eqz p2, :cond_1

    mul-int/lit8 p1, p1, 0x8

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->C(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0

    :cond_1
    const-wide/16 v0, 0x0

    invoke-static {p0, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->o(IJ)I

    move-result p0

    mul-int/2addr p1, p0

    return p1
.end method

.method static i(Ljava/util/List;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    mul-int/lit8 p0, p0, 0x8

    return p0
.end method

.method static j(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/g1;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/google/crypto/tink/shaded/protobuf/r0;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/g1;",
            ")I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/r0;

    invoke-static {p0, v3, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->s(ILcom/google/crypto/tink/shaded/protobuf/r0;Lcom/google/crypto/tink/shaded/protobuf/g1;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method static k(ILjava/util/List;Z)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i1;->l(Ljava/util/List;)I

    move-result p1

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    if-eqz p2, :cond_1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->C(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0

    :cond_1
    mul-int/2addr v0, p0

    add-int/2addr p1, v0

    return p1
.end method

.method static l(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    if-eqz v2, :cond_1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->getInt(I)I

    move-result v3

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->w(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->w(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return v2
.end method

.method static m(ILjava/util/List;Z)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i1;->n(Ljava/util/List;)I

    move-result v0

    if-eqz p2, :cond_1

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/k;->C(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    mul-int/2addr p1, p0

    add-int/2addr v0, p1

    return v0
.end method

.method static n(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/crypto/tink/shaded/protobuf/i0;

    if-eqz v2, :cond_1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/i0;

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i0;->n(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->y(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->y(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return v2
.end method

.method static o(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;)I
    .locals 1

    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/e0;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/e0;

    invoke-static {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->A(ILcom/google/crypto/tink/shaded/protobuf/e0;)I

    move-result p0

    return p0

    :cond_0
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/r0;

    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->F(ILcom/google/crypto/tink/shaded/protobuf/r0;Lcom/google/crypto/tink/shaded/protobuf/g1;)I

    move-result p0

    return p0
.end method

.method static p(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/g1;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/g1;",
            ")I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    mul-int/2addr p0, v0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/google/crypto/tink/shaded/protobuf/e0;

    if-eqz v3, :cond_1

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/e0;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->B(Lcom/google/crypto/tink/shaded/protobuf/e0;)I

    move-result v2

    goto :goto_1

    :cond_1
    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/r0;

    invoke-static {v2, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->H(Lcom/google/crypto/tink/shaded/protobuf/r0;Lcom/google/crypto/tink/shaded/protobuf/g1;)I

    move-result v2

    :goto_1
    add-int/2addr p0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return p0
.end method

.method static q(ILjava/util/List;Z)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i1;->r(Ljava/util/List;)I

    move-result p1

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    if-eqz p2, :cond_1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->C(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0

    :cond_1
    mul-int/2addr v0, p0

    add-int/2addr p1, v0

    return p1
.end method

.method static r(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    if-eqz v2, :cond_1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->getInt(I)I

    move-result v3

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->O(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->O(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return v2
.end method

.method static s(ILjava/util/List;Z)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i1;->t(Ljava/util/List;)I

    move-result p1

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    if-eqz p2, :cond_1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->C(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0

    :cond_1
    mul-int/2addr v0, p0

    add-int/2addr p1, v0

    return p1
.end method

.method static t(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/crypto/tink/shaded/protobuf/i0;

    if-eqz v2, :cond_1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/i0;

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i0;->n(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return v2
.end method

.method static u(ILjava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    mul-int/2addr p0, v0

    instance-of v2, p1, Lcom/google/crypto/tink/shaded/protobuf/g0;

    if-eqz v2, :cond_2

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/g0;

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-interface {p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/g0;->j(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v3, :cond_1

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->h(Lcom/google/crypto/tink/shaded/protobuf/h;)I

    move-result v2

    goto :goto_1

    :cond_1
    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->S(Ljava/lang/String;)I

    move-result v2

    :goto_1
    add-int/2addr p0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    if-ge v1, v0, :cond_4

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v3, :cond_3

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->h(Lcom/google/crypto/tink/shaded/protobuf/h;)I

    move-result v2

    goto :goto_3

    :cond_3
    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->S(Ljava/lang/String;)I

    move-result v2

    :goto_3
    add-int/2addr p0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    return p0
.end method

.method static v(ILjava/util/List;Z)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i1;->w(Ljava/util/List;)I

    move-result p1

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    if-eqz p2, :cond_1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->C(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0

    :cond_1
    mul-int/2addr v0, p0

    add-int/2addr p1, v0

    return p1
.end method

.method static w(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    if-eqz v2, :cond_1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/z;

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/z;->getInt(I)I

    move-result v3

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->V(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lcom/google/crypto/tink/shaded/protobuf/k;->V(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return v2
.end method

.method static x(ILjava/util/List;Z)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i1;->y(Ljava/util/List;)I

    move-result p1

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/k;->T(I)I

    move-result p0

    if-eqz p2, :cond_1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/k;->C(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0

    :cond_1
    mul-int/2addr v0, p0

    add-int/2addr p1, v0

    return p1
.end method

.method static y(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/crypto/tink/shaded/protobuf/i0;

    if-eqz v2, :cond_1

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/i0;

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i0;->n(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->X(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/k;->X(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return v2
.end method

.method static z(Ljava/lang/Object;ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/a0$d;Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/n1;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/crypto/tink/shaded/protobuf/a0$d<",
            "*>;TUB;",
            "Lcom/google/crypto/tink/shaded/protobuf/n1<",
            "TUT;TUB;>;)TUB;"
        }
    .end annotation

    if-nez p3, :cond_0

    return-object p4

    :cond_0
    instance-of v0, p2, Ljava/util/RandomAccess;

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {p3, v3}, Lcom/google/crypto/tink/shaded/protobuf/a0$d;->a(I)Lcom/google/crypto/tink/shaded/protobuf/a0$c;

    move-result-object v4

    if-eqz v4, :cond_2

    if-eq v1, v2, :cond_1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p2, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-static {p0, p1, v3, p4, p5}, Lcom/google/crypto/tink/shaded/protobuf/i1;->L(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/n1;)Ljava/lang/Object;

    move-result-object p4

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    if-eq v2, v0, :cond_6

    invoke-interface {p2, v2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->clear()V

    goto :goto_3

    :cond_4
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p3, v0}, Lcom/google/crypto/tink/shaded/protobuf/a0$d;->a(I)Lcom/google/crypto/tink/shaded/protobuf/a0$c;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-static {p0, p1, v0, p4, p5}, Lcom/google/crypto/tink/shaded/protobuf/i1;->L(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/n1;)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    :cond_6
    :goto_3
    return-object p4
.end method
