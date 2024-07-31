.class public final Lqd/a$b;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lqd/a;",
        "Lqd/a$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lqd/a;->Z()Lqd/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lqd/a$a;)V
    .locals 0

    invoke-direct {p0}, Lqd/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Ljava/lang/String;)Lqd/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lqd/a;

    invoke-static {v0, p1}, Lqd/a;->i0(Lqd/a;Ljava/lang/String;)V

    return-object p0
.end method

.method public J(Lqd/b$b;)Lqd/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lqd/a;

    invoke-virtual {p1}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p1

    check-cast p1, Lqd/b;

    invoke-static {v0, p1}, Lqd/a;->j0(Lqd/a;Lqd/b;)V

    return-object p0
.end method

.method public K(J)Lqd/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lqd/a;

    invoke-static {v0, p1, p2}, Lqd/a;->b0(Lqd/a;J)V

    return-object p0
.end method

.method public L(Lqd/i;)Lqd/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lqd/a;

    invoke-static {v0, p1}, Lqd/a;->e0(Lqd/a;Lqd/i;)V

    return-object p0
.end method

.method public M(Lqd/j;)Lqd/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lqd/a;

    invoke-static {v0, p1}, Lqd/a;->d0(Lqd/a;Lqd/j;)V

    return-object p0
.end method

.method public N(Ljava/lang/String;)Lqd/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lqd/a;

    invoke-static {v0, p1}, Lqd/a;->h0(Lqd/a;Ljava/lang/String;)V

    return-object p0
.end method

.method public O(Ljava/lang/String;)Lqd/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lqd/a;

    invoke-static {v0, p1}, Lqd/a;->g0(Lqd/a;Ljava/lang/String;)V

    return-object p0
.end method

.method public P(Lqd/h0;)Lqd/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lqd/a;

    invoke-static {v0, p1}, Lqd/a;->f0(Lqd/a;Lqd/h0;)V

    return-object p0
.end method
