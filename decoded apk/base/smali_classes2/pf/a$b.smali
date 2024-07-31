.class public final Lpf/a$b;
.super Lcom/google/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x$a<",
        "Lpf/a;",
        "Lpf/a$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lpf/a;->Z()Lpf/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/x$a;-><init>(Lcom/google/protobuf/x;)V

    return-void
.end method

.method synthetic constructor <init>(Lpf/a$a;)V
    .locals 0

    invoke-direct {p0}, Lpf/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Ljava/lang/String;)Lpf/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lpf/a;

    invoke-static {v0, p1}, Lpf/a;->b0(Lpf/a;Ljava/lang/String;)V

    return-object p0
.end method

.method public J(J)Lpf/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->A()V

    iget-object v0, p0, Lcom/google/protobuf/x$a;->b:Lcom/google/protobuf/x;

    check-cast v0, Lpf/a;

    invoke-static {v0, p1, p2}, Lpf/a;->d0(Lpf/a;J)V

    return-object p0
.end method
