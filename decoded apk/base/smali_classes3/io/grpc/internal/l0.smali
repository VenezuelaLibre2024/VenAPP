.class abstract Lio/grpc/internal/l0;
.super Lvi/s0;
.source "SourceFile"


# instance fields
.field private final a:Lvi/s0;


# direct methods
.method constructor <init>(Lvi/s0;)V
    .locals 0

    invoke-direct {p0}, Lvi/s0;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/l0;->a:Lvi/s0;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/l0;->a:Lvi/s0;

    invoke-virtual {v0}, Lvi/d;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Lvi/x0;Lvi/c;)Lvi/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestT:",
            "Ljava/lang/Object;",
            "ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/x0<",
            "TRequestT;TResponseT;>;",
            "Lvi/c;",
            ")",
            "Lvi/g<",
            "TRequestT;TResponseT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/l0;->a:Lvi/s0;

    invoke-virtual {v0, p1, p2}, Lvi/d;->h(Lvi/x0;Lvi/c;)Lvi/g;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "delegate"

    iget-object v2, p0, Lio/grpc/internal/l0;->a:Lvi/s0;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
