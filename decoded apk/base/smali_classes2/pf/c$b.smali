.class public final Lpf/c$b;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpf/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lpf/c;",
        "Lpf/c$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lpf/c;->Z()Lpf/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lpf/c$a;)V
    .locals 0

    invoke-direct {p0}, Lpf/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Ljava/lang/String;)Lpf/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lpf/c;

    invoke-static {v0, p1}, Lpf/c;->d0(Lpf/c;Ljava/lang/String;)V

    return-object p0
.end method

.method public J(Ljava/lang/String;)Lpf/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lpf/c;

    invoke-static {v0, p1}, Lpf/c;->e0(Lpf/c;Ljava/lang/String;)V

    return-object p0
.end method

.method public K(Ljava/lang/String;)Lpf/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lpf/c;

    invoke-static {v0, p1}, Lpf/c;->b0(Lpf/c;Ljava/lang/String;)V

    return-object p0
.end method
