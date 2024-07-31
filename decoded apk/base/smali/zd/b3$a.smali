.class public final Lzd/b3$a;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzd/b3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lzd/b3;",
        "Lzd/b3$a;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lzd/b3;->Z()Lzd/b3;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lzd/a3;)V
    .locals 0

    invoke-direct {p0}, Lzd/b3$a;-><init>()V

    return-void
.end method


# virtual methods
.method public I()Lzd/b3$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lzd/b3;

    invoke-static {v0}, Lzd/b3;->d0(Lzd/b3;)V

    return-object p0
.end method

.method public J(J)Lzd/b3$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lzd/b3;

    invoke-static {v0, p1, p2}, Lzd/b3;->e0(Lzd/b3;J)V

    return-object p0
.end method

.method public K(J)Lzd/b3$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lzd/b3;

    invoke-static {v0, p1, p2}, Lzd/b3;->b0(Lzd/b3;J)V

    return-object p0
.end method
