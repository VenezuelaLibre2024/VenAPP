.class final Lio/grpc/internal/q1$c;
.super Lvi/p0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/q1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Lvi/p0$e;


# direct methods
.method constructor <init>(Lvi/p0$e;)V
    .locals 1

    invoke-direct {p0}, Lvi/p0$i;-><init>()V

    const-string v0, "result"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/p0$e;

    iput-object p1, p0, Lio/grpc/internal/q1$c;->a:Lvi/p0$e;

    return-void
.end method


# virtual methods
.method public a(Lvi/p0$f;)Lvi/p0$e;
    .locals 0

    iget-object p1, p0, Lio/grpc/internal/q1$c;->a:Lvi/p0$e;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-class v0, Lio/grpc/internal/q1$c;

    invoke-static {v0}, Leb/i;->b(Ljava/lang/Class;)Leb/i$b;

    move-result-object v0

    const-string v1, "result"

    iget-object v2, p0, Lio/grpc/internal/q1$c;->a:Lvi/p0$e;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
