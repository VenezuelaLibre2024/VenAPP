.class public final Lqd/b$b;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lqd/b;",
        "Lqd/b$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lqd/b;->Z()Lqd/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lqd/b$a;)V
    .locals 0

    invoke-direct {p0}, Lqd/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Ljava/lang/String;)Lqd/b$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lqd/b;

    invoke-static {v0, p1}, Lqd/b;->d0(Lqd/b;Ljava/lang/String;)V

    return-object p0
.end method

.method public J(Ljava/lang/String;)Lqd/b$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lqd/b;

    invoke-static {v0, p1}, Lqd/b;->b0(Lqd/b;Ljava/lang/String;)V

    return-object p0
.end method
