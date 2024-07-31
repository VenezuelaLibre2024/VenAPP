.class public final Lxe/h$b;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lxe/h;",
        "Lxe/h$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lxe/h;->Z()Lxe/h;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lxe/h$a;)V
    .locals 0

    invoke-direct {p0}, Lxe/h$b;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Ljava/lang/Iterable;)Lxe/h$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lxe/k;",
            ">;)",
            "Lxe/h$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0, p1}, Lxe/h;->m0(Lxe/h;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public J()Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0}, Lxe/h;->l0(Lxe/h;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-object p0
.end method

.method public K()Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0}, Lxe/h;->g0(Lxe/h;)V

    return-object p0
.end method

.method public L()J
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-virtual {v0}, Lxe/h;->E0()J

    move-result-wide v0

    return-wide v0
.end method

.method public M()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-virtual {v0}, Lxe/h;->F0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public N()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-virtual {v0}, Lxe/h;->G0()Z

    move-result v0

    return v0
.end method

.method public O()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-virtual {v0}, Lxe/h;->I0()Z

    move-result v0

    return v0
.end method

.method public P()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-virtual {v0}, Lxe/h;->M0()Z

    move-result v0

    return v0
.end method

.method public R(Ljava/util/Map;)Lxe/h$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lxe/h$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0}, Lxe/h;->l0(Lxe/h;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public S(J)Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0, p1, p2}, Lxe/h;->h0(Lxe/h;J)V

    return-object p0
.end method

.method public T(Lxe/h$d;)Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0, p1}, Lxe/h;->n0(Lxe/h;Lxe/h$d;)V

    return-object p0
.end method

.method public U(I)Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0, p1}, Lxe/h;->e0(Lxe/h;I)V

    return-object p0
.end method

.method public V(Lxe/h$e;)Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0, p1}, Lxe/h;->d0(Lxe/h;Lxe/h$e;)V

    return-object p0
.end method

.method public W(J)Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0, p1, p2}, Lxe/h;->o0(Lxe/h;J)V

    return-object p0
.end method

.method public X(Ljava/lang/String;)Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0, p1}, Lxe/h;->f0(Lxe/h;Ljava/lang/String;)V

    return-object p0
.end method

.method public Y(J)Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0, p1, p2}, Lxe/h;->p0(Lxe/h;J)V

    return-object p0
.end method

.method public Z(J)Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0, p1, p2}, Lxe/h;->i0(Lxe/h;J)V

    return-object p0
.end method

.method public b0(J)Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0, p1, p2}, Lxe/h;->k0(Lxe/h;J)V

    return-object p0
.end method

.method public d0(J)Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0, p1, p2}, Lxe/h;->j0(Lxe/h;J)V

    return-object p0
.end method

.method public e0(Ljava/lang/String;)Lxe/h$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/h;

    invoke-static {v0, p1}, Lxe/h;->b0(Lxe/h;Ljava/lang/String;)V

    return-object p0
.end method
