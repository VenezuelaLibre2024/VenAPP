.class public final Lxe/g$b;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lxe/g;",
        "Lxe/g$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lxe/g;->Z()Lxe/g;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lxe/g$a;)V
    .locals 0

    invoke-direct {p0}, Lxe/g$b;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Lxe/b;)Lxe/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/g;

    invoke-static {v0, p1}, Lxe/g;->d0(Lxe/g;Lxe/b;)V

    return-object p0
.end method

.method public J(Lxe/e;)Lxe/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/g;

    invoke-static {v0, p1}, Lxe/g;->f0(Lxe/g;Lxe/e;)V

    return-object p0
.end method

.method public K(Lxe/f;)Lxe/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/g;

    invoke-static {v0, p1}, Lxe/g;->e0(Lxe/g;Lxe/f;)V

    return-object p0
.end method

.method public L(Ljava/lang/String;)Lxe/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/g;

    invoke-static {v0, p1}, Lxe/g;->b0(Lxe/g;Ljava/lang/String;)V

    return-object p0
.end method
