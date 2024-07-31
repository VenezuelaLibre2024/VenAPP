.class final Lio/grpc/internal/f1$c;
.super Lvi/p0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1;->A0(Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "c"
.end annotation


# instance fields
.field private final a:Lvi/p0$e;

.field final synthetic b:Ljava/lang/Throwable;

.field final synthetic c:Lio/grpc/internal/f1;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$c;->c:Lio/grpc/internal/f1;

    iput-object p2, p0, Lio/grpc/internal/f1$c;->b:Ljava/lang/Throwable;

    invoke-direct {p0}, Lvi/p0$i;-><init>()V

    sget-object p1, Lvi/g1;->t:Lvi/g1;

    const-string v0, "Panic! This is a bug!"

    invoke-virtual {p1, v0}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object p1

    invoke-virtual {p1, p2}, Lvi/g1;->q(Ljava/lang/Throwable;)Lvi/g1;

    move-result-object p1

    invoke-static {p1}, Lvi/p0$e;->e(Lvi/g1;)Lvi/p0$e;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/f1$c;->a:Lvi/p0$e;

    return-void
.end method


# virtual methods
.method public a(Lvi/p0$f;)Lvi/p0$e;
    .locals 0

    iget-object p1, p0, Lio/grpc/internal/f1$c;->a:Lvi/p0$e;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-class v0, Lio/grpc/internal/f1$c;

    invoke-static {v0}, Leb/i;->b(Ljava/lang/Class;)Leb/i$b;

    move-result-object v0

    const-string v1, "panicPickResult"

    iget-object v2, p0, Lio/grpc/internal/f1$c;->a:Lvi/p0$e;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
