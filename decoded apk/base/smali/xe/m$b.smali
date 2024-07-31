.class public final Lxe/m$b;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lxe/m;",
        "Lxe/m$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lxe/m;->Z()Lxe/m;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lxe/m$a;)V
    .locals 0

    invoke-direct {p0}, Lxe/m$b;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Ljava/lang/Iterable;)Lxe/m$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lxe/k;",
            ">;)",
            "Lxe/m$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/m;

    invoke-static {v0, p1}, Lxe/m;->i0(Lxe/m;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public J(Ljava/lang/Iterable;)Lxe/m$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lxe/m;",
            ">;)",
            "Lxe/m$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/m;

    invoke-static {v0, p1}, Lxe/m;->f0(Lxe/m;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public K(Lxe/k;)Lxe/m$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/m;

    invoke-static {v0, p1}, Lxe/m;->h0(Lxe/m;Lxe/k;)V

    return-object p0
.end method

.method public L(Lxe/m;)Lxe/m$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/m;

    invoke-static {v0, p1}, Lxe/m;->e0(Lxe/m;Lxe/m;)V

    return-object p0
.end method

.method public M(Ljava/util/Map;)Lxe/m$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)",
            "Lxe/m$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/m;

    invoke-static {v0}, Lxe/m;->d0(Lxe/m;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public N(Ljava/util/Map;)Lxe/m$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lxe/m$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/m;

    invoke-static {v0}, Lxe/m;->g0(Lxe/m;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public O(Ljava/lang/String;J)Lxe/m$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/m;

    invoke-static {v0}, Lxe/m;->d0(Lxe/m;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public P(Ljava/lang/String;Ljava/lang/String;)Lxe/m$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/m;

    invoke-static {v0}, Lxe/m;->g0(Lxe/m;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public R(J)Lxe/m$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/m;

    invoke-static {v0, p1, p2}, Lxe/m;->j0(Lxe/m;J)V

    return-object p0
.end method

.method public S(J)Lxe/m$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/m;

    invoke-static {v0, p1, p2}, Lxe/m;->k0(Lxe/m;J)V

    return-object p0
.end method

.method public T(Ljava/lang/String;)Lxe/m$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/m;

    invoke-static {v0, p1}, Lxe/m;->b0(Lxe/m;Ljava/lang/String;)V

    return-object p0
.end method
