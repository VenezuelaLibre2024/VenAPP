.class public Lyi/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Lyi/a;

.field private b:Lio/grpc/okhttp/internal/e$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/grpc/okhttp/internal/e$b;

    invoke-direct {v0}, Lio/grpc/okhttp/internal/e$b;-><init>()V

    iput-object v0, p0, Lyi/b$b;->b:Lio/grpc/okhttp/internal/e$b;

    return-void
.end method

.method static synthetic a(Lyi/b$b;)Lyi/a;
    .locals 0

    iget-object p0, p0, Lyi/b$b;->a:Lyi/a;

    return-object p0
.end method

.method static synthetic b(Lyi/b$b;)Lio/grpc/okhttp/internal/e$b;
    .locals 0

    iget-object p0, p0, Lyi/b$b;->b:Lio/grpc/okhttp/internal/e$b;

    return-object p0
.end method


# virtual methods
.method public c()Lyi/b;
    .locals 2

    iget-object v0, p0, Lyi/b$b;->a:Lyi/a;

    if-eqz v0, :cond_0

    new-instance v0, Lyi/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lyi/b;-><init>(Lyi/b$b;Lyi/b$a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Lyi/b$b;
    .locals 1

    iget-object v0, p0, Lyi/b$b;->b:Lio/grpc/okhttp/internal/e$b;

    invoke-virtual {v0, p1, p2}, Lio/grpc/okhttp/internal/e$b;->f(Ljava/lang/String;Ljava/lang/String;)Lio/grpc/okhttp/internal/e$b;

    return-object p0
.end method

.method public e(Lyi/a;)Lyi/b$b;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lyi/b$b;->a:Lyi/a;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "url == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
