.class public final Lyb/b$a;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lyb/b;",
        "Lyb/b$a;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lyb/b;->Z()Lyb/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lyb/a;)V
    .locals 0

    invoke-direct {p0}, Lyb/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Ljava/lang/String;)Lyb/b$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lyb/b;

    invoke-static {v0, p1}, Lyb/b;->b0(Lyb/b;Ljava/lang/String;)V

    return-object p0
.end method

.method public J(Ljava/lang/String;)Lyb/b$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lyb/b;

    invoke-static {v0, p1}, Lyb/b;->f0(Lyb/b;Ljava/lang/String;)V

    return-object p0
.end method

.method public K(Ljava/lang/String;)Lyb/b$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lyb/b;

    invoke-static {v0, p1}, Lyb/b;->e0(Lyb/b;Ljava/lang/String;)V

    return-object p0
.end method

.method public L(Ljava/lang/String;)Lyb/b$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lyb/b;

    invoke-static {v0, p1}, Lyb/b;->d0(Lyb/b;Ljava/lang/String;)V

    return-object p0
.end method
