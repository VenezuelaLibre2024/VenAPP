.class public final Lxe/e$b;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lxe/e;",
        "Lxe/e$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lxe/e;->Z()Lxe/e;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lxe/e$a;)V
    .locals 0

    invoke-direct {p0}, Lxe/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public I(J)Lxe/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/e;

    invoke-static {v0, p1, p2}, Lxe/e;->b0(Lxe/e;J)V

    return-object p0
.end method

.method public J(J)Lxe/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/e;

    invoke-static {v0, p1, p2}, Lxe/e;->e0(Lxe/e;J)V

    return-object p0
.end method

.method public K(J)Lxe/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/e;

    invoke-static {v0, p1, p2}, Lxe/e;->d0(Lxe/e;J)V

    return-object p0
.end method
