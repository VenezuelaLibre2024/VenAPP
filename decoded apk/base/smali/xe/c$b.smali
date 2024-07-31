.class public final Lxe/c$b;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lxe/c;",
        "Lxe/c$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lxe/c;->Z()Lxe/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lxe/c$a;)V
    .locals 0

    invoke-direct {p0}, Lxe/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public I()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/c;

    invoke-virtual {v0}, Lxe/c;->l0()Z

    move-result v0

    return v0
.end method

.method public J(Ljava/util/Map;)Lxe/c$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lxe/c$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/c;

    invoke-static {v0}, Lxe/c;->e0(Lxe/c;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public K(Lxe/a$b;)Lxe/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/c;

    invoke-virtual {p1}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p1

    check-cast p1, Lxe/a;

    invoke-static {v0, p1}, Lxe/c;->g0(Lxe/c;Lxe/a;)V

    return-object p0
.end method

.method public L(Ljava/lang/String;)Lxe/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/c;

    invoke-static {v0, p1}, Lxe/c;->f0(Lxe/c;Ljava/lang/String;)V

    return-object p0
.end method

.method public M(Lxe/d;)Lxe/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/c;

    invoke-static {v0, p1}, Lxe/c;->d0(Lxe/c;Lxe/d;)V

    return-object p0
.end method

.method public N(Ljava/lang/String;)Lxe/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/c;

    invoke-static {v0, p1}, Lxe/c;->b0(Lxe/c;Ljava/lang/String;)V

    return-object p0
.end method
