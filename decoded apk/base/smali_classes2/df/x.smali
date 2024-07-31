.class public final Ldf/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/x$c;,
        Ldf/x$b;
    }
.end annotation


# static fields
.field private static final f:Ldf/x$b;

.field private static final g:Lrk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrk/a<",
            "Landroid/content/Context;",
            "Lx0/f<",
            "La1/d;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lgk/f;

.field private final d:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ldf/l;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcl/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcl/b<",
            "Ldf/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ldf/x$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldf/x$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ldf/x;->f:Ldf/x$b;

    sget-object v0, Ldf/v;->a:Ldf/v;

    invoke-virtual {v0}, Ldf/v;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lz0/a;->b(Ljava/lang/String;Ly0/b;Lok/l;Lzk/k0;ILjava/lang/Object;)Lrk/a;

    move-result-object v0

    sput-object v0, Ldf/x;->g:Lrk/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lgk/f;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/x;->b:Landroid/content/Context;

    iput-object p2, p0, Ldf/x;->c:Lgk/f;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ldf/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Ldf/x;->f:Ldf/x$b;

    invoke-static {v0, p1}, Ldf/x$b;->a(Ldf/x$b;Landroid/content/Context;)Lx0/f;

    move-result-object p1

    invoke-interface {p1}, Lx0/f;->getData()Lcl/b;

    move-result-object p1

    new-instance v0, Ldf/x$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldf/x$d;-><init>(Lgk/Continuation;)V

    invoke-static {p1, v0}, Lcl/d;->a(Lcl/b;Lok/q;)Lcl/b;

    move-result-object p1

    new-instance v0, Ldf/x$e;

    invoke-direct {v0, p1, p0}, Ldf/x$e;-><init>(Lcl/b;Ldf/x;)V

    iput-object v0, p0, Ldf/x;->e:Lcl/b;

    invoke-static {p2}, Lzk/l0;->a(Lgk/f;)Lzk/k0;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Ldf/x$a;

    invoke-direct {v5, p0, v1}, Ldf/x$a;-><init>(Ldf/x;Lgk/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lzk/h;->d(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;ILjava/lang/Object;)Lzk/w1;

    return-void
.end method

.method public static final synthetic c()Ldf/x$b;
    .locals 1

    sget-object v0, Ldf/x;->f:Ldf/x$b;

    return-object v0
.end method

.method public static final synthetic d(Ldf/x;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Ldf/x;->b:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic e(Ldf/x;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Ldf/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static final synthetic f()Lrk/a;
    .locals 1

    sget-object v0, Ldf/x;->g:Lrk/a;

    return-object v0
.end method

.method public static final synthetic g(Ldf/x;)Lcl/b;
    .locals 0

    iget-object p0, p0, Ldf/x;->e:Lcl/b;

    return-object p0
.end method

.method public static final synthetic h(Ldf/x;La1/d;)Ldf/l;
    .locals 0

    invoke-direct {p0, p1}, Ldf/x;->i(La1/d;)Ldf/l;

    move-result-object p0

    return-object p0
.end method

.method private final i(La1/d;)Ldf/l;
    .locals 2

    new-instance v0, Ldf/l;

    sget-object v1, Ldf/x$c;->a:Ldf/x$c;

    invoke-virtual {v1}, Ldf/x$c;->a()La1/d$a;

    move-result-object v1

    invoke-virtual {p1, v1}, La1/d;->b(La1/d$a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, p1}, Ldf/l;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldf/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldf/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ldf/l;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 7

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldf/x;->c:Lgk/f;

    invoke-static {v0}, Lzk/l0;->a(Lgk/f;)Lzk/k0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Ldf/x$f;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ldf/x$f;-><init>(Ldf/x;Ljava/lang/String;Lgk/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lzk/h;->d(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;ILjava/lang/Object;)Lzk/w1;

    return-void
.end method
