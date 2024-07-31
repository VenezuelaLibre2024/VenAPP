.class public final Lxe/i$b;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lxe/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lxe/i;",
        "Lxe/i$b;",
        ">;",
        "Lxe/j;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lxe/i;->Z()Lxe/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lxe/i$a;)V
    .locals 0

    invoke-direct {p0}, Lxe/i$b;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Lxe/c$b;)Lxe/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/i;

    invoke-virtual {p1}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p1

    check-cast p1, Lxe/c;

    invoke-static {v0, p1}, Lxe/i;->b0(Lxe/i;Lxe/c;)V

    return-object p0
.end method

.method public J(Lxe/g;)Lxe/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/i;

    invoke-static {v0, p1}, Lxe/i;->d0(Lxe/i;Lxe/g;)V

    return-object p0
.end method

.method public K(Lxe/h;)Lxe/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/i;

    invoke-static {v0, p1}, Lxe/i;->f0(Lxe/i;Lxe/h;)V

    return-object p0
.end method

.method public L(Lxe/m;)Lxe/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/i;

    invoke-static {v0, p1}, Lxe/i;->e0(Lxe/i;Lxe/m;)V

    return-object p0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/i;

    invoke-virtual {v0}, Lxe/i;->i()Z

    move-result v0

    return v0
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/i;

    invoke-virtual {v0}, Lxe/i;->j()Z

    move-result v0

    return v0
.end method

.method public k()Lxe/h;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/i;

    invoke-virtual {v0}, Lxe/i;->k()Lxe/h;

    move-result-object v0

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/i;

    invoke-virtual {v0}, Lxe/i;->m()Z

    move-result v0

    return v0
.end method

.method public p()Lxe/m;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/i;

    invoke-virtual {v0}, Lxe/i;->p()Lxe/m;

    move-result-object v0

    return-object v0
.end method

.method public q()Lxe/g;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/i;

    invoke-virtual {v0}, Lxe/i;->q()Lxe/g;

    move-result-object v0

    return-object v0
.end method
