.class final Lio/grpc/internal/j$d;
.super Lvi/p0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final a:Lvi/g1;


# direct methods
.method constructor <init>(Lvi/g1;)V
    .locals 0

    invoke-direct {p0}, Lvi/p0$i;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/j$d;->a:Lvi/g1;

    return-void
.end method


# virtual methods
.method public a(Lvi/p0$f;)Lvi/p0$e;
    .locals 0

    iget-object p1, p0, Lio/grpc/internal/j$d;->a:Lvi/g1;

    invoke-static {p1}, Lvi/p0$e;->f(Lvi/g1;)Lvi/p0$e;

    move-result-object p1

    return-object p1
.end method
