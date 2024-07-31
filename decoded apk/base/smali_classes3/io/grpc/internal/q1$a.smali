.class Lio/grpc/internal/q1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi/p0$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/q1;->a(Lvi/p0$g;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvi/p0$h;

.field final synthetic b:Lio/grpc/internal/q1;


# direct methods
.method constructor <init>(Lio/grpc/internal/q1;Lvi/p0$h;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/q1$a;->b:Lio/grpc/internal/q1;

    iput-object p2, p0, Lio/grpc/internal/q1$a;->a:Lvi/p0$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lvi/q;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/q1$a;->b:Lio/grpc/internal/q1;

    iget-object v1, p0, Lio/grpc/internal/q1$a;->a:Lvi/p0$h;

    invoke-static {v0, v1, p1}, Lio/grpc/internal/q1;->f(Lio/grpc/internal/q1;Lvi/p0$h;Lvi/q;)V

    return-void
.end method
