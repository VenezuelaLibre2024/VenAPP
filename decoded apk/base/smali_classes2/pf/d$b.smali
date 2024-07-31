.class public final Lpf/d$b;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpf/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lpf/d;",
        "Lpf/d$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lpf/d;->Z()Lpf/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lpf/d$a;)V
    .locals 0

    invoke-direct {p0}, Lpf/d$b;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Ljava/lang/Iterable;)Lpf/d$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lpf/a;",
            ">;)",
            "Lpf/d$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lpf/d;

    invoke-static {v0, p1}, Lpf/d;->d0(Lpf/d;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public J(Lyb/b;)Lpf/d$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lpf/d;

    invoke-static {v0, p1}, Lpf/d;->e0(Lpf/d;Lyb/b;)V

    return-object p0
.end method

.method public K(Ljava/lang/String;)Lpf/d$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lpf/d;

    invoke-static {v0, p1}, Lpf/d;->b0(Lpf/d;Ljava/lang/String;)V

    return-object p0
.end method

.method public L(Lpf/c;)Lpf/d$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lpf/d;

    invoke-static {v0, p1}, Lpf/d;->f0(Lpf/d;Lpf/c;)V

    return-object p0
.end method
