.class public final Lxe/a$b;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lxe/a;",
        "Lxe/a$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lxe/a;->Z()Lxe/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lxe/a$a;)V
    .locals 0

    invoke-direct {p0}, Lxe/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Ljava/lang/String;)Lxe/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/a;

    invoke-static {v0, p1}, Lxe/a;->b0(Lxe/a;Ljava/lang/String;)V

    return-object p0
.end method

.method public J(Ljava/lang/String;)Lxe/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/a;

    invoke-static {v0, p1}, Lxe/a;->d0(Lxe/a;Ljava/lang/String;)V

    return-object p0
.end method

.method public K(Ljava/lang/String;)Lxe/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/a;

    invoke-static {v0, p1}, Lxe/a;->e0(Lxe/a;Ljava/lang/String;)V

    return-object p0
.end method
