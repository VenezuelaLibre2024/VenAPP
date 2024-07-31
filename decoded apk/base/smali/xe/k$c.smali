.class public final Lxe/k$c;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lxe/k;",
        "Lxe/k$c;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lxe/k;->Z()Lxe/k;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lxe/k$a;)V
    .locals 0

    invoke-direct {p0}, Lxe/k$c;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Lxe/l;)Lxe/k$c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/k;

    invoke-static {v0, p1}, Lxe/k;->d0(Lxe/k;Lxe/l;)V

    return-object p0
.end method

.method public J(Ljava/lang/String;)Lxe/k$c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lxe/k;

    invoke-static {v0, p1}, Lxe/k;->b0(Lxe/k;Ljava/lang/String;)V

    return-object p0
.end method
